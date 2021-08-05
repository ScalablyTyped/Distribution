package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineMessageId extends StObject {
  
  var chatId: js.UndefOr[Double] = js.undefined
  
  var inlineMessageId: js.UndefOr[String] = js.undefined
  
  var messageId: js.UndefOr[Double] = js.undefined
}
object InlineMessageId {
  
  inline def apply(): InlineMessageId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineMessageId]
  }
  
  extension [Self <: InlineMessageId](x: Self) {
    
    inline def setChatId(value: Double): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setInlineMessageId(value: String): Self = StObject.set(x, "inlineMessageId", value.asInstanceOf[js.Any])
    
    inline def setInlineMessageIdUndefined: Self = StObject.set(x, "inlineMessageId", js.undefined)
    
    inline def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
