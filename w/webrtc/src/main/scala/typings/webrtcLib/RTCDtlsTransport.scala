package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsTransport extends js.Object {
  var onstatechange: DtlsTransportEventHandler
  val transport: RTCIceTransport
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[stdLib.ArrayBuffer]
}

object RTCDtlsTransport {
  @scala.inline
  def apply(
    getRemoteCertificates: js.Function0[js.Array[stdLib.ArrayBuffer]],
    onstatechange: DtlsTransportEventHandler,
    transport: RTCIceTransport
  ): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRemoteCertificates")(getRemoteCertificates)
    __obj.updateDynamic("onstatechange")(onstatechange.asInstanceOf[js.Any])
    __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[RTCDtlsTransport]
  }
}

