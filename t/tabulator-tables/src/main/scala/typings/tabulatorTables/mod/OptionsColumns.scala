package typings.tabulatorTables.mod

import typings.std.Record
import typings.tabulatorTables.anon.PartialColumnDefinition
import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.both
import typings.tabulatorTables.tabulatorTablesStrings.collapse
import typings.tabulatorTables.tabulatorTablesStrings.desc
import typings.tabulatorTables.tabulatorTablesStrings.fitColumns
import typings.tabulatorTables.tabulatorTablesStrings.fitData
import typings.tabulatorTables.tabulatorTablesStrings.fitDataFill
import typings.tabulatorTables.tabulatorTablesStrings.fitDataStretch
import typings.tabulatorTables.tabulatorTablesStrings.fitDataTable
import typings.tabulatorTables.tabulatorTablesStrings.group
import typings.tabulatorTables.tabulatorTablesStrings.hide
import typings.tabulatorTables.tabulatorTablesStrings.none
import typings.tabulatorTables.tabulatorTablesStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsColumns extends StObject {
  
  /** If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data. */
  var autoColumns: js.UndefOr[Boolean] = js.undefined
  
  var autoColumnsDefinitions: js.UndefOr[
    (js.Function1[
      /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]], 
      js.Array[ColumnDefinition]
    ]) | js.Array[ColumnDefinition] | (Record[String, PartialColumnDefinition])
  ] = js.undefined
  
  /**
    * By default column calculations are shown at the top and bottom of the table, unless row grouping is enabled, in which case they are shown at the top and bottom of each group.
    *
    * The columnCalcs option lets you decided where the calculations should be displayed, it can take one of four values:
    *
    * true - show calcs at top and bottom of the table, unless grouped, then show in groups (boolean, default)
    * both - show calcs at top and bottom of the table and show in groups
    * table - show calcs at top and bottom of the table only
    * group - show calcs in groups only
    */
  var columnCalcs: js.UndefOr[Boolean | both | table | group] = js.undefined
  
  var columnDefaults: js.UndefOr[ColumnDefinition] = js.undefined
  
  /** multiple or single column sorting */
  var columnHeaderSortMulti: js.UndefOr[Boolean] = js.undefined
  
  /** You can use the columnHeaderVertAlign option to set how the text in your column headers should be vertically. */
  var columnHeaderVertAlign: js.UndefOr[VerticalAlign] = js.undefined
  
  /** The columnMoved callback will be triggered when a column has been successfully moved. */
  var columnMoved: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* columns */ js.Array[Any], Unit]] = js.undefined
  
  var columnResized: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.undefined
  
  /** The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array. */
  var columnTitleChanged: js.UndefOr[js.Function1[/* column */ ColumnComponent, Unit]] = js.undefined
  
  /** The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states. */
  var columnVisibilityChanged: js.UndefOr[js.Function2[/* column */ ColumnComponent, /* visible */ Boolean, Unit]] = js.undefined
  
  /** The column definitions are provided to Tabulator in the columns property of the table constructor object and should take the format of an array of objects, with each object representing the configuration of one column. */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  
  /** The headerSort option can now be set in the table options to affect all columns as well as in column definitions. */
  var headerSort: js.UndefOr[Boolean] = js.undefined
  
  var headerSortElement: js.UndefOr[
    String | (js.Function2[/* column */ ColumnComponent, /* dir */ asc | desc | none, Any])
  ] = js.undefined
  
  /** By setting the headerVisible option to false you can hide the column headers and present the table as a simple list if needed. */
  var headerVisible: js.UndefOr[Boolean] = js.undefined
  
  /** By default Tabulator will use the fitData layout mode, which will resize the tables columns to fit the data held in each column, unless you specify a width or minWidth in the column constructor. If the width of all columns exceeds the width of the containing element, a scroll bar will appear. */
  var layout: js.UndefOr[fitData | fitColumns | fitDataFill | fitDataStretch | fitDataTable] = js.undefined
  
  /**
    * To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
    *
    * If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true.
    */
  var layoutColumnsOnNewData: js.UndefOr[Boolean] = js.undefined
  
  /** To allow the user to move columns along the table, set the movableColumns parameter in the options: */
  var movableColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you need to use the . character as part of your field name, you can change the separator to any other character using the nestedFieldSeparator option
    * Set to false to disable nested data parsing
    */
  var nestedFieldSeparator: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
    *
    * There are two responsive layout modes available:
    *
    * hide - hide columns that no longer fit in the table
    * collapse - collapse columns that no longer fit on the table into a list under the row
    *
    * Hide Extra Columns
    * By default, columns will be hidden from right to left as the width of the table decreases. You can choose exactly how columns are hidden using the responsive property in the column definition object.
    *
    * When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets.
    */
  var responsiveLayout: js.UndefOr[Boolean | hide | collapse] = js.undefined
  
  /**
    * If you set the responsiveLayout option to collapse the values from hidden columns will be displayed in a title/value list under the row.
    *
    * In this mode an object containing the title of each hidden column and its value is generated and then used to generate a list displayed in a div .tabulator-responsive-collapse under the row data.
    *
    * The inbuilt collapse formatter creates a table to neatly display the hidden columns. If you would like to format the data in your own way you can use the responsiveLayoutCollapseFormatter, it take an object of the column values as an argument and must return the HTML content of the div.
    *
    * This function should return an empty string if there is no data to display.
    */
  var responsiveLayoutCollapseFormatter: js.UndefOr[js.Function1[/* data */ js.Array[Any], Any]] = js.undefined
  
  /** Collapsed lists are displayed to the user by default, if you would prefer they start closed so the user can open them you can use the responsiveLayoutCollapseStartOpen option. */
  var responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default any formatter set on the column is applied to the value that will appear in the list. while this works for most formatters it can cause issues with the progress formatter which relies on being inside a cell.
    *
    * If you would like to disable column formatting in the collapsed list, you can use the responsiveLayoutCollapseUseFormatters option:
    */
  var responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default option for triggering a ScrollTo on a visible element can be set using the scrollToColumnIfVisible option. It can take a boolean value:
    *
    * true - scroll to column, even if it is visible (default)
    * false - scroll to column, unless it is currently visible, then don't move
    */
  var scrollToColumnIfVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default ScrollTo position can be set using the scrollToColumnPosition option. It can take one of three possible values:
    *
    * left - position column with its left edge at the left of the table (default)
    * center - position column with its left edge in the center of the table
    * right - position column with its right edge at the right of the table
    */
  var scrollToColumnPosition: js.UndefOr[ScrollToColumnPosition] = js.undefined
}
object OptionsColumns {
  
