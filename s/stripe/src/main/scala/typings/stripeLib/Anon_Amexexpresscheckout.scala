package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amexexpresscheckout extends js.Object {
  /**
    * (For tokenized numbers only.) The last four digits of the device account number.
    */
  var dynamic_last4: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this is a `google_pay` card wallet, this hash contains details about the wallet.
    */
  var google_pay: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this is a `masterpass` card wallet, this hash contains details about the wallet.
    */
  var masterpass: js.UndefOr[js.Object] = js.undefined
  /**
    * The type of the card wallet, one of `amex_express_checkout`, `apple_pay`, `google_pay`, `masterpass`,
    * `samsung_pay`, or `visa_checkout`. An additional hash is included on the Wallet subhash with a name
    * matching this value. It contains additional information specific to the card wallet type.
    */
  var `type`: stripeLib.stripeLibStrings.amex_express_checkout | stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.google_pay | stripeLib.stripeLibStrings.masterpass | stripeLib.stripeLibStrings.samsung_pay | stripeLib.stripeLibStrings.visa_checkout
}

object Anon_Amexexpresscheckout {
  @scala.inline
  def apply(
    `type`: stripeLib.stripeLibStrings.amex_express_checkout | stripeLib.stripeLibStrings.apple_pay | stripeLib.stripeLibStrings.google_pay | stripeLib.stripeLibStrings.masterpass | stripeLib.stripeLibStrings.samsung_pay | stripeLib.stripeLibStrings.visa_checkout,
    dynamic_last4: java.lang.String = null,
    google_pay: java.lang.String = null,
    masterpass: js.Object = null
  ): Anon_Amexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4)
    if (google_pay != null) __obj.updateDynamic("google_pay")(google_pay)
    if (masterpass != null) __obj.updateDynamic("masterpass")(masterpass)
    __obj.asInstanceOf[Anon_Amexexpresscheckout]
  }
}

