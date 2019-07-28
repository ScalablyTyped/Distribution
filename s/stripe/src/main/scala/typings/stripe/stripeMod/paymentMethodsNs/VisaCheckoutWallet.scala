package typings.stripe.stripeMod.paymentMethodsNs

import typings.stripe.stripeStrings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisaCheckoutWallet extends CardWallet {
  var `type`: visa_checkout
  var visa_checkout: WalletData
}

object VisaCheckoutWallet {
  @scala.inline
  def apply(`type`: visa_checkout, visa_checkout: WalletData): VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VisaCheckoutWallet]
  }
}

