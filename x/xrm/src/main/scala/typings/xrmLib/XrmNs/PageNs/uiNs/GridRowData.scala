package typings
package xrmLib.XrmNs.PageNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for grid row data.  Use the GridRowData.getEntity method to access the GridEntity. GridRowData is
  * returned by the GridRow.getData method.
  * @deprecated Use {@link Xrm.Controls.Grid.GridRowData} instead.
  */
trait GridRowData
  extends xrmLib.XrmNs.ControlsNs.GridNs.GridRowData

object GridRowData {
  @scala.inline
  def apply(getEntity: () => xrmLib.XrmNs.ControlsNs.GridNs.GridEntity): GridRowData = {
    val __obj = js.Dynamic.literal(getEntity = js.Any.fromFunction0(getEntity))
  
    __obj.asInstanceOf[GridRowData]
  }
}

