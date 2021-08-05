package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineMsgId extends StObject {
  
  var chatId: Double | String
  
  var inlineMsgId: js.UndefOr[Double] = js.undefined
  
  var messageId: Double
}
object InlineMsgId {
  
  inline def apply(chatId: Double | String, messageId: Double): InlineMsgId = {
    val __obj = js.Dynamic.literal(chatId = chatId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineMsgId]
  }
  
  extension [Self <: InlineMsgId](x: Self) {
    
    inline def setChatId(value: Double | String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setInlineMsgId(value: Double): Self = StObject.set(x, "inlineMsgId", value.asInstanceOf[js.Any])
    
    inline def setInlineMsgIdUndefined: Self = StObject.set(x, "inlineMsgId", js.undefined)
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
