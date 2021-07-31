package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def AmericanExpressWallet(): typings.stripe.mod.paymentMethods.AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amex_express_checkout")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.AmericanExpressWallet]
  }
  
  @scala.inline
  def ApplePayWallet(): typings.stripe.mod.paymentMethods.ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("apple_pay")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.ApplePayWallet]
  }
  
  @scala.inline
  def GooglePayWallet(): typings.stripe.mod.paymentMethods.GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("google_pay")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.GooglePayWallet]
  }
  
  @scala.inline
  def MasterpassWallet(masterpass: WalletData): typings.stripe.mod.paymentMethods.MasterpassWallet = {
    val __obj = js.Dynamic.literal(masterpass = masterpass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("masterpass")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.MasterpassWallet]
  }
  
  @scala.inline
  def SamsungPayWallet(): typings.stripe.mod.paymentMethods.SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("samsung_pay")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.SamsungPayWallet]
  }
  
  @scala.inline
  def VisaCheckoutWallet(visa_checkout: WalletData): typings.stripe.mod.paymentMethods.VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("visa_checkout")
    __obj.asInstanceOf[typings.stripe.mod.paymentMethods.VisaCheckoutWallet]
  }
}
