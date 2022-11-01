package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swellJs.mod.CartItemCamelCase
  - typings.swellJs.mod.CartItemSnakeCase
*/
trait CartItem extends StObject
object CartItem {
  
  inline def CartItemCamelCase(
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
  ): typings.swellJs.mod.CartItemCamelCase = {
    val __obj = js.Dynamic.literal(discountEach = discountEach.asInstanceOf[js.Any], discountTotal = discountTotal.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origPrice = origPrice.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceTotal = priceTotal.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], shipmentWeight = shipmentWeight.asInstanceOf[js.Any], taxEach = taxEach.asInstanceOf[js.Any], taxTotal = taxTotal.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swellJs.mod.CartItemCamelCase]
  }
  
  inline def CartItemSnakeCase(
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
  ): typings.swellJs.mod.CartItemSnakeCase = {
    val __obj = js.Dynamic.literal(discount_each = discount_each.asInstanceOf[js.Any], discount_total = discount_total.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], orig_price = orig_price.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_total = price_total.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], shipment_weight = shipment_weight.asInstanceOf[js.Any], tax_each = tax_each.asInstanceOf[js.Any], tax_total = tax_total.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swellJs.mod.CartItemSnakeCase]
  }
}
