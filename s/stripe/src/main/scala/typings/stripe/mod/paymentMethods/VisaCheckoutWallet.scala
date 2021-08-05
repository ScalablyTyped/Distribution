package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.visa_checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisaCheckoutWallet
  extends StObject
     with CardWallet {
  
  var `type`: visa_checkout
  
  var visa_checkout: WalletData
}
object VisaCheckoutWallet {
  
  inline def apply(visa_checkout: WalletData): VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("visa_checkout")
    __obj.asInstanceOf[VisaCheckoutWallet]
  }
  
  extension [Self <: VisaCheckoutWallet](x: Self) {
    
    inline def setType(value: visa_checkout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisa_checkout(value: WalletData): Self = StObject.set(x, "visa_checkout", value.asInstanceOf[js.Any])
  }
}