  inline def apply(): OptionsColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsColumns]
  }
  
  extension [Self <: OptionsColumns](x: Self) {
    
    inline def setAutoColumns(value: Boolean): Self = StObject.set(x, "autoColumns", value.asInstanceOf[js.Any])
    
    inline def setAutoColumnsDefinitions(
      value: (js.Function1[
          /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]], 
          js.Array[ColumnDefinition]
        ]) | js.Array[ColumnDefinition] | (Record[String, PartialColumnDefinition])
    ): Self = StObject.set(x, "autoColumnsDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAutoColumnsDefinitionsFunction1(
      value: /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]] => js.Array[ColumnDefinition]
    ): Self = StObject.set(x, "autoColumnsDefinitions", js.Any.fromFunction1(value))
    
    inline def setAutoColumnsDefinitionsUndefined: Self = StObject.set(x, "autoColumnsDefinitions", js.undefined)
    
    inline def setAutoColumnsDefinitionsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "autoColumnsDefinitions", js.Array(value*))
    
    inline def setAutoColumnsUndefined: Self = StObject.set(x, "autoColumns", js.undefined)
    
    inline def setColumnCalcs(value: Boolean | both | table | group): Self = StObject.set(x, "columnCalcs", value.asInstanceOf[js.Any])
    
    inline def setColumnCalcsUndefined: Self = StObject.set(x, "columnCalcs", js.undefined)
    
    inline def setColumnDefaults(value: ColumnDefinition): Self = StObject.set(x, "columnDefaults", value.asInstanceOf[js.Any])
    
    inline def setColumnDefaultsUndefined: Self = StObject.set(x, "columnDefaults", js.undefined)
    
    inline def setColumnHeaderSortMulti(value: Boolean): Self = StObject.set(x, "columnHeaderSortMulti", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderSortMultiUndefined: Self = StObject.set(x, "columnHeaderSortMulti", js.undefined)
    
    inline def setColumnHeaderVertAlign(value: VerticalAlign): Self = StObject.set(x, "columnHeaderVertAlign", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderVertAlignUndefined: Self = StObject.set(x, "columnHeaderVertAlign", js.undefined)
    
    inline def setColumnMoved(value: (/* column */ ColumnComponent, /* columns */ js.Array[Any]) => Unit): Self = StObject.set(x, "columnMoved", js.Any.fromFunction2(value))
    
    inline def setColumnMovedUndefined: Self = StObject.set(x, "columnMoved", js.undefined)
    
    inline def setColumnResized(value: /* column */ ColumnComponent => Unit): Self = StObject.set(x, "columnResized", js.Any.fromFunction1(value))
    
    inline def setColumnResizedUndefined: Self = StObject.set(x, "columnResized", js.undefined)
    
    inline def setColumnTitleChanged(value: /* column */ ColumnComponent => Unit): Self = StObject.set(x, "columnTitleChanged", js.Any.fromFunction1(value))
    
    inline def setColumnTitleChangedUndefined: Self = StObject.set(x, "columnTitleChanged", js.undefined)
    
    inline def setColumnVisibilityChanged(value: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2(value))
    
    inline def setColumnVisibilityChangedUndefined: Self = StObject.set(x, "columnVisibilityChanged", js.undefined)
    
    inline def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortElement(value: String | (js.Function2[/* column */ ColumnComponent, /* dir */ asc | desc | none, Any])): Self = StObject.set(x, "headerSortElement", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortElementFunction2(value: (/* column */ ColumnComponent, /* dir */ asc | desc | none) => Any): Self = StObject.set(x, "headerSortElement", js.Any.fromFunction2(value))
    
    inline def setHeaderSortElementUndefined: Self = StObject.set(x, "headerSortElement", js.undefined)
    
    inline def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
    
    inline def setHeaderVisible(value: Boolean): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
    
    inline def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
    
    inline def setLayout(value: fitData | fitColumns | fitDataFill | fitDataStretch | fitDataTable): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutColumnsOnNewData(value: Boolean): Self = StObject.set(x, "layoutColumnsOnNewData", value.asInstanceOf[js.Any])
    
    inline def setLayoutColumnsOnNewDataUndefined: Self = StObject.set(x, "layoutColumnsOnNewData", js.undefined)
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMovableColumns(value: Boolean): Self = StObject.set(x, "movableColumns", value.asInstanceOf[js.Any])
    
    inline def setMovableColumnsUndefined: Self = StObject.set(x, "movableColumns", js.undefined)
    
    inline def setNestedFieldSeparator(value: String | Boolean): Self = StObject.set(x, "nestedFieldSeparator", value.asInstanceOf[js.Any])
    
    inline def setNestedFieldSeparatorUndefined: Self = StObject.set(x, "nestedFieldSeparator", js.undefined)
    
    inline def setResponsiveLayout(value: Boolean | hide | collapse): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
    
    inline def setResponsiveLayoutCollapseFormatter(value: /* data */ js.Array[Any] => Any): Self = StObject.set(x, "responsiveLayoutCollapseFormatter", js.Any.fromFunction1(value))
    
    inline def setResponsiveLayoutCollapseFormatterUndefined: Self = StObject.set(x, "responsiveLayoutCollapseFormatter", js.undefined)
    
    inline def setResponsiveLayoutCollapseStartOpen(value: Boolean): Self = StObject.set(x, "responsiveLayoutCollapseStartOpen", value.asInstanceOf[js.Any])
    
    inline def setResponsiveLayoutCollapseStartOpenUndefined: Self = StObject.set(x, "responsiveLayoutCollapseStartOpen", js.undefined)
    
    inline def setResponsiveLayoutCollapseUseFormatters(value: Boolean): Self = StObject.set(x, "responsiveLayoutCollapseUseFormatters", value.asInstanceOf[js.Any])
    
    inline def setResponsiveLayoutCollapseUseFormattersUndefined: Self = StObject.set(x, "responsiveLayoutCollapseUseFormatters", js.undefined)
    
    inline def setResponsiveLayoutUndefined: Self = StObject.set(x, "responsiveLayout", js.undefined)
    
    inline def setScrollToColumnIfVisible(value: Boolean): Self = StObject.set(x, "scrollToColumnIfVisible", value.asInstanceOf[js.Any])
    
    inline def setScrollToColumnIfVisibleUndefined: Self = StObject.set(x, "scrollToColumnIfVisible", js.undefined)
    
    inline def setScrollToColumnPosition(value: ScrollToColumnPosition): Self = StObject.set(x, "scrollToColumnPosition", value.asInstanceOf[js.Any])
    
    inline def setScrollToColumnPositionUndefined: Self = StObject.set(x, "scrollToColumnPosition", js.undefined)
  }
}
