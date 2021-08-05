package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var RTCPeerConnection: RTCPeerConnectionStatic
}
object Window {
  
  inline def apply(RTCPeerConnection: RTCPeerConnectionStatic): Window = {
    val __obj = js.Dynamic.literal(RTCPeerConnection = RTCPeerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setRTCPeerConnection(value: RTCPeerConnectionStatic): Self = StObject.set(x, "RTCPeerConnection", value.asInstanceOf[js.Any])
  }
}
