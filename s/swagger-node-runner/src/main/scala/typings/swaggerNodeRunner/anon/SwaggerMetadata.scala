package typings.swaggerNodeRunner.anon

import typings.swaggerNodeRunner.mod.SwaggerSecurityHandlers
import typings.swaggerNodeRunner.mod.SwaggerToolsMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwaggerMetadata extends js.Object {
  
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
