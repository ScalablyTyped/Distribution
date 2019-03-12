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

object RTCIceTransport {
  @scala.inline
  def apply(
    gatheringState: stdLib.RTCIceGatheringState,
    getLocalCandidates: () => js.Array[stdLib.RTCIceCandidate],
    getLocalParameters: () => RTCIceParameters | scala.Null,
    getRemoteCandidates: () => js.Array[stdLib.RTCIceCandidate],
    getRemoteParameters: () => RTCIceParameters | scala.Null,
    getSelectedCandidatePair: () => stdLib.RTCIceCandidatePair | scala.Null,
    ongatheringstatechange: IceTransportEventHandler,
    onselectedcandidatepairchange: IceTransportEventHandler,
    onstatechange: IceTransportEventHandler
  ): RTCIceTransport = {
    val __obj = js.Dynamic.literal(gatheringState = gatheringState, getLocalCandidates = js.Any.fromFunction0(getLocalCandidates), getLocalParameters = js.Any.fromFunction0(getLocalParameters), getRemoteCandidates = js.Any.fromFunction0(getRemoteCandidates), getRemoteParameters = js.Any.fromFunction0(getRemoteParameters), getSelectedCandidatePair = js.Any.fromFunction0(getSelectedCandidatePair), ongatheringstatechange = ongatheringstatechange.asInstanceOf[js.Any], onselectedcandidatepairchange = onselectedcandidatepairchange.asInstanceOf[js.Any], onstatechange = onstatechange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RTCIceTransport]
  }
}

