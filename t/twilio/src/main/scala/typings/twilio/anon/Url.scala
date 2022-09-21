package typings.twilio.anon

import typings.twilio.serviceConversationWebhookMod.WebhookMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var filters: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var flowSid: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[WebhookMethod] = js.undefined
  
  var replayAfter: js.UndefOr[Double] = js.undefined
  
  var triggers: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Url {
  
  inline def apply(): Url = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setFilters(value: String | js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFlowSid(value: String): Self = StObject.set(x, "flowSid", value.asInstanceOf[js.Any])
    
    inline def setFlowSidUndefined: Self = StObject.set(x, "flowSid", js.undefined)
    
    inline def setMethod(value: WebhookMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setReplayAfter(value: Double): Self = StObject.set(x, "replayAfter", value.asInstanceOf[js.Any])
    
    inline def setReplayAfterUndefined: Self = StObject.set(x, "replayAfter", js.undefined)
    
    inline def setTriggers(value: String | js.Array[String]): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: String*): Self = StObject.set(x, "triggers", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
