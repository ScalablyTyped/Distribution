package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizedWallet extends StObject {
  
  /** (For tokenized numbers only.) The last four digits of the device account number. */
  var dynamic_last4: js.UndefOr[String] = js.native
}
object TokenizedWallet {
  
  @scala.inline
  def apply(): TokenizedWallet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizedWallet]
  }
  
  @scala.inline
  implicit class TokenizedWalletMutableBuilder[Self <: TokenizedWallet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic_last4Undefined: Self = StObject.set(x, "dynamic_last4", js.undefined)
  }
}
