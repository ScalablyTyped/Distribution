package typings.tabulatorTables.mod

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsRows extends StObject {
  
  /** The position in the table for new rows to be added, "bottom" or "top". */
  var addRowPos: js.UndefOr[bottom | top] = js.undefined
  
  /** The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children. */
  var dataTreeRowCollapsed: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.undefined
  
  /** The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children. */
  var dataTreeRowExpanded: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ Double, Unit]] = js.undefined
  
  /** Freeze rows of data */
  var frozenRows: js.UndefOr[Double | js.Array[String] | (js.Function1[/* row */ RowComponent, Boolean])] = js.undefined
  
  var frozenRowsField: js.UndefOr[String] = js.undefined
  
  /** To allow the user to move rows up and down the table, set the movableRows parameter in the options: */
  var movableRows: js.UndefOr[Boolean] = js.undefined
  
  var movableRowsConnectedElements: js.UndefOr[String | HTMLElement] = js.undefined
  
  /** Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabulator object for the table to the movableRowsConnectedTables option. if you want to connect to multiple tables then you can pass in an array of values to this option. */
  var movableRowsConnectedTables: js.UndefOr[String | (js.Array[HTMLElement | String]) | HTMLElement] = js.undefined
  
  /** When a row is dropped on element from from the movableRowsConnectedElements option the movableRowsElementDrop callback will be triggered. You can use this callback to trigger any changes as a result of the drop */
  var movableRowsElementDrop: js.UndefOr[
    js.Function3[/* e */ MouseEvent, /* element */ HTMLElement, /* row */ RowComponent, Any]
  ] = js.undefined
  
  /** The movableRowsReceived callback is triggered on a receiving table when a row has been successfully received. */
  var movableRowsReceived: js.UndefOr[
    js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Unit]
  ] = js.undefined
  
  /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false. */
  var movableRowsReceivedFailed: js.UndefOr[
    js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Unit]
  ] = js.undefined
  
  /**
    * The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
    * There are several inbuilt receiver functions:
    *
    * - insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
    * - add - adds row to the table
    * - update - updates the row it is dropped on with the sent rows data
    * - replace - replaces the row it is dropped on with the sent row
    */
  var movableRowsReceiver: js.UndefOr[
    insert | add | update | replace | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Any])
  ] = js.undefined
  
  /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
  var movableRowsReceivingStart: js.UndefOr[js.Function2[/* fromRow */ RowComponent, /* toTable */ Tabulator, Unit]] = js.undefined
  
  /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ Tabulator, Unit]] = js.undefined
  
  /**
    * The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfully dropped into the receiving table.
    * There are several inbuilt sender functions:
    *
    * - false - do nothing(default)
    * - delete - deletes the row from the table
    * You can also pass a callback to the movableRowsSender option for custom sender functionality
    */
  var movableRowsSender: js.UndefOr[
    `false` | delete | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Any])
  ] = js.undefined
  
  /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
  var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[Any], Unit]] = js.undefined
  
  /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[Any], Unit]] = js.undefined
  
  /** The movableRowsSent callback is triggered on the sending table when a row has been successfully received by a receiving table. */
  var movableRowsSent: js.UndefOr[
    js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Unit]
  ] = js.undefined
  
  /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table. */
  var movableRowsSentFailed: js.UndefOr[
    js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Unit]
  ] = js.undefined
  
  /** You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true. */
  var resizableRows: js.UndefOr[Boolean] = js.undefined
  
  /** The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions. */
  var rowAdded: js.UndefOr[RowChangedCallback] = js.undefined
  
  /** The rowClick callback is triggered when a user clicks on a row. */
  var rowClick: js.UndefOr[RowEventCallback] = js.undefined
  
  /**
    * The rowContext callback is triggered when a user right clicks on a row.
    * If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback.
    */
  var rowContext: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowDblClick callback is triggered when a user double clicks on a row. */
  var rowDblClick: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms. */
  var rowDblTap: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function. */
  var rowDeleted: js.UndefOr[RowChangedCallback] = js.undefined
  
  /** The rowDeselected event is triggered when a row is deselected, either by the user or programmatically. */
  var rowDeselected: js.UndefOr[RowChangedCallback] = js.undefined
  
  /**
    * Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
    * The function accepts one argument, the RowComponent for the row being formatted.
    */
  var rowFormatter: js.UndefOr[js.Function1[/* row */ RowComponent, Any]] = js.undefined
  
  /** When copying to the clipboard you may want to apply a different formatter may want to apply a different formatter from the one usually used to format the row. You can now do this using the rowFormatterClipboard table option, which takes the same inputs as the standard rowFormatter property. Passing a value of false into the formatter prevent the default row formatter from being run when the table is copied to the clipboard. */
  var rowFormatterClipboard: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, Any])] = js.undefined
  
  /** When the getHtml function is called you may want to apply a different formatter may want to apply a different formatter from the one usually used to format the row */
  var rowFormatterHtmlOutput: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, Any])] = js.undefined
  
  /** When printing you may want to apply a different formatter may want to apply a different formatter from the one usually used to format the row. */
  var rowFormatterPrint: js.UndefOr[`false` | (js.Function1[/* row */ RowComponent, Any])] = js.undefined
  
  /** The rowMouseEnter callback is triggered when the mouse pointer enters a row. */
  var rowMouseEnter: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowMouseLeave callback is triggered when the mouse pointer leaves a row. */
  var rowMouseLeave: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowMouseMove callback is triggered when the mouse pointer moves over a row. */
  var rowMouseMove: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements. */
  var rowMouseOut: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements. */
  var rowMouseOver: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowMoved callback will be triggered when a row has been successfully moved. */
  var rowMoved: js.UndefOr[RowChangedCallback] = js.undefined
  
  /** The rowResized callback will be triggered when a row has been resized by the user. */
  var rowResized: js.UndefOr[RowChangedCallback] = js.undefined
  
  /** The rowSelected event is triggered when a row is selected, either by the user or programmatically. */
  var rowSelected: js.UndefOr[RowChangedCallback] = js.undefined
  
  /** Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument. */
  var rowSelectionChanged: js.UndefOr[js.Function2[/* data */ js.Array[Any], /* rows */ js.Array[RowComponent], Unit]] = js.undefined
  
  /** The rowTap callback is triggered when a user taps on a row on a touch display. */
  var rowTap: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second. */
  var rowTapHold: js.UndefOr[RowEventCallback] = js.undefined
  
  /** The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions. */
  var rowUpdated: js.UndefOr[RowChangedCallback] = js.undefined
  
  /**
    * The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
    *
    * true - scroll to row, even if it is visible (default)
    * false - scroll to row, unless it is currently visible, then don't move
    */
  var scrollToRowIfVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
    *
    * top - position row with its top edge at the top of the table (default)
    * center - position row with its top edge in the center of the table
    * bottom - position row with its bottom edge at the bottom of the table
    * nearest - position row on the edge of the table it is closest to
    */
  var scrollToRowPosition: js.UndefOr[ScrollToRowPosition] = js.undefined
  
  /**
    * The selectable option can take one of a several values:
    * false - selectable rows are disabled
    * true - selectable rows are enabled, and you can select as many as you want
    * integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exceeded, the first selected row will be deselected to allow the next row to be selected).
    * "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable.
    */
  var selectable: js.UndefOr[Boolean | Double | highlight] = js.undefined
  
  /** You many want to exclude certain rows from being selected. The selectableCheck options allows you to pass a function to check if the current row should be selectable, returning true will allow row selection, false will result in nothing happening. The function should accept a RowComponent as its first argument. */
  var selectableCheck: js.UndefOr[js.Function1[/* row */ RowComponent, Boolean]] = js.undefined
  
  /** By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false. */
  var selectablePersistence: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
    *
    * If you would prefer to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can achieve this by setting the selectableRangeMode to click
    */
  var selectableRangeMode: js.UndefOr[click] = js.undefined
  
  /** By default, row selection works on a rolling basis, if you set the selectable option to a numeric value then when you select past this number of rows, the first row to be selected will be deselected. If you want to disable this behavior and instead prevent selection of new rows once the limit is reached you can set the selectableRollingSelection option to false. */
  var selectableRollingSelection: js.UndefOr[Boolean] = js.undefined
  
  /** Allows you to specify the behavior when the user tabs from the last editable cell on the last row of the table. */
  var tabEndNewRow: js.UndefOr[Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, Any])] = js.undefined
}
object OptionsRows {
  
