package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.amex_express_checkout
import typings.stripeV3.stripeV3Strings.apple_pay
import typings.stripeV3.stripeV3Strings.google_pay
import typings.stripeV3.stripeV3Strings.masterpass
import typings.stripeV3.stripeV3Strings.samsung_pay
import typings.stripeV3.stripeV3Strings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amexexpresscheckout extends js.Object {
  var amex_express_checkout: js.UndefOr[js.Any] = js.undefined
  var apple_pay: js.UndefOr[js.Any] = js.undefined
  var dynamic_last4: js.UndefOr[js.Any] = js.undefined
  var google_pay: js.UndefOr[js.Any] = js.undefined
  var masterpass: js.UndefOr[js.Any] = js.undefined
  var samsung_pay: js.UndefOr[js.Any] = js.undefined
  var `type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout
  var visa_checkout: js.UndefOr[js.Any] = js.undefined
}

object Amexexpresscheckout {
  @scala.inline
  def apply(
    `type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout,
    amex_express_checkout: js.Any = null,
    apple_pay: js.Any = null,
    dynamic_last4: js.Any = null,
    google_pay: js.Any = null,
    masterpass: js.Any = null,
    samsung_pay: js.Any = null,
    visa_checkout: js.Any = null
  ): Amexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (amex_express_checkout != null) __obj.updateDynamic("amex_express_checkout")(amex_express_checkout.asInstanceOf[js.Any])
    if (apple_pay != null) __obj.updateDynamic("apple_pay")(apple_pay.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    if (google_pay != null) __obj.updateDynamic("google_pay")(google_pay.asInstanceOf[js.Any])
    if (masterpass != null) __obj.updateDynamic("masterpass")(masterpass.asInstanceOf[js.Any])
    if (samsung_pay != null) __obj.updateDynamic("samsung_pay")(samsung_pay.asInstanceOf[js.Any])
    if (visa_checkout != null) __obj.updateDynamic("visa_checkout")(visa_checkout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amexexpresscheckout]
  }
}

