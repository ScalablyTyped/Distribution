package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var parseMode: js.UndefOr[String] = js.undefined
  
  var replyMarkup: js.UndefOr[Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
  
  var webPreview: js.UndefOr[Boolean] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setParseMode(value: String): Self = StObject.set(x, "parseMode", value.asInstanceOf[js.Any])
    
    inline def setParseModeUndefined: Self = StObject.set(x, "parseMode", js.undefined)
    
    inline def setReplyMarkup(value: Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    inline def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    inline def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    inline def setWebPreview(value: Boolean): Self = StObject.set(x, "webPreview", value.asInstanceOf[js.Any])
    
    inline def setWebPreviewUndefined: Self = StObject.set(x, "webPreview", js.undefined)
  }
}
