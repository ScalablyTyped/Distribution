package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageId extends js.Object {
  
  var chatId: js.UndefOr[Double | String] = js.native
  
  var inlineMsgId: Double = js.native
  
  var messageId: js.UndefOr[Double] = js.native
}
object MessageId {
  
  @scala.inline
  def apply(inlineMsgId: Double): MessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
  
  @scala.inline
  implicit class MessageIdOps[Self <: MessageId] (val x: Self) extends AnyVal {
    
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
    def setInlineMsgId(value: Double): Self = this.set("inlineMsgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatId(value: Double | String): Self = this.set("chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChatId: Self = this.set("chatId", js.undefined)
    
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
}
