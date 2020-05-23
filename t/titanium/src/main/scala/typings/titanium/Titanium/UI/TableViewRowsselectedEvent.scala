package typings.titanium.Titanium.UI

import typings.titanium.SelectedRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when user stops two-pan gesture interaction for selecting multiple rows.
  * It is used in conjunction with <Titanium.UI.TableView.allowsMultipleSelectionInteraction>.
  */
trait TableViewRowsselectedEvent extends TableViewBaseEvent {
  /**
    * List of rows selected by user.
    */
  var selectedRows: js.Array[SelectedRowObject]
  /**
    * First row selected when user started interaction.
    */
  var startingRow: SelectedRowObject
}

object TableViewRowsselectedEvent {
  @scala.inline
  def apply(selectedRows: js.Array[SelectedRowObject], source: TableView, startingRow: SelectedRowObject): TableViewRowsselectedEvent = {
    val __obj = js.Dynamic.literal(selectedRows = selectedRows.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startingRow = startingRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewRowsselectedEvent]
  }
}

