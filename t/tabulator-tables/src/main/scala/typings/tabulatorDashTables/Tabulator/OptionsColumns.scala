package typings.tabulatorDashTables.Tabulator

import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`false`
import typings.tabulatorDashTables.tabulatorDashTablesNumbers.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.both
import typings.tabulatorDashTables.tabulatorDashTablesStrings.bottom
import typings.tabulatorDashTables.tabulatorDashTablesStrings.cell
import typings.tabulatorDashTables.tabulatorDashTablesStrings.collapse
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitColumns
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitData
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitDataFill
import typings.tabulatorDashTables.tabulatorDashTablesStrings.group
import typings.tabulatorDashTables.tabulatorDashTablesStrings.header
import typings.tabulatorDashTables.tabulatorDashTablesStrings.hide
import typings.tabulatorDashTables.tabulatorDashTablesStrings.middle
import typings.tabulatorDashTables.tabulatorDashTablesStrings.table
import typings.tabulatorDashTables.tabulatorDashTablesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsColumns extends js.Object {
  /**
    * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data.
    */
  var autoColumns: js.UndefOr[Boolean] = js.undefined
  /** By default column calculations are shown at the top and bottom of the table, unless row grouping is enabled, in which case they are shown at the top and bottom of each group.
    The columnCalcs option lets you decided where the calculations should be displayed, it can take one of four values:
    true - show calcs at top and bottom of the table, unless grouped, then show in groups (boolean, default)
    both - show calcs at top and bottom of the table and show in groups
    table - show calcs at top and bottom of the table only
    group - show calcs in groups only */
  var columnCalcs: js.UndefOr[Boolean | both | table | group] = js.undefined
  /** multiple or single column sorting */
  var columnHeaderSortMulti: js.UndefOr[Boolean] = js.undefined
  /** It is possible to set a minimum column width to prevent resizing columns from becoming too small.
    This can be set globally, by setting the columnMinWidth option to the column width when you create your Tabulator.
    This option can be overridden on a per column basis by setting the minWidth property on the column definition. */
  var columnMinWidth: js.UndefOr[Double] = js.undefined
  /** The columnMoved callback will be triggered when a column has been successfuly moved. */
  var columnMoved: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* columns */ js.Array[_], Unit]] = js.undefined
  var columnResized: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.undefined
  /** The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array. */
  var columnTitleChanged: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.undefined
  /** You can use the columnVertAlign option to set how the text in your column headers should be vertically  */
  var columnVertAlign: js.UndefOr[top | middle | bottom] = js.undefined
  /** The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states. */
  var columnVisibilityChanged: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* visible */ Boolean, Unit]] = js.undefined
  /** The column definitions are provided to Tabluator in the columns property of the table constructor object and should take the format of an array of objects, with each object representing the configuration of one column. */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  /** The default placeholder text used for input elements can be set using the headerFilterPlaceholder option in the table definition */
  var headerFilterPlaceholder: js.UndefOr[String] = js.undefined
  /** The headerSort option can now be set in the table options to affect all columns as well as in column definitions. */
  var headerSort: js.UndefOr[Boolean] = js.undefined
  /** The headerSortTristate option can now be set in the table options to affect all columns as well as in column definitions.*/
  var headerSortTristate: js.UndefOr[Boolean] = js.undefined
  /**By setting the headerVisible option to false you can hide the column headers and present the table as a simple list if needed. */
  var headerVisible: js.UndefOr[Boolean] = js.undefined
  /** By default Tabulator will use the fitData layout mode, which will resize the tables columns to fit the data held in each column, unless you specify a width or minWidth in the column constructor. If the width of all columns exceeds the width of the containing element, a scroll bar will appear. */
  var layout: js.UndefOr[fitData | fitColumns | fitDataFill] = js.undefined
  /** To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
    If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true. */
  var layoutColumnsOnNewData: js.UndefOr[Boolean] = js.undefined
  /** To allow the user to move columns along the table, set the movableColumns parameter in the options: */
  var movableColumns: js.UndefOr[Boolean] = js.undefined
  /** If you need to use the . character as part of your field name, you can change the separator to any other character using the nestedFieldSeparator option
    * Set to false to disable nested data parsing
    */
  var nestedFieldSeparator: js.UndefOr[String | Boolean] = js.undefined
  /**If you don't want to show a particular column in the print table you can set the print property in its column definition object to false */
  var print: js.UndefOr[Boolean] = js.undefined
  /** By default it is possible to manually resize columns by dragging the borders of the column in both the column headers and the cells of the column.
    If you want to alter this behaviour you can use the resizableColumns to choose where the resize handles are available.  */
  var resizableColumns: js.UndefOr[`true` | `false` | header | cell] = js.undefined
  /** Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
    There are two responsive layout modes available:
    hide - hide columns that no longer fit in the table
    collapse - collapse columns that no longer fit on the table into a list under the row
    Hide Extra Columns
    By default, columns will be hidden from right to left as the width of the table decreases. You can choose exactlyhow columns are hidden using the responsive property in the column definition object.
    When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets. */
  var responsiveLayout: js.UndefOr[Boolean | hide | collapse] = js.undefined
  /** If you set the responsiveLayout option to collapse the values from hidden columns will be displayed in a title/value list under the row.
    In this mode an object containing the title of each hidden column and its value is generated and then used to generate a list displayed in a div .tabulator-responsive-collapse under the row data.
    The inbuilt collapse formatter creates a table to neatly display the hidden columns. If you would like to format the data in your own way you can use the responsiveLayoutCollapseFormatter, it take an object of the column values as an argument and must return the HTML content of the div.
    This function should return an empty string if there is no data to display. */
  var responsiveLayoutCollapseFormatter: js.UndefOr[js.Function1[/* data */ js.Array[_], _]] = js.undefined
  /** Collapsed lists are displayed to the user by default, if you would prefer they start closed so the user can open them you can use the responsiveLayoutCollapseStartOpen option */
  var responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.undefined
  /** By default any formatter set on the column is applied to the value that will appear in the list. while this works for most formatters it can cause issues with the progress formatter which relies on being inside a cell.
    If you would like to disable column formatting in the collapsed list, you can use the responsiveLayoutCollapseUseFormatters option: */
  var responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.undefined
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToColumnIfVisible option. It can take a boolean value:
    true - scroll to column, even if it is visible (default)
    false - scroll to column, unless it is currently visible, then don't move */
  var scrollToColumnIfVisible: js.UndefOr[Boolean] = js.undefined
  /** The default ScrollTo position can be set using the scrollToColumnPosition option. It can take one of three possible values:
    left - position column with its left edge at the left of the table (default)
    center - position column with its left edge in the center of the table
    right - position column with its right edge at the right of the table */
  var scrollToColumnPosition: js.UndefOr[ScrollToColumnPosition] = js.undefined
  /** Header tooltips can be set globally using the tooltipsHeader options parameter */
  var tooltipsHeader: js.UndefOr[Boolean] = js.undefined
}

