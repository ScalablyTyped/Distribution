package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineMsgId extends js.Object {
  
  var chatId: Double | String = js.native
  
  var inlineMsgId: js.UndefOr[Double] = js.native
  
  var messageId: Double = js.native
}
object InlineMsgId {
  
  @scala.inline
  def apply(chatId: Double | String, messageId: Double): InlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineMsgId]
  }
  
  @scala.inline
  implicit class InlineMsgIdOps[Self <: InlineMsgId] (val x: Self) extends AnyVal {
    
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
    def setChatId(value: Double | String): Self = this.set("chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineMsgId(value: Double): Self = this.set("inlineMsgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineMsgId: Self = this.set("inlineMsgId", js.undefined)
  }
}
