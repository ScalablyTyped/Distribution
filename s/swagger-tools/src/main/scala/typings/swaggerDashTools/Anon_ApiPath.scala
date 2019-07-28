package typings.swaggerDashTools

import typings.swaggerDashTools.swaggerDashToolsMod.OperationParameter
import typings.swaggerDashTools.swaggerDashToolsMod.Swagger20Operation
import typings.swaggerDashTools.swaggerDashToolsMod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiPath[P /* <: SwaggerRequestParameters */] extends js.Object {
  var apiPath: String
  var operation: js.UndefOr[Swagger20Operation] = js.undefined
  var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.undefined
  var operationPath: js.UndefOr[js.Array[String]] = js.undefined
  var params: P
  var path: js.Any
  var security: js.Array[_]
  var swaggerObject: js.Any
  var swaggerVersion: String
  var useStubs: js.UndefOr[Boolean] = js.undefined
}

object Anon_ApiPath {
  @scala.inline
  def apply[P /* <: SwaggerRequestParameters */](
    apiPath: String,
    params: P,
    path: js.Any,
    security: js.Array[_],
    swaggerObject: js.Any,
    swaggerVersion: String,
    operation: Swagger20Operation = null,
    operationParameters: js.Array[OperationParameter] = null,
    operationPath: js.Array[String] = null,
    useStubs: js.UndefOr[Boolean] = js.undefined
  ): Anon_ApiPath[P] = {
    val __obj = js.Dynamic.literal(apiPath = apiPath, params = params.asInstanceOf[js.Any], path = path, security = security, swaggerObject = swaggerObject, swaggerVersion = swaggerVersion)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationParameters != null) __obj.updateDynamic("operationParameters")(operationParameters)
    if (operationPath != null) __obj.updateDynamic("operationPath")(operationPath)
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs)
    __obj.asInstanceOf[Anon_ApiPath[P]]
  }
}

