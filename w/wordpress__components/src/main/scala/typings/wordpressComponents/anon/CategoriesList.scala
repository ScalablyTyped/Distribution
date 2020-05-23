package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoriesList extends js.Object {
  var categoriesList: js.Array[Id]
  var selectedCategoryId: Double
  def onCategoryChange(categoryId: Double): Unit
}

object CategoriesList {
  @scala.inline
  def apply(categoriesList: js.Array[Id], onCategoryChange: Double => Unit, selectedCategoryId: Double): CategoriesList = {
    val __obj = js.Dynamic.literal(categoriesList = categoriesList.asInstanceOf[js.Any], onCategoryChange = js.Any.fromFunction1(onCategoryChange), selectedCategoryId = selectedCategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesList]
  }
}

