package typings.twilioChat.mod

import typings.twilioChat.anon.Consumptionreportinterval
import typings.twilioChat.anon.Conversations
import typings.twilioChat.anon.Myconversations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationResponse extends StObject {
  
  var identity: String
  
  var links: Conversations
  
  var options: Consumptionreportinterval
  
  var sync_objects: Myconversations
  
  var url: String
}
object ConfigurationResponse {
  
  inline def apply(
    identity: String,
    links: Conversations,
    options: Consumptionreportinterval,
    sync_objects: Myconversations,
    url: String
  ): ConfigurationResponse = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sync_objects = sync_objects.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Conversations): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Consumptionreportinterval): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSync_objects(value: Myconversations): Self = StObject.set(x, "sync_objects", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
