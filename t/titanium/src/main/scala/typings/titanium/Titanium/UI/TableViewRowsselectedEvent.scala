package typings.titanium.Titanium.UI

import typings.titanium.SelectedRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TableViewRowsselectedEventMutableBuilder[Self <: TableViewRowsselectedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedRows(value: js.Array[SelectedRowObject]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowsVarargs(value: SelectedRowObject*): Self = StObject.set(x, "selectedRows", js.Array(value :_*))
    
    @scala.inline
    def setStartingRow(value: SelectedRowObject): Self = StObject.set(x, "startingRow", value.asInstanceOf[js.Any])
  }
}
