package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    *  Path to app
    */
  var appRoot: java.lang.String
  /**
    * Used for Bagpipes library
    *
    * @se @link{https://github.com/apigee-127/bagpipes|Github Source}
    */
  var bagpipes: js.UndefOr[js.Any] = js.undefined
  /**
    *  Sets `NODE_CONFIG_DIR` env if not set yet
    */
  var configDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Swagger controller directories
    *
    * default is array with `/api/controllers` relative to `appRoot`
    */
  var controllersDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    *  default is `null`
    */
  var defaultPipe: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for Bagpipes library
    *
    * default is `[api/fittings]`
    */
  var fittingsDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Swagger mock controller directories
    *
    * default is array with `/api/mocks` relative to `appRoot`
    */
  var mockControllersDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If `true` API is in mock mode
    *
    * default is `false`
    */
  var mockMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * default is `swagger_controllers`
    */
  var swaggerControllerPipe: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Absolute path to swagger.yml file, if not set default value is used.
    */
  var swaggerFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define Middleware for using Swagger security information to authenticate requests. Part of _swagger-tools_
    *
    * default is `undefined`
    * @see {@link https://github.com/apigee-127/swagger-tools/blob/master/middleware/swagger-security.js|Github Source}
    */
  var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.undefined
  /**
    * If `true` resonse is validated
    *
    * default is `true`
    */
  var validateResponse: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    appRoot: java.lang.String,
    bagpipes: js.Any = null,
    configDir: java.lang.String = null,
    controllersDirs: js.Array[java.lang.String] = null,
    defaultPipe: java.lang.String = null,
    fittingsDirs: js.Array[java.lang.String] = null,
    mockControllersDirs: js.Array[java.lang.String] = null,
    mockMode: js.UndefOr[scala.Boolean] = js.undefined,
    swaggerControllerPipe: java.lang.String = null,
    swaggerFile: java.lang.String = null,
    swaggerSecurityHandlers: SwaggerSecurityHandlers = null,
    validateResponse: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(appRoot = appRoot)
    if (bagpipes != null) __obj.updateDynamic("bagpipes")(bagpipes)
    if (configDir != null) __obj.updateDynamic("configDir")(configDir)
    if (controllersDirs != null) __obj.updateDynamic("controllersDirs")(controllersDirs)
    if (defaultPipe != null) __obj.updateDynamic("defaultPipe")(defaultPipe)
    if (fittingsDirs != null) __obj.updateDynamic("fittingsDirs")(fittingsDirs)
    if (mockControllersDirs != null) __obj.updateDynamic("mockControllersDirs")(mockControllersDirs)
    if (!js.isUndefined(mockMode)) __obj.updateDynamic("mockMode")(mockMode)
    if (swaggerControllerPipe != null) __obj.updateDynamic("swaggerControllerPipe")(swaggerControllerPipe)
    if (swaggerFile != null) __obj.updateDynamic("swaggerFile")(swaggerFile)
    if (swaggerSecurityHandlers != null) __obj.updateDynamic("swaggerSecurityHandlers")(swaggerSecurityHandlers)
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse)
    __obj.asInstanceOf[Config]
  }
}

