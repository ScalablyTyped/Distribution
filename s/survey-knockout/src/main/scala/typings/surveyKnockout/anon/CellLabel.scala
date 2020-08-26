package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellLabel extends js.Object {
  var cellLabel: String = js.native
  var cellText: String = js.native
  var cellTextSelected: String = js.native
  var itemChecked: String = js.native
  var itemDecorator: String = js.native
  var label: String = js.native
  var root: String = js.native
}

object CellLabel {
  @scala.inline
  def apply(
    cellLabel: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    label: String,
    root: String
  ): CellLabel = {
    val __obj = js.Dynamic.literal(cellLabel = cellLabel.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellLabel]
  }
  @scala.inline
  implicit class CellLabelOps[Self <: CellLabel] (val x: Self) extends AnyVal {
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
    def setCellLabel(value: String): Self = this.set("cellLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellText(value: String): Self = this.set("cellText", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellTextSelected(value: String): Self = this.set("cellTextSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDecorator(value: String): Self = this.set("itemDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
  
}

