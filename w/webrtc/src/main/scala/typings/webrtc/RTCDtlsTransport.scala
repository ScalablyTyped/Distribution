package typings.webrtc

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsTransport extends js.Object {
  var onstatechange: DtlsTransportEventHandler
  val transport: RTCIceTransport
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[ArrayBuffer]
}

object RTCDtlsTransport {
  @scala.inline
  def apply(
    getRemoteCertificates: () => js.Array[ArrayBuffer],
    onstatechange: DtlsTransportEventHandler,
    transport: RTCIceTransport
  ): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal(getRemoteCertificates = js.Any.fromFunction0(getRemoteCertificates), onstatechange = onstatechange.asInstanceOf[js.Any], transport = transport)
  
    __obj.asInstanceOf[RTCDtlsTransport]
  }
}

