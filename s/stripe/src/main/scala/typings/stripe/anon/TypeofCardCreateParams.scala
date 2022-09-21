package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCardCreateParams extends StObject {
  
  val Shipping: Any
  
  val SpendingControls: TypeofSpendingControls
}
object TypeofCardCreateParams {
  
  inline def apply(Shipping: Any, SpendingControls: TypeofSpendingControls): TypeofCardCreateParams = {
    val __obj = js.Dynamic.literal(Shipping = Shipping.asInstanceOf[js.Any], SpendingControls = SpendingControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCardCreateParams]
  }
  
  extension [Self <: TypeofCardCreateParams](x: Self) {
    
    inline def setShipping(value: Any): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setSpendingControls(value: TypeofSpendingControls): Self = StObject.set(x, "SpendingControls", value.asInstanceOf[js.Any])
  }
}
