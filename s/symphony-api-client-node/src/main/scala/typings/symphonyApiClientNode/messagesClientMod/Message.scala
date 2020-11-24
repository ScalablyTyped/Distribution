package typings.symphonyApiClientNode.messagesClientMod

import typings.symphonyApiClientNode.usersClientMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFormat(value: String): Self = this.set("originalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setSharedMessage(value: Message): Self = this.set("sharedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedMessage: Self = this.set("sharedMessage", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
