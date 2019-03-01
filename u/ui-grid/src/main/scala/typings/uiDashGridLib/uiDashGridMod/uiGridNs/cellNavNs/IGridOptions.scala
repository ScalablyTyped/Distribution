package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.cellNavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable multiple cell selection only when using the ctrlKey or shiftKey.
    * Defaults to false
    * @default false
    */
  var modifierKeysToMultiSelectCells: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(modifierKeysToMultiSelectCells: js.UndefOr[scala.Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(modifierKeysToMultiSelectCells)) __obj.updateDynamic("modifierKeysToMultiSelectCells")(modifierKeysToMultiSelectCells)
    __obj.asInstanceOf[IGridOptions]
  }
}

