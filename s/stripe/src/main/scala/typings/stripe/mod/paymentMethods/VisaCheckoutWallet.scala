package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.visa_checkout
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
  implicit class VisaCheckoutWalletOps[Self <: VisaCheckoutWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: visa_checkout): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisa_checkout(value: WalletData): Self = this.set("visa_checkout", value.asInstanceOf[js.Any])
  }
}
