package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.samsung_pay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamsungPayWallet
  extends TokenizedWallet
     with CardWallet {
  
  var `type`: samsung_pay = js.native
}
object SamsungPayWallet {
  
  @scala.inline
  def apply(`type`: samsung_pay): SamsungPayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamsungPayWallet]
  }
  
  @scala.inline
  implicit class SamsungPayWalletMutableBuilder[Self <: SamsungPayWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: samsung_pay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
