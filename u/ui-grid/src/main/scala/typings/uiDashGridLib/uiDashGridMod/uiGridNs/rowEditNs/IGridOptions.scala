package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.rowEditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * How long the grid should wait for another change on this row before triggering a save (in milliseconds).
    * If set to -1, then saves are never triggered by timer
    * (implying that the user will call flushDirtyRows() manually)
    */
  var rowEditWaitInterval: js.UndefOr[scala.Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(rowEditWaitInterval: scala.Int | scala.Double = null): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (rowEditWaitInterval != null) __obj.updateDynamic("rowEditWaitInterval")(rowEditWaitInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

