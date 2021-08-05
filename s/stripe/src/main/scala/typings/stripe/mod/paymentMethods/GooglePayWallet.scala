package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.google_pay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePayWallet
  extends StObject
     with TokenizedWallet
     with CardWallet {
  
  var `type`: google_pay
}
object GooglePayWallet {
  
  inline def apply(): GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("google_pay")
    __obj.asInstanceOf[GooglePayWallet]
  }
  
  extension [Self <: GooglePayWallet](x: Self) {
    
    inline def setType(value: google_pay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
