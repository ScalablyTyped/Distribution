package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.apple_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePayWallet
  extends TokenizedWallet
     with CardWallet {
  
  var `type`: apple_pay = js.native
}
object ApplePayWallet {
  
  @scala.inline
  def apply(`type`: apple_pay): ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayWallet]
  }
  
  @scala.inline
  implicit class ApplePayWalletOps[Self <: ApplePayWallet] (val x: Self) extends AnyVal {
    
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
    def setType(value: apple_pay): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
