package com.cjavaperu.microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApplication.class, args);
	}
        
        @RequestMapping("main")
        public String saludar(){
            return "hola cjava";
        }
        
}
