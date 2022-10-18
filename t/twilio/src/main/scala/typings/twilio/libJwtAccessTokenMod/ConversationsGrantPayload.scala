package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsGrantPayload extends StObject {
  
  var configuration_profile_sid: js.UndefOr[String] = js.undefined
}
object ConversationsGrantPayload {
  
  inline def apply(): ConversationsGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationsGrantPayload]
  }
  
  extension [Self <: ConversationsGrantPayload](x: Self) {
    
    inline def setConfiguration_profile_sid(value: String): Self = StObject.set(x, "configuration_profile_sid", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_profile_sidUndefined: Self = StObject.set(x, "configuration_profile_sid", js.undefined)
  }
}
