package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.google_pay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePayWallet
  extends TokenizedWallet
     with CardWallet {
  
  var `type`: google_pay = js.native
}
object GooglePayWallet {
  
  @scala.inline
  def apply(`type`: google_pay): GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePayWallet]
  }
  
  @scala.inline
  implicit class GooglePayWalletMutableBuilder[Self <: GooglePayWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: google_pay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
