package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcsctptransport
trait RTCSctpTransport extends js.Object {
  val maxMessageSize: Double
  val transport: RTCDtlsTransport
}

object RTCSctpTransport {
  @scala.inline
  def apply(maxMessageSize: Double, transport: RTCDtlsTransport): RTCSctpTransport = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize, transport = transport)
  
    __obj.asInstanceOf[RTCSctpTransport]
  }
}

