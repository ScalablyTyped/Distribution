package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Currency extends js.Object {
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
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricesVarargs(value: js.Any*): Self = this.set("prices", js.Array(value :_*))
    @scala.inline
    def setPrices(value: js.Array[_]): Self = this.set("prices", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderToken(value: String): Self = this.set("providerToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartParameter(value: String): Self = this.set("startParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFlexible(value: Boolean): Self = this.set("isFlexible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFlexible: Self = this.set("isFlexible", js.undefined)
    @scala.inline
    def setNeed(value: Email): Self = this.set("need", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeed: Self = this.set("need", js.undefined)
    @scala.inline
    def setNotification(value: Boolean): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setPhoto(value: Url): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = this.set("replyMarkup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyMarkup: Self = this.set("replyMarkup", js.undefined)
    @scala.inline
    def setReplyToMessage(value: Double): Self = this.set("replyToMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToMessage: Self = this.set("replyToMessage", js.undefined)
  }
  
}

