package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoriesResult extends js.Object {
  var categories: js.Array[ExtensionCategory]
}

object CategoriesResult {
  @scala.inline
  def apply(categories: js.Array[ExtensionCategory]): CategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesResult]
  }
}

