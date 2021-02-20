package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.apple_pay
import org.scalablytyped.runtime.StObject
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
  implicit class ApplePayWalletMutableBuilder[Self <: ApplePayWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: apple_pay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
