package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoriesResult extends StObject {
  
  var categories: js.Array[ExtensionCategory]
}
object CategoriesResult {
  
  @scala.inline
  def apply(categories: js.Array[ExtensionCategory]): CategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesResult]
  }
  
  @scala.inline
  implicit class CategoriesResultMutableBuilder[Self <: CategoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[ExtensionCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: ExtensionCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
