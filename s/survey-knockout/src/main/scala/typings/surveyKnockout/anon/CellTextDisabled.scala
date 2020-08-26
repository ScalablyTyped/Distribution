package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellTextDisabled extends js.Object {
  var cell: String = js.native
  var cellText: String = js.native
  var cellTextDisabled: String = js.native
  var cellTextSelected: String = js.native
  var headerCell: String = js.native
  var itemChecked: String = js.native
  var itemDecorator: String = js.native
  var itemDisabled: String = js.native
  var itemHover: String = js.native
  var itemValue: String = js.native
  var label: String = js.native
  var materialDecorator: String = js.native
  var root: String = js.native
  var tableWrapper: String = js.native
}

object CellTextDisabled {
  @scala.inline
  def apply(
    cell: String,
    cellText: String,
    cellTextDisabled: String,
    cellTextSelected: String,
    headerCell: String,
    itemChecked: String,
    itemDecorator: String,
    itemDisabled: String,
    itemHover: String,
    itemValue: String,
    label: String,
    materialDecorator: String,
    root: String,
    tableWrapper: String
  ): CellTextDisabled = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextDisabled = cellTextDisabled.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemHover = itemHover.asInstanceOf[js.Any], itemValue = itemValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], tableWrapper = tableWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellTextDisabled]
  }
  @scala.inline
  implicit class CellTextDisabledOps[Self <: CellTextDisabled] (val x: Self) extends AnyVal {
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
    def setCell(value: String): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellText(value: String): Self = this.set("cellText", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellTextDisabled(value: String): Self = this.set("cellTextDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellTextSelected(value: String): Self = this.set("cellTextSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCell(value: String): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDecorator(value: String): Self = this.set("itemDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDisabled(value: String): Self = this.set("itemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemHover(value: String): Self = this.set("itemHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemValue(value: String): Self = this.set("itemValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterialDecorator(value: String): Self = this.set("materialDecorator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableWrapper(value: String): Self = this.set("tableWrapper", value.asInstanceOf[js.Any])
  }
  
}

