package typings.yandexMoneySdk.YandexMoneySDK.ExternalPayment

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    amount: js.UndefOr[Double] = js.undefined,
    amount_due: js.UndefOr[Double] = js.undefined,
    message: String = null,
    to: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(pattern_id = pattern_id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(amount_due)) __obj.updateDynamic("amount_due")(amount_due.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

