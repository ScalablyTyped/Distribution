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
  
  inline def apply(): FoursquareId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoursquareId]
  }
  
  extension [Self <: FoursquareId](x: Self) {
    
    inline def setFoursquareId(value: String): Self = StObject.set(x, "foursquareId", value.asInstanceOf[js.Any])
    
    inline def setFoursquareIdUndefined: Self = StObject.set(x, "foursquareId", js.undefined)
    
    inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setReplyMarkup(value: js.Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    inline def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    inline def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
  }
}
