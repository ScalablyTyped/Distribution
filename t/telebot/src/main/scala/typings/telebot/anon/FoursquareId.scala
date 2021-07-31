package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoursquareId extends StObject {
  
  var foursquareId: js.UndefOr[String] = js.undefined
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
}
object FoursquareId {
  
  @scala.inline
  def apply(): FoursquareId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoursquareId]
  }
  
  @scala.inline
  implicit class FoursquareIdMutableBuilder[Self <: FoursquareId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoursquareId(value: String): Self = StObject.set(x, "foursquareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoursquareIdUndefined: Self = StObject.set(x, "foursquareId", js.undefined)
    
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
