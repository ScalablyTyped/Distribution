package typings.swellJs.mod

import typings.swellJs.anon.Active
import typings.swellJs.anon.Count
import typings.swellJs.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCamelCase
  extends StObject
     with Product {
  
  var attributes: Any
  
  var content: Any
  
  var crossSells: js.UndefOr[js.Array[Id]] = js.undefined
  
  var description: String
  
  var id: String
  
  var images: js.Array[ImageCamelCase]
  
  var name: String
  
  var options: js.UndefOr[js.Array[Active]] = js.undefined
  
  var price: Double
  
  var sale: Boolean
  
  var salePrice: js.UndefOr[Double] = js.undefined
  
  var sku: Any
  
  var slug: String
  
  var stockLevel: Double
  
  var stockPurchasable: Boolean
  
  var stockTracking: Boolean
  
  var upSells: js.UndefOr[js.Array[Id]] = js.undefined
  
  var variants: js.UndefOr[Count] = js.undefined
}
object ProductCamelCase {
  
  inline def apply(
    attributes: Any,
    content: Any,
    description: String,
    id: String,
    images: js.Array[ImageCamelCase],
    name: String,
    price: Double,
    sale: Boolean,
    sku: Any,
    slug: String,
    stockLevel: Double,
    stockPurchasable: Boolean,
    stockTracking: Boolean
  ): ProductCamelCase = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sale = sale.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], stockLevel = stockLevel.asInstanceOf[js.Any], stockPurchasable = stockPurchasable.asInstanceOf[js.Any], stockTracking = stockTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCamelCase]
  }
  
  extension [Self <: ProductCamelCase](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCrossSells(value: js.Array[Id]): Self = StObject.set(x, "crossSells", value.asInstanceOf[js.Any])
    
    inline def setCrossSellsUndefined: Self = StObject.set(x, "crossSells", js.undefined)
    
    inline def setCrossSellsVarargs(value: Id*): Self = StObject.set(x, "crossSells", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageCamelCase]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageCamelCase*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Active]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Active*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSale(value: Boolean): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSalePrice(value: Double): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    inline def setSku(value: Any): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStockLevel(value: Double): Self = StObject.set(x, "stockLevel", value.asInstanceOf[js.Any])
    
    inline def setStockPurchasable(value: Boolean): Self = StObject.set(x, "stockPurchasable", value.asInstanceOf[js.Any])
    
    inline def setStockTracking(value: Boolean): Self = StObject.set(x, "stockTracking", value.asInstanceOf[js.Any])
    
    inline def setUpSells(value: js.Array[Id]): Self = StObject.set(x, "upSells", value.asInstanceOf[js.Any])
    
    inline def setUpSellsUndefined: Self = StObject.set(x, "upSells", js.undefined)
    
    inline def setUpSellsVarargs(value: Id*): Self = StObject.set(x, "upSells", js.Array(value*))
    
    inline def setVariants(value: Count): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
