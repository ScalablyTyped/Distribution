package typings.swellJs

import typings.swellJs.mod.BaseModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionItems
  extends StObject
     with BaseModel {
  
  var description: js.UndefOr[String] = js.undefined
  
  var discount_each: js.UndefOr[Double] = js.undefined
  
  var discount_total: js.UndefOr[Double] = js.undefined
  
  var price: js.UndefOr[Double] = js.undefined
  
  var price_total: js.UndefOr[Double] = js.undefined
  
  var proration: js.UndefOr[Boolean] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var recurring_discount_each: js.UndefOr[Double] = js.undefined
  
  var recurring_discount_total: js.UndefOr[Double] = js.undefined
  
  var recurring_price: js.UndefOr[Double] = js.undefined
  
  var recurring_price_total: js.UndefOr[Double] = js.undefined
  
  var recurring_tax_each: js.UndefOr[Double] = js.undefined
  
  var recurring_tax_total: js.UndefOr[Double] = js.undefined
  
  var tax_each: js.UndefOr[Double] = js.undefined
  
  var tax_total: js.UndefOr[Double] = js.undefined
}
object SubscriptionItems {
  
  inline def apply(): SubscriptionItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionItems] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscount_each(value: Double): Self = StObject.set(x, "discount_each", value.asInstanceOf[js.Any])
    
    inline def setDiscount_eachUndefined: Self = StObject.set(x, "discount_each", js.undefined)
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setDiscount_totalUndefined: Self = StObject.set(x, "discount_total", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPrice_total(value: Double): Self = StObject.set(x, "price_total", value.asInstanceOf[js.Any])
    
    inline def setPrice_totalUndefined: Self = StObject.set(x, "price_total", js.undefined)
    
    inline def setProration(value: Boolean): Self = StObject.set(x, "proration", value.asInstanceOf[js.Any])
    
    inline def setProrationUndefined: Self = StObject.set(x, "proration", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRecurring_discount_each(value: Double): Self = StObject.set(x, "recurring_discount_each", value.asInstanceOf[js.Any])
    
    inline def setRecurring_discount_eachUndefined: Self = StObject.set(x, "recurring_discount_each", js.undefined)
    
    inline def setRecurring_discount_total(value: Double): Self = StObject.set(x, "recurring_discount_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_discount_totalUndefined: Self = StObject.set(x, "recurring_discount_total", js.undefined)
    
    inline def setRecurring_price(value: Double): Self = StObject.set(x, "recurring_price", value.asInstanceOf[js.Any])
    
    inline def setRecurring_priceUndefined: Self = StObject.set(x, "recurring_price", js.undefined)
    
    inline def setRecurring_price_total(value: Double): Self = StObject.set(x, "recurring_price_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_price_totalUndefined: Self = StObject.set(x, "recurring_price_total", js.undefined)
    
    inline def setRecurring_tax_each(value: Double): Self = StObject.set(x, "recurring_tax_each", value.asInstanceOf[js.Any])
    
    inline def setRecurring_tax_eachUndefined: Self = StObject.set(x, "recurring_tax_each", js.undefined)
    
    inline def setRecurring_tax_total(value: Double): Self = StObject.set(x, "recurring_tax_total", value.asInstanceOf[js.Any])
    
    inline def setRecurring_tax_totalUndefined: Self = StObject.set(x, "recurring_tax_total", js.undefined)
    
    inline def setTax_each(value: Double): Self = StObject.set(x, "tax_each", value.asInstanceOf[js.Any])
    
    inline def setTax_eachUndefined: Self = StObject.set(x, "tax_each", js.undefined)
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setTax_totalUndefined: Self = StObject.set(x, "tax_total", js.undefined)
  }
}
