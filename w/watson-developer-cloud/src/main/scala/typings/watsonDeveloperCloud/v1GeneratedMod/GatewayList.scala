package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing gateways array. */
trait GatewayList extends js.Object {
  /** Array of configured gateway connections. */
  var gateways: js.UndefOr[js.Array[Gateway]] = js.undefined
}

object GatewayList {
  @scala.inline
  def apply(gateways: js.Array[Gateway] = null): GatewayList = {
    val __obj = js.Dynamic.literal()
    if (gateways != null) __obj.updateDynamic("gateways")(gateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayList]
  }
}

