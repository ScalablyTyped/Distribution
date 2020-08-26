package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.both
import typings.tabulatorTables.tabulatorTablesStrings.cell
import typings.tabulatorTables.tabulatorTablesStrings.collapse
import typings.tabulatorTables.tabulatorTablesStrings.fitColumns
import typings.tabulatorTables.tabulatorTablesStrings.fitData
import typings.tabulatorTables.tabulatorTablesStrings.fitDataFill
import typings.tabulatorTables.tabulatorTablesStrings.fitDataStretch
import typings.tabulatorTables.tabulatorTablesStrings.fitDataTable
import typings.tabulatorTables.tabulatorTablesStrings.group
import typings.tabulatorTables.tabulatorTablesStrings.header
import typings.tabulatorTables.tabulatorTablesStrings.hide
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsColumns extends js.Object {
  /**
    * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data.
    */
  var autoColumns: js.UndefOr[Boolean] = js.native
  /** By default column calculations are shown at the top and bottom of the table, unless row grouping is enabled, in which case they are shown at the top and bottom of each group.
    The columnCalcs option lets you decided where the calculations should be displayed, it can take one of four values:
    true - show calcs at top and bottom of the table, unless grouped, then show in groups (boolean, default)
    both - show calcs at top and bottom of the table and show in groups
    table - show calcs at top and bottom of the table only
    group - show calcs in groups only */
  var columnCalcs: js.UndefOr[Boolean | both | table | group] = js.native
  /** multiple or single column sorting */
  var columnHeaderSortMulti: js.UndefOr[Boolean] = js.native
  /** You can use the columnHeaderVertAlign option to set how the text in your column headers should be vertically  */
  var columnHeaderVertAlign: js.UndefOr[VerticalAlign] = js.native
  /** It is possible to set a minimum column width to prevent resizing columns from becoming too small.
    This can be set globally, by setting the columnMinWidth option to the column width when you create your Tabulator.
    This option can be overridden on a per column basis by setting the minWidth property on the column definition. */
  var columnMinWidth: js.UndefOr[Double] = js.native
  /** The columnMoved callback will be triggered when a column has been successfuly moved. */
  var columnMoved: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* columns */ js.Array[_], Unit]] = js.native
  var columnResized: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.native
  /** The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array. */
  var columnTitleChanged: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.native
  /** The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states. */
  var columnVisibilityChanged: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* visible */ Boolean, Unit]] = js.native
  /** The column definitions are provided to Tabluator in the columns property of the table constructor object and should take the format of an array of objects, with each object representing the configuration of one column. */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  /** The default placeholder text used for input elements can be set using the headerFilterPlaceholder option in the table definition */
  var headerFilterPlaceholder: js.UndefOr[String] = js.native
  /** The headerSort option can now be set in the table options to affect all columns as well as in column definitions. */
  var headerSort: js.UndefOr[Boolean] = js.native
  /** The headerSortTristate option can now be set in the table options to affect all columns as well as in column definitions.*/
  var headerSortTristate: js.UndefOr[Boolean] = js.native
  /**By setting the headerVisible option to false you can hide the column headers and present the table as a simple list if needed. */
  var headerVisible: js.UndefOr[Boolean] = js.native
  /** By default Tabulator will use the fitData layout mode, which will resize the tables columns to fit the data held in each column, unless you specify a width or minWidth in the column constructor. If the width of all columns exceeds the width of the containing element, a scroll bar will appear. */
  var layout: js.UndefOr[fitData | fitColumns | fitDataFill | fitDataStretch | fitDataTable] = js.native
  /** To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
    If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true. */
  var layoutColumnsOnNewData: js.UndefOr[Boolean] = js.native
  /** To allow the user to move columns along the table, set the movableColumns parameter in the options: */
  var movableColumns: js.UndefOr[Boolean] = js.native
  /** If you need to use the . character as part of your field name, you can change the separator to any other character using the nestedFieldSeparator option
    * Set to false to disable nested data parsing
    */
  var nestedFieldSeparator: js.UndefOr[String | Boolean] = js.native
  /**If you don't want to show a particular column in the print table you can set the print property in its column definition object to false */
  var print: js.UndefOr[Boolean] = js.native
  /** By default it is possible to manually resize columns by dragging the borders of the column in both the column headers and the cells of the column.
    If you want to alter this behaviour you can use the resizableColumns to choose where the resize handles are available.  */
  var resizableColumns: js.UndefOr[`true` | `false` | header | cell] = js.native
  /** Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
    There are two responsive layout modes available:
    hide - hide columns that no longer fit in the table
    collapse - collapse columns that no longer fit on the table into a list under the row
    Hide Extra Columns
    By default, columns will be hidden from right to left as the width of the table decreases. You can choose exactlyhow columns are hidden using the responsive property in the column definition object.
    When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets. */
  var responsiveLayout: js.UndefOr[Boolean | hide | collapse] = js.native
  /** If you set the responsiveLayout option to collapse the values from hidden columns will be displayed in a title/value list under the row.
    In this mode an object containing the title of each hidden column and its value is generated and then used to generate a list displayed in a div .tabulator-responsive-collapse under the row data.
    The inbuilt collapse formatter creates a table to neatly display the hidden columns. If you would like to format the data in your own way you can use the responsiveLayoutCollapseFormatter, it take an object of the column values as an argument and must return the HTML content of the div.
    This function should return an empty string if there is no data to display. */
  var responsiveLayoutCollapseFormatter: js.UndefOr[js.Function1[/* data */ js.Array[_], _]] = js.native
  /** Collapsed lists are displayed to the user by default, if you would prefer they start closed so the user can open them you can use the responsiveLayoutCollapseStartOpen option */
  var responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.native
  /** By default any formatter set on the column is applied to the value that will appear in the list. while this works for most formatters it can cause issues with the progress formatter which relies on being inside a cell.
    If you would like to disable column formatting in the collapsed list, you can use the responsiveLayoutCollapseUseFormatters option: */
  var responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.native
  /** The default option for triggering a ScrollTo on a visible element can be set using the scrollToColumnIfVisible option. It can take a boolean value:
    true - scroll to column, even if it is visible (default)
    false - scroll to column, unless it is currently visible, then don't move */
  var scrollToColumnIfVisible: js.UndefOr[Boolean] = js.native
  /** The default ScrollTo position can be set using the scrollToColumnPosition option. It can take one of three possible values:
    left - position column with its left edge at the left of the table (default)
    center - position column with its left edge in the center of the table
    right - position column with its right edge at the right of the table */
  var scrollToColumnPosition: js.UndefOr[ScrollToColumnPosition] = js.native
  /** Header tooltips can be set globally using the tooltipsHeader options parameter */
  var tooltipsHeader: js.UndefOr[Boolean] = js.native
}

