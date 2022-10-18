package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoriesResult extends StObject {
  
  var categories: js.Array[ExtensionCategory]
}
object CategoriesResult {
  
  inline def apply(categories: js.Array[ExtensionCategory]): CategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesResult]
  }
  
  extension [Self <: CategoriesResult](x: Self) {
    
    inline def setCategories(value: js.Array[ExtensionCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: ExtensionCategory*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
