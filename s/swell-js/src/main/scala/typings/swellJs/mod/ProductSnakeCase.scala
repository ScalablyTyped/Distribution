package typings.swellJs.mod

import typings.swellJs.anon.Inputtype
import typings.swellJs.anon.Productid
import typings.swellJs.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSnakeCase
  extends StObject
     with Product {
  
  var attributes: Any
  
  var content: Any
  
  var cross_sells: js.UndefOr[js.Array[Productid]] = js.undefined
  
  var description: String
  
  var id: String
  
  var images: js.Array[ImageSnakeCase]
  
  var name: String
  
  var options: js.UndefOr[js.Array[Inputtype]] = js.undefined
  
  var price: Double
  
  var sale: Boolean
  
  var sale_price: js.UndefOr[Double] = js.undefined
  
  var sku: Any
  
  var slug: String
  
  var stock_level: Double
  
  var stock_purchasable: Boolean
  
  var stock_tracking: Boolean
  
  var up_sells: js.UndefOr[js.Array[Productid]] = js.undefined
  
  var variants: js.UndefOr[Results] = js.undefined
}
object ProductSnakeCase {
  
  inline def apply(
    attributes: Any,
    content: Any,
    description: String,
    id: String,
    images: js.Array[ImageSnakeCase],
    name: String,
    price: Double,
    sale: Boolean,
    sku: Any,
    slug: String,
    stock_level: Double,
    stock_purchasable: Boolean,
    stock_tracking: Boolean
  ): ProductSnakeCase = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], sale = sale.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], stock_level = stock_level.asInstanceOf[js.Any], stock_purchasable = stock_purchasable.asInstanceOf[js.Any], stock_tracking = stock_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSnakeCase]
  }
  
  extension [Self <: ProductSnakeCase](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCross_sells(value: js.Array[Productid]): Self = StObject.set(x, "cross_sells", value.asInstanceOf[js.Any])
    
    inline def setCross_sellsUndefined: Self = StObject.set(x, "cross_sells", js.undefined)
    
    inline def setCross_sellsVarargs(value: Productid*): Self = StObject.set(x, "cross_sells", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageSnakeCase]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageSnakeCase*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Inputtype]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Inputtype*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSale(value: Boolean): Self = StObject.set(x, "sale", value.asInstanceOf[js.Any])
    
    inline def setSale_price(value: Double): Self = StObject.set(x, "sale_price", value.asInstanceOf[js.Any])
    
    inline def setSale_priceUndefined: Self = StObject.set(x, "sale_price", js.undefined)
    
    inline def setSku(value: Any): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setStock_level(value: Double): Self = StObject.set(x, "stock_level", value.asInstanceOf[js.Any])
    
    inline def setStock_purchasable(value: Boolean): Self = StObject.set(x, "stock_purchasable", value.asInstanceOf[js.Any])
    
    inline def setStock_tracking(value: Boolean): Self = StObject.set(x, "stock_tracking", value.asInstanceOf[js.Any])
    
    inline def setUp_sells(value: js.Array[Productid]): Self = StObject.set(x, "up_sells", value.asInstanceOf[js.Any])
    
    inline def setUp_sellsUndefined: Self = StObject.set(x, "up_sells", js.undefined)
    
    inline def setUp_sellsVarargs(value: Productid*): Self = StObject.set(x, "up_sells", js.Array(value*))
    
    inline def setVariants(value: Results): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
  }
}
