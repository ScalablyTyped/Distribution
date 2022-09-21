package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAttributes extends StObject {
  
  var byoc: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var sendDigits: js.UndefOr[String] = js.undefined
  
  var statusCallback: js.UndefOr[String] = js.undefined
  
  var statusCallbackEvent: js.UndefOr[js.Array[NumberEvent]] = js.undefined
  
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object NumberAttributes {
  
  inline def apply(): NumberAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributes]
  }
  
  extension [Self <: NumberAttributes](x: Self) {
    
    inline def setByoc(value: String): Self = StObject.set(x, "byoc", value.asInstanceOf[js.Any])
    
    inline def setByocUndefined: Self = StObject.set(x, "byoc", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSendDigits(value: String): Self = StObject.set(x, "sendDigits", value.asInstanceOf[js.Any])
    
    inline def setSendDigitsUndefined: Self = StObject.set(x, "sendDigits", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[NumberEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: NumberEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
