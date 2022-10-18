package typings.twilio.libJwtAccessTokenMod

import typings.twilio.anon.Applicationsid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceGrantPayload extends StObject {
  
  var endpoint_id: js.UndefOr[String] = js.undefined
  
  var outgoing: js.UndefOr[Applicationsid] = js.undefined
  
  var push_credential_sid: js.UndefOr[String] = js.undefined
}
object VoiceGrantPayload {
  
  inline def apply(): VoiceGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceGrantPayload]
  }
  
  extension [Self <: VoiceGrantPayload](x: Self) {
    
    inline def setEndpoint_id(value: String): Self = StObject.set(x, "endpoint_id", value.asInstanceOf[js.Any])
    
    inline def setEndpoint_idUndefined: Self = StObject.set(x, "endpoint_id", js.undefined)
    
    inline def setOutgoing(value: Applicationsid): Self = StObject.set(x, "outgoing", value.asInstanceOf[js.Any])
    
    inline def setOutgoingUndefined: Self = StObject.set(x, "outgoing", js.undefined)
    
    inline def setPush_credential_sid(value: String): Self = StObject.set(x, "push_credential_sid", value.asInstanceOf[js.Any])
    
    inline def setPush_credential_sidUndefined: Self = StObject.set(x, "push_credential_sid", js.undefined)
  }
}
