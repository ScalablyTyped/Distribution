package typings
package swaggerDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Api extends js.Object {
  var api: js.Any
  var apiDeclaration: js.Any
  var apiIndex: scala.Double
  var authorizations: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[js.Any] = js.undefined
  var operationPath: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var params: swaggerDashToolsLib.swaggerDashToolsMod.SwaggerRequestParameters
  var resourceIndex: scala.Double
  var resourceListing: js.Any
  var swaggerVersion: java.lang.String
  var useStubs: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Api {
  @scala.inline
  def apply(
    api: js.Any,
    apiDeclaration: js.Any,
    apiIndex: scala.Double,
    params: swaggerDashToolsLib.swaggerDashToolsMod.SwaggerRequestParameters,
    resourceIndex: scala.Double,
    resourceListing: js.Any,
    swaggerVersion: java.lang.String,
    authorizations: js.Any = null,
    operation: js.Any = null,
    operationPath: js.Array[java.lang.String] = null,
    useStubs: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Api = {
    val __obj = js.Dynamic.literal(api = api, apiDeclaration = apiDeclaration, apiIndex = apiIndex, params = params, resourceIndex = resourceIndex, resourceListing = resourceListing, swaggerVersion = swaggerVersion)
    if (authorizations != null) __obj.updateDynamic("authorizations")(authorizations)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (operationPath != null) __obj.updateDynamic("operationPath")(operationPath)
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs)
    __obj.asInstanceOf[Anon_Api]
  }
}

