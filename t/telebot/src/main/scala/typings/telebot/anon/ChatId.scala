package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatId extends StObject {
  
  var chatId: js.UndefOr[Double] = js.undefined
  
  var disableEditMessage: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var inlineMessageId: js.UndefOr[String] = js.undefined
  
  var messageId: js.UndefOr[Double] = js.undefined
}
object ChatId {
  
  @scala.inline
  def apply(): ChatId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatId]
  }
  
  @scala.inline
  implicit class ChatIdMutableBuilder[Self <: ChatId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatId(value: Double): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    @scala.inline
    def setDisableEditMessage(value: Boolean): Self = StObject.set(x, "disableEditMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEditMessageUndefined: Self = StObject.set(x, "disableEditMessage", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setInlineMessageId(value: String): Self = StObject.set(x, "inlineMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineMessageIdUndefined: Self = StObject.set(x, "inlineMessageId", js.undefined)
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
