package typings.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends StObject {
  
  var currency: String = js.native
  
  var description: String = js.native
  
  var isFlexible: js.UndefOr[Boolean] = js.native
  
  var need: js.UndefOr[Email] = js.native
  
  var notification: js.UndefOr[Boolean] = js.native
  
  var payload: String = js.native
  
  var photo: js.UndefOr[Url] = js.native
  
  var prices: js.Array[_] = js.native
  
  var providerToken: String = js.native
  
  var replyMarkup: js.UndefOr[js.Any] = js.native
  
  var replyToMessage: js.UndefOr[Double] = js.native
  
  var startParameter: String = js.native
  
  var title: String = js.native
}
object Currency {
  
  @scala.inline
  def apply(
    currency: String,
    description: String,
    payload: String,
    prices: js.Array[_],
    providerToken: String,
    startParameter: String,
    title: String
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], startParameter = startParameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlexible(value: Boolean): Self = StObject.set(x, "isFlexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFlexibleUndefined: Self = StObject.set(x, "isFlexible", js.undefined)
    
    @scala.inline
    def setNeed(value: Email): Self = StObject.set(x, "need", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedUndefined: Self = StObject.set(x, "need", js.undefined)
    
    @scala.inline
    def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto(value: Url): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPrices(value: js.Array[_]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesVarargs(value: js.Any*): Self = StObject.set(x, "prices", js.Array(value :_*))
    
    @scala.inline
    def setProviderToken(value: String): Self = StObject.set(x, "providerToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    @scala.inline
    def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    @scala.inline
    def setStartParameter(value: String): Self = StObject.set(x, "startParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
