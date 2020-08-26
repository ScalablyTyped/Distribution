package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The updated labeling from the input document, accounting for the submitted feedback. */
@js.native
trait UpdatedLabelsIn extends js.Object {
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.Array[Category] = js.native
  /** Description of the action specified by the element and whom it affects. */
  var types: js.Array[TypeLabel] = js.native
}

object UpdatedLabelsIn {
  @scala.inline
  def apply(categories: js.Array[Category], types: js.Array[TypeLabel]): UpdatedLabelsIn = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedLabelsIn]
  }
  @scala.inline
  implicit class UpdatedLabelsInOps[Self <: UpdatedLabelsIn] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: Category*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: TypeLabel*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[TypeLabel]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

