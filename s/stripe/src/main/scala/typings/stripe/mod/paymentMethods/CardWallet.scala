package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.amex_express_checkout
import typings.stripe.stripeStrings.apple_pay
import typings.stripe.stripeStrings.google_pay
import typings.stripe.stripeStrings.masterpass
import typings.stripe.stripeStrings.samsung_pay
import typings.stripe.stripeStrings.visa_checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.stripe.mod.paymentMethods.MasterpassWallet
  - typings.stripe.mod.paymentMethods.VisaCheckoutWallet
  - typings.stripe.mod.paymentMethods.AmericanExpressWallet
  - typings.stripe.mod.paymentMethods.ApplePayWallet
  - typings.stripe.mod.paymentMethods.GooglePayWallet
  - typings.stripe.mod.paymentMethods.SamsungPayWallet
*/
trait CardWallet extends StObject
object CardWallet {
  
  @scala.inline
  def AmericanExpressWallet(`type`: amex_express_checkout): typings.stripe.mod.paymentMethods.AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.AmericanExpressWallet]
  }
  
  @scala.inline
  def ApplePayWallet(`type`: apple_pay): typings.stripe.mod.paymentMethods.ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ApplePayWallet]
  }
  
  @scala.inline
  def GooglePayWallet(`type`: google_pay): typings.stripe.mod.paymentMethods.GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.GooglePayWallet]
  }
  
  @scala.inline
  def MasterpassWallet(masterpass: WalletData, `type`: masterpass): typings.stripe.mod.paymentMethods.MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.MasterpassWallet]
  }
  
  @scala.inline
  def SamsungPayWallet(`type`: samsung_pay): typings.stripe.mod.paymentMethods.SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.SamsungPayWallet]
  }
  
  @scala.inline
  def VisaCheckoutWallet(`type`: visa_checkout, visa_checkout: WalletData): typings.stripe.mod.paymentMethods.VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.VisaCheckoutWallet]
  }
}
