package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  var currency: java.lang.String
  var description: java.lang.String
  var isFlexible: js.UndefOr[scala.Boolean] = js.undefined
  var need: js.UndefOr[Anon_Email] = js.undefined
  var notification: js.UndefOr[scala.Boolean] = js.undefined
  var payload: java.lang.String
  var photo: js.UndefOr[Anon_Height] = js.undefined
  var prices: js.Array[_]
  var providerToken: java.lang.String
  var replyMarkup: js.UndefOr[js.Any] = js.undefined
  var replyToMessage: js.UndefOr[scala.Double] = js.undefined
  var startParameter: java.lang.String
  var title: java.lang.String
}

object Anon_Currency {
  @scala.inline
  def apply(
    currency: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    prices: js.Array[_],
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    title: java.lang.String,
    isFlexible: js.UndefOr[scala.Boolean] = js.undefined,
    need: Anon_Email = null,
    notification: js.UndefOr[scala.Boolean] = js.undefined,
    photo: Anon_Height = null,
    replyMarkup: js.Any = null,
    replyToMessage: scala.Int | scala.Double = null
  ): Anon_Currency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("prices")(prices)
    __obj.updateDynamic("providerToken")(providerToken)
    __obj.updateDynamic("startParameter")(startParameter)
    __obj.updateDynamic("title")(title)
    if (!js.isUndefined(isFlexible)) __obj.updateDynamic("isFlexible")(isFlexible)
    if (need != null) __obj.updateDynamic("need")(need)
    if (!js.isUndefined(notification)) __obj.updateDynamic("notification")(notification)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (replyMarkup != null) __obj.updateDynamic("replyMarkup")(replyMarkup)
    if (replyToMessage != null) __obj.updateDynamic("replyToMessage")(replyToMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Currency]
  }
}

