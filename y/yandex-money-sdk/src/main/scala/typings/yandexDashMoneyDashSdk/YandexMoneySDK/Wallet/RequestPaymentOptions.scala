package typings.yandexDashMoneyDashSdk.YandexMoneySDK.Wallet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentOptions
  extends /* key */ StringDictionary[js.Any] {
  var amount: js.UndefOr[Double] = js.undefined
  var amount_due: js.UndefOr[Double] = js.undefined
  var codepro: js.UndefOr[Boolean] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var expire_period: js.UndefOr[Double] = js.undefined
  var hold_for_pickup: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var pattern_id: String
  var `phone-number`: js.UndefOr[String] = js.undefined
  var test_card: js.UndefOr[String] = js.undefined
  var test_payment: js.UndefOr[Boolean] = js.undefined
  var test_result: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object RequestPaymentOptions {
  @scala.inline
  def apply(
    pattern_id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    amount: Int | Double = null,
    amount_due: Int | Double = null,
    codepro: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    expire_period: Int | Double = null,
    hold_for_pickup: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    message: String = null,
    `phone-number`: String = null,
    test_card: String = null,
    test_payment: js.UndefOr[Boolean] = js.undefined,
    test_result: String = null,
    to: String = null
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amount_due != null) __obj.updateDynamic("amount_due")(amount_due.asInstanceOf[js.Any])
    if (!js.isUndefined(codepro)) __obj.updateDynamic("codepro")(codepro)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (expire_period != null) __obj.updateDynamic("expire_period")(expire_period.asInstanceOf[js.Any])
    if (!js.isUndefined(hold_for_pickup)) __obj.updateDynamic("hold_for_pickup")(hold_for_pickup)
    if (label != null) __obj.updateDynamic("label")(label)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`phone-number` != null) __obj.updateDynamic("phone-number")(`phone-number`)
    if (test_card != null) __obj.updateDynamic("test_card")(test_card)
    if (!js.isUndefined(test_payment)) __obj.updateDynamic("test_payment")(test_payment)
    if (test_result != null) __obj.updateDynamic("test_result")(test_result)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RequestPaymentOptions]
  }
}

