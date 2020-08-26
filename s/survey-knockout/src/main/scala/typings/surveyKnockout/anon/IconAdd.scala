package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconAdd extends js.Object {
  var button: String = js.native
  var buttonAdd: String = js.native
  var buttonRemove: String = js.native
  var cell: String = js.native
  var headerCell: String = js.native
  var iconAdd: String = js.native
  var iconRemove: String = js.native
  var root: String = js.native
}

object IconAdd {
  @scala.inline
  def apply(
    button: String,
    buttonAdd: String,
    buttonRemove: String,
    cell: String,
    headerCell: String,
    iconAdd: String,
    iconRemove: String,
    root: String
  ): IconAdd = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonAdd = buttonAdd.asInstanceOf[js.Any], buttonRemove = buttonRemove.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], iconAdd = iconAdd.asInstanceOf[js.Any], iconRemove = iconRemove.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconAdd]
  }
  @scala.inline
  implicit class IconAddOps[Self <: IconAdd] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonAdd(value: String): Self = this.set("buttonAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonRemove(value: String): Self = this.set("buttonRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCell(value: String): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconAdd(value: String): Self = this.set("iconAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconRemove(value: String): Self = this.set("iconRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

