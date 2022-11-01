package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swellJs.mod.ProductCamelCase
  - typings.swellJs.mod.ProductSnakeCase
*/
trait Product extends StObject
object Product {
  
  inline def ProductCamelCase(
    attributes: Any,
    description: String,
    id: String,
    name: String,
    price: Double,
    sale: Boolean,
    sku: Any,
    slug: String,
    stockLevel: Double,
    stockPurchasable: Boolean,
    stockTracking: Boolean
  ): typings.swellJs.mod.ProductCamelCase = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sale = sale.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], stockLevel = stockLevel.asInstanceOf[js.Any], stockPurchasable = stockPurchasable.asInstanceOf[js.Any], stockTracking = stockTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swellJs.mod.ProductCamelCase]
  }
  
  inline def ProductSnakeCase(
    attributes: Any,
    description: String,
    id: String,
    name: String,
    price: Double,
    sale: Boolean,
    sku: Any,
    slug: String,
    stock_level: Double,
    stock_purchasable: Boolean,
    stock_tracking: Boolean
  ): typings.swellJs.mod.ProductSnakeCase = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sale = sale.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], stock_level = stock_level.asInstanceOf[js.Any], stock_purchasable = stock_purchasable.asInstanceOf[js.Any], stock_tracking = stock_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swellJs.mod.ProductSnakeCase]
  }
}
