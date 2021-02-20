package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import typings.symphonyApiClientNode.usersClientMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesClientMod {
  
  @JSImport("symphony-api-client-node/MessagesClient", "forwardMessage")
  @js.native
  def forwardMessage(conversationId: String, message: String, data: js.Any): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node/MessagesClient", "getAttachment")
  @js.native
  def getAttachment(streamId: String, attachmentId: String, messageId: String): js.Promise[String] = js.native
  
  @JSImport("symphony-api-client-node/MessagesClient", "getMessage")
  @js.native
  def getMessage(messageId: String): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node/MessagesClient", "getMessages")
  @js.native
  def getMessages(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = js.native
  
  @JSImport("symphony-api-client-node/MessagesClient", "sendMessage")
  @js.native
  def sendMessage(conversationId: String, message: String, data: js.Any, format: String, sessionToken: String): js.Promise[Message] = js.native
  
  @JSImport("symphony-api-client-node/MessagesClient", "sendMessageWithAttachment")
  @js.native
  def sendMessageWithAttachment(
    conversationId: String,
    message: String,
    data: js.Any,
    fileName: String,
    fileType: String,
    fileContent: js.Any,
    format: String
  ): js.Promise[Message] = js.native
  
  @js.native
  trait Attachment extends StObject {
    
    var id: String = js.native
    
    var images: js.Array[Image] = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
  }
  object Attachment {
    
    @scala.inline
    def apply(id: String, images: js.Array[Image], name: String, size: Double): Attachment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Image extends StObject {
    
    var dimension: String = js.native
    
    var id: String = js.native
  }
  object Image {
    
    @scala.inline
    def apply(dimension: String, id: String): Image = {
      val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var attachments: js.UndefOr[js.Array[Attachment]] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    var messageId: String = js.native
    
    var originalFormat: String = js.native
    
    var sharedMessage: js.UndefOr[Message] = js.native
    
    var sid: String = js.native
    
    var stream: Stream = js.native
    
    var timestamp: Double = js.native
    
    var user: User = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object Message {
    
    @scala.inline
    def apply(
      message: String,
      messageId: String,
      originalFormat: String,
      sid: String,
      stream: Stream,
      timestamp: Double,
      user: User
    ): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], originalFormat = originalFormat.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalFormat(value: String): Self = StObject.set(x, "originalFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedMessage(value: Message): Self = StObject.set(x, "sharedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedMessageUndefined: Self = StObject.set(x, "sharedMessage", js.undefined)
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait Stream extends StObject {
    
    var streamId: String = js.native
    
    var streamType: StreamType = js.native
  }
  object Stream {
    
    @scala.inline
    def apply(streamId: String, streamType: StreamType): Stream = {
      val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    }
  }
}
