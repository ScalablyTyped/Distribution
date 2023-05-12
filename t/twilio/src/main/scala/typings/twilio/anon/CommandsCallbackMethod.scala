package typings.twilio.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsCallbackMethod extends StObject {
  
  var accountSid: String
  
  var commandsCallbackMethod: String
  
  var commandsCallbackUrl: String
  
  var dateCreated: js.Date
  
  var dateUpdated: js.Date
  
  var eId: String
  
  var friendlyName: String
  
  var iccid: String
  
  var links: Record[String, String]
  
  var ratePlanSid: String
  
  var sid: String
  
  var smsFallbackMethod: String
  
  var smsFallbackUrl: String
  
  var smsMethod: String
  
  var smsUrl: String
  
  var status: String
  
  var uniqueName: String
  
  var url: String
  
  var voiceFallbackMethod: String
  
  var voiceFallbackUrl: String
  
  var voiceMethod: String
  
  var voiceUrl: String
}
object CommandsCallbackMethod {
  
  inline def apply(
    accountSid: String,
    commandsCallbackMethod: String,
    commandsCallbackUrl: String,
    dateCreated: js.Date,
    dateUpdated: js.Date,
    eId: String,
    friendlyName: String,
    iccid: String,
    links: Record[String, String],
    ratePlanSid: String,
    sid: String,
    smsFallbackMethod: String,
    smsFallbackUrl: String,
    smsMethod: String,
    smsUrl: String,
    status: String,
    uniqueName: String,
    url: String,
    voiceFallbackMethod: String,
    voiceFallbackUrl: String,
    voiceMethod: String,
    voiceUrl: String
  ): CommandsCallbackMethod = {
    val __obj = js.Dynamic.literal(accountSid = accountSid.asInstanceOf[js.Any], commandsCallbackMethod = commandsCallbackMethod.asInstanceOf[js.Any], commandsCallbackUrl = commandsCallbackUrl.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], eId = eId.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], iccid = iccid.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], ratePlanSid = ratePlanSid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], smsFallbackMethod = smsFallbackMethod.asInstanceOf[js.Any], smsFallbackUrl = smsFallbackUrl.asInstanceOf[js.Any], smsMethod = smsMethod.asInstanceOf[js.Any], smsUrl = smsUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], voiceFallbackMethod = voiceFallbackMethod.asInstanceOf[js.Any], voiceFallbackUrl = voiceFallbackUrl.asInstanceOf[js.Any], voiceMethod = voiceMethod.asInstanceOf[js.Any], voiceUrl = voiceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsCallbackMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandsCallbackMethod] (val x: Self) extends AnyVal {
    
    inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
    
    inline def setCommandsCallbackMethod(value: String): Self = StObject.set(x, "commandsCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setCommandsCallbackUrl(value: String): Self = StObject.set(x, "commandsCallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setEId(value: String): Self = StObject.set(x, "eId", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setIccid(value: String): Self = StObject.set(x, "iccid", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setRatePlanSid(value: String): Self = StObject.set(x, "ratePlanSid", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSmsFallbackMethod(value: String): Self = StObject.set(x, "smsFallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setSmsFallbackUrl(value: String): Self = StObject.set(x, "smsFallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setSmsMethod(value: String): Self = StObject.set(x, "smsMethod", value.asInstanceOf[js.Any])
    
    inline def setSmsUrl(value: String): Self = StObject.set(x, "smsUrl", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVoiceFallbackMethod(value: String): Self = StObject.set(x, "voiceFallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setVoiceFallbackUrl(value: String): Self = StObject.set(x, "voiceFallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setVoiceMethod(value: String): Self = StObject.set(x, "voiceMethod", value.asInstanceOf[js.Any])
    
    inline def setVoiceUrl(value: String): Self = StObject.set(x, "voiceUrl", value.asInstanceOf[js.Any])
  }
}
