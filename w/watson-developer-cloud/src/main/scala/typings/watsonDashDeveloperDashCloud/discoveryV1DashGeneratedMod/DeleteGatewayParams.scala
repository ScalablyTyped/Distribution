package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `deleteGateway` operation. */
trait DeleteGatewayParams extends js.Object {
  /** The ID of the environment. */
  var environment_id: String
  /** The requested gateway ID. */
  var gateway_id: String
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object DeleteGatewayParams {
  @scala.inline
  def apply(
    environment_id: String,
    gateway_id: String,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): DeleteGatewayParams = {
    val __obj = js.Dynamic.literal(environment_id = environment_id, gateway_id = gateway_id)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response)
    __obj.asInstanceOf[DeleteGatewayParams]
  }
}

