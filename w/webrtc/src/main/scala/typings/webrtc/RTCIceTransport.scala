package typings.webrtc

import typings.std.RTCIceCandidate
import typings.std.RTCIceCandidatePair
import typings.std.RTCIceGatheringState
import typings.std.RTCIceParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceTransport extends js.Object {
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: RTCIceGatheringState
  var ongatheringstatechange: IceTransportEventHandler
  var onselectedcandidatepairchange: IceTransportEventHandler
  var onstatechange: IceTransportEventHandler
  def getLocalCandidates(): js.Array[RTCIceCandidate]
  def getLocalParameters(): RTCIceParameters | Null
  def getRemoteCandidates(): js.Array[RTCIceCandidate]
  def getRemoteParameters(): RTCIceParameters | Null
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null
}

object RTCIceTransport {
  @scala.inline
  def apply(
    gatheringState: RTCIceGatheringState,
    getLocalCandidates: () => js.Array[RTCIceCandidate],
    getLocalParameters: () => RTCIceParameters | Null,
    getRemoteCandidates: () => js.Array[RTCIceCandidate],
    getRemoteParameters: () => RTCIceParameters | Null,
    getSelectedCandidatePair: () => RTCIceCandidatePair | Null,
    ongatheringstatechange: IceTransportEventHandler = null,
    onselectedcandidatepairchange: IceTransportEventHandler = null,
    onstatechange: IceTransportEventHandler = null
  ): RTCIceTransport = {
    val __obj = js.Dynamic.literal(gatheringState = gatheringState.asInstanceOf[js.Any], getLocalCandidates = js.Any.fromFunction0(getLocalCandidates), getLocalParameters = js.Any.fromFunction0(getLocalParameters), getRemoteCandidates = js.Any.fromFunction0(getRemoteCandidates), getRemoteParameters = js.Any.fromFunction0(getRemoteParameters), getSelectedCandidatePair = js.Any.fromFunction0(getSelectedCandidatePair))
    if (ongatheringstatechange != null) __obj.updateDynamic("ongatheringstatechange")(ongatheringstatechange.asInstanceOf[js.Any])
    if (onselectedcandidatepairchange != null) __obj.updateDynamic("onselectedcandidatepairchange")(onselectedcandidatepairchange.asInstanceOf[js.Any])
    if (onstatechange != null) __obj.updateDynamic("onstatechange")(onstatechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceTransport]
  }
}

