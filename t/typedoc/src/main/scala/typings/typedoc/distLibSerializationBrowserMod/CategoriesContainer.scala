package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoriesContainer[T] extends js.Object {
  var categories: js.Array[T]
}

object CategoriesContainer {
  @scala.inline
  def apply[T](categories: js.Array[T]): CategoriesContainer[T] = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoriesContainer[T]]
  }
}

