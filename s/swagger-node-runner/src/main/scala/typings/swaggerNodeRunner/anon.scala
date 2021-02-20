package typings.swaggerNodeRunner

import typings.hapi.mod.Server
import typings.swaggerNodeRunner.mod.SwaggerSecurityHandlers
import typings.swaggerNodeRunner.mod.SwaggerToolsMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Registers Plugin with `onRequest` and traces `request-error` callbacks
      *             *
      * @param  server - Hapi server
      * @param  options - options for plugin (not used in the moment)
      * @param  next - callback called when register is done
      */
    def apply(server: Server, options: js.Any, next: js.Function0[Unit]): Unit = js.native
    
    /** Object attached to `register` function to provide hapi with some additional information about the plugin */
    var attributes: Name = js.native
  }
  
  @js.native
  trait Name extends StObject {
    
    /**  Name of Plugin (e.g. `swagger-node-runner`) */
    var name: String = js.native
    
    /** Version of Plugin */
    var version: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    var path: js.Any = js.native
  }
  object Path {
    
    @scala.inline
    def apply(path: js.Any): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Register extends StObject {
    
    /**
      * Registers Plugin with `onRequest` and traces `request-error` callbacks
      *             *
      * @param  server - Hapi server
      * @param  options - options for plugin (not used in the moment)
      * @param  next - callback called when register is done
      */
    /**
      * Hapi plugin `register` implementation.
      * @see {@link https://hapijs.com/tutorials/plugins|Hapi Docs}
      */
    def register(server: Server, options: js.Any, next: js.Function0[Unit]): Unit = js.native
    /**
      * Hapi plugin `register` implementation.
      * @see {@link https://hapijs.com/tutorials/plugins|Hapi Docs}
      */
    @JSName("register")
    var register_Original: Call = js.native
  }
  
  @js.native
  trait Swagger extends StObject {
    
    var swagger: Path = js.native
  }
  object Swagger {
    
    @scala.inline
    def apply(swagger: Path): Swagger = {
      val __obj = js.Dynamic.literal(swagger = swagger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Swagger]
    }
    
    @scala.inline
    implicit class SwaggerMutableBuilder[Self <: Swagger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSwagger(value: Path): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwaggerMetadata extends StObject {
    
    /**
      * Middleware for providing Swagger information to downstream middleware and request handlers.
      *
      * @param rlOrSO - The Resource Listing (Swagger 1.2) or Swagger Object (Swagger 2.0)
      * @param apiDeclarations - The array of API Declarations (Swagger 1.2)
      *
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-metadata.js|Git Source}
      */
    def swaggerMetadata(rlOrSO: js.Any, apiDeclarations: js.Array[_]): SwaggerToolsMiddleware = js.native
    
    /**
      *  Middleware for using Swagger information to route requests to handlers.
      * @param [] options - The configuration options
      *
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/docs/Middleware.md#swaggerrouteroptions|Docs}
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-router.js|Github Source}
      */
    def swaggerRouter(): SwaggerToolsMiddleware = js.native
    def swaggerRouter(options: js.Any): SwaggerToolsMiddleware = js.native
    
    /**
      * Middleware for using Swagger security information to authenticate requests.
      * @param [] options - The configuration options
      *
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-security.js|Github Source}
      */
    def swaggerSecurity(): SwaggerToolsMiddleware = js.native
    def swaggerSecurity(options: SwaggerSecurityHandlers): SwaggerToolsMiddleware = js.native
    
    /**
      * Middleware for serving the Swagger documents and Swagger UI.
      *
      * @param rlOrSO - The Resource Listing (Swagger 1.2) or Swagger Object (Swagger 2.0)
      * @param apiDeclarations - The array of API Declarations (Swagger 1.2)
      * @param [] options - The configuration options
      *
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-ui.js|Github Source}
      */
    def swaggerUi(rlOrSO: js.Any, apiDeclarations: js.Array[_]): SwaggerToolsMiddleware = js.native
    def swaggerUi(rlOrSO: js.Any, apiDeclarations: js.Array[_], options: js.Any): SwaggerToolsMiddleware = js.native
    
    /**
      * Middleware for using Swagger information to validate API requests/responses.type
      * @param [] options - The configuration options
      *
      * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-validator.js|Github Source}
      */
    def swaggerValidator(): SwaggerToolsMiddleware = js.native
    def swaggerValidator(options: js.Any): SwaggerToolsMiddleware = js.native
  }
}
