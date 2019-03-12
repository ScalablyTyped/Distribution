package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid.  Use Grid methods to access information about data in the grid. Grid is returned by the
  * GridControl.getGrid method.
  * @deprecated Use {@link Xrm.Controls.Grid} instead.
  */
trait Grid
  extends xrmLib.XrmNs.ControlsNs.Grid

object Grid {
  @scala.inline
  def apply(
    getRows: () => xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.GridNs.GridRow],
    getSelectedRows: () => xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.GridNs.GridRow],
    getTotalRecordCount: () => scala.Double
  ): Grid = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction0(getRows), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getTotalRecordCount = js.Any.fromFunction0(getTotalRecordCount))
  
    __obj.asInstanceOf[Grid]
  }
}

