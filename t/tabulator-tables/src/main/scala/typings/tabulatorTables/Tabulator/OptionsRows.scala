package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.add
import typings.tabulatorTables.tabulatorTablesStrings.bottom
import typings.tabulatorTables.tabulatorTablesStrings.click
import typings.tabulatorTables.tabulatorTablesStrings.delete
import typings.tabulatorTables.tabulatorTablesStrings.highlight
import typings.tabulatorTables.tabulatorTablesStrings.insert
import typings.tabulatorTables.tabulatorTablesStrings.replace
import typings.tabulatorTables.tabulatorTablesStrings.top
import typings.tabulatorTables.tabulatorTablesStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsRows extends js.Object {
  /** The position in the table for new rows to be added, "bottom" or "top" */
  var addRowPos: js.UndefOr[bottom | top] = js.native
  /** The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children.*/
  var dataTreeRowCollapsed: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.native
  /** The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children. */
  var dataTreeRowExpanded: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.native
  /** To allow the user to move rows up and down the table, set the movableRows parameter in the options: */
  var movableRows: js.UndefOr[Boolean] = js.native
  var movableRowsConnectedElements: js.UndefOr[String | HTMLElement] = js.native
  /** Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabuator object for the table to the movableRowsConnectedTables option. if you want to connect to multple tables then you can pass in an array of values to this option. */
  var movableRowsConnectedTables: js.UndefOr[String | (js.Array[HTMLElement | String]) | HTMLElement] = js.native
  /**When a row is dropped on element from from the movableRowsConnectedElements option the movableRowsElementDrop callback will be triggered. You can use this callback to trigger any changes as a result of the drop */
  var movableRowsElementDrop: js.UndefOr[
    js.Function3[/* e */ MouseEvent, /* element */ HTMLElement, /* row */ RowComponent, _]
  ] = js.native
  /** The movableRowsReceived callback is triggered on a receiving table when a row has been successfuly received.*/
  var movableRowsReceived: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typings.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.*/
  var movableRowsReceivedFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typings.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /**  The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
    There are several inbuilt receiver functions:
    insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
    add - adds row to the table
    update - updates the row it is dropped on with the sent rows data
    replace - replaces the row it is dropped on with the sent row*/
  var movableRowsReceiver: js.UndefOr[
    insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typings.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.native
  /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
  var movableRowsReceivingStart: js.UndefOr[
    js.Function2[/* fromRow */ RowComponent, /* toTable */ typings.tabulatorTables.Tabulator, Unit]
  ] = js.native
  /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.*/
  var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ typings.tabulatorTables.Tabulator, Unit]] = js.native
  /** The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
    There are several inbuilt sender functions:
    false - do nothing(default)
    delete - deletes the row from the table
    You can also pass a callback to the movableRowsSender option for custom sender functionality
    */
  var movableRowsSender: js.UndefOr[
    `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typings.tabulatorTables.Tabulator, 
      _
    ])
  ] = js.native
  /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
  var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
  /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
  /** The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table. */
  var movableRowsSent: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typings.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.*/
  var movableRowsSentFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typings.tabulatorTables.Tabulator, 
      Unit
    ]
  ] = js.native
  /** You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true */
  var resizableRows: js.UndefOr[Boolean] = js.native
  /** The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions. */
  var rowAdded: js.UndefOr[RowChangedCallback] = js.native
  /** The rowClick callback is triggered when a user clicks on a row. */
  var rowClick: js.UndefOr[RowEventCallback] = js.native
  /** The rowContext callback is triggered when a user right clicks on a row.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var rowContext: js.UndefOr[RowEventCallback] = js.native
  /** The rowDblClick callback is triggered when a user double clicks on a row. */
  var rowDblClick: js.UndefOr[RowEventCallback] = js.native
  /** The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms. */
  var rowDblTap: js.UndefOr[RowEventCallback] = js.native
  /** The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function. */
  var rowDeleted: js.UndefOr[RowChangedCallback] = js.native
  /** The rowDeselected event is triggered when a row is deselected, either by the user or programatically. */
  var rowDeselected: js.UndefOr[RowChangedCallback] = js.native
  /** Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
    The function accepts one argument, the RowComponent for the row being formatted. */
  var rowFormatter: js.UndefOr[js.Function1[/* row */ RowComponent, _]] = js.native
  /**When copying to the clipboard you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row. You can now do this using the rowFormatterClipboard table option, which takes the same inputs as the standard rowFormatter property. Passing a value of false into the formatter prevent the default row formatter from being run when the table is copied to the clipboard*/
  var rowFormatterClipboard: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /**When the getHtml function is called you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row */
  var rowFormatterHtmlOutput: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /**When printing you may want to apply a different formatter may want to apply a different formatter from the one usualy used to format the row. */
  var rowFormatterPrint: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, _])] = js.native
  /** The rowMouseEnter callback is triggered when the mouse pointer enters a row. */
  var rowMouseEnter: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseLeave callback is triggered when the mouse pointer leaves a row. */
  var rowMouseLeave: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseMove callback is triggered when the mouse pointer moves over a row. */
  var rowMouseMove: js.UndefOr[RowEventCallback] = js.native
  /** The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements. */
  var rowMouseOut: js.UndefOr[RowEventCallback] = js.native
  /**  The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements.*/
  var rowMouseOver: js.UndefOr[RowEventCallback] = js.native
  /** The rowMoved callback will be triggered when a row has been successfuly moved. */
  var rowMoved: js.UndefOr[RowChangedCallback] = js.native
  /** The rowResized callback will be triggered when a row has been resized by the user. */
  var rowResized: js.UndefOr[RowChangedCallback] = js.native
  /** The rowSelected event is triggered when a row is selected, either by the user or programatically. */
  var rowSelected: js.UndefOr[RowChangedCallback] = js.native
  /** Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument. */
  var rowSelectionChanged: js.UndefOr[js.Function2[/* data */ js.Array[_], /* rows */ js.Array[RowComponent], Unit]] = js.native
  /** The rowTap callback is triggered when a user taps on a row on a touch display. */
  var rowTap: js.UndefOr[RowEventCallback] = js.native
  /** The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second. */
  var rowTapHold: js.UndefOr[RowEventCallback] = js.native
  /** The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions. */
  var rowUpdated: js.UndefOr[RowChangedCallback] = js.native
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
    true - scroll to row, even if it is visible (default)
    false - scroll to row, unless it is currently visible, then don't move */
  var scrollToRowIfVisible: js.UndefOr[Boolean] = js.native
  /** * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
    top - position row with its top edge at the top of the table (default)
    center - position row with its top edge in the center of the table
    bottom - position row with its bottom edge at the bottom of the table
    nearest - position row on the edge of the table it is closest to
    */
  var scrollToRowPosition: js.UndefOr[ScrollToRowPostition] = js.native
  /** The selectable option can take one of a several values:
    false - selectable rows are disabled
    true - selectable rows are enabled, and you can select as many as you want
    integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
    "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable. */
  var selectable: js.UndefOr[Boolean | Double | highlight] = js.native
  /** You many want to exclude certain rows from being selected. The selectableCheck options allows you to pass a function to check if the current row should be selectable, returning true will allow row selection, false will result in nothing happening. The function should accept a RowComponent as its first argument. */
  var selectableCheck: js.UndefOr[js.Function1[/* row */ RowComponent, Boolean]] = js.native
  /** By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false. */
  var selectablePersistence: js.UndefOr[Boolean] = js.native
  /** By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
    If you would prefere to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can acheive this by setting the selectableRangeMode to click */
  var selectableRangeMode: js.UndefOr[click] = js.native
  /** By default, row selection works on a rolling basis, if you set the selectable option to a numeric value then when you select past this number of rows, the first row to be selected will be deselected. If you want to disable this behaviour and instead prevent selection of new rows once the limit is reached you can set the selectableRollingSelection option to false. */
  var selectableRollingSelection: js.UndefOr[Boolean] = js.native
  /**  Allows you to specifcy the behaviour when the user tabs from the last editable cell on the last row of the table */
  var tabEndNewRow: js.UndefOr[Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])] = js.native
}

object OptionsRows {
  @scala.inline
  def apply(): OptionsRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRows]
  }
  @scala.inline
  implicit class OptionsRowsOps[Self <: OptionsRows] (val x: Self) extends AnyVal {
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
    def setAddRowPos(value: bottom | top): Self = this.set("addRowPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRowPos: Self = this.set("addRowPos", js.undefined)
    @scala.inline
    def setDataTreeRowCollapsed(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = this.set("dataTreeRowCollapsed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataTreeRowCollapsed: Self = this.set("dataTreeRowCollapsed", js.undefined)
    @scala.inline
    def setDataTreeRowExpanded(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = this.set("dataTreeRowExpanded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataTreeRowExpanded: Self = this.set("dataTreeRowExpanded", js.undefined)
    @scala.inline
    def setMovableRows(value: Boolean): Self = this.set("movableRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableRows: Self = this.set("movableRows", js.undefined)
    @scala.inline
    def setMovableRowsConnectedElements(value: String | HTMLElement): Self = this.set("movableRowsConnectedElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableRowsConnectedElements: Self = this.set("movableRowsConnectedElements", js.undefined)
    @scala.inline
    def setMovableRowsConnectedTablesVarargs(value: (HTMLElement | String)*): Self = this.set("movableRowsConnectedTables", js.Array(value :_*))
    @scala.inline
    def setMovableRowsConnectedTables(value: String | (js.Array[HTMLElement | String]) | HTMLElement): Self = this.set("movableRowsConnectedTables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableRowsConnectedTables: Self = this.set("movableRowsConnectedTables", js.undefined)
    @scala.inline
    def setMovableRowsElementDrop(value: (/* e */ MouseEvent, /* element */ HTMLElement, /* row */ RowComponent) => _): Self = this.set("movableRowsElementDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMovableRowsElementDrop: Self = this.set("movableRowsElementDrop", js.undefined)
    @scala.inline
    def setMovableRowsReceived(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typings.tabulatorTables.Tabulator) => Unit
    ): Self = this.set("movableRowsReceived", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMovableRowsReceived: Self = this.set("movableRowsReceived", js.undefined)
    @scala.inline
    def setMovableRowsReceivedFailed(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typings.tabulatorTables.Tabulator) => Unit
    ): Self = this.set("movableRowsReceivedFailed", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMovableRowsReceivedFailed: Self = this.set("movableRowsReceivedFailed", js.undefined)
    @scala.inline
    def setMovableRowsReceiverFunction3(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typings.tabulatorTables.Tabulator) => _
    ): Self = this.set("movableRowsReceiver", js.Any.fromFunction3(value))
    @scala.inline
    def setMovableRowsReceiver(
      value: insert | add | update | replace | (js.Function3[
          /* fromRow */ RowComponent, 
          /* toRow */ RowComponent, 
          /* fromTable */ typings.tabulatorTables.Tabulator, 
          _
        ])
    ): Self = this.set("movableRowsReceiver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableRowsReceiver: Self = this.set("movableRowsReceiver", js.undefined)
    @scala.inline
    def setMovableRowsReceivingStart(value: (/* fromRow */ RowComponent, /* toTable */ typings.tabulatorTables.Tabulator) => Unit): Self = this.set("movableRowsReceivingStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMovableRowsReceivingStart: Self = this.set("movableRowsReceivingStart", js.undefined)
    @scala.inline
    def setMovableRowsReceivingStop(value: /* fromTable */ typings.tabulatorTables.Tabulator => Unit): Self = this.set("movableRowsReceivingStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMovableRowsReceivingStop: Self = this.set("movableRowsReceivingStop", js.undefined)
    @scala.inline
    def setMovableRowsSenderFunction3(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typings.tabulatorTables.Tabulator) => _
    ): Self = this.set("movableRowsSender", js.Any.fromFunction3(value))
    @scala.inline
    def setMovableRowsSender(
      value: `false` | delete | (js.Function3[
          /* fromRow */ RowComponent, 
          /* toRow */ RowComponent, 
          /* toTable */ typings.tabulatorTables.Tabulator, 
          _
        ])
    ): Self = this.set("movableRowsSender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableRowsSender: Self = this.set("movableRowsSender", js.undefined)
    @scala.inline
    def setMovableRowsSendingStart(value: /* toTables */ js.Array[_] => Unit): Self = this.set("movableRowsSendingStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMovableRowsSendingStart: Self = this.set("movableRowsSendingStart", js.undefined)
    @scala.inline
    def setMovableRowsSendingStop(value: /* toTables */ js.Array[_] => Unit): Self = this.set("movableRowsSendingStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMovableRowsSendingStop: Self = this.set("movableRowsSendingStop", js.undefined)
    @scala.inline
    def setMovableRowsSent(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typings.tabulatorTables.Tabulator) => Unit
    ): Self = this.set("movableRowsSent", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMovableRowsSent: Self = this.set("movableRowsSent", js.undefined)
    @scala.inline
    def setMovableRowsSentFailed(
      value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typings.tabulatorTables.Tabulator) => Unit
    ): Self = this.set("movableRowsSentFailed", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMovableRowsSentFailed: Self = this.set("movableRowsSentFailed", js.undefined)
    @scala.inline
    def setResizableRows(value: Boolean): Self = this.set("resizableRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizableRows: Self = this.set("resizableRows", js.undefined)
    @scala.inline
    def setRowAdded(value: /* row */ RowComponent => Unit): Self = this.set("rowAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowAdded: Self = this.set("rowAdded", js.undefined)
    @scala.inline
    def setRowClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowClick: Self = this.set("rowClick", js.undefined)
    @scala.inline
    def setRowContext(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowContext", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowContext: Self = this.set("rowContext", js.undefined)
    @scala.inline
    def setRowDblClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowDblClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowDblClick: Self = this.set("rowDblClick", js.undefined)
    @scala.inline
    def setRowDblTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowDblTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowDblTap: Self = this.set("rowDblTap", js.undefined)
    @scala.inline
    def setRowDeleted(value: /* row */ RowComponent => Unit): Self = this.set("rowDeleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDeleted: Self = this.set("rowDeleted", js.undefined)
    @scala.inline
    def setRowDeselected(value: /* row */ RowComponent => Unit): Self = this.set("rowDeselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDeselected: Self = this.set("rowDeselected", js.undefined)
    @scala.inline
    def setRowFormatter(value: /* row */ RowComponent => _): Self = this.set("rowFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowFormatter: Self = this.set("rowFormatter", js.undefined)
    @scala.inline
    def setRowFormatterClipboardFunction1(value: /* row */ RowComponent => _): Self = this.set("rowFormatterClipboard", js.Any.fromFunction1(value))
    @scala.inline
    def setRowFormatterClipboard(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = this.set("rowFormatterClipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFormatterClipboard: Self = this.set("rowFormatterClipboard", js.undefined)
    @scala.inline
    def setRowFormatterHtmlOutputFunction1(value: /* row */ RowComponent => _): Self = this.set("rowFormatterHtmlOutput", js.Any.fromFunction1(value))
    @scala.inline
    def setRowFormatterHtmlOutput(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = this.set("rowFormatterHtmlOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFormatterHtmlOutput: Self = this.set("rowFormatterHtmlOutput", js.undefined)
    @scala.inline
    def setRowFormatterPrintFunction1(value: /* row */ RowComponent => _): Self = this.set("rowFormatterPrint", js.Any.fromFunction1(value))
    @scala.inline
    def setRowFormatterPrint(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = this.set("rowFormatterPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFormatterPrint: Self = this.set("rowFormatterPrint", js.undefined)
    @scala.inline
    def setRowMouseEnter(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowMouseEnter: Self = this.set("rowMouseEnter", js.undefined)
    @scala.inline
    def setRowMouseLeave(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowMouseLeave: Self = this.set("rowMouseLeave", js.undefined)
    @scala.inline
    def setRowMouseMove(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowMouseMove: Self = this.set("rowMouseMove", js.undefined)
    @scala.inline
    def setRowMouseOut(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowMouseOut: Self = this.set("rowMouseOut", js.undefined)
    @scala.inline
    def setRowMouseOver(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowMouseOver: Self = this.set("rowMouseOver", js.undefined)
    @scala.inline
    def setRowMoved(value: /* row */ RowComponent => Unit): Self = this.set("rowMoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowMoved: Self = this.set("rowMoved", js.undefined)
    @scala.inline
    def setRowResized(value: /* row */ RowComponent => Unit): Self = this.set("rowResized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowResized: Self = this.set("rowResized", js.undefined)
    @scala.inline
    def setRowSelected(value: /* row */ RowComponent => Unit): Self = this.set("rowSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    @scala.inline
    def setRowSelectionChanged(value: (/* data */ js.Array[_], /* rows */ js.Array[RowComponent]) => Unit): Self = this.set("rowSelectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowSelectionChanged: Self = this.set("rowSelectionChanged", js.undefined)
    @scala.inline
    def setRowTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowTap: Self = this.set("rowTap", js.undefined)
    @scala.inline
    def setRowTapHold(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = this.set("rowTapHold", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowTapHold: Self = this.set("rowTapHold", js.undefined)
    @scala.inline
    def setRowUpdated(value: /* row */ RowComponent => Unit): Self = this.set("rowUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowUpdated: Self = this.set("rowUpdated", js.undefined)
    @scala.inline
    def setScrollToRowIfVisible(value: Boolean): Self = this.set("scrollToRowIfVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToRowIfVisible: Self = this.set("scrollToRowIfVisible", js.undefined)
    @scala.inline
    def setScrollToRowPosition(value: ScrollToRowPostition): Self = this.set("scrollToRowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToRowPosition: Self = this.set("scrollToRowPosition", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean | Double | highlight): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectableCheck(value: /* row */ RowComponent => Boolean): Self = this.set("selectableCheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectableCheck: Self = this.set("selectableCheck", js.undefined)
    @scala.inline
    def setSelectablePersistence(value: Boolean): Self = this.set("selectablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectablePersistence: Self = this.set("selectablePersistence", js.undefined)
    @scala.inline
    def setSelectableRangeMode(value: click): Self = this.set("selectableRangeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableRangeMode: Self = this.set("selectableRangeMode", js.undefined)
    @scala.inline
    def setSelectableRollingSelection(value: Boolean): Self = this.set("selectableRollingSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableRollingSelection: Self = this.set("selectableRollingSelection", js.undefined)
    @scala.inline
    def setTabEndNewRowFunction1(value: /* row */ RowComponent => _): Self = this.set("tabEndNewRow", js.Any.fromFunction1(value))
    @scala.inline
    def setTabEndNewRow(value: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])): Self = this.set("tabEndNewRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabEndNewRow: Self = this.set("tabEndNewRow", js.undefined)
  }
  
}

