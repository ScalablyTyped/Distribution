package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable focus on a cell within this column.
    * Defaults to true
    * @default true
    */
  var allowCellFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(allowCellFocus: js.UndefOr[scala.Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellFocus)) __obj.updateDynamic("allowCellFocus")(allowCellFocus)
    __obj.asInstanceOf[IColumnDef]
  }
}

