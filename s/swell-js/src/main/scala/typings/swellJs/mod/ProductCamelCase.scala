package typings.swellJs.mod

import typings.swellJs.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCamelCase
  extends StObject
     with Product {
  
  var attributes: Any
  
  var description: String
  
  var id: String
  
  var name: String
  
  var options: js.UndefOr[js.Array[Active]] = js.undefined
  
  var price: Double
  
  var sale: Boolean
  
  var sku: Any
  
  var slug: String
  
  var stockLevel: Double
  
  var stockPurchasable: Boolean
  
  var stockTracking: Boolean
}
object ProductCamelCase {
  
  inline def apply(
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
  ): ProductCamelCase = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sale = sale.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], stockLevel = stockLevel.asInstanceOf[js.Any], stockPurchasable = stockPurchasable.asInstanceOf[js.Any], stockTracking = stockTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCamelCase]
  }
  
  extension [Self <: ProductCamelCase](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Active]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Active*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSale(value: Boolean): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSku(value: Any): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStockLevel(value: Double): Self = StObject.set(x, "stockLevel", value.asInstanceOf[js.Any])
    
    inline def setStockPurchasable(value: Boolean): Self = StObject.set(x, "stockPurchasable", value.asInstanceOf[js.Any])
    
    inline def setStockTracking(value: Boolean): Self = StObject.set(x, "stockTracking", value.asInstanceOf[js.Any])
  }
}
