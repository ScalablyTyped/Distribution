package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsRows extends js.Object {
  /** The position in the table for new rows to be added, "bottom" or "top" */
  var addRowPos: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top
  ] = js.undefined
  /** The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children.*/
  var dataTreeRowCollapsed: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ scala.Double, scala.Unit]] = js.undefined
  /** The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children. */
  var dataTreeRowExpanded: js.UndefOr[js.Function2[/* row */ RowComponent, /* level */ scala.Double, scala.Unit]] = js.undefined
  /** To allow the user to move rows up and down the table, set the movableRows parameter in the options: */
  var movableRows: js.UndefOr[scala.Boolean] = js.undefined
  /** Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabuator object for the table to the movableRowsConnectedTables option. if you want to connect to multple tables then you can pass in an array of values to this option. */
  var movableRowsConnectedTables: js.UndefOr[
    java.lang.String | (js.Array[stdLib.HTMLElement | java.lang.String]) | stdLib.HTMLElement
  ] = js.undefined
  /** The movableRowsReceived callback is triggered on a receiving table when a row has been successfuly received.*/
  var movableRowsReceived: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ tabulatorDashTablesLib.Tabulator, 
      scala.Unit
    ]
  ] = js.undefined
  /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.*/
  var movableRowsReceivedFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ tabulatorDashTablesLib.Tabulator, 
      scala.Unit
    ]
  ] = js.undefined
  /**  The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
    There are several inbuilt receiver functions:
    insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
    add - adds row to the table
    update - updates the row it is dropped on with the sent rows data
    replace - replaces the row it is dropped on with the sent row*/
  var movableRowsReceiver: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibStrings.insert | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.add | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.update | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ tabulatorDashTablesLib.Tabulator, 
      _
    ])
  ] = js.undefined
  /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
  var movableRowsReceivingStart: js.UndefOr[
    js.Function2[
      /* fromRow */ RowComponent, 
      /* toTable */ tabulatorDashTablesLib.Tabulator, 
      scala.Unit
    ]
  ] = js.undefined
  /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.*/
  var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ tabulatorDashTablesLib.Tabulator, scala.Unit]] = js.undefined
  /** The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
    There are several inbuilt sender functions:
    false - do nothing(default)
    delete - deletes the row from the table
    You can also pass a callback to the movableRowsSender option for custom sender functionality
    */
  var movableRowsSender: js.UndefOr[
    tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ tabulatorDashTablesLib.Tabulator, 
      _
    ])
  ] = js.undefined
  /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
  var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[_], scala.Unit]] = js.undefined
  /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
  var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[_], scala.Unit]] = js.undefined
  /** The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table. */
  var movableRowsSent: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ tabulatorDashTablesLib.Tabulator, 
      scala.Unit
    ]
  ] = js.undefined
  /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.*/
  var movableRowsSentFailed: js.UndefOr[
    js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ tabulatorDashTablesLib.Tabulator, 
      scala.Unit
    ]
  ] = js.undefined
  /** You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true */
  var resizableRows: js.UndefOr[scala.Boolean] = js.undefined
  /** The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions. */
  var rowAdded: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowClick callback is triggered when a user clicks on a row. */
  var rowClick: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowContext callback is triggered when a user right clicks on a row.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var rowContext: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDblClick callback is triggered when a user double clicks on a row. */
  var rowDblClick: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms. */
  var rowDblTap: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function. */
  var rowDeleted: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowDeselected event is triggered when a row is deselected, either by the user or programatically. */
  var rowDeselected: js.UndefOr[RowChangedCallback] = js.undefined
  /** Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
    The function accepts one argument, the RowComponent for the row being formatted. */
  var rowFormatter: js.UndefOr[js.Function1[/* row */ RowComponent, _]] = js.undefined
  /** The rowMouseEnter callback is triggered when the mouse pointer enters a row. */
  var rowMouseEnter: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseLeave callback is triggered when the mouse pointer leaves a row. */
  var rowMouseLeave: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseMove callback is triggered when the mouse pointer moves over a row. */
  var rowMouseMove: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements. */
  var rowMouseOut: js.UndefOr[RowEventCallback] = js.undefined
  /**  The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements.*/
  var rowMouseOver: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowMoved callback will be triggered when a row has been successfuly moved. */
  var rowMoved: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowResized callback will be triggered when a row has been resized by the user. */
  var rowResized: js.UndefOr[RowChangedCallback] = js.undefined
  /** The rowSelected event is triggered when a row is selected, either by the user or programatically. */
  var rowSelected: js.UndefOr[RowChangedCallback] = js.undefined
  /** Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument. */
  var rowSelectionChanged: js.UndefOr[
    js.Function2[/* data */ js.Array[_], /* rows */ js.Array[RowComponent], scala.Unit]
  ] = js.undefined
  /** The rowTap callback is triggered when a user taps on a row on a touch display. */
  var rowTap: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second. */
  var rowTapHold: js.UndefOr[RowEventCallback] = js.undefined
  /** The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions. */
  var rowUpdated: js.UndefOr[RowChangedCallback] = js.undefined
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
    true - scroll to row, even if it is visible (default)
    false - scroll to row, unless it is currently visible, then don't move */
  var scrollToRowIfVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
    top - position row with its top edge at the top of the table (default)
    center - position row with its top edge in the center of the table
    bottom - position row with its bottom edge at the bottom of the table
    nearest - position row on the edge of the table it is closest to
    */
  var scrollToRowPosition: js.UndefOr[ScrollToRowPostition] = js.undefined
  /** The selectable option can take one of a several values:
    false - selectable rows are disabled
    true - selectable rows are enabled, and you can select as many as you want
    integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
    "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable. */
  var selectable: js.UndefOr[
    scala.Boolean | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.highlight
  ] = js.undefined
  /** You many want to exclude certain rows from being selected. The selectableCheck options allows you to pass a function to check if the current row should be selectable, returning true will allow row selection, false will result in nothing happening. The function should accept a RowComponent as its first argument. */
  var selectableCheck: js.UndefOr[js.Function1[/* row */ RowComponent, scala.Boolean]] = js.undefined
  /** By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false. */
  var selectablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
    If you would prefere to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can acheive this by setting the selectableRangeMode to click */
  var selectableRangeMode: js.UndefOr[tabulatorDashTablesLib.tabulatorDashTablesLibStrings.click] = js.undefined
  /** By default, row selection works on a rolling basis, if you set the selectable option to a numeric value then when you select past this number of rows, the first row to be selected will be deselected. If you want to disable this behaviour and instead prevent selection of new rows once the limit is reached you can set the selectableRollingSelection option to false. */
  var selectableRollingSelection: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsRows {
  @scala.inline
  def apply(
    addRowPos: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top = null,
    dataTreeRowCollapsed: (/* row */ RowComponent, /* level */ scala.Double) => scala.Unit = null,
    dataTreeRowExpanded: (/* row */ RowComponent, /* level */ scala.Double) => scala.Unit = null,
    movableRows: js.UndefOr[scala.Boolean] = js.undefined,
    movableRowsConnectedTables: java.lang.String | (js.Array[stdLib.HTMLElement | java.lang.String]) | stdLib.HTMLElement = null,
    movableRowsReceived: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ tabulatorDashTablesLib.Tabulator) => scala.Unit = null,
    movableRowsReceivedFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ tabulatorDashTablesLib.Tabulator) => scala.Unit = null,
    movableRowsReceiver: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.insert | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.add | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.update | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ tabulatorDashTablesLib.Tabulator, 
      _
    ]) = null,
    movableRowsReceivingStart: (/* fromRow */ RowComponent, /* toTable */ tabulatorDashTablesLib.Tabulator) => scala.Unit = null,
    movableRowsReceivingStop: /* fromTable */ tabulatorDashTablesLib.Tabulator => scala.Unit = null,
    movableRowsSender: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ tabulatorDashTablesLib.Tabulator, 
      _
    ]) = null,
    movableRowsSendingStart: /* toTables */ js.Array[_] => scala.Unit = null,
    movableRowsSendingStop: /* toTables */ js.Array[_] => scala.Unit = null,
    movableRowsSent: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ tabulatorDashTablesLib.Tabulator) => scala.Unit = null,
    movableRowsSentFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ tabulatorDashTablesLib.Tabulator) => scala.Unit = null,
    resizableRows: js.UndefOr[scala.Boolean] = js.undefined,
    rowAdded: RowChangedCallback = null,
    rowClick: RowEventCallback = null,
    rowContext: RowEventCallback = null,
    rowDblClick: RowEventCallback = null,
    rowDblTap: RowEventCallback = null,
    rowDeleted: RowChangedCallback = null,
    rowDeselected: RowChangedCallback = null,
    rowFormatter: /* row */ RowComponent => _ = null,
    rowMouseEnter: RowEventCallback = null,
    rowMouseLeave: RowEventCallback = null,
    rowMouseMove: RowEventCallback = null,
    rowMouseOut: RowEventCallback = null,
    rowMouseOver: RowEventCallback = null,
    rowMoved: RowChangedCallback = null,
    rowResized: RowChangedCallback = null,
    rowSelected: RowChangedCallback = null,
    rowSelectionChanged: (/* data */ js.Array[_], /* rows */ js.Array[RowComponent]) => scala.Unit = null,
    rowTap: RowEventCallback = null,
    rowTapHold: RowEventCallback = null,
    rowUpdated: RowChangedCallback = null,
    scrollToRowIfVisible: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToRowPosition: ScrollToRowPostition = null,
    selectable: scala.Boolean | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.highlight = null,
    selectableCheck: /* row */ RowComponent => scala.Boolean = null,
    selectablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    selectableRangeMode: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.click = null,
    selectableRollingSelection: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsRows = {
    val __obj = js.Dynamic.literal()
    if (addRowPos != null) __obj.updateDynamic("addRowPos")(addRowPos.asInstanceOf[js.Any])
    if (dataTreeRowCollapsed != null) __obj.updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2(dataTreeRowCollapsed))
    if (dataTreeRowExpanded != null) __obj.updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2(dataTreeRowExpanded))
    if (!js.isUndefined(movableRows)) __obj.updateDynamic("movableRows")(movableRows)
    if (movableRowsConnectedTables != null) __obj.updateDynamic("movableRowsConnectedTables")(movableRowsConnectedTables.asInstanceOf[js.Any])
    if (movableRowsReceived != null) __obj.updateDynamic("movableRowsReceived")(js.Any.fromFunction3(movableRowsReceived))
    if (movableRowsReceivedFailed != null) __obj.updateDynamic("movableRowsReceivedFailed")(js.Any.fromFunction3(movableRowsReceivedFailed))
    if (movableRowsReceiver != null) __obj.updateDynamic("movableRowsReceiver")(movableRowsReceiver.asInstanceOf[js.Any])
    if (movableRowsReceivingStart != null) __obj.updateDynamic("movableRowsReceivingStart")(js.Any.fromFunction2(movableRowsReceivingStart))
    if (movableRowsReceivingStop != null) __obj.updateDynamic("movableRowsReceivingStop")(js.Any.fromFunction1(movableRowsReceivingStop))
    if (movableRowsSender != null) __obj.updateDynamic("movableRowsSender")(movableRowsSender.asInstanceOf[js.Any])
    if (movableRowsSendingStart != null) __obj.updateDynamic("movableRowsSendingStart")(js.Any.fromFunction1(movableRowsSendingStart))
    if (movableRowsSendingStop != null) __obj.updateDynamic("movableRowsSendingStop")(js.Any.fromFunction1(movableRowsSendingStop))
    if (movableRowsSent != null) __obj.updateDynamic("movableRowsSent")(js.Any.fromFunction3(movableRowsSent))
    if (movableRowsSentFailed != null) __obj.updateDynamic("movableRowsSentFailed")(js.Any.fromFunction3(movableRowsSentFailed))
    if (!js.isUndefined(resizableRows)) __obj.updateDynamic("resizableRows")(resizableRows)
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(rowAdded)
    if (rowClick != null) __obj.updateDynamic("rowClick")(rowClick)
    if (rowContext != null) __obj.updateDynamic("rowContext")(rowContext)
    if (rowDblClick != null) __obj.updateDynamic("rowDblClick")(rowDblClick)
    if (rowDblTap != null) __obj.updateDynamic("rowDblTap")(rowDblTap)
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(rowDeleted)
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(rowDeselected)
    if (rowFormatter != null) __obj.updateDynamic("rowFormatter")(js.Any.fromFunction1(rowFormatter))
    if (rowMouseEnter != null) __obj.updateDynamic("rowMouseEnter")(rowMouseEnter)
    if (rowMouseLeave != null) __obj.updateDynamic("rowMouseLeave")(rowMouseLeave)
    if (rowMouseMove != null) __obj.updateDynamic("rowMouseMove")(rowMouseMove)
    if (rowMouseOut != null) __obj.updateDynamic("rowMouseOut")(rowMouseOut)
    if (rowMouseOver != null) __obj.updateDynamic("rowMouseOver")(rowMouseOver)
    if (rowMoved != null) __obj.updateDynamic("rowMoved")(rowMoved)
    if (rowResized != null) __obj.updateDynamic("rowResized")(rowResized)
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(rowSelected)
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(rowSelectionChanged))
    if (rowTap != null) __obj.updateDynamic("rowTap")(rowTap)
    if (rowTapHold != null) __obj.updateDynamic("rowTapHold")(rowTapHold)
    if (rowUpdated != null) __obj.updateDynamic("rowUpdated")(rowUpdated)
    if (!js.isUndefined(scrollToRowIfVisible)) __obj.updateDynamic("scrollToRowIfVisible")(scrollToRowIfVisible)
    if (scrollToRowPosition != null) __obj.updateDynamic("scrollToRowPosition")(scrollToRowPosition)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectableCheck != null) __obj.updateDynamic("selectableCheck")(js.Any.fromFunction1(selectableCheck))
    if (!js.isUndefined(selectablePersistence)) __obj.updateDynamic("selectablePersistence")(selectablePersistence)
    if (selectableRangeMode != null) __obj.updateDynamic("selectableRangeMode")(selectableRangeMode)
    if (!js.isUndefined(selectableRollingSelection)) __obj.updateDynamic("selectableRollingSelection")(selectableRollingSelection)
    __obj.asInstanceOf[OptionsRows]
  }
}

