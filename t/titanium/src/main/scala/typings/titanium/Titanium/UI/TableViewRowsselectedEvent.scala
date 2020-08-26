package typings.titanium.Titanium.UI

import typings.titanium.SelectedRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when user stops two-pan gesture interaction for selecting multiple rows.
  * It is used in conjunction with <Titanium.UI.TableView.allowsMultipleSelectionInteraction>.
  */
@js.native
trait TableViewRowsselectedEvent extends TableViewBaseEvent {
  /**
    * List of rows selected by user.
    */
  var selectedRows: js.Array[SelectedRowObject] = js.native
  /**
    * First row selected when user started interaction.
    */
  var startingRow: SelectedRowObject = js.native
}

object TableViewRowsselectedEvent {
  @scala.inline
  def apply(selectedRows: js.Array[SelectedRowObject], source: TableView, startingRow: SelectedRowObject): TableViewRowsselectedEvent = {
    val __obj = js.Dynamic.literal(selectedRows = selectedRows.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startingRow = startingRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowsselectedEvent]
  }
  @scala.inline
  implicit class TableViewRowsselectedEventOps[Self <: TableViewRowsselectedEvent] (val x: Self) extends AnyVal {
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
    def setSelectedRowsVarargs(value: SelectedRowObject*): Self = this.set("selectedRows", js.Array(value :_*))
    @scala.inline
    def setSelectedRows(value: js.Array[SelectedRowObject]): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartingRow(value: SelectedRowObject): Self = this.set("startingRow", value.asInstanceOf[js.Any])
  }
  
}

