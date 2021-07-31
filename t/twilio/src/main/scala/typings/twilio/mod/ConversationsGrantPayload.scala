package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsGrantPayload
  extends StObject
     with GrantPayload {
  
  var configuration_profile_sid: String
}
object ConversationsGrantPayload {
  
  @scala.inline
  def apply(configuration_profile_sid: String): ConversationsGrantPayload = {
    val __obj = js.Dynamic.literal(configuration_profile_sid = configuration_profile_sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantPayload]
  }
  
  @scala.inline
  implicit class ConversationsGrantPayloadMutableBuilder[Self <: ConversationsGrantPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration_profile_sid(value: String): Self = StObject.set(x, "configuration_profile_sid", value.asInstanceOf[js.Any])
  }
}
