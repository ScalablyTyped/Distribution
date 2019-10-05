package typings.yandexDashMoneyDashSdk.YandexMoneySDK.ExternalPayment

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends /* key */ StringDictionary[js.Any] {
  var amount: js.UndefOr[Double] = js.undefined
  var amount_due: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var pattern_id: String
  // instance_id: string; // the method always overwrites this value
  var to: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    pattern_id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    amount: Int | Double = null,
    amount_due: Int | Double = null,
    message: String = null,
    to: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amount_due != null) __obj.updateDynamic("amount_due")(amount_due.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RequestOptions]
  }
}

