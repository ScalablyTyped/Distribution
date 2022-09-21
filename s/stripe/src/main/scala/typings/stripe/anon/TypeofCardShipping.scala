package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardShipping extends StObject {
  
  val Shipping: Any
  
  val SpendingControls: TypeofSpendingControls
  
  val Wallets: TypeofWallets
}
object TypeofCardShipping {
  
  inline def apply(Shipping: Any, SpendingControls: TypeofSpendingControls, Wallets: TypeofWallets): TypeofCardShipping = {
    val __obj = js.Dynamic.literal(Shipping = Shipping.asInstanceOf[js.Any], SpendingControls = SpendingControls.asInstanceOf[js.Any], Wallets = Wallets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardShipping]
  }
  
  extension [Self <: TypeofCardShipping](x: Self) {
    
    inline def setShipping(value: Any): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setSpendingControls(value: TypeofSpendingControls): Self = StObject.set(x, "SpendingControls", value.asInstanceOf[js.Any])
    
    inline def setWallets(value: TypeofWallets): Self = StObject.set(x, "Wallets", value.asInstanceOf[js.Any])
  }
}
