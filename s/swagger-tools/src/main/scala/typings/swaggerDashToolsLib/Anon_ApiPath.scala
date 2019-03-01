package typings
package swaggerDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiPath[P /* <: swaggerDashToolsLib.swaggerDashToolsMod.SwaggerRequestParameters */] extends js.Object {
  var apiPath: java.lang.String
  var operation: js.UndefOr[swaggerDashToolsLib.swaggerDashToolsMod.Swagger20Operation] = js.undefined
  var operationParameters: js.UndefOr[js.Array[swaggerDashToolsLib.swaggerDashToolsMod.OperationParameter]] = js.undefined
  var operationPath: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var params: P
  var path: js.Any
  var security: js.Array[_]
  var swaggerObject: js.Any
  var swaggerVersion: java.lang.String
  var useStubs: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ApiPath {
  @scala.inline
  def apply[P /* <: swaggerDashToolsLib.swaggerDashToolsMod.SwaggerRequestParameters */](
    apiPath: java.lang.String,
    params: P,
    path: js.Any,
    security: js.Array[_],
    swaggerObject: js.Any,
    swaggerVersion: java.lang.String,
    operation: swaggerDashToolsLib.swaggerDashToolsMod.Swagger20Operation = null,
    operationParameters: js.Array[swaggerDashToolsLib.swaggerDashToolsMod.OperationParameter] = null,
    operationPath: js.Array[java.lang.String] = null,
    useStubs: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ApiPath[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiPath")(apiPath)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("security")(security)
    __obj.updateDynamic("swaggerObject")(swaggerObject)
    __obj.updateDynamic("swaggerVersion")(swaggerVersion)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationParameters != null) __obj.updateDynamic("operationParameters")(operationParameters)
    if (operationPath != null) __obj.updateDynamic("operationPath")(operationPath)
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs)
    __obj.asInstanceOf[Anon_ApiPath[P]]
  }
}

