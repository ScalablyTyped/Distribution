package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverapiMod {
  
  trait PublishMessageRequest extends StObject {
    
    var data: js.Object
  }
  object PublishMessageRequest {
    
    inline def apply(data: js.Object): PublishMessageRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMessageRequest]
    }
    
    extension [Self <: PublishMessageRequest](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishMessageResponse extends StObject {
    
    var sid: String
  }
  object PublishMessageResponse {
    
    inline def apply(sid: String): PublishMessageResponse = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMessageResponse]
    }
    
    extension [Self <: PublishMessageResponse](x: Self) {
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamDescriptor extends StObject {
    
    var date_expires: String
    
    var links: StreamLinks
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object StreamDescriptor {
    
    inline def apply(date_expires: String, links: StreamLinks, sid: String, unique_name: String, url: String): StreamDescriptor = {
      val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDescriptor]
    }
    
    extension [Self <: StreamDescriptor](x: Self) {
      
      inline def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: StreamLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamLinks extends StObject {
    
    var messages: String
  }
  object StreamLinks {
    
    inline def apply(messages: String): StreamLinks = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLinks]
    }
    
    extension [Self <: StreamLinks](x: Self) {
      
      inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
}
