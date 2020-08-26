package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductCategoriesResult extends js.Object {
  var categories: js.Array[ProductCategory] = js.native
}

object ProductCategoriesResult {
  @scala.inline
  def apply(categories: js.Array[ProductCategory]): ProductCategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategoriesResult]
  }
  @scala.inline
  implicit class ProductCategoriesResultOps[Self <: ProductCategoriesResult] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: ProductCategory*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[ProductCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
  }
  
}

