package typings.uiGrid.mod.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridRow extends js.Object {
  /**
    * Enable row selection for this row, only settable by internal code.
    *
    * The grouping feature, for example, might set group header rows to not be selectable.
    * Defaults to true
    * @default true
    */
  var enableSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Selected state of row.
    * Should be readonly.
    * Make any changes to selected state using setSelected().
    * Defaults to false
    *
    * @readonly
    * @default false
    */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the isSelected property and updates the selectedCount
    * Changes to isSelected state should only be made via this function
    * @param selected Value to set
    */
  def setSelected(selected: Boolean): Unit
}

object IGridRow {
  @scala.inline
  def apply(
    setSelected: Boolean => Unit,
    enableSelection: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): IGridRow = {
    val __obj = js.Dynamic.literal(setSelected = js.Any.fromFunction1(setSelected))
    if (!js.isUndefined(enableSelection)) __obj.updateDynamic("enableSelection")(enableSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridRow]
  }
}

