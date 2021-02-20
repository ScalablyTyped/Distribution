package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var RTCPeerConnection: RTCPeerConnectionStatic = js.native
}
object Window {
  
  @scala.inline
  def apply(RTCPeerConnection: RTCPeerConnectionStatic): Window = {
    val __obj = js.Dynamic.literal(RTCPeerConnection = RTCPeerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRTCPeerConnection(value: RTCPeerConnectionStatic): Self = StObject.set(x, "RTCPeerConnection", value.asInstanceOf[js.Any])
  }
}
