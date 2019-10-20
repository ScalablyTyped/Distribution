package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gatway deletion confirmation. */
trait GatewayDelete extends js.Object {
  /** The gateway ID of the deleted gateway. */
  var gateway_id: js.UndefOr[String] = js.undefined
  /** The status of the request. */
  var status: js.UndefOr[String] = js.undefined
}

object GatewayDelete {
  @scala.inline
  def apply(gateway_id: String = null, status: String = null): GatewayDelete = {
    val __obj = js.Dynamic.literal()
    if (gateway_id != null) __obj.updateDynamic("gateway_id")(gateway_id)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GatewayDelete]
  }
}

