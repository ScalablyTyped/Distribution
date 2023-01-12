package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartItemSnakeCase
  extends StObject
     with CartItem {
  
  var discount_each: Double
  
  var discount_total: Double
  
  var id: String
  
  var orig_price: Double
  
  var price: Double
  
  var price_total: Double
  
  var product: Product
  
  var product_id: String
  
  var quantity: Double
  
  var shipment_weight: Double
  
  var tax_each: Double
  
  var tax_total: Double
  
  var variant: Null
}
object CartItemSnakeCase {
  
  inline def apply(
    discount_each: Double,
    discount_total: Double,
    id: String,
    orig_price: Double,
    price: Double,
    price_total: Double,
    product: Product,
    product_id: String,
    quantity: Double,
    shipment_weight: Double,
    tax_each: Double,
    tax_total: Double,
    variant: Null
  ): CartItemSnakeCase = {
    val __obj = js.Dynamic.literal(discount_each = discount_each.asInstanceOf[js.Any], discount_total = discount_total.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orig_price = orig_price.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_total = price_total.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], shipment_weight = shipment_weight.asInstanceOf[js.Any], tax_each = tax_each.asInstanceOf[js.Any], tax_total = tax_total.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartItemSnakeCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartItemSnakeCase] (val x: Self) extends AnyVal {
    
    inline def setDiscount_each(value: Double): Self = StObject.set(x, "discount_each", value.asInstanceOf[js.Any])
    
    inline def setDiscount_total(value: Double): Self = StObject.set(x, "discount_total", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrig_price(value: Double): Self = StObject.set(x, "orig_price", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPrice_total(value: Double): Self = StObject.set(x, "price_total", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setShipment_weight(value: Double): Self = StObject.set(x, "shipment_weight", value.asInstanceOf[js.Any])
    
    inline def setTax_each(value: Double): Self = StObject.set(x, "tax_each", value.asInstanceOf[js.Any])
    
    inline def setTax_total(value: Double): Self = StObject.set(x, "tax_total", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: Null): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
