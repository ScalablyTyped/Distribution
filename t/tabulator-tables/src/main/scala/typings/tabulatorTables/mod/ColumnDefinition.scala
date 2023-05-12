package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.cell
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.header
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition
  extends StObject
     with ColumnLayout
     with CellCallbacks
     with _ColumnLookup {
  
  /**
    * Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    *
    * You can set accessors on a per column basis using the accessor option in the column definition object.
    */
  var accessor: js.UndefOr[CustomAccessor] = js.undefined
  
  /** only called when data is being copied into the clipboard. */
  var accessorClipboard: js.UndefOr[CustomAccessor] = js.undefined
  
  /** Additional parameters you can pass to the accessorClipboard. */
  var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.undefined
  
  /** only called when data is being converted into a downloadable file. */
  var accessorDownload: js.UndefOr[CustomAccessor] = js.undefined
  
  /** additional parameters you can pass to the accessorDownload. */
  var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.undefined
  
  /** You can use the accessorHtmlOutput and accessorHtmlOutputParams options on a column definition to alter the value of data in a column before the html is generated. */
  var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.undefined
  
  var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.undefined
  
  /** Each accessor function has its own matching params option, for example accessorDownload has accessorDownloadParams. */
  var accessorParams: js.UndefOr[CustomAccessorParams] = js.undefined
  
  /** You can use the accessorPrint and accessorPrintParams options on a column definition to alter the value of data in a column before it is printed. */
  var accessorPrint: js.UndefOr[CustomAccessor] = js.undefined
  
  var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.undefined
  
  var bottomCalc: js.UndefOr[ColumnCalc] = js.undefined
  
  var bottomCalcFormatter: js.UndefOr[Formatter] = js.undefined
  
  /** additional parameters you can pass to the bottomCalcFormatter function. */
  var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  
  var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
  
  /** Popups work in a similar way to menus, but instead of only displaying lists of menu items they allow you to fill them with any custom content you like, text, input elements, forms, anything you fancy. */
  var cellPopup: js.UndefOr[
    String | (js.Function3[
      /* e */ MouseEvent, 
      /* component */ RowComponent | CellComponent | ColumnComponent, 
      /* onRendered */ js.Function0[Any], 
      Any
    ])
  ] = js.undefined
  
  var clickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
  
  /** If you don't want to show a particular column in the clipboard output you can set the clipboard property in its column definition object to false. */
  var clipboard: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
  
  /** A column can be a "group" of columns (Example: group header column -> Measurements, grouped column -> Length, Width, Height) */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  
  /** You can add a right click context menu to any columns cells by passing an array of menu items to the contextMenu option in that columns definition. */
  var contextMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
  
  /** sets css classes on header and cells in this column. (value should be a string containing space separated class names) */
  var cssClass: js.UndefOr[String] = js.undefined
  
  var dblClickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
  
  var dblClickPopup: js.UndefOr[String] = js.undefined
  
  /** show or hide column in downloaded data */
  var download: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
  
  /** There are some circumstances where you may want to block edit-ability of a cell for one reason or another. To meet this need you can use the editable option. This lets you set a callback that is executed before the editor is built, if this callback returns true the editor is added, if it returns false the edit is aborted and the cell remains a non editable cell. The function is passed one parameter, the CellComponent of the cell about to be edited. You can also pass a boolean value instead of a function to this property. */
  var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.undefined
  
  /** allows the user to edit the header titles */
  var editableTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a user clicks on an editable column the will be able to edit the value for that cell.
    *
    * By default Tabulator will use an editor that matches the current formatter for that cell. if you wish to specify a specific editor, you can set them per column using the editor option in the column definition. Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
    *
    * You can pass an optional additional parameter with the editor, editorParams that should contain an object with additional information for configuring the editor.
    */
  var editor: js.UndefOr[Editor] = js.undefined
  
  /** additional parameters you can pass to the editor. */
  var editorParams: js.UndefOr[EditorParams] = js.undefined
  
  /** Set how you would like the data to be formatted. */
  var formatter: js.UndefOr[Formatter] = js.undefined
  
  /** When copying to the clipboard you may want to apply a different formatter from the one usually used to format the cell, you can do this using the formatterClipboard column definition option. You can use the formatterClipboardParams to pass in any additional params to the formatter. */
  var formatterClipboard: js.UndefOr[Formatter | `false`] = js.undefined
  
  var formatterClipboardParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** When the getHtml function is called you may want to apply a different formatter from the one usually used to format the cell, you can do this using the formatterHtmlOutput column definition option. */
  var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.undefined
  
  var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** You can pass an optional additional parameter with the formatter, formatterParams that should contain an object with additional information for configuring the formatter. */
  var formatterParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** When printing you may want to apply a different formatter from the one usually used to format the cell, you can do this using the formatterPrint column definition option. You can use the formatterPrintParams to pass in any additional params to the formatter. */
  var formatterPrint: js.UndefOr[Formatter | `false`] = js.undefined
  
  var formatterPrintParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** You can freeze the position of columns on the left and right of the table using the frozen property in the column definition array. This will keep the column still when the table is scrolled horizontally. */
  var frozen: js.UndefOr[Boolean] = js.undefined
  
  /** Callback for when user clicks on the header for this column. */
  var headerClick: js.UndefOr[ColumnEventCallback] = js.undefined
  
  /** Callback for when user right clicks on the header for this column. */
  var headerContext: js.UndefOr[ColumnEventCallback] = js.undefined
  
  /** You can add a right click context menu to any column by passing an array of menu items to the headerContextMenu option in that columns definition. */
  var headerContextMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
  
  /** Callback for when user double clicks on the header for this column. */
  var headerDblClick: js.UndefOr[ColumnEventCallback] = js.undefined
  
  var headerDblClickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.undefined
  
  var headerDblClickPopup: js.UndefOr[String] = js.undefined
  
  /** callback for when user double taps on a header for this column, triggered in touch displays when a user taps the same header twice in under 300ms */
  var headerDblTap: js.UndefOr[ColumnEventCallback] = js.undefined
  
  /** filtering of columns from elements in the header. */
  var headerFilter: js.UndefOr[Editor] = js.undefined
  
  /** function to check when the header filter is empty */
  var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.undefined
  
  /**
    * By default Tabulator will try and match the comparison type to the type of element used for the header filter.
    *
    * Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
    *
    * For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
    *
    * If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function
    */
  var headerFilterFunc: js.UndefOr[
    FilterType | (js.Function4[
      /* headerValue */ Any, 
      /* rowValue */ Any, 
      /* rowdata */ Any, 
      /* filterparams */ Any, 
      Boolean
    ])
  ] = js.undefined
  
  /** additional parameters object passed to the headerFilterFunc function. */
  var headerFilterFuncParams: js.UndefOr[Any] = js.undefined
  
  /** disable live filtering of the table. */
  var headerFilterLiveFilter: js.UndefOr[Boolean] = js.undefined
  
  /** additional parameters you can pass to the header filter. */
  var headerFilterParams: js.UndefOr[EditorParams] = js.undefined
  
  /** placeholder text for the header filter. */
  var headerFilterPlaceholder: js.UndefOr[String] = js.undefined
  
  var headerHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
  
  /** You can add a menu to any column by passing an array of menu items to the headerMenu option in that columns definition. */
  var headerMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.undefined
  
  /** The headerMenuIcon option will accept one of three types of value. You can pass in a string for the HTML contents of the button. Or you can pass the DOM node for the button. Though be careful not to pass the same node to multple columns or you may run into issues. Or you can define a function that is called when the column header is rendered that should return either an HTML string or the contents of the element. This funtion is passed the column component as its first argument. */
  var headerMenuIcon: js.UndefOr[
    String | HTMLElement | (js.Function1[/* component */ ColumnComponent, HTMLElement | String])
  ] = js.undefined
  
  var headerMouseDown: js.UndefOr[ColumnEventCallback] = js.undefined
  
  var headerMouseUp: js.UndefOr[ColumnEventCallback] = js.undefined
  
  // Column Header
  /** By default all columns in a table are sortable by clicking on the column header, if you want to disable this behavior, set the headerSort property to false in the column definition array: */
  var headerSort: js.UndefOr[Boolean] = js.undefined
  
  /** set the starting sort direction when a user first clicks on a header. */
  var headerSortStartingDir: js.UndefOr[SortDirection] = js.undefined
  
  /** allow tristate toggling of column header sort direction. */
  var headerSortTristate: js.UndefOr[Boolean] = js.undefined
  
  /** callback for when user taps on a header for this column, triggered in touch displays. */
  var headerTap: js.UndefOr[ColumnEventCallback] = js.undefined
  
  /** callback for when user taps and holds on a header for this column, triggered in touch displays when a user taps and holds the same header for 1 second. */
  var headerTapHold: js.UndefOr[ColumnEventCallback] = js.undefined
  
  /**
    * sets the on hover tooltip for the column header* * The tooltip headerTooltip can take three different types of value
    *
    * - boolean - a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value.
    * - string - a string that will be displayed for the tooltip.
    * - function - a callback function that returns the string for the column header*
    */
  var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.undefined
  
  /**
    * Change the orientation of the column header to vertical* * The headerVertical property can take one of three values:
    *
    * - false - vertical columns disabled (default value)
    * - true - vertical columns enabled
    * - "flip" - vertical columns enabled, with text direction flipped by 180 degrees*
    */
  var headerVertical: js.UndefOr[Boolean | flip] = js.undefined
  
  var headerWordWrap: js.UndefOr[Boolean] = js.undefined
  
  /** When the getHtml function is called, hide the column from the output. */
  var hideInHtml: js.UndefOr[Boolean] = js.undefined
  
  /** If you want to set the horizontal alignment on a column by column basis, */
  var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
  
  /** Show/Hide a particular column in the HTML output. */
  var htmlOutput: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
  
  var maxWidth: js.UndefOr[Double | `false`] = js.undefined
  
  /** sets the minimum width of this column, this should be set in pixels */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Mutators are used to alter data as it is parsed into  For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    *
    * You can set mutators on a per column basis using the mutator option in the column definition object.
    *
    * You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator.
    */
  var mutator: js.UndefOr[CustomMutator] = js.undefined
  
  /** only called when data is changed via a user editing a cell. */
  var mutatorClipboard: js.UndefOr[CustomMutator] = js.undefined
  
  var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.undefined
  
  /** only called when data is loaded via a command {eg. setData). */
  var mutatorData: js.UndefOr[CustomMutator] = js.undefined
  
  var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.undefined
  
  /** only called when data is changed via a user editing a cell. */
  var mutatorEdit: js.UndefOr[CustomMutator] = js.undefined
  
  var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.undefined
  
  /** You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutatorParams: js.UndefOr[CustomMutatorParams] = js.undefined
  
  /** If you don't want to show a particular column in the print table you can set the print property in its column definition object to false. */
  var print: js.UndefOr[Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])] = js.undefined
  
  /** set whether column can be resized by user dragging its edges */
  var resizable: js.UndefOr[`true` | `false` | header | cell] = js.undefined
  
  /** an integer to determine when the column should be hidden in responsive mode. */
  var responsive: js.UndefOr[Double] = js.undefined
  
  /** sets the column as a row handle, allowing it to be used to drag movable rows. */
  var rowHandle: js.UndefOr[Boolean] = js.undefined
  
  // Data Manipulation
  /**
    * By default Tabulator will attempt to guess which sorter should be applied to a column based on the data contained in the first row. It can determine sorters for strings, numbers, alphanumeric sequences and booleans, anything else will be treated as a string.
    * To specify a sorter to be used on a column use the sorter property in the columns definition object
    *
    * You can pass an optional additional property with sorter, sorterParams that should contain an object with additional information for configuring the sorter
    */
  var sorter: js.UndefOr[
    string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ Any, 
      /* b */ Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ])
  ] = js.undefined
  
  /** If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object. */
  var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.undefined
  
  /** When copying to clipboard you may want to apply a different column header title from the one usually used in the table. You can now do this using the titleClipboard column definition option, which takes the same inputs as the standard title property. */
  var titleClipboard: js.UndefOr[String] = js.undefined
  
  /** set custom title for column in download. */
  var titleDownload: js.UndefOr[String] = js.undefined
  
  /** formatter function for header title. */
  var titleFormatter: js.UndefOr[Formatter] = js.undefined
  
  /** additional parameters you can pass to the header title formatter. */
  var titleFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** When the getHtml function is called you may want to apply a different column header title from the one usually used in the table. You can now do this using the titleHtmlOutput column definition option, which takes the same inputs as the standard title property. */
  var titleHtmlOutput: js.UndefOr[String] = js.undefined
  
  /** When printing you may want to apply a different column header title from the one usually used in the table. You can now do this using the titlePrint column definition option, which takes the same inputs as the standard title property. */
  var titlePrint: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the on hover tooltip for each cell in this column * * The tooltip parameter can take three different types of value:
    * - boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
    * - string - a string that will be displayed for all cells in the matching column/table.
    * - function - a callback function that returns the string for the cell
    * Note: setting a tooltip value on a column will override the global setting.
    */
  var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.undefined
  
  /** the column calculation to be displayed at the top of this column(see Column Calculations for more details) */
  var topCalc: js.UndefOr[ColumnCalc] = js.undefined
  
  /** Formatter for the topCalc calculation cell. */
  var topCalcFormatter: js.UndefOr[Formatter] = js.undefined
  
  /** additional parameters you can pass to the topCalcFormatter function. */
  var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.undefined
  
  /** additional parameters you can pass to the topCalc calculation function (see Column Calculations for more details) */
  var topCalcParams: js.UndefOr[ColumnCalcParams] = js.undefined
  
  /**
    * Validators are used to ensure that any user input into your editable cells matches your requirements.
    *
    * Validators can be applied by using the validator property in a columns definition object (see Define Columns for more details).
    */
  var validator: js.UndefOr[
    StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String
  ] = js.undefined
  
  /** alter the row height to fit the contents of the cell instead of hiding overflow */
  var variableHeight: js.UndefOr[Boolean] = js.undefined
  
  /** If you want to set the vertical alignment on a column by column basis */
  var vertAlign: js.UndefOr[VerticalAlign] = js.undefined
  
  /** The widthGrow property should be used on columns without a width property set. The value is used to work out what fraction of the available will be allocated to the column. The value should be set to a number greater than 0, by default any columns with no width set have a widthGrow value of 1 */
  var widthGrow: js.UndefOr[Double] = js.undefined
  
  /** The widthShrink property should be used on columns with a width property set. The value is used to work out how to shrink columns with a fixed width when the table is too narrow to fit in all the columns. The value should be set to a number greater than 0, by default columns with a width set have a widthShrink value of 0, meaning they will not be shrunk if the table gets too narrow, and may cause the horizontal scrollbar to appear. */
  var widthShrink: js.UndefOr[Double] = js.undefined
}
object ColumnDefinition {
  
