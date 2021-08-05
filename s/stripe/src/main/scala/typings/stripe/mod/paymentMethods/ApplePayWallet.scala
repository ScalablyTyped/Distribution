package typings.stripe.mod.paymentMethods

import typings.stripe.stripeStrings.apple_pay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePayWallet
  extends StObject
     with TokenizedWallet
     with CardWallet {
  
  var `type`: apple_pay
}
object ApplePayWallet {
  
  inline def apply(): ApplePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("apple_pay")
    __obj.asInstanceOf[ApplePayWallet]
  }
  
  extension [Self <: ApplePayWallet](x: Self) {
    
    inline def setType(value: apple_pay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
