package typings.twilio.accessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsGrantOptions extends StObject {
  
  var configurationProfileSid: js.UndefOr[String] = js.undefined
}
object ConversationsGrantOptions {
  
  inline def apply(): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
  
  extension [Self <: ConversationsGrantOptions](x: Self) {
    
    inline def setConfigurationProfileSid(value: String): Self = StObject.set(x, "configurationProfileSid", value.asInstanceOf[js.Any])
    
    inline def setConfigurationProfileSidUndefined: Self = StObject.set(x, "configurationProfileSid", js.undefined)
  }
}
