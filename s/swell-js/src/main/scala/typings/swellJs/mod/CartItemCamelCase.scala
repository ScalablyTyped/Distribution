package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartItemCamelCase
  extends StObject
     with CartItem {
  
  var discountEach: Double
  
  var discountTotal: Double
  
  var id: String
  
  var origPrice: Double
  
  var price: Double
  
  var priceTotal: Double
  
  var product: Product
  
  var productId: String
  
  var quantity: Double
  
  var shipmentWeight: Double
  
  var taxEach: Double
  
  var taxTotal: Double
  
  var variant: Null
}
object CartItemCamelCase {
  
  inline def apply(
    discountEach: Double,
    discountTotal: Double,
    id: String,
    origPrice: Double,
    price: Double,
    priceTotal: Double,
    product: Product,
    productId: String,
    quantity: Double,
    shipmentWeight: Double,
    taxEach: Double,
    taxTotal: Double,
    variant: Null
  ): CartItemCamelCase = {
    val __obj = js.Dynamic.literal(discountEach = discountEach.asInstanceOf[js.Any], discountTotal = discountTotal.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origPrice = origPrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceTotal = priceTotal.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], shipmentWeight = shipmentWeight.asInstanceOf[js.Any], taxEach = taxEach.asInstanceOf[js.Any], taxTotal = taxTotal.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartItemCamelCase]
  }
  
  extension [Self <: CartItemCamelCase](x: Self) {
    
    inline def setDiscountEach(value: Double): Self = StObject.set(x, "discountEach", value.asInstanceOf[js.Any])
    
    inline def setDiscountTotal(value: Double): Self = StObject.set(x, "discountTotal", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrigPrice(value: Double): Self = StObject.set(x, "origPrice", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceTotal(value: Double): Self = StObject.set(x, "priceTotal", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setShipmentWeight(value: Double): Self = StObject.set(x, "shipmentWeight", value.asInstanceOf[js.Any])
    
    inline def setTaxEach(value: Double): Self = StObject.set(x, "taxEach", value.asInstanceOf[js.Any])
    
    inline def setTaxTotal(value: Double): Self = StObject.set(x, "taxTotal", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: Null): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
