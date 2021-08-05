package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsGrantOptions extends StObject {
  
  var configurationProfileSid: String
}
object ConversationsGrantOptions {
  
  inline def apply(configurationProfileSid: String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
  
  extension [Self <: ConversationsGrantOptions](x: Self) {
    
    inline def setConfigurationProfileSid(value: String): Self = StObject.set(x, "configurationProfileSid", value.asInstanceOf[js.Any])
  }
}
