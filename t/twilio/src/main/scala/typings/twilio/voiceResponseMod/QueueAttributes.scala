package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueAttributes extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
  
  var postWorkActivitySid: js.UndefOr[String] = js.undefined
  
  var reservationSid: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object QueueAttributes {
  
  inline def apply(): QueueAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueAttributes]
  }
  
  extension [Self <: QueueAttributes](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPostWorkActivitySid(value: String): Self = StObject.set(x, "postWorkActivitySid", value.asInstanceOf[js.Any])
    
    inline def setPostWorkActivitySidUndefined: Self = StObject.set(x, "postWorkActivitySid", js.undefined)
    
    inline def setReservationSid(value: String): Self = StObject.set(x, "reservationSid", value.asInstanceOf[js.Any])
    
    inline def setReservationSidUndefined: Self = StObject.set(x, "reservationSid", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
