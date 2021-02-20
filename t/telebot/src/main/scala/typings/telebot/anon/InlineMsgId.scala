package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineMsgId extends StObject {
  
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
  implicit class InlineMsgIdMutableBuilder[Self <: InlineMsgId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineMsgId(value: Double): Self = StObject.set(x, "inlineMsgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineMsgIdUndefined: Self = StObject.set(x, "inlineMsgId", js.undefined)
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
