package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationReplyMarkup extends StObject {
  
  var notification: js.UndefOr[Boolean] = js.native
  
  var replyMarkup: js.UndefOr[js.Any] = js.native
  
  var replyToMessage: js.UndefOr[Double] = js.native
}
object NotificationReplyMarkup {
  
  @scala.inline
  def apply(): NotificationReplyMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationReplyMarkup]
  }
  
  @scala.inline
  implicit class NotificationReplyMarkupMutableBuilder[Self <: NotificationReplyMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    @scala.inline
    def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
  }
}
