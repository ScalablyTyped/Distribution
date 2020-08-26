package typings.uiGrid.mod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridRow extends js.Object {
  /**
    * Enable row selection for this row, only settable by internal code.
    *
    * The grouping feature, for example, might set group header rows to not be selectable.
    * Defaults to true
    * @default true
    */
  var enableSelection: js.UndefOr[Boolean] = js.native
  /**
    * Selected state of row.
    * Should be readonly.
    * Make any changes to selected state using setSelected().
    * Defaults to false
    *
    * @readonly
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * Sets the isSelected property and updates the selectedCount
    * Changes to isSelected state should only be made via this function
    * @param selected Value to set
    */
  def setSelected(selected: Boolean): Unit = js.native
}

object IGridRow {
  @scala.inline
  def apply(setSelected: Boolean => Unit): IGridRow = {
    val __obj = js.Dynamic.literal(setSelected = js.Any.fromFunction1(setSelected))
    __obj.asInstanceOf[IGridRow]
  }
  @scala.inline
  implicit class IGridRowOps[Self <: IGridRow] (val x: Self) extends AnyVal {
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
    def setSetSelected(value: Boolean => Unit): Self = this.set("setSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableSelection(value: Boolean): Self = this.set("enableSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelection: Self = this.set("enableSelection", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
  
}

