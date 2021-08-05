package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#h-rtcdatachannelevent
trait RTCDataChannelEvent extends StObject {
  
  val channel: RTCDataChannel
}
object RTCDataChannelEvent {
  
  inline def apply(channel: RTCDataChannel): RTCDataChannelEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDataChannelEvent]
  }
  
  extension [Self <: RTCDataChannelEvent](x: Self) {
    
    inline def setChannel(value: RTCDataChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
