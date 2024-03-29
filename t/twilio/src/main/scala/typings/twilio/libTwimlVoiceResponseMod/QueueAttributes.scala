package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueAttributes extends StObject {
  
  /** method - Action URL method */
  var method: js.UndefOr[String] = js.undefined
  
  /** postWorkActivitySid - TaskRouter Activity SID */
  var postWorkActivitySid: js.UndefOr[String] = js.undefined
  
  /** reservationSid - TaskRouter Reservation SID */
  var reservationSid: js.UndefOr[String] = js.undefined
  
  /** url - Action URL */
  var url: js.UndefOr[String] = js.undefined
}
object QueueAttributes {
  
  inline def apply(): QueueAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueAttributes] (val x: Self) extends AnyVal {
    
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
