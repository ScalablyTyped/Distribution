package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageId extends StObject {
  
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
  implicit class MessageIdMutableBuilder[Self <: MessageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    @scala.inline
    def setInlineMsgId(value: Double): Self = StObject.set(x, "inlineMsgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