object OptionsColumns {
  @scala.inline
  def apply(
    autoColumns: js.UndefOr[Boolean] = js.undefined,
    columnCalcs: Boolean | both | table | group = null,
    columnHeaderSortMulti: js.UndefOr[Boolean] = js.undefined,
    columnMinWidth: Int | Double = null,
    columnMoved: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => Unit = null,
    columnResized: /* column */ ColumnComponent => Unit = null,
    columnTitleChanged: /* column */ ColumnComponent => Unit = null,
    columnVertAlign: top | middle | bottom = null,
    columnVisibilityChanged: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit = null,
    columns: js.Array[ColumnDefinition] = null,
    headerFilterPlaceholder: String = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerVisible: js.UndefOr[Boolean] = js.undefined,
    layout: fitData | fitColumns | fitDataFill = null,
    layoutColumnsOnNewData: js.UndefOr[Boolean] = js.undefined,
    movableColumns: js.UndefOr[Boolean] = js.undefined,
    nestedFieldSeparator: String | Boolean = null,
    print: js.UndefOr[Boolean] = js.undefined,
    resizableColumns: `true` | `false` | header | cell = null,
    responsiveLayout: Boolean | hide | collapse = null,
    responsiveLayoutCollapseFormatter: /* data */ js.Array[_] => _ = null,
    responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.undefined,
    responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.undefined,
    scrollToColumnIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToColumnPosition: ScrollToColumnPosition = null,
    tooltipsHeader: js.UndefOr[Boolean] = js.undefined
  ): OptionsColumns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoColumns)) __obj.updateDynamic("autoColumns")(autoColumns.asInstanceOf[js.Any])
    if (columnCalcs != null) __obj.updateDynamic("columnCalcs")(columnCalcs.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaderSortMulti)) __obj.updateDynamic("columnHeaderSortMulti")(columnHeaderSortMulti.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnMoved != null) __obj.updateDynamic("columnMoved")(js.Any.fromFunction2(columnMoved))
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction1(columnResized))
    if (columnTitleChanged != null) __obj.updateDynamic("columnTitleChanged")(js.Any.fromFunction1(columnTitleChanged))
    if (columnVertAlign != null) __obj.updateDynamic("columnVertAlign")(columnVertAlign.asInstanceOf[js.Any])
    if (columnVisibilityChanged != null) __obj.updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2(columnVisibilityChanged))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.asInstanceOf[js.Any])
    if (!js.isUndefined(headerVisible)) __obj.updateDynamic("headerVisible")(headerVisible.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutColumnsOnNewData)) __obj.updateDynamic("layoutColumnsOnNewData")(layoutColumnsOnNewData.asInstanceOf[js.Any])
    if (!js.isUndefined(movableColumns)) __obj.updateDynamic("movableColumns")(movableColumns.asInstanceOf[js.Any])
    if (nestedFieldSeparator != null) __obj.updateDynamic("nestedFieldSeparator")(nestedFieldSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (resizableColumns != null) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (responsiveLayout != null) __obj.updateDynamic("responsiveLayout")(responsiveLayout.asInstanceOf[js.Any])
    if (responsiveLayoutCollapseFormatter != null) __obj.updateDynamic("responsiveLayoutCollapseFormatter")(js.Any.fromFunction1(responsiveLayoutCollapseFormatter))
    if (!js.isUndefined(responsiveLayoutCollapseStartOpen)) __obj.updateDynamic("responsiveLayoutCollapseStartOpen")(responsiveLayoutCollapseStartOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveLayoutCollapseUseFormatters)) __obj.updateDynamic("responsiveLayoutCollapseUseFormatters")(responsiveLayoutCollapseUseFormatters.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToColumnIfVisible)) __obj.updateDynamic("scrollToColumnIfVisible")(scrollToColumnIfVisible.asInstanceOf[js.Any])
    if (scrollToColumnPosition != null) __obj.updateDynamic("scrollToColumnPosition")(scrollToColumnPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipsHeader)) __obj.updateDynamic("tooltipsHeader")(tooltipsHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsColumns]
  }
}

