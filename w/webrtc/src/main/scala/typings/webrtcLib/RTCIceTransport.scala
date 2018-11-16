package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
@js.native
trait RTCIceTransport extends js.Object {
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: stdLib.RTCIceGatheringState = js.native
  @JSName("ongatheringstatechange")
  var ongatheringstatechange_Original: EventHandler = js.native
  @JSName("onselectedcandidatepairchange")
  var onselectedcandidatepairchange_Original: EventHandler = js.native
  @JSName("onstatechange")
  var onstatechange_Original: EventHandler = js.native
  def getLocalCandidates(): js.Array[stdLib.RTCIceCandidate] = js.native
  def getLocalParameters(): RTCIceParameters | scala.Null = js.native
  def getRemoteCandidates(): js.Array[stdLib.RTCIceCandidate] = js.native
  def getRemoteParameters(): RTCIceParameters | scala.Null = js.native
  def getSelectedCandidatePair(): stdLib.RTCIceCandidatePair | scala.Null = js.native
  def ongatheringstatechange(event: stdLib.Event): scala.Unit = js.native
  def onselectedcandidatepairchange(event: stdLib.Event): scala.Unit = js.native
  def onstatechange(event: stdLib.Event): scala.Unit = js.native
}

