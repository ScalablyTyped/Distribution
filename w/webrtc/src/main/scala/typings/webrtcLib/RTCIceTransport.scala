package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransport extends js.Object {
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: stdLib.RTCIceGatheringState
  var ongatheringstatechange: IceTransportEventHandler
  var onselectedcandidatepairchange: IceTransportEventHandler
  var onstatechange: IceTransportEventHandler
  def getLocalCandidates(): js.Array[stdLib.RTCIceCandidate]
  def getLocalParameters(): RTCIceParameters | scala.Null
  def getRemoteCandidates(): js.Array[stdLib.RTCIceCandidate]
  def getRemoteParameters(): RTCIceParameters | scala.Null
  def getSelectedCandidatePair(): stdLib.RTCIceCandidatePair | scala.Null
}

