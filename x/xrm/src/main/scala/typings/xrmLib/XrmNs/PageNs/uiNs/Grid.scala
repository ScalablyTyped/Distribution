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
    getRows: js.Function0[xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.GridNs.GridRow]],
    getSelectedRows: js.Function0[xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.GridNs.GridRow]],
    getTotalRecordCount: js.Function0[scala.Double]
  ): Grid = {
    val __obj = js.Dynamic.literal(getRows = getRows, getSelectedRows = getSelectedRows, getTotalRecordCount = getTotalRecordCount)
  
    __obj.asInstanceOf[Grid]
  }
}

