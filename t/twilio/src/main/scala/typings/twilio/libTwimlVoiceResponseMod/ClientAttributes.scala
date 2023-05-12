package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAttributes extends StObject {
  
  /** method - Client URL Method */
  var method: js.UndefOr[String] = js.undefined
  
  /** statusCallback - Status Callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackEvent - Events to trigger status callback */
  var statusCallbackEvent: js.UndefOr[js.Array[ClientEvent]] = js.undefined
  
  /** statusCallbackMethod - Status Callback URL Method */
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** url - Client URL */
  var url: js.UndefOr[String] = js.undefined
}
object ClientAttributes {
  
  inline def apply(): ClientAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientAttributes] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[ClientEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: ClientEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
