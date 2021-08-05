package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.amex_express_checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// There are currently no child attributes for these wallet types in the documentation. See https://stripe.com/docs/api/payment_methods/object#payment_method_object-card-wallet.
trait AmericanExpressWallet
  extends StObject
     with CardWallet {
  
  var `type`: amex_express_checkout
}
object AmericanExpressWallet {
  
  inline def apply(): AmericanExpressWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amex_express_checkout")
    __obj.asInstanceOf[AmericanExpressWallet]
  }
  
  extension [Self <: AmericanExpressWallet](x: Self) {
    
    inline def setType(value: amex_express_checkout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
