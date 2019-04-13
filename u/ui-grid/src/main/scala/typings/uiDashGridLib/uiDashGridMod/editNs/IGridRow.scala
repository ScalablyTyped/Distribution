package typings
package uiDashGridLib.uiDashGridMod.editNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridRow extends js.Object {
  /** enable editing on row, grouping for example might disable editing on group header rows */
  var enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridRow {
  @scala.inline
  def apply(enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined): IGridRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit)
    __obj.asInstanceOf[IGridRow]
  }
}

