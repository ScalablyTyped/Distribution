package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCategoriesResult extends js.Object {
  var categories: js.Array[ProductCategory]
}

object ProductCategoriesResult {
  @scala.inline
  def apply(categories: js.Array[ProductCategory]): ProductCategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategoriesResult]
  }
}