  inline def apply(title: String): ColumnDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
    inline def setAccessor(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessor", js.Any.fromFunction6(value))
    
    inline def setAccessorClipboard(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorClipboard", js.Any.fromFunction6(value))
    
    inline def setAccessorClipboardParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorClipboardParams", value.asInstanceOf[js.Any])
    
    inline def setAccessorClipboardParamsFunction5(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorClipboardParams", js.Any.fromFunction5(value))
    
    inline def setAccessorClipboardParamsUndefined: Self = StObject.set(x, "accessorClipboardParams", js.undefined)
    
    inline def setAccessorClipboardUndefined: Self = StObject.set(x, "accessorClipboard", js.undefined)
    
    inline def setAccessorDownload(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorDownload", js.Any.fromFunction6(value))
    
    inline def setAccessorDownloadParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorDownloadParams", value.asInstanceOf[js.Any])
    
    inline def setAccessorDownloadParamsFunction5(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorDownloadParams", js.Any.fromFunction5(value))
    
    inline def setAccessorDownloadParamsUndefined: Self = StObject.set(x, "accessorDownloadParams", js.undefined)
    
    inline def setAccessorDownloadUndefined: Self = StObject.set(x, "accessorDownload", js.undefined)
    
    inline def setAccessorHtmlOutput(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorHtmlOutput", js.Any.fromFunction6(value))
    
    inline def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorHtmlOutputParams", value.asInstanceOf[js.Any])
    
    inline def setAccessorHtmlOutputParamsFunction5(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorHtmlOutputParams", js.Any.fromFunction5(value))
    
    inline def setAccessorHtmlOutputParamsUndefined: Self = StObject.set(x, "accessorHtmlOutputParams", js.undefined)
    
    inline def setAccessorHtmlOutputUndefined: Self = StObject.set(x, "accessorHtmlOutput", js.undefined)
    
    inline def setAccessorParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorParams", value.asInstanceOf[js.Any])
    
    inline def setAccessorParamsFunction5(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorParams", js.Any.fromFunction5(value))
    
    inline def setAccessorParamsUndefined: Self = StObject.set(x, "accessorParams", js.undefined)
    
    inline def setAccessorPrint(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* AccessorParams */ Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorPrint", js.Any.fromFunction6(value))
    
    inline def setAccessorPrintParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorPrintParams", value.asInstanceOf[js.Any])
    
    inline def setAccessorPrintParamsFunction5(
      value: (/* value */ Any, /* data */ Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => Any
    ): Self = StObject.set(x, "accessorPrintParams", js.Any.fromFunction5(value))
    
    inline def setAccessorPrintParamsUndefined: Self = StObject.set(x, "accessorPrintParams", js.undefined)
    
    inline def setAccessorPrintUndefined: Self = StObject.set(x, "accessorPrint", js.undefined)
    
    inline def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
    
    inline def setBottomCalc(value: ColumnCalc): Self = StObject.set(x, "bottomCalc", value.asInstanceOf[js.Any])
    
    inline def setBottomCalcFormatter(value: Formatter): Self = StObject.set(x, "bottomCalcFormatter", value.asInstanceOf[js.Any])
    
    inline def setBottomCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "bottomCalcFormatter", js.Any.fromFunction3(value))
    
    inline def setBottomCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "bottomCalcFormatterParams", value.asInstanceOf[js.Any])
    
    inline def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "bottomCalcFormatterParams", js.Any.fromFunction1(value))
    
    inline def setBottomCalcFormatterParamsUndefined: Self = StObject.set(x, "bottomCalcFormatterParams", js.undefined)
    
    inline def setBottomCalcFormatterUndefined: Self = StObject.set(x, "bottomCalcFormatter", js.undefined)
    
    inline def setBottomCalcFunction3(value: (/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object) => Any): Self = StObject.set(x, "bottomCalc", js.Any.fromFunction3(value))
    
    inline def setBottomCalcParams(value: ColumnCalcParams): Self = StObject.set(x, "bottomCalcParams", value.asInstanceOf[js.Any])
    
    inline def setBottomCalcParamsFunction2(value: (/* values */ Any, /* data */ Any) => Any): Self = StObject.set(x, "bottomCalcParams", js.Any.fromFunction2(value))
    
    inline def setBottomCalcParamsUndefined: Self = StObject.set(x, "bottomCalcParams", js.undefined)
    
    inline def setBottomCalcUndefined: Self = StObject.set(x, "bottomCalc", js.undefined)
    
    inline def setCellPopup(
      value: String | (js.Function3[
          /* e */ MouseEvent, 
          /* component */ RowComponent | CellComponent | ColumnComponent, 
          /* onRendered */ js.Function0[Any], 
          Any
        ])
    ): Self = StObject.set(x, "cellPopup", value.asInstanceOf[js.Any])
    
    inline def setCellPopupFunction3(
      value: (/* e */ MouseEvent, /* component */ RowComponent | CellComponent | ColumnComponent, /* onRendered */ js.Function0[Any]) => Any
    ): Self = StObject.set(x, "cellPopup", js.Any.fromFunction3(value))
    
    inline def setCellPopupUndefined: Self = StObject.set(x, "cellPopup", js.undefined)
    
    inline def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "clickMenu", value.asInstanceOf[js.Any])
    
    inline def setClickMenuUndefined: Self = StObject.set(x, "clickMenu", js.undefined)
    
    inline def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "clickMenu", js.Array(value*))
    
    inline def setClipboard(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setClipboardFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "clipboard", js.Any.fromFunction1(value))
    
    inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
    
    inline def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "contextMenu", js.Array(value*))
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDblClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "dblClickMenu", value.asInstanceOf[js.Any])
    
    inline def setDblClickMenuUndefined: Self = StObject.set(x, "dblClickMenu", js.undefined)
    
    inline def setDblClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "dblClickMenu", js.Array(value*))
    
    inline def setDblClickPopup(value: String): Self = StObject.set(x, "dblClickPopup", value.asInstanceOf[js.Any])
    
    inline def setDblClickPopupUndefined: Self = StObject.set(x, "dblClickPopup", js.undefined)
    
    inline def setDownload(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
    
    inline def setEditableTitle(value: Boolean): Self = StObject.set(x, "editableTitle", value.asInstanceOf[js.Any])
    
    inline def setEditableTitleUndefined: Self = StObject.set(x, "editableTitle", js.undefined)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = StObject.set(x, "editor", js.Any.fromFunction5(value))
    
    inline def setEditorParams(value: EditorParams): Self = StObject.set(x, "editorParams", value.asInstanceOf[js.Any])
    
    inline def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "editorParams", js.Any.fromFunction1(value))
    
    inline def setEditorParamsUndefined: Self = StObject.set(x, "editorParams", js.undefined)
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterClipboard(value: Formatter | `false`): Self = StObject.set(x, "formatterClipboard", value.asInstanceOf[js.Any])
    
    inline def setFormatterClipboardFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "formatterClipboard", js.Any.fromFunction3(value))
    
    inline def setFormatterClipboardParams(value: FormatterParams): Self = StObject.set(x, "formatterClipboardParams", value.asInstanceOf[js.Any])
    
    inline def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterClipboardParams", js.Any.fromFunction1(value))
    
    inline def setFormatterClipboardParamsUndefined: Self = StObject.set(x, "formatterClipboardParams", js.undefined)
    
    inline def setFormatterClipboardUndefined: Self = StObject.set(x, "formatterClipboard", js.undefined)
    
    inline def setFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterHtmlOutput(value: Formatter | `false`): Self = StObject.set(x, "formatterHtmlOutput", value.asInstanceOf[js.Any])
    
    inline def setFormatterHtmlOutputFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "formatterHtmlOutput", js.Any.fromFunction3(value))
    