object OptionsColumns {
  @scala.inline
  def apply(): OptionsColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsColumns]
  }
  @scala.inline
  implicit class OptionsColumnsOps[Self <: OptionsColumns] (val x: Self) extends AnyVal {
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
    def setAutoColumns(value: Boolean): Self = this.set("autoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoColumns: Self = this.set("autoColumns", js.undefined)
    @scala.inline
    def setColumnCalcs(value: Boolean | both | table | group): Self = this.set("columnCalcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnCalcs: Self = this.set("columnCalcs", js.undefined)
    @scala.inline
    def setColumnHeaderSortMulti(value: Boolean): Self = this.set("columnHeaderSortMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaderSortMulti: Self = this.set("columnHeaderSortMulti", js.undefined)
    @scala.inline
    def setColumnHeaderVertAlign(value: VerticalAlign): Self = this.set("columnHeaderVertAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaderVertAlign: Self = this.set("columnHeaderVertAlign", js.undefined)
    @scala.inline
    def setColumnMinWidth(value: Double): Self = this.set("columnMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnMinWidth: Self = this.set("columnMinWidth", js.undefined)
    @scala.inline
    def setColumnMoved(value: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => Unit): Self = this.set("columnMoved", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnMoved: Self = this.set("columnMoved", js.undefined)
    @scala.inline
    def setColumnResized(value: /* column */ ColumnComponent => Unit): Self = this.set("columnResized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnResized: Self = this.set("columnResized", js.undefined)
    @scala.inline
    def setColumnTitleChanged(value: /* column */ ColumnComponent => Unit): Self = this.set("columnTitleChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnTitleChanged: Self = this.set("columnTitleChanged", js.undefined)
    @scala.inline
    def setColumnVisibilityChanged(value: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit): Self = this.set("columnVisibilityChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnVisibilityChanged: Self = this.set("columnVisibilityChanged", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setHeaderFilterPlaceholder(value: String): Self = this.set("headerFilterPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFilterPlaceholder: Self = this.set("headerFilterPlaceholder", js.undefined)
    @scala.inline
    def setHeaderSort(value: Boolean): Self = this.set("headerSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderSort: Self = this.set("headerSort", js.undefined)
    @scala.inline
    def setHeaderSortTristate(value: Boolean): Self = this.set("headerSortTristate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderSortTristate: Self = this.set("headerSortTristate", js.undefined)
    @scala.inline
    def setHeaderVisible(value: Boolean): Self = this.set("headerVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderVisible: Self = this.set("headerVisible", js.undefined)
    @scala.inline
    def setLayout(value: fitData | fitColumns | fitDataFill | fitDataStretch | fitDataTable): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLayoutColumnsOnNewData(value: Boolean): Self = this.set("layoutColumnsOnNewData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutColumnsOnNewData: Self = this.set("layoutColumnsOnNewData", js.undefined)
    @scala.inline
    def setMovableColumns(value: Boolean): Self = this.set("movableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovableColumns: Self = this.set("movableColumns", js.undefined)
    @scala.inline
    def setNestedFieldSeparator(value: String | Boolean): Self = this.set("nestedFieldSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedFieldSeparator: Self = this.set("nestedFieldSeparator", js.undefined)
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setResizableColumns(value: `true` | `false` | header | cell): Self = this.set("resizableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizableColumns: Self = this.set("resizableColumns", js.undefined)
    @scala.inline
    def setResponsiveLayout(value: Boolean | hide | collapse): Self = this.set("responsiveLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveLayout: Self = this.set("responsiveLayout", js.undefined)
    @scala.inline
    def setResponsiveLayoutCollapseFormatter(value: /* data */ js.Array[_] => _): Self = this.set("responsiveLayoutCollapseFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResponsiveLayoutCollapseFormatter: Self = this.set("responsiveLayoutCollapseFormatter", js.undefined)
    @scala.inline
    def setResponsiveLayoutCollapseStartOpen(value: Boolean): Self = this.set("responsiveLayoutCollapseStartOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveLayoutCollapseStartOpen: Self = this.set("responsiveLayoutCollapseStartOpen", js.undefined)
    @scala.inline
    def setResponsiveLayoutCollapseUseFormatters(value: Boolean): Self = this.set("responsiveLayoutCollapseUseFormatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsiveLayoutCollapseUseFormatters: Self = this.set("responsiveLayoutCollapseUseFormatters", js.undefined)
    @scala.inline
    def setScrollToColumnIfVisible(value: Boolean): Self = this.set("scrollToColumnIfVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToColumnIfVisible: Self = this.set("scrollToColumnIfVisible", js.undefined)
    @scala.inline
    def setScrollToColumnPosition(value: ScrollToColumnPosition): Self = this.set("scrollToColumnPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToColumnPosition: Self = this.set("scrollToColumnPosition", js.undefined)
    @scala.inline
    def setTooltipsHeader(value: Boolean): Self = this.set("tooltipsHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipsHeader: Self = this.set("tooltipsHeader", js.undefined)
  }
  
}

