package typings.swaggerNodeRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    *  Path to app
    */
  var appRoot: String
  /**
    * Used for Bagpipes library
    *
    * @se @link{https://github.com/apigee-127/bagpipes|Github Source}
    */
  var bagpipes: js.UndefOr[js.Any] = js.undefined
  /**
    *  Sets `NODE_CONFIG_DIR` env if not set yet
    */
  var configDir: js.UndefOr[String] = js.undefined
  /**
    * Swagger controller directories
    *
    * default is array with `/api/controllers` relative to `appRoot`
    */
  var controllersDirs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *  default is `null`
    */
  var defaultPipe: js.UndefOr[String] = js.undefined
  /**
    * Used for Bagpipes library
    *
    * default is `[api/fittings]`
    */
  var fittingsDirs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Swagger mock controller directories
    *
    * default is array with `/api/mocks` relative to `appRoot`
    */
  var mockControllersDirs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If `true` API is in mock mode
    *
    * default is `false`
    */
  var mockMode: js.UndefOr[Boolean] = js.undefined
  /**
    * default is `swagger_controllers`
    */
  var swaggerControllerPipe: js.UndefOr[String] = js.undefined
  /**
    * Absolute path to swagger.yml file, if not set default value is used.
    */
  var swaggerFile: js.UndefOr[String] = js.undefined
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
  var validateResponse: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    appRoot: String,
    bagpipes: js.Any = null,
    configDir: String = null,
    controllersDirs: js.Array[String] = null,
    defaultPipe: String = null,
    fittingsDirs: js.Array[String] = null,
    mockControllersDirs: js.Array[String] = null,
    mockMode: js.UndefOr[Boolean] = js.undefined,
    swaggerControllerPipe: String = null,
    swaggerFile: String = null,
    swaggerSecurityHandlers: SwaggerSecurityHandlers = null,
    validateResponse: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal(appRoot = appRoot.asInstanceOf[js.Any])
    if (bagpipes != null) __obj.updateDynamic("bagpipes")(bagpipes.asInstanceOf[js.Any])
    if (configDir != null) __obj.updateDynamic("configDir")(configDir.asInstanceOf[js.Any])
    if (controllersDirs != null) __obj.updateDynamic("controllersDirs")(controllersDirs.asInstanceOf[js.Any])
    if (defaultPipe != null) __obj.updateDynamic("defaultPipe")(defaultPipe.asInstanceOf[js.Any])
    if (fittingsDirs != null) __obj.updateDynamic("fittingsDirs")(fittingsDirs.asInstanceOf[js.Any])
    if (mockControllersDirs != null) __obj.updateDynamic("mockControllersDirs")(mockControllersDirs.asInstanceOf[js.Any])
    if (!js.isUndefined(mockMode)) __obj.updateDynamic("mockMode")(mockMode.asInstanceOf[js.Any])
    if (swaggerControllerPipe != null) __obj.updateDynamic("swaggerControllerPipe")(swaggerControllerPipe.asInstanceOf[js.Any])
    if (swaggerFile != null) __obj.updateDynamic("swaggerFile")(swaggerFile.asInstanceOf[js.Any])
    if (swaggerSecurityHandlers != null) __obj.updateDynamic("swaggerSecurityHandlers")(swaggerSecurityHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

