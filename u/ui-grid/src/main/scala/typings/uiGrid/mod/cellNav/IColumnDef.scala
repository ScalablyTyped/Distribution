package typings.uiGrid.mod.cellNav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable focus on a cell within this column.
    * Defaults to true
    * @default true
    */
  var allowCellFocus: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(allowCellFocus: js.UndefOr[Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCellFocus)) __obj.updateDynamic("allowCellFocus")(allowCellFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDef]
  }
}

