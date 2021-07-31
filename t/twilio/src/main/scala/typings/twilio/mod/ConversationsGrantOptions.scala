package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsGrantOptions extends StObject {
  
  var configurationProfileSid: String
}
object ConversationsGrantOptions {
  
  @scala.inline
  def apply(configurationProfileSid: String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
  
  @scala.inline
  implicit class ConversationsGrantOptionsMutableBuilder[Self <: ConversationsGrantOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationProfileSid(value: String): Self = StObject.set(x, "configurationProfileSid", value.asInstanceOf[js.Any])
  }
}
