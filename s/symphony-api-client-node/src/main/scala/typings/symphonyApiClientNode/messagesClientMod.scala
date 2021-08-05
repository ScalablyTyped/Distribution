package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import typings.symphonyApiClientNode.usersClientMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesClientMod {
  
  @JSImport("symphony-api-client-node/MessagesClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forwardMessage(conversationId: String, message: String, data: js.Any): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("forwardMessage")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  inline def getAttachment(streamId: String, attachmentId: String, messageId: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttachment")(streamId.asInstanceOf[js.Any], attachmentId.asInstanceOf[js.Any], messageId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getMessage(messageId: String): js.Promise[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Message]]
  
  inline def getMessages(streamId: String, since: Double, skip: Double, limit: Double): js.Promise[js.Array[Message]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessages")(streamId.asInstanceOf[js.Any], since.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Message]]]
  
  inline def sendMessage(conversationId: String, message: String, data: js.Any, format: String, sessionToken: String): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  inline def sendMessageWithAttachment(
    conversationId: String,
    message: String,
    data: js.Any,
    fileName: String,
    fileType: String,
    fileContent: js.Any,
    format: String
  ): js.Promise[Message] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageWithAttachment")(conversationId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], fileType.asInstanceOf[js.Any], fileContent.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Message]]
  
  trait Attachment extends StObject {
    
    var id: String
    
    var images: js.Array[Image]
    
    var name: String
    
    var size: Double
  }
  object Attachment {
    
    inline def apply(id: String, images: js.Array[Image], name: String, size: Double): Attachment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var dimension: String
    
    var id: String
  }
  object Image {
    
    inline def apply(dimension: String, id: String): Image = {
      val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var messageId: String
    
    var originalFormat: String
    
    var sharedMessage: js.UndefOr[Message] = js.undefined
    
    var sid: String
    
    var stream: Stream
    
    var timestamp: Double
    
    var user: User
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Message {
    
    inline def apply(
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
    
    extension [Self <: Message](x: Self) {
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setOriginalFormat(value: String): Self = StObject.set(x, "originalFormat", value.asInstanceOf[js.Any])
      
      inline def setSharedMessage(value: Message): Self = StObject.set(x, "sharedMessage", value.asInstanceOf[js.Any])
      
      inline def setSharedMessageUndefined: Self = StObject.set(x, "sharedMessage", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait Stream extends StObject {
    
    var streamId: String
    
    var streamType: StreamType
  }
  object Stream {
    
    inline def apply(streamId: String, streamType: StreamType): Stream = {
      val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any], streamType = streamType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
      
      inline def setStreamType(value: StreamType): Self = StObject.set(x, "streamType", value.asInstanceOf[js.Any])
    }
  }
}
