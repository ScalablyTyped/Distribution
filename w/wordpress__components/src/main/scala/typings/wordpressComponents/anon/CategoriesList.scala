package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoriesList extends js.Object {
  
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
  implicit class CategoriesListOps[Self <: CategoriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategoriesListVarargs(value: Id*): Self = this.set("categoriesList", js.Array(value :_*))
    
    @scala.inline
    def setCategoriesList(value: js.Array[Id]): Self = this.set("categoriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCategoryChange(value: Double => Unit): Self = this.set("onCategoryChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedCategoryId(value: Double): Self = this.set("selectedCategoryId", value.asInstanceOf[js.Any])
  }
}
