package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gatway deletion confirmation. */
@js.native
trait GatewayDelete extends js.Object {
  /** The gateway ID of the deleted gateway. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The status of the request. */
  var status: js.UndefOr[String] = js.native
}

object GatewayDelete {
  @scala.inline
  def apply(): GatewayDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayDelete]
  }
  @scala.inline
  implicit class GatewayDeleteOps[Self <: GatewayDelete] (val x: Self) extends AnyVal {
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
    def setGateway_id(value: String): Self = this.set("gateway_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway_id: Self = this.set("gateway_id", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

