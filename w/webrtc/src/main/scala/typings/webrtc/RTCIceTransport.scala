package typings.webrtc

import typings.std.RTCIceCandidate
import typings.std.RTCIceCandidatePair
import typings.std.RTCIceGatheringState
import typings.std.RTCIceParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceTransport extends StObject {
  
  //readonly role: RTCIceRole;
  //readonly component: RTCIceComponent;
  //readonly state: RTCIceTransportState;
  val gatheringState: RTCIceGatheringState
  
  def getLocalCandidates(): js.Array[RTCIceCandidate]
  
  def getLocalParameters(): RTCIceParameters | Null
  
  def getRemoteCandidates(): js.Array[RTCIceCandidate]
  
  def getRemoteParameters(): RTCIceParameters | Null
  
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null
  
  var ongatheringstatechange: IceTransportEventHandler
  
  var onselectedcandidatepairchange: IceTransportEventHandler
  
  var onstatechange: IceTransportEventHandler
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
    val __obj = js.Dynamic.literal(gatheringState = gatheringState.asInstanceOf[js.Any], getLocalCandidates = js.Any.fromFunction0(getLocalCandidates), getLocalParameters = js.Any.fromFunction0(getLocalParameters), getRemoteCandidates = js.Any.fromFunction0(getRemoteCandidates), getRemoteParameters = js.Any.fromFunction0(getRemoteParameters), getSelectedCandidatePair = js.Any.fromFunction0(getSelectedCandidatePair), ongatheringstatechange = null, onselectedcandidatepairchange = null, onstatechange = null)
    __obj.asInstanceOf[RTCIceTransport]
  }
  
  @scala.inline
  implicit class RTCIceTransportMutableBuilder[Self <: RTCIceTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatheringState(value: RTCIceGatheringState): Self = StObject.set(x, "gatheringState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLocalCandidates(value: () => js.Array[RTCIceCandidate]): Self = StObject.set(x, "getLocalCandidates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalParameters(value: () => RTCIceParameters | Null): Self = StObject.set(x, "getLocalParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemoteCandidates(value: () => js.Array[RTCIceCandidate]): Self = StObject.set(x, "getRemoteCandidates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRemoteParameters(value: () => RTCIceParameters | Null): Self = StObject.set(x, "getRemoteParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedCandidatePair(value: () => RTCIceCandidatePair | Null): Self = StObject.set(x, "getSelectedCandidatePair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOngatheringstatechange(value: IceTransportEventHandler): Self = StObject.set(x, "ongatheringstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOngatheringstatechangeNull: Self = StObject.set(x, "ongatheringstatechange", null)
    
    @scala.inline
    def setOnselectedcandidatepairchange(value: IceTransportEventHandler): Self = StObject.set(x, "onselectedcandidatepairchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectedcandidatepairchangeNull: Self = StObject.set(x, "onselectedcandidatepairchange", null)
    
    @scala.inline
    def setOnstatechange(value: IceTransportEventHandler): Self = StObject.set(x, "onstatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstatechangeNull: Self = StObject.set(x, "onstatechange", null)
  }
}
