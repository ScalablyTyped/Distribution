package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationReplyMarkup extends StObject {
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var replyMarkup: js.UndefOr[Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
}
object NotificationReplyMarkup {
  
  inline def apply(): NotificationReplyMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationReplyMarkup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationReplyMarkup] (val x: Self) extends AnyVal {
    
    inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setReplyMarkup(value: Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    inline def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    inline def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
  }
}
