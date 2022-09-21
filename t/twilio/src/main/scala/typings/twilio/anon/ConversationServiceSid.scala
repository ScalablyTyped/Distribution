package typings.twilio.anon

import typings.twilio.addressConfigurationMod.AddressConfigurationAutoCreationType
import typings.twilio.addressConfigurationMod.AddressConfigurationMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationServiceSid extends StObject {
  
  var conversationServiceSid: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var studioFlowSid: js.UndefOr[String] = js.undefined
  
  var studioRetryCount: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[AddressConfigurationAutoCreationType] = js.undefined
  
  var webhookFilters: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var webhookMethod: js.UndefOr[AddressConfigurationMethod] = js.undefined
  
  var webhookUrl: js.UndefOr[String] = js.undefined
}
object ConversationServiceSid {
  
  inline def apply(): ConversationServiceSid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationServiceSid]
  }
  
  extension [Self <: ConversationServiceSid](x: Self) {
    
    inline def setConversationServiceSid(value: String): Self = StObject.set(x, "conversationServiceSid", value.asInstanceOf[js.Any])
    
    inline def setConversationServiceSidUndefined: Self = StObject.set(x, "conversationServiceSid", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStudioFlowSid(value: String): Self = StObject.set(x, "studioFlowSid", value.asInstanceOf[js.Any])
    
    inline def setStudioFlowSidUndefined: Self = StObject.set(x, "studioFlowSid", js.undefined)
    
    inline def setStudioRetryCount(value: Double): Self = StObject.set(x, "studioRetryCount", value.asInstanceOf[js.Any])
    
    inline def setStudioRetryCountUndefined: Self = StObject.set(x, "studioRetryCount", js.undefined)
    
    inline def setType(value: AddressConfigurationAutoCreationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebhookFilters(value: String | js.Array[String]): Self = StObject.set(x, "webhookFilters", value.asInstanceOf[js.Any])
    
    inline def setWebhookFiltersUndefined: Self = StObject.set(x, "webhookFilters", js.undefined)
    
    inline def setWebhookFiltersVarargs(value: String*): Self = StObject.set(x, "webhookFilters", js.Array(value*))
    
    inline def setWebhookMethod(value: AddressConfigurationMethod): Self = StObject.set(x, "webhookMethod", value.asInstanceOf[js.Any])
    
    inline def setWebhookMethodUndefined: Self = StObject.set(x, "webhookMethod", js.undefined)
    
    inline def setWebhookUrl(value: String): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
    
    inline def setWebhookUrlUndefined: Self = StObject.set(x, "webhookUrl", js.undefined)
  }
}
