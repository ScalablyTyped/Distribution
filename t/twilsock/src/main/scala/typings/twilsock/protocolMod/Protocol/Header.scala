package typings.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var http_request: js.UndefOr[Request] = js.native
  var id: js.UndefOr[String] = js.native
  var method: MessageType = js.native
  var notification_ctx_id: js.UndefOr[String] = js.native
  var payload_size: js.UndefOr[Double] = js.native
  var payload_type: js.UndefOr[String] = js.native
}

object Header {
  @scala.inline
  def apply(method: MessageType): Header = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
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
    def setMethod(value: MessageType): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp_request(value: Request): Self = this.set("http_request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp_request: Self = this.set("http_request", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNotification_ctx_id(value: String): Self = this.set("notification_ctx_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification_ctx_id: Self = this.set("notification_ctx_id", js.undefined)
    @scala.inline
    def setPayload_size(value: Double): Self = this.set("payload_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload_size: Self = this.set("payload_size", js.undefined)
    @scala.inline
    def setPayload_type(value: String): Self = this.set("payload_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload_type: Self = this.set("payload_type", js.undefined)
  }
  
}

