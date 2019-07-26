package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisaCheckoutWallet extends CardWallet {
  var `type`: stripeLib.stripeLibStrings.visa_checkout
  var visa_checkout: WalletData
}

object VisaCheckoutWallet {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.visa_checkout, visa_checkout: WalletData): VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VisaCheckoutWallet]
  }
}

