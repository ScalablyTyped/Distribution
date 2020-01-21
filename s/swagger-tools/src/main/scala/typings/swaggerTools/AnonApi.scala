package typings.swaggerTools

import typings.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApi extends js.Object {
  var api: js.Any
  var apiDeclaration: js.Any
  var apiIndex: Double
  var authorizations: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[js.Any] = js.undefined
  var operationPath: js.UndefOr[js.Array[String]] = js.undefined
  var params: SwaggerRequestParameters
  var resourceIndex: Double
  var resourceListing: js.Any
  var swaggerVersion: String
  var useStubs: js.UndefOr[Boolean] = js.undefined
}

object AnonApi {
  @scala.inline
  def apply(
    api: js.Any,
    apiDeclaration: js.Any,
    apiIndex: Double,
    params: SwaggerRequestParameters,
    resourceIndex: Double,
    resourceListing: js.Any,
    swaggerVersion: String,
    authorizations: js.Any = null,
    operation: js.Any = null,
    operationPath: js.Array[String] = null,
    useStubs: js.UndefOr[Boolean] = js.undefined
  ): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], apiDeclaration = apiDeclaration.asInstanceOf[js.Any], apiIndex = apiIndex.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceListing = resourceListing.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    if (authorizations != null) __obj.updateDynamic("authorizations")(authorizations.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (operationPath != null) __obj.updateDynamic("operationPath")(operationPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApi]
  }
}

