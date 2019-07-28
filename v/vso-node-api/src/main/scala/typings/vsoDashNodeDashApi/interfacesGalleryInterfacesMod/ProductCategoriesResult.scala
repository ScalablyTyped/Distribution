package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductCategoriesResult extends js.Object {
  var categories: js.Array[ProductCategory]
}

object ProductCategoriesResult {
  @scala.inline
  def apply(categories: js.Array[ProductCategory]): ProductCategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories)
  
    __obj.asInstanceOf[ProductCategoriesResult]
  }
}

