package typings.stripe.stripeMod.paymentMethods

import typings.stripe.stripeStrings.amex_express_checkout
import typings.stripe.stripeStrings.apple_pay
import typings.stripe.stripeStrings.google_pay
import typings.stripe.stripeStrings.masterpass
import typings.stripe.stripeStrings.samsung_pay
import typings.stripe.stripeStrings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeMod.paymentMethods.MasterpassWallet
  - typings.stripe.stripeMod.paymentMethods.VisaCheckoutWallet
  - typings.stripe.stripeMod.paymentMethods.AmericanExpressWallet
  - typings.stripe.stripeMod.paymentMethods.ApplePayWallet
  - typings.stripe.stripeMod.paymentMethods.GooglePayWallet
  - typings.stripe.stripeMod.paymentMethods.SamsungPayWallet
*/
trait CardWallet extends js.Object

object CardWallet {
  @scala.inline
  def SamsungPayWallet(`type`: samsung_pay, dynamic_last4: String = null): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  @scala.inline
  def ApplePayWallet(`type`: apple_pay, dynamic_last4: String = null): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  @scala.inline
  def MasterpassWallet(masterpass: WalletData, `type`: masterpass): CardWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  @scala.inline
  def AmericanExpressWallet(`type`: amex_express_checkout): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  @scala.inline
  def VisaCheckoutWallet(`type`: visa_checkout, visa_checkout: WalletData): CardWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
  @scala.inline
  def GooglePayWallet(`type`: google_pay, dynamic_last4: String = null): CardWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWallet]
  }
}

