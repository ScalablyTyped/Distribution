package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.amex_express_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// There are currently no child attributes for these wallet types in the documentation. See https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-wallet.
@js.native
trait AmericanExpressWallet extends CardWallet {
  
  var `type`: amex_express_checkout = js.native
}
object AmericanExpressWallet {
  
  @scala.inline
  def apply(`type`: amex_express_checkout): AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmericanExpressWallet]
  }
  
  @scala.inline
  implicit class AmericanExpressWalletOps[Self <: AmericanExpressWallet] (val x: Self) extends AnyVal {
    
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
    def setType(value: amex_express_checkout): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
