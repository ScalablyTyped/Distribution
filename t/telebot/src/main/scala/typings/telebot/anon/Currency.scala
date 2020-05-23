package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var currency: String
  var description: String
  var isFlexible: js.UndefOr[Boolean] = js.undefined
  var need: js.UndefOr[Email] = js.undefined
  var notification: js.UndefOr[Boolean] = js.undefined
  var payload: String
  var photo: js.UndefOr[Url] = js.undefined
  var prices: js.Array[_]
  var providerToken: String
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[Double] = js.undefined
  var startParameter: String
  var title: String
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
    title: String,
    isFlexible: js.UndefOr[Boolean] = js.undefined,
    need: Email = null,
    notification: js.UndefOr[Boolean] = js.undefined,
    photo: Url = null,
    replyMarkup: js.Any = null,
    replyToMessage: js.UndefOr[Double] = js.undefined
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], startParameter = startParameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(isFlexible)) __obj.updateDynamic("isFlexible")(isFlexible.get.asInstanceOf[js.Any])
    if (need != null) __obj.updateDynamic("need")(need.asInstanceOf[js.Any])
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification.get.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup.asInstanceOf[js.Any])
    if (!js.isUndefined(replyToMessage)) __obj.updateDynamic("replyToMessage")(replyToMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
}

