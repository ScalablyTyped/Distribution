package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeCheckoutItem extends StObject {
  
  var plan: js.UndefOr[String] = js.native
  
  var quantity: Double = js.native
  
  var sku: js.UndefOr[String] = js.native
}
object StripeCheckoutItem {
  
  @scala.inline
  def apply(quantity: Double): StripeCheckoutItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCheckoutItem]
  }
  
  @scala.inline
  implicit class StripeCheckoutItemMutableBuilder[Self <: StripeCheckoutItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
