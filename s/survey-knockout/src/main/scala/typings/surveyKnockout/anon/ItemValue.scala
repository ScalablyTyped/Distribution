package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemValue extends js.Object {
  var itemTitle: String = js.native
  var itemValue: String = js.native
  var root: String = js.native
}

object ItemValue {
  @scala.inline
  def apply(itemTitle: String, itemValue: String, root: String): ItemValue = {
    val __obj = js.Dynamic.literal(itemTitle = itemTitle.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemValue]
  }
  @scala.inline
  implicit class ItemValueOps[Self <: ItemValue] (val x: Self) extends AnyVal {
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
    def setItemTitle(value: String): Self = this.set("itemTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemValue(value: String): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