  inline def apply(): OptionsRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRows]
  }
  
  extension [Self <: OptionsRows](x: Self) {
    
    inline def setAddRowPos(value: bottom | top): Self = StObject.set(x, "addRowPos", value.asInstanceOf[js.Any])
    
    inline def setAddRowPosUndefined: Self = StObject.set(x, "addRowPos", js.undefined)
    
    inline def setDataTreeRowCollapsed(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = StObject.set(x, "dataTreeRowCollapsed", js.Any.fromFunction2(value))
    
    inline def setDataTreeRowCollapsedUndefined: Self = StObject.set(x, "dataTreeRowCollapsed", js.undefined)
    
    inline def setDataTreeRowExpanded(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = StObject.set(x, "dataTreeRowExpanded", js.Any.fromFunction2(value))
    
    inline def setDataTreeRowExpandedUndefined: Self = StObject.set(x, "dataTreeRowExpanded", js.undefined)
    
    inline def setFrozenRows(value: Double | js.Array[String] | (js.Function1[/* row */ RowComponent, Boolean])): Self = StObject.set(x, "frozenRows", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowsField(value: String): Self = StObject.set(x, "frozenRowsField", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowsFieldUndefined: Self = StObject.set(x, "frozenRowsField", js.undefined)
    
    inline def setFrozenRowsFunction1(value: /* row */ RowComponent => Boolean): Self = StObject.set(x, "frozenRows", js.Any.fromFunction1(value))
    
    inline def setFrozenRowsUndefined: Self = StObject.set(x, "frozenRows", js.undefined)
    
    inline def setFrozenRowsVarargs(value: String*): Self = StObject.set(x, "frozenRows", js.Array(value*))
    
    inline def setMovableRows(value: Boolean): Self = StObject.set(x, "movableRows", value.asInstanceOf[js.Any])
    
    inline def setMovableRowsConnectedElements(value: String | HTMLElement): Self = StObject.set(x, "movableRowsConnectedElements", value.asInstanceOf[js.Any])
    
    inline def setMovableRowsConnectedElementsUndefined: Self = StObject.set(x, "movableRowsConnectedElements", js.undefined)
    
    inline def setMovableRowsConnectedTables(value: String | (js.Array[HTMLElement | String]) | HTMLElement): Self = StObject.set(x, "movableRowsConnectedTables", value.asInstanceOf[js.Any])
    
    inline def setMovableRowsConnectedTablesUndefined: Self = StObject.set(x, "movableRowsConnectedTables", js.undefined)
    
    inline def setMovableRowsConnectedTablesVarargs(value: (HTMLElement | String)*): Self = StObject.set(x, "movableRowsConnectedTables", js.Array(value*))
    
    inline def setMovableRowsElementDrop(value: (/* e */ MouseEvent, /* element */ HTMLElement, /* row */ RowComponent) => Any): Self = StObject.set(x, "movableRowsElementDrop", js.Any.fromFunction3(value))
    
    inline def setMovableRowsElementDropUndefined: Self = StObject.set(x, "movableRowsElementDrop", js.undefined)
    
    inline def setMovableRowsReceived(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceived", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceivedFailed(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivedFailed", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceivedFailedUndefined: Self = StObject.set(x, "movableRowsReceivedFailed", js.undefined)
    
    inline def setMovableRowsReceivedUndefined: Self = StObject.set(x, "movableRowsReceived", js.undefined)
    
    inline def setMovableRowsReceiver(
      value: insert | add | update | replace | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Any])
    ): Self = StObject.set(x, "movableRowsReceiver", value.asInstanceOf[js.Any])
    
    inline def setMovableRowsReceiverFunction3(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => Any): Self = StObject.set(x, "movableRowsReceiver", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceiverUndefined: Self = StObject.set(x, "movableRowsReceiver", js.undefined)
    
    inline def setMovableRowsReceivingStart(value: (/* fromRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivingStart", js.Any.fromFunction2(value))
    
    inline def setMovableRowsReceivingStartUndefined: Self = StObject.set(x, "movableRowsReceivingStart", js.undefined)
    
    inline def setMovableRowsReceivingStop(value: /* fromTable */ Tabulator => Unit): Self = StObject.set(x, "movableRowsReceivingStop", js.Any.fromFunction1(value))
    
    inline def setMovableRowsReceivingStopUndefined: Self = StObject.set(x, "movableRowsReceivingStop", js.undefined)
    
    inline def setMovableRowsSender(
      value: `false` | delete | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Any])
    ): Self = StObject.set(x, "movableRowsSender", value.asInstanceOf[js.Any])
    
    inline def setMovableRowsSenderFunction3(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => Any): Self = StObject.set(x, "movableRowsSender", js.Any.fromFunction3(value))
    
    inline def setMovableRowsSenderUndefined: Self = StObject.set(x, "movableRowsSender", js.undefined)
    
    inline def setMovableRowsSendingStart(value: /* toTables */ js.Array[Any] => Unit): Self = StObject.set(x, "movableRowsSendingStart", js.Any.fromFunction1(value))
    
    inline def setMovableRowsSendingStartUndefined: Self = StObject.set(x, "movableRowsSendingStart", js.undefined)
    
    inline def setMovableRowsSendingStop(value: /* toTables */ js.Array[Any] => Unit): Self = StObject.set(x, "movableRowsSendingStop", js.Any.fromFunction1(value))
    
    inline def setMovableRowsSendingStopUndefined: Self = StObject.set(x, "movableRowsSendingStop", js.undefined)
    
    inline def setMovableRowsSent(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsSent", js.Any.fromFunction3(value))
    
    inline def setMovableRowsSentFailed(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsSentFailed", js.Any.fromFunction3(value))
    
    inline def setMovableRowsSentFailedUndefined: Self = StObject.set(x, "movableRowsSentFailed", js.undefined)
    
    inline def setMovableRowsSentUndefined: Self = StObject.set(x, "movableRowsSent", js.undefined)
    
    inline def setMovableRowsUndefined: Self = StObject.set(x, "movableRows", js.undefined)
    
    inline def setResizableRows(value: Boolean): Self = StObject.set(x, "resizableRows", value.asInstanceOf[js.Any])
    
    inline def setResizableRowsUndefined: Self = StObject.set(x, "resizableRows", js.undefined)
    
    inline def setRowAdded(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowAdded", js.Any.fromFunction1(value))
    
    inline def setRowAddedUndefined: Self = StObject.set(x, "rowAdded", js.undefined)
    
    inline def setRowClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowClick", js.Any.fromFunction2(value))
    
    inline def setRowClickUndefined: Self = StObject.set(x, "rowClick", js.undefined)
    
    inline def setRowContext(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowContext", js.Any.fromFunction2(value))
    
    inline def setRowContextUndefined: Self = StObject.set(x, "rowContext", js.undefined)
    
    inline def setRowDblClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowDblClick", js.Any.fromFunction2(value))
    
    inline def setRowDblClickUndefined: Self = StObject.set(x, "rowDblClick", js.undefined)
    
    inline def setRowDblTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowDblTap", js.Any.fromFunction2(value))
    
    inline def setRowDblTapUndefined: Self = StObject.set(x, "rowDblTap", js.undefined)
    
    inline def setRowDeleted(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowDeleted", js.Any.fromFunction1(value))
    
    inline def setRowDeletedUndefined: Self = StObject.set(x, "rowDeleted", js.undefined)
    
    inline def setRowDeselected(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowDeselected", js.Any.fromFunction1(value))
    
    inline def setRowDeselectedUndefined: Self = StObject.set(x, "rowDeselected", js.undefined)
    
    inline def setRowFormatter(value: /* row */ RowComponent => Any): Self = StObject.set(x, "rowFormatter", js.Any.fromFunction1(value))
    
    inline def setRowFormatterClipboard(value: `false` | (js.Function1[/* row */ RowComponent, Any])): Self = StObject.set(x, "rowFormatterClipboard", value.asInstanceOf[js.Any])
    
    inline def setRowFormatterClipboardFunction1(value: /* row */ RowComponent => Any): Self = StObject.set(x, "rowFormatterClipboard", js.Any.fromFunction1(value))
    
    inline def setRowFormatterClipboardUndefined: Self = StObject.set(x, "rowFormatterClipboard", js.undefined)
    
    inline def setRowFormatterHtmlOutput(value: `false` | (js.Function1[/* row */ RowComponent, Any])): Self = StObject.set(x, "rowFormatterHtmlOutput", value.asInstanceOf[js.Any])
    
    inline def setRowFormatterHtmlOutputFunction1(value: /* row */ RowComponent => Any): Self = StObject.set(x, "rowFormatterHtmlOutput", js.Any.fromFunction1(value))
    
    inline def setRowFormatterHtmlOutputUndefined: Self = StObject.set(x, "rowFormatterHtmlOutput", js.undefined)
    
    inline def setRowFormatterPrint(value: `false` | (js.Function1[/* row */ RowComponent, Any])): Self = StObject.set(x, "rowFormatterPrint", value.asInstanceOf[js.Any])
    
    inline def setRowFormatterPrintFunction1(value: /* row */ RowComponent => Any): Self = StObject.set(x, "rowFormatterPrint", js.Any.fromFunction1(value))
    
    inline def setRowFormatterPrintUndefined: Self = StObject.set(x, "rowFormatterPrint", js.undefined)
    
    inline def setRowFormatterUndefined: Self = StObject.set(x, "rowFormatter", js.undefined)
    
    inline def setRowMouseEnter(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseEnter", js.Any.fromFunction2(value))
    
    inline def setRowMouseEnterUndefined: Self = StObject.set(x, "rowMouseEnter", js.undefined)
    
    inline def setRowMouseLeave(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseLeave", js.Any.fromFunction2(value))
    
    inline def setRowMouseLeaveUndefined: Self = StObject.set(x, "rowMouseLeave", js.undefined)
    
    inline def setRowMouseMove(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseMove", js.Any.fromFunction2(value))
    
    inline def setRowMouseMoveUndefined: Self = StObject.set(x, "rowMouseMove", js.undefined)
    
    inline def setRowMouseOut(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseOut", js.Any.fromFunction2(value))
    
    inline def setRowMouseOutUndefined: Self = StObject.set(x, "rowMouseOut", js.undefined)
    
    inline def setRowMouseOver(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseOver", js.Any.fromFunction2(value))
    
    inline def setRowMouseOverUndefined: Self = StObject.set(x, "rowMouseOver", js.undefined)
    
    inline def setRowMoved(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowMoved", js.Any.fromFunction1(value))
    
    inline def setRowMovedUndefined: Self = StObject.set(x, "rowMoved", js.undefined)
    
    inline def setRowResized(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowResized", js.Any.fromFunction1(value))
    
    inline def setRowResizedUndefined: Self = StObject.set(x, "rowResized", js.undefined)
    
    inline def setRowSelected(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1(value))
    
    inline def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
    
    inline def setRowSelectionChanged(value: (/* data */ js.Array[Any], /* rows */ js.Array[RowComponent]) => Unit): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction2(value))
    
    inline def setRowSelectionChangedUndefined: Self = StObject.set(x, "rowSelectionChanged", js.undefined)
    
    inline def setRowTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowTap", js.Any.fromFunction2(value))
    
    inline def setRowTapHold(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowTapHold", js.Any.fromFunction2(value))
    
    inline def setRowTapHoldUndefined: Self = StObject.set(x, "rowTapHold", js.undefined)
    
    inline def setRowTapUndefined: Self = StObject.set(x, "rowTap", js.undefined)
    
    inline def setRowUpdated(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowUpdated", js.Any.fromFunction1(value))
    
    inline def setRowUpdatedUndefined: Self = StObject.set(x, "rowUpdated", js.undefined)
    
    inline def setScrollToRowIfVisible(value: Boolean): Self = StObject.set(x, "scrollToRowIfVisible", value.asInstanceOf[js.Any])
    
    inline def setScrollToRowIfVisibleUndefined: Self = StObject.set(x, "scrollToRowIfVisible", js.undefined)
    
    inline def setScrollToRowPosition(value: ScrollToRowPosition): Self = StObject.set(x, "scrollToRowPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollToRowPositionUndefined: Self = StObject.set(x, "scrollToRowPosition", js.undefined)
    
    inline def setSelectable(value: Boolean | Double | highlight): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableCheck(value: /* row */ RowComponent => Boolean): Self = StObject.set(x, "selectableCheck", js.Any.fromFunction1(value))
    
    inline def setSelectableCheckUndefined: Self = StObject.set(x, "selectableCheck", js.undefined)
    
    inline def setSelectablePersistence(value: Boolean): Self = StObject.set(x, "selectablePersistence", value.asInstanceOf[js.Any])
    
    inline def setSelectablePersistenceUndefined: Self = StObject.set(x, "selectablePersistence", js.undefined)
    
    inline def setSelectableRangeMode(value: click): Self = StObject.set(x, "selectableRangeMode", value.asInstanceOf[js.Any])
    
    inline def setSelectableRangeModeUndefined: Self = StObject.set(x, "selectableRangeMode", js.undefined)
    
    inline def setSelectableRollingSelection(value: Boolean): Self = StObject.set(x, "selectableRollingSelection", value.asInstanceOf[js.Any])
    
    inline def setSelectableRollingSelectionUndefined: Self = StObject.set(x, "selectableRollingSelection", js.undefined)
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setTabEndNewRow(value: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, Any])): Self = StObject.set(x, "tabEndNewRow", value.asInstanceOf[js.Any])
    
    inline def setTabEndNewRowFunction1(value: /* row */ RowComponent => Any): Self = StObject.set(x, "tabEndNewRow", js.Any.fromFunction1(value))
    
    inline def setTabEndNewRowUndefined: Self = StObject.set(x, "tabEndNewRow", js.undefined)
  }
}
