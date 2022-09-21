package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var currency: String
  
  var description: String
  
  var isFlexible: js.UndefOr[Boolean] = js.undefined
  
  var need: js.UndefOr[Email] = js.undefined
  
  var notification: js.UndefOr[Boolean] = js.undefined
  
  var payload: String
  
  var photo: js.UndefOr[Url] = js.undefined
  
  var prices: js.Array[Any]
  
  var providerToken: String
  
  var replyMarkup: js.UndefOr[Any] = js.undefined
  
  var replyToMessage: js.UndefOr[Double] = js.undefined
  
  var startParameter: String
  
  var title: String
}
object Currency {
  
  inline def apply(
    currency: String,
    description: String,
    payload: String,
    prices: js.Array[Any],
    providerToken: String,
    startParameter: String,
    title: String
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], startParameter = startParameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  extension [Self <: Currency](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsFlexible(value: Boolean): Self = StObject.set(x, "isFlexible", value.asInstanceOf[js.Any])
    
    inline def setIsFlexibleUndefined: Self = StObject.set(x, "isFlexible", js.undefined)
    
    inline def setNeed(value: Email): Self = StObject.set(x, "need", value.asInstanceOf[js.Any])
    
    inline def setNeedUndefined: Self = StObject.set(x, "need", js.undefined)
    
    inline def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPhoto(value: Url): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPrices(value: js.Array[Any]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesVarargs(value: Any*): Self = StObject.set(x, "prices", js.Array(value*))
    
    inline def setProviderToken(value: String): Self = StObject.set(x, "providerToken", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkup(value: Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    inline def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    inline def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    inline def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    inline def setStartParameter(value: String): Self = StObject.set(x, "startParameter", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
