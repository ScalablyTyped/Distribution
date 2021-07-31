package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var parseMode: js.UndefOr[String] = js.undefined
  
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
  
  var webPreview: js.UndefOr[Boolean] = js.undefined
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setParseMode(value: String): Self = StObject.set(x, "parseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseModeUndefined: Self = StObject.set(x, "parseMode", js.undefined)
    
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    @scala.inline
    def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    @scala.inline
    def setWebPreview(value: Boolean): Self = StObject.set(x, "webPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPreviewUndefined: Self = StObject.set(x, "webPreview", js.undefined)
  }
}
