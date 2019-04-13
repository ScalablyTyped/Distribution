package typings
package uiDashGridLib.uiDashGridMod.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridRow extends js.Object {
  /**
    * Enable focus on a cell within this row. If set to false then no cells in this row can be focused
    * Group header rows, for example, would set this to false.
    * Defaults to true
    */
  var allowCellFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridRow {
  @scala.inline
  def apply(allowCellFocus: js.UndefOr[scala.Boolean] = js.undefined): IGridRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellFocus)) __obj.updateDynamic("allowCellFocus")(allowCellFocus)
    __obj.asInstanceOf[IGridRow]
  }
}

