package typings.swaggerNodeRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /**
    *  Path to app
    */
  var appRoot: String = js.native
  
  /**
    * Used for Bagpipes library
    *
    * @se @link{https://github.com/apigee-127/bagpipes|Github Source}
    */
  var bagpipes: js.UndefOr[js.Any] = js.native
  
  /**
    *  Sets `NODE_CONFIG_DIR` env if not set yet
    */
  var configDir: js.UndefOr[String] = js.native
  
  /**
    * Swagger controller directories
    *
    * default is array with `/api/controllers` relative to `appRoot`
    */
  var controllersDirs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    *  default is `null`
    */
  var defaultPipe: js.UndefOr[String] = js.native
  
  /**
    * Used for Bagpipes library
    *
    * default is `[api/fittings]`
    */
  var fittingsDirs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Swagger mock controller directories
    *
    * default is array with `/api/mocks` relative to `appRoot`
    */
  var mockControllersDirs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If `true` API is in mock mode
    *
    * default is `false`
    */
  var mockMode: js.UndefOr[Boolean] = js.native
  
  /**
    * default is `swagger_controllers`
    */
  var swaggerControllerPipe: js.UndefOr[String] = js.native
  
  /**
    * Absolute path to swagger.yml file, if not set default value is used.
    */
  var swaggerFile: js.UndefOr[String] = js.native
  
  /**
    * Define Middleware for using Swagger security information to authenticate requests. Part of _swagger-tools_
    *
    * default is `undefined`
    * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-security.js|Github Source}
    */
  var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
  
  /**
    * If `true` resonse is validated
    *
    * default is `true`
    */
  var validateResponse: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(appRoot: String): Config = {
    val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppRoot(value: String): Self = this.set("appRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBagpipes(value: js.Any): Self = this.set("bagpipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBagpipes: Self = this.set("bagpipes", js.undefined)
    
    @scala.inline
    def setConfigDir(value: String): Self = this.set("configDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigDir: Self = this.set("configDir", js.undefined)
    
    @scala.inline
    def setControllersDirsVarargs(value: String*): Self = this.set("controllersDirs", js.Array(value :_*))
    
    @scala.inline
    def setControllersDirs(value: js.Array[String]): Self = this.set("controllersDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllersDirs: Self = this.set("controllersDirs", js.undefined)
    
    @scala.inline
    def setDefaultPipe(value: String): Self = this.set("defaultPipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPipe: Self = this.set("defaultPipe", js.undefined)
    
    @scala.inline
    def setFittingsDirsVarargs(value: String*): Self = this.set("fittingsDirs", js.Array(value :_*))
    
    @scala.inline
    def setFittingsDirs(value: js.Array[String]): Self = this.set("fittingsDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFittingsDirs: Self = this.set("fittingsDirs", js.undefined)
    
    @scala.inline
    def setMockControllersDirsVarargs(value: String*): Self = this.set("mockControllersDirs", js.Array(value :_*))
    
    @scala.inline
    def setMockControllersDirs(value: js.Array[String]): Self = this.set("mockControllersDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMockControllersDirs: Self = this.set("mockControllersDirs", js.undefined)
    
    @scala.inline
    def setMockMode(value: Boolean): Self = this.set("mockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMockMode: Self = this.set("mockMode", js.undefined)
    
    @scala.inline
    def setSwaggerControllerPipe(value: String): Self = this.set("swaggerControllerPipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerControllerPipe: Self = this.set("swaggerControllerPipe", js.undefined)
    
    @scala.inline
    def setSwaggerFile(value: String): Self = this.set("swaggerFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerFile: Self = this.set("swaggerFile", js.undefined)
    
    @scala.inline
    def setSwaggerSecurityHandlers(value: SwaggerSecurityHandlers): Self = this.set("swaggerSecurityHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwaggerSecurityHandlers: Self = this.set("swaggerSecurityHandlers", js.undefined)
    
    @scala.inline
    def setValidateResponse(value: Boolean): Self = this.set("validateResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateResponse: Self = this.set("validateResponse", js.undefined)
  }
}
