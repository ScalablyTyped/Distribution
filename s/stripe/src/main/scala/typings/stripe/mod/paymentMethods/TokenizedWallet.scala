package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizedWallet extends StObject {
  
  /** (For tokenized numbers only.) The last four digits of the device account number. */
  var dynamic_last4: js.UndefOr[String] = js.undefined
}
object TokenizedWallet {
  
  inline def apply(): TokenizedWallet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizedWallet]
  }
  
  extension [Self <: TokenizedWallet](x: Self) {
    
    inline def setDynamic_last4(value: String): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    inline def setDynamic_last4Undefined: Self = StObject.set(x, "dynamic_last4", js.undefined)
  }
}
