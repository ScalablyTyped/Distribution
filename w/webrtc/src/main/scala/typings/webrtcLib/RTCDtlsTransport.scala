package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
@js.native
trait RTCDtlsTransport extends js.Object {
  @JSName("onstatechange")
  var onstatechange_Original: EventHandler = js.native
  val transport: RTCIceTransport = js.native
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[stdLib.ArrayBuffer] = js.native
  def onstatechange(event: stdLib.Event): scala.Unit = js.native
}

