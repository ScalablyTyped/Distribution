package typings.xrm.Xrm.Controls.Grid

import typings.xrm.Xrm.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid row.  Use the GridRow.getData method to access the GridRowData. A collection of GridRow is
  * returned by Grid.getRows and Grid.getSelectedRows methods.
  * In V9 - this is essentailly a form context
  */
@js.native
trait GridRow extends js.Object {
  /**
    * Provides methods to work with the row data.
    */
  var data: Data = js.native
  /**
    * Returns the GridRowData for the GridRow.
    * @deprecated Deprecated in V9 - use data field instead
    * @returns The data.
    */
  def getData(): GridRowData = js.native
}

object GridRow {
  @scala.inline
  def apply(data: Data, getData: () => GridRowData): GridRow = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData))
    __obj.asInstanceOf[GridRow]
  }
  @scala.inline
  implicit class GridRowOps[Self <: GridRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetData(value: () => GridRowData): Self = this.set("getData", js.Any.fromFunction0(value))
  }
  
}

