package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object describing a specific gateway. */
@js.native
trait Gateway extends js.Object {
  /** The gateway ID of the gateway. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The user defined name of the gateway. */
  var name: js.UndefOr[String] = js.native
  /** The current status of the gateway. `connected` means the gateway is connected to the remotly installed gateway. `idle` means this gateway is not currently in use. */
  var status: js.UndefOr[String] = js.native
  /** The generated **token** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token: js.UndefOr[String] = js.native
  /** The generated **token_id** for this gateway. The value of this field is used when configuring the remotly installed gateway. */
  var token_id: js.UndefOr[String] = js.native
}

object Gateway {
  @scala.inline
  def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  @scala.inline
  implicit class GatewayOps[Self <: Gateway] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setToken_id(value: String): Self = this.set("token_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_id: Self = this.set("token_id", js.undefined)
  }
  
}

