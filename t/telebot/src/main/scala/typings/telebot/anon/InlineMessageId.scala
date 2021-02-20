package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineMessageId extends StObject {
  
  var chatId: js.UndefOr[Double] = js.native
  
  var inlineMessageId: js.UndefOr[String] = js.native
  
  var messageId: js.UndefOr[Double] = js.native
}
object InlineMessageId {
  
  @scala.inline
  def apply(): InlineMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineMessageId]
  }
  
  @scala.inline
  implicit class InlineMessageIdMutableBuilder[Self <: InlineMessageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatId(value: Double): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
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
