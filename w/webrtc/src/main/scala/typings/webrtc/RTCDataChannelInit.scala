package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelinit
trait RTCDataChannelInit extends StObject {
  
  // default = false
  var id: js.UndefOr[Double] = js.undefined
  
  // default = true
  var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
  
  var maxRetransmits: js.UndefOr[Double] = js.undefined
  
  // default = ''
  var negotiated: js.UndefOr[Boolean] = js.undefined
  
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
}
object RTCDataChannelInit {
  
  inline def apply(): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDataChannelInit]
  }
  
  extension [Self <: RTCDataChannelInit](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
    
    inline def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
    
    inline def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
    
    inline def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
    
    inline def setNegotiated(value: Boolean): Self = StObject.set(x, "negotiated", value.asInstanceOf[js.Any])
    
    inline def setNegotiatedUndefined: Self = StObject.set(x, "negotiated", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
