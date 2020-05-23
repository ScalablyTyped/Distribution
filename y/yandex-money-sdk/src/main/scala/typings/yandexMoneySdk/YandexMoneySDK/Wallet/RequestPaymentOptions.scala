package typings.yandexMoneySdk.YandexMoneySDK.Wallet

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    amount: js.UndefOr[Double] = js.undefined,
    amount_due: js.UndefOr[Double] = js.undefined,
    codepro: js.UndefOr[Boolean] = js.undefined,
    comment: String = null,
    expire_period: js.UndefOr[Double] = js.undefined,
    hold_for_pickup: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    message: String = null,
    `phone-number`: String = null,
    test_card: String = null,
    test_payment: js.UndefOr[Boolean] = js.undefined,
    test_result: String = null,
    to: String = null
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(amount_due)) __obj.updateDynamic("amount_due")(amount_due.get.asInstanceOf[js.Any])
    if (!js.isUndefined(codepro)) __obj.updateDynamic("codepro")(codepro.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(expire_period)) __obj.updateDynamic("expire_period")(expire_period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hold_for_pickup)) __obj.updateDynamic("hold_for_pickup")(hold_for_pickup.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`phone-number` != null) __obj.updateDynamic("phone-number")(`phone-number`.asInstanceOf[js.Any])
    if (test_card != null) __obj.updateDynamic("test_card")(test_card.asInstanceOf[js.Any])
    if (!js.isUndefined(test_payment)) __obj.updateDynamic("test_payment")(test_payment.get.asInstanceOf[js.Any])
    if (test_result != null) __obj.updateDynamic("test_result")(test_result.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOptions]
  }
}

