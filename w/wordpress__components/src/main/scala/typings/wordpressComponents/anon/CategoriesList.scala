package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoriesList extends StObject {
  
  var categoriesList: js.Array[Id]
  
  def onCategoryChange(categoryId: Double): Unit
  
  var selectedCategoryId: Double
}
object CategoriesList {
  
  inline def apply(categoriesList: js.Array[Id], onCategoryChange: Double => Unit, selectedCategoryId: Double): CategoriesList = {
    val __obj = js.Dynamic.literal(categoriesList = categoriesList.asInstanceOf[js.Any], onCategoryChange = js.Any.fromFunction1(onCategoryChange), selectedCategoryId = selectedCategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoriesList] (val x: Self) extends AnyVal {
    
    inline def setCategoriesList(value: js.Array[Id]): Self = StObject.set(x, "categoriesList", value.asInstanceOf[js.Any])
    
    inline def setCategoriesListVarargs(value: Id*): Self = StObject.set(x, "categoriesList", js.Array(value*))
    
    inline def setOnCategoryChange(value: Double => Unit): Self = StObject.set(x, "onCategoryChange", js.Any.fromFunction1(value))
    
    inline def setSelectedCategoryId(value: Double): Self = StObject.set(x, "selectedCategoryId", value.asInstanceOf[js.Any])
  }
}