    inline def setFormatterHtmlOutputParams(value: FormatterParams): Self = StObject.set(x, "formatterHtmlOutputParams", value.asInstanceOf[js.Any])
    
    inline def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterHtmlOutputParams", js.Any.fromFunction1(value))
    
    inline def setFormatterHtmlOutputParamsUndefined: Self = StObject.set(x, "formatterHtmlOutputParams", js.undefined)
    
    inline def setFormatterHtmlOutputUndefined: Self = StObject.set(x, "formatterHtmlOutput", js.undefined)
    
    inline def setFormatterParams(value: FormatterParams): Self = StObject.set(x, "formatterParams", value.asInstanceOf[js.Any])
    
    inline def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterParams", js.Any.fromFunction1(value))
    
    inline def setFormatterParamsUndefined: Self = StObject.set(x, "formatterParams", js.undefined)
    
    inline def setFormatterPrint(value: Formatter | `false`): Self = StObject.set(x, "formatterPrint", value.asInstanceOf[js.Any])
    
    inline def setFormatterPrintFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "formatterPrint", js.Any.fromFunction3(value))
    
    inline def setFormatterPrintParams(value: FormatterParams): Self = StObject.set(x, "formatterPrintParams", value.asInstanceOf[js.Any])
    
    inline def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterPrintParams", js.Any.fromFunction1(value))
    
    inline def setFormatterPrintParamsUndefined: Self = StObject.set(x, "formatterPrintParams", js.undefined)
    
    inline def setFormatterPrintUndefined: Self = StObject.set(x, "formatterPrint", js.undefined)
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
    
    inline def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction2(value))
    
    inline def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
    
    inline def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerContext", js.Any.fromFunction2(value))
    
    inline def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerContextMenu", value.asInstanceOf[js.Any])
    
    inline def setHeaderContextMenuUndefined: Self = StObject.set(x, "headerContextMenu", js.undefined)
    
    inline def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerContextMenu", js.Array(value*))
    
    inline def setHeaderContextUndefined: Self = StObject.set(x, "headerContext", js.undefined)
    
    inline def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2(value))
    
    inline def setHeaderDblClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "headerDblClickMenu", value.asInstanceOf[js.Any])
    
    inline def setHeaderDblClickMenuUndefined: Self = StObject.set(x, "headerDblClickMenu", js.undefined)
    
    inline def setHeaderDblClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "headerDblClickMenu", js.Array(value*))
    
    inline def setHeaderDblClickPopup(value: String): Self = StObject.set(x, "headerDblClickPopup", value.asInstanceOf[js.Any])
    
    inline def setHeaderDblClickPopupUndefined: Self = StObject.set(x, "headerDblClickPopup", js.undefined)
    
    inline def setHeaderDblClickUndefined: Self = StObject.set(x, "headerDblClick", js.undefined)
    
    inline def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2(value))
    
    inline def setHeaderDblTapUndefined: Self = StObject.set(x, "headerDblTap", js.undefined)
    
    inline def setHeaderFilter(value: Editor): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterEmptyCheck(value: /* value */ Any => Boolean): Self = StObject.set(x, "headerFilterEmptyCheck", js.Any.fromFunction1(value))
    
    inline def setHeaderFilterEmptyCheckUndefined: Self = StObject.set(x, "headerFilterEmptyCheck", js.undefined)
    
    inline def setHeaderFilterFunc(
      value: FilterType | (js.Function4[
          /* headerValue */ Any, 
          /* rowValue */ Any, 
          /* rowdata */ Any, 
          /* filterparams */ Any, 
          Boolean
        ])
    ): Self = StObject.set(x, "headerFilterFunc", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterFuncFunction4(
      value: (/* headerValue */ Any, /* rowValue */ Any, /* rowdata */ Any, /* filterparams */ Any) => Boolean
    ): Self = StObject.set(x, "headerFilterFunc", js.Any.fromFunction4(value))
    
    inline def setHeaderFilterFuncParams(value: Any): Self = StObject.set(x, "headerFilterFuncParams", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterFuncParamsUndefined: Self = StObject.set(x, "headerFilterFuncParams", js.undefined)
    
    inline def setHeaderFilterFuncUndefined: Self = StObject.set(x, "headerFilterFunc", js.undefined)
    
    inline def setHeaderFilterFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = StObject.set(x, "headerFilter", js.Any.fromFunction5(value))
    
    inline def setHeaderFilterLiveFilter(value: Boolean): Self = StObject.set(x, "headerFilterLiveFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterLiveFilterUndefined: Self = StObject.set(x, "headerFilterLiveFilter", js.undefined)
    
    inline def setHeaderFilterParams(value: EditorParams): Self = StObject.set(x, "headerFilterParams", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "headerFilterParams", js.Any.fromFunction1(value))
    
    inline def setHeaderFilterParamsUndefined: Self = StObject.set(x, "headerFilterParams", js.undefined)
    
    inline def setHeaderFilterPlaceholder(value: String): Self = StObject.set(x, "headerFilterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterPlaceholderUndefined: Self = StObject.set(x, "headerFilterPlaceholder", js.undefined)
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "headerHozAlign", value.asInstanceOf[js.Any])
    
    inline def setHeaderHozAlignUndefined: Self = StObject.set(x, "headerHozAlign", js.undefined)
    
    inline def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
    
    inline def setHeaderMenuIcon(
      value: String | HTMLElement | (js.Function1[/* component */ ColumnComponent, HTMLElement | String])
    ): Self = StObject.set(x, "headerMenuIcon", value.asInstanceOf[js.Any])
    
    inline def setHeaderMenuIconFunction1(value: /* component */ ColumnComponent => HTMLElement | String): Self = StObject.set(x, "headerMenuIcon", js.Any.fromFunction1(value))
    
    inline def setHeaderMenuIconUndefined: Self = StObject.set(x, "headerMenuIcon", js.undefined)
    
    inline def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
    
    inline def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerMenu", js.Array(value*))
    
    inline def setHeaderMouseDown(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseDown", js.Any.fromFunction2(value))
    
    inline def setHeaderMouseDownUndefined: Self = StObject.set(x, "headerMouseDown", js.undefined)
    
    inline def setHeaderMouseUp(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseUp", js.Any.fromFunction2(value))
    
    inline def setHeaderMouseUpUndefined: Self = StObject.set(x, "headerMouseUp", js.undefined)
    
    inline def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortStartingDir(value: SortDirection): Self = StObject.set(x, "headerSortStartingDir", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortStartingDirUndefined: Self = StObject.set(x, "headerSortStartingDir", js.undefined)
    
    inline def setHeaderSortTristate(value: Boolean): Self = StObject.set(x, "headerSortTristate", value.asInstanceOf[js.Any])
    
    inline def setHeaderSortTristateUndefined: Self = StObject.set(x, "headerSortTristate", js.undefined)
    
    inline def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
    
    inline def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTap", js.Any.fromFunction2(value))
    
    inline def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2(value))
    
    inline def setHeaderTapHoldUndefined: Self = StObject.set(x, "headerTapHold", js.undefined)
    
    inline def setHeaderTapUndefined: Self = StObject.set(x, "headerTap", js.undefined)
    
    inline def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
    
    inline def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = StObject.set(x, "headerTooltip", js.Any.fromFunction1(value))
    
    inline def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
    
    inline def setHeaderVertical(value: Boolean | flip): Self = StObject.set(x, "headerVertical", value.asInstanceOf[js.Any])
    
    inline def setHeaderVerticalUndefined: Self = StObject.set(x, "headerVertical", js.undefined)
    
    inline def setHeaderWordWrap(value: Boolean): Self = StObject.set(x, "headerWordWrap", value.asInstanceOf[js.Any])
    
    inline def setHeaderWordWrapUndefined: Self = StObject.set(x, "headerWordWrap", js.undefined)
    
    inline def setHideInHtml(value: Boolean): Self = StObject.set(x, "hideInHtml", value.asInstanceOf[js.Any])
    
    inline def setHideInHtmlUndefined: Self = StObject.set(x, "hideInHtml", js.undefined)
    
    inline def setHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "hozAlign", value.asInstanceOf[js.Any])
    
    inline def setHozAlignUndefined: Self = StObject.set(x, "hozAlign", js.undefined)
    
    inline def setHtmlOutput(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "htmlOutput", value.asInstanceOf[js.Any])
    
    inline def setHtmlOutputFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "htmlOutput", js.Any.fromFunction1(value))
    
    inline def setHtmlOutputUndefined: Self = StObject.set(x, "htmlOutput", js.undefined)
    
    inline def setMaxWidth(value: Double | `false`): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMutator(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutator", js.Any.fromFunction5(value))
    
    inline def setMutatorClipboard(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorClipboard", js.Any.fromFunction5(value))
    
    inline def setMutatorClipboardParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorClipboardParams", value.asInstanceOf[js.Any])
    
    inline def setMutatorClipboardParamsFunction4(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorClipboardParams", js.Any.fromFunction4(value))
    
    inline def setMutatorClipboardParamsUndefined: Self = StObject.set(x, "mutatorClipboardParams", js.undefined)
    
    inline def setMutatorClipboardUndefined: Self = StObject.set(x, "mutatorClipboard", js.undefined)
    
    inline def setMutatorData(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorData", js.Any.fromFunction5(value))
    
    inline def setMutatorDataParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorDataParams", value.asInstanceOf[js.Any])
    
    inline def setMutatorDataParamsFunction4(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorDataParams", js.Any.fromFunction4(value))
    
    inline def setMutatorDataParamsUndefined: Self = StObject.set(x, "mutatorDataParams", js.undefined)
    
    inline def setMutatorDataUndefined: Self = StObject.set(x, "mutatorData", js.undefined)
    
    inline def setMutatorEdit(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* mutatorParams */ Any, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorEdit", js.Any.fromFunction5(value))
    
    inline def setMutatorEditParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorEditParams", value.asInstanceOf[js.Any])
    
    inline def setMutatorEditParamsFunction4(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorEditParams", js.Any.fromFunction4(value))
    
    inline def setMutatorEditParamsUndefined: Self = StObject.set(x, "mutatorEditParams", js.undefined)
    
    inline def setMutatorEditUndefined: Self = StObject.set(x, "mutatorEdit", js.undefined)
    
    inline def setMutatorParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorParams", value.asInstanceOf[js.Any])
    
    inline def setMutatorParamsFunction4(
      value: (/* value */ Any, /* data */ Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => Any
    ): Self = StObject.set(x, "mutatorParams", js.Any.fromFunction4(value))
    
    inline def setMutatorParamsUndefined: Self = StObject.set(x, "mutatorParams", js.undefined)
    
    inline def setMutatorUndefined: Self = StObject.set(x, "mutator", js.undefined)
    
    inline def setPrint(value: Boolean | (js.Function1[/* column */ ColumnComponent, Boolean])): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setPrintFunction1(value: /* column */ ColumnComponent => Boolean): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setResizable(value: `true` | `false` | header | cell): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setResponsive(value: Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRowHandle(value: Boolean): Self = StObject.set(x, "rowHandle", value.asInstanceOf[js.Any])
    
    inline def setRowHandleUndefined: Self = StObject.set(x, "rowHandle", js.undefined)
    
    inline def setSorter(
      value: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
          /* a */ Any, 
          /* b */ Any, 
          /* aRow */ RowComponent, 
          /* bRow */ RowComponent, 
          /* column */ ColumnComponent, 
          /* dir */ SortDirection, 
          /* sorterParams */ js.Object, 
          Double
        ])
    ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterFunction7(
      value: (/* a */ Any, /* b */ Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
    ): Self = StObject.set(x, "sorter", js.Any.fromFunction7(value))
    
    inline def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = StObject.set(x, "sorterParams", value.asInstanceOf[js.Any])
    
    inline def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = StObject.set(x, "sorterParams", js.Any.fromFunction2(value))
    
    inline def setSorterParamsUndefined: Self = StObject.set(x, "sorterParams", js.undefined)
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
    
    inline def setTitleClipboard(value: String): Self = StObject.set(x, "titleClipboard", value.asInstanceOf[js.Any])
    
    inline def setTitleClipboardUndefined: Self = StObject.set(x, "titleClipboard", js.undefined)
    
    inline def setTitleDownload(value: String): Self = StObject.set(x, "titleDownload", value.asInstanceOf[js.Any])
    
    inline def setTitleDownloadUndefined: Self = StObject.set(x, "titleDownload", js.undefined)
    
    inline def setTitleFormatter(value: Formatter): Self = StObject.set(x, "titleFormatter", value.asInstanceOf[js.Any])
    
    inline def setTitleFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
    
    inline def setTitleFormatterParams(value: FormatterParams): Self = StObject.set(x, "titleFormatterParams", value.asInstanceOf[js.Any])
    
    inline def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "titleFormatterParams", js.Any.fromFunction1(value))
    
    inline def setTitleFormatterParamsUndefined: Self = StObject.set(x, "titleFormatterParams", js.undefined)
    
    inline def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
    
    inline def setTitleHtmlOutput(value: String): Self = StObject.set(x, "titleHtmlOutput", value.asInstanceOf[js.Any])
    
    inline def setTitleHtmlOutputUndefined: Self = StObject.set(x, "titleHtmlOutput", js.undefined)
    
    inline def setTitlePrint(value: String): Self = StObject.set(x, "titlePrint", value.asInstanceOf[js.Any])
    
    inline def setTitlePrintUndefined: Self = StObject.set(x, "titlePrint", js.undefined)
    
    inline def setTooltip(value: String | GlobalTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipFunction3(
      value: (/* event */ MouseEvent, /* cell */ CellComponent, /* onRender */ js.Function0[Unit]) => String
    ): Self = StObject.set(x, "tooltip", js.Any.fromFunction3(value))
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTopCalc(value: ColumnCalc): Self = StObject.set(x, "topCalc", value.asInstanceOf[js.Any])
    
    inline def setTopCalcFormatter(value: Formatter): Self = StObject.set(x, "topCalcFormatter", value.asInstanceOf[js.Any])
    
    inline def setTopCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = StObject.set(x, "topCalcFormatter", js.Any.fromFunction3(value))
    
    inline def setTopCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "topCalcFormatterParams", value.asInstanceOf[js.Any])
    
    inline def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "topCalcFormatterParams", js.Any.fromFunction1(value))
    
    inline def setTopCalcFormatterParamsUndefined: Self = StObject.set(x, "topCalcFormatterParams", js.undefined)
    
    inline def setTopCalcFormatterUndefined: Self = StObject.set(x, "topCalcFormatter", js.undefined)
    
    inline def setTopCalcFunction3(value: (/* values */ js.Array[Any], /* data */ js.Array[Any], /* calcParams */ js.Object) => Any): Self = StObject.set(x, "topCalc", js.Any.fromFunction3(value))
    
    inline def setTopCalcParams(value: ColumnCalcParams): Self = StObject.set(x, "topCalcParams", value.asInstanceOf[js.Any])
    
    inline def setTopCalcParamsFunction2(value: (/* values */ Any, /* data */ Any) => Any): Self = StObject.set(x, "topCalcParams", js.Any.fromFunction2(value))
    
    inline def setTopCalcParamsUndefined: Self = StObject.set(x, "topCalcParams", js.undefined)
    
    inline def setTopCalcUndefined: Self = StObject.set(x, "topCalc", js.undefined)
    
    inline def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    inline def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = StObject.set(x, "validator", js.Array(value*))
    
    inline def setVariableHeight(value: Boolean): Self = StObject.set(x, "variableHeight", value.asInstanceOf[js.Any])
    
    inline def setVariableHeightUndefined: Self = StObject.set(x, "variableHeight", js.undefined)
    
    inline def setVertAlign(value: VerticalAlign): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
    
    inline def setVertAlignUndefined: Self = StObject.set(x, "vertAlign", js.undefined)
    
    inline def setWidthGrow(value: Double): Self = StObject.set(x, "widthGrow", value.asInstanceOf[js.Any])
    
    inline def setWidthGrowUndefined: Self = StObject.set(x, "widthGrow", js.undefined)
    
    inline def setWidthShrink(value: Double): Self = StObject.set(x, "widthShrink", value.asInstanceOf[js.Any])
    
    inline def setWidthShrinkUndefined: Self = StObject.set(x, "widthShrink", js.undefined)
  }
}
