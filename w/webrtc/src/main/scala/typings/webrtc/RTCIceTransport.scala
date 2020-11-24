package typings.webrtc

import typings.std.RTCIceCandidate
import typings.std.RTCIceCandidatePair
import typings.std.RTCIceGatheringState
import typings.std.RTCIceParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceTransport extends js.Object {
  
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: RTCIceGatheringState = js.native
  
  def getLocalCandidates(): js.Array[RTCIceCandidate] = js.native
  
  def getLocalParameters(): RTCIceParameters | Null = js.native
  
  def getRemoteCandidates(): js.Array[RTCIceCandidate] = js.native
  
  def getRemoteParameters(): RTCIceParameters | Null = js.native
  
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null = js.native
  
  var ongatheringstatechange: IceTransportEventHandler = js.native
  
  var onselectedcandidatepairchange: IceTransportEventHandler = js.native
  
  var onstatechange: IceTransportEventHandler = js.native
}
object RTCIceTransport {
  
  @scala.inline
  def apply(
    gatheringState: RTCIceGatheringState,
    getLocalCandidates: () => js.Array[RTCIceCandidate],
    getLocalParameters: () => RTCIceParameters | Null,
    getRemoteCandidates: () => js.Array[RTCIceCandidate],
    getRemoteParameters: () => RTCIceParameters | Null,
    getSelectedCandidatePair: () => RTCIceCandidatePair | Null
  ): RTCIceTransport = {
    val __obj = js.Dynamic.literal(gatheringState = gatheringState.asInstanceOf[js.Any], getLocalCandidates = js.Any.fromFunction0(getLocalCandidates), getLocalParameters = js.Any.fromFunction0(getLocalParameters), getRemoteCandidates = js.Any.fromFunction0(getRemoteCandidates), getRemoteParameters = js.Any.fromFunction0(getRemoteParameters), getSelectedCandidatePair = js.Any.fromFunction0(getSelectedCandidatePair))
    __obj.asInstanceOf[RTCIceTransport]
  }
  
  @scala.inline
  implicit class RTCIceTransportOps[Self <: RTCIceTransport] (val x: Self) extends AnyVal {
    
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
    def setGatheringState(value: RTCIceGatheringState): Self = this.set("gatheringState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLocalCandidates(value: () => js.Array[RTCIceCandidate]): Self = this.set("getLocalCandidates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalParameters(value: () => RTCIceParameters | Null): Self = this.set("getLocalParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemoteCandidates(value: () => js.Array[RTCIceCandidate]): Self = this.set("getRemoteCandidates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemoteParameters(value: () => RTCIceParameters | Null): Self = this.set("getRemoteParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedCandidatePair(value: () => RTCIceCandidatePair | Null): Self = this.set("getSelectedCandidatePair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOngatheringstatechange(value: IceTransportEventHandler): Self = this.set("ongatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOngatheringstatechangeNull: Self = this.set("ongatheringstatechange", null)
    
    @scala.inline
    def setOnselectedcandidatepairchange(value: IceTransportEventHandler): Self = this.set("onselectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectedcandidatepairchangeNull: Self = this.set("onselectedcandidatepairchange", null)
    
    @scala.inline
    def setOnstatechange(value: IceTransportEventHandler): Self = this.set("onstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstatechangeNull: Self = this.set("onstatechange", null)
  }
}
