package com.nugu.greenery.NuguServer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30) // open api spec 3.0
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());

    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("NUGU SERVER")
                //title은 화면에 보여질 제목이다.
                .description("2022 IT쇼 Nugu에서 사용되는 서버입니다.")
                //간단한 설명을 적는다.
                .version("1.0.0")
                //해당 api의 버전이다.
                .build();
    }
}
