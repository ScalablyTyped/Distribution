package typings.wordpressComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoriesList extends StObject {
  
  var categoriesList: js.Array[Id] = js.native
  
  def onCategoryChange(categoryId: Double): Unit = js.native
  
  var selectedCategoryId: Double = js.native
}
object CategoriesList {
  
  @scala.inline
  def apply(categoriesList: js.Array[Id], onCategoryChange: Double => Unit, selectedCategoryId: Double): CategoriesList = {
    val __obj = js.Dynamic.literal(categoriesList = categoriesList.asInstanceOf[js.Any], onCategoryChange = js.Any.fromFunction1(onCategoryChange), selectedCategoryId = selectedCategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesList]
  }
  
  @scala.inline
  implicit class CategoriesListMutableBuilder[Self <: CategoriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoriesList(value: js.Array[Id]): Self = StObject.set(x, "categoriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesListVarargs(value: Id*): Self = StObject.set(x, "categoriesList", js.Array(value :_*))
    
    @scala.inline
    def setOnCategoryChange(value: Double => Unit): Self = StObject.set(x, "onCategoryChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedCategoryId(value: Double): Self = StObject.set(x, "selectedCategoryId", value.asInstanceOf[js.Any])
  }
}
