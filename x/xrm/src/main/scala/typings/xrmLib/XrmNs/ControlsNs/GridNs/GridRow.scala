package typings
package xrmLib.XrmNs.ControlsNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
  * returned by Grid.getRows and Grid.getSelectedRows methods.
  * In V9 - this is essentailly a form context
  */
trait GridRow extends js.Object {
  /**
    * Provides methods to work with the row data.
    */
  var data: xrmLib.XrmNs.Data
  /**
    * Returns the GridRowData for the GridRow.
    * @deprecated Deprecated in V9 - use data field instead
    * @returns The data.
    */
  def getData(): GridRowData
}

object GridRow {
  @scala.inline
  def apply(data: xrmLib.XrmNs.Data, getData: js.Function0[GridRowData]): GridRow = {
    val __obj = js.Dynamic.literal(data = data, getData = getData)
  
    __obj.asInstanceOf[GridRow]
  }
}

