package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageId extends StObject {
  
  var chatId: js.UndefOr[Double | String] = js.undefined
  
  var inlineMsgId: Double
  
  var messageId: js.UndefOr[Double] = js.undefined
}
object MessageId {
  
  inline def apply(inlineMsgId: Double): MessageId = {
    val __obj = js.Dynamic.literal(inlineMsgId = inlineMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageId] (val x: Self) extends AnyVal {
    
    inline def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setInlineMsgId(value: Double): Self = StObject.set(x, "inlineMsgId", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
