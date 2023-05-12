package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationAttributes extends StObject {
  
  /** copyParentTo - Copy parent call To field to called application side, otherwise use the application sid as To field */
  var copyParentTo: js.UndefOr[Boolean] = js.undefined
  
  /** customerId - Identity of the customer calling application */
  var customerId: js.UndefOr[String] = js.undefined
  
  /** method - TwiML URL Method */
  var method: js.UndefOr[String] = js.undefined
  
  /** statusCallback - Status Callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackEvent - Events to trigger status callback */
  var statusCallbackEvent: js.UndefOr[js.Array[ApplicationEvent]] = js.undefined
  
  /** statusCallbackMethod - Status Callback URL Method */
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** url - TwiML URL */
  var url: js.UndefOr[String] = js.undefined
}
object ApplicationAttributes {
  
  inline def apply(): ApplicationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationAttributes] (val x: Self) extends AnyVal {
    
    inline def setCopyParentTo(value: Boolean): Self = StObject.set(x, "copyParentTo", value.asInstanceOf[js.Any])
    
    inline def setCopyParentToUndefined: Self = StObject.set(x, "copyParentTo", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[ApplicationEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: ApplicationEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
