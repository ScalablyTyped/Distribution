package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcsctptransport
@js.native
trait RTCSctpTransport extends js.Object {
  val maxMessageSize: Double = js.native
  val transport: RTCDtlsTransport = js.native
}

object RTCSctpTransport {
  @scala.inline
  def apply(maxMessageSize: Double, transport: RTCDtlsTransport): RTCSctpTransport = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSctpTransport]
  }
  @scala.inline
  implicit class RTCSctpTransportOps[Self <: RTCSctpTransport] (val x: Self) extends AnyVal {
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
    def setMaxMessageSize(value: Double): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransport(value: RTCDtlsTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
  
}

