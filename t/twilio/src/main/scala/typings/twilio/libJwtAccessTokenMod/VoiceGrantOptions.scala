package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceGrantOptions extends StObject {
  
  var endpointId: js.UndefOr[String] = js.undefined
  
  var incomingAllow: js.UndefOr[Boolean] = js.undefined
  
  var outgoingApplicationParams: js.UndefOr[js.Object] = js.undefined
  
  var outgoingApplicationSid: js.UndefOr[String] = js.undefined
  
  var pushCredentialSid: js.UndefOr[String] = js.undefined
}
object VoiceGrantOptions {
  
  inline def apply(): VoiceGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceGrantOptions]
  }
  
  extension [Self <: VoiceGrantOptions](x: Self) {
    
    inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    
    inline def setIncomingAllow(value: Boolean): Self = StObject.set(x, "incomingAllow", value.asInstanceOf[js.Any])
    
    inline def setIncomingAllowUndefined: Self = StObject.set(x, "incomingAllow", js.undefined)
    
    inline def setOutgoingApplicationParams(value: js.Object): Self = StObject.set(x, "outgoingApplicationParams", value.asInstanceOf[js.Any])
    
    inline def setOutgoingApplicationParamsUndefined: Self = StObject.set(x, "outgoingApplicationParams", js.undefined)
    
    inline def setOutgoingApplicationSid(value: String): Self = StObject.set(x, "outgoingApplicationSid", value.asInstanceOf[js.Any])
    
    inline def setOutgoingApplicationSidUndefined: Self = StObject.set(x, "outgoingApplicationSid", js.undefined)
    
    inline def setPushCredentialSid(value: String): Self = StObject.set(x, "pushCredentialSid", value.asInstanceOf[js.Any])
    
    inline def setPushCredentialSidUndefined: Self = StObject.set(x, "pushCredentialSid", js.undefined)
  }
}
