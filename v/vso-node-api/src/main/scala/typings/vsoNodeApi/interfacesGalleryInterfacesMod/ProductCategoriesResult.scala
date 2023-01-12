package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCategoriesResult extends StObject {
  
  var categories: js.Array[ProductCategory]
}
object ProductCategoriesResult {
  
  inline def apply(categories: js.Array[ProductCategory]): ProductCategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategoriesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductCategoriesResult] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[ProductCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: ProductCategory*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
