package typings
package yandexDashMoneyDashSdkLib.YandexMoneySDKNs.ExternalPaymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var amount: js.UndefOr[scala.Double] = js.undefined
  var amount_due: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var pattern_id: java.lang.String
  // instance_id: string; // the method always overwrites this value
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    pattern_id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    amount: scala.Int | scala.Double = null,
    amount_due: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    to: java.lang.String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pattern_id")(pattern_id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amount_due != null) __obj.updateDynamic("amount_due")(amount_due.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RequestOptions]
  }
}

