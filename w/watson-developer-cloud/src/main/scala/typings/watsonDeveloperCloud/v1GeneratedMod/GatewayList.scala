package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing gateways array. */
@js.native
trait GatewayList extends js.Object {
  /** Array of configured gateway connections. */
  var gateways: js.UndefOr[js.Array[Gateway]] = js.native
}

object GatewayList {
  @scala.inline
  def apply(): GatewayList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayList]
  }
  @scala.inline
  implicit class GatewayListOps[Self <: GatewayList] (val x: Self) extends AnyVal {
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
    def setGatewaysVarargs(value: Gateway*): Self = this.set("gateways", js.Array(value :_*))
    @scala.inline
    def setGateways(value: js.Array[Gateway]): Self = this.set("gateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateways: Self = this.set("gateways", js.undefined)
  }
  
}

