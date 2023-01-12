package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCheckoutItem extends StObject {
  
  var plan: js.UndefOr[String] = js.undefined
  
  var quantity: Double
  
  var sku: js.UndefOr[String] = js.undefined
}
object StripeCheckoutItem {
  
  inline def apply(quantity: Double): StripeCheckoutItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCheckoutItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StripeCheckoutItem] (val x: Self) extends AnyVal {
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
