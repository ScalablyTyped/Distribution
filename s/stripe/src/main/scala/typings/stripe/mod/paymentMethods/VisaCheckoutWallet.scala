package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.visa_checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisaCheckoutWallet extends CardWallet {
  
  var `type`: visa_checkout = js.native
  
  var visa_checkout: WalletData = js.native
}
object VisaCheckoutWallet {
  
  @scala.inline
  def apply(`type`: visa_checkout, visa_checkout: WalletData): VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisaCheckoutWallet]
  }
  
  @scala.inline
  implicit class VisaCheckoutWalletMutableBuilder[Self <: VisaCheckoutWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: visa_checkout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisa_checkout(value: WalletData): Self = StObject.set(x, "visa_checkout", value.asInstanceOf[js.Any])
  }
}
