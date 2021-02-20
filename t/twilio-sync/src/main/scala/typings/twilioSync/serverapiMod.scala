package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverapiMod {
  
  @js.native
  trait PublishMessageRequest extends StObject {
    
    var data: js.Object = js.native
  }
  object PublishMessageRequest {
    
    @scala.inline
    def apply(data: js.Object): PublishMessageRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMessageRequest]
    }
    
    @scala.inline
    implicit class PublishMessageRequestMutableBuilder[Self <: PublishMessageRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PublishMessageResponse extends StObject {
    
    var sid: String = js.native
  }
  object PublishMessageResponse {
    
    @scala.inline
    def apply(sid: String): PublishMessageResponse = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMessageResponse]
    }
    
    @scala.inline
    implicit class PublishMessageResponseMutableBuilder[Self <: PublishMessageResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamDescriptor extends StObject {
    
    var date_expires: String = js.native
    
    var links: StreamLinks = js.native
    
    var sid: String = js.native
    
    var unique_name: String = js.native
    
    var url: String = js.native
  }
  object StreamDescriptor {
    
    @scala.inline
    def apply(date_expires: String, links: StreamLinks, sid: String, unique_name: String, url: String): StreamDescriptor = {
      val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDescriptor]
    }
    
    @scala.inline
    implicit class StreamDescriptorMutableBuilder[Self <: StreamDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinks(value: StreamLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StreamLinks extends StObject {
    
    var messages: String = js.native
  }
  object StreamLinks {
    
    @scala.inline
    def apply(messages: String): StreamLinks = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamLinks]
    }
    
    @scala.inline
    implicit class StreamLinksMutableBuilder[Self <: StreamLinks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
}
