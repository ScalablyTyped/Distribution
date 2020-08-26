package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoriesResult extends js.Object {
  var categories: js.Array[ExtensionCategory] = js.native
}

object CategoriesResult {
  @scala.inline
  def apply(categories: js.Array[ExtensionCategory]): CategoriesResult = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesResult]
  }
  @scala.inline
  implicit class CategoriesResultOps[Self <: CategoriesResult] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: ExtensionCategory*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[ExtensionCategory]): Self = this.set("categories", value.asInstanceOf[js.Any])
  }
  
}

