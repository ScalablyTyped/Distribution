package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDefinition
  extends ColumnLayout
     with CellCallbacks
     with _ColumnLookup {
  
  /**  Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    You can set accessors on a per column basis using the accessor option in the column definition object.*/
  var accessor: js.UndefOr[CustomAccessor] = js.native
  
  /** only called when data is being copied into the clipboard. */
  var accessorClipboard: js.UndefOr[CustomAccessor] = js.native
  
  /**  additional parameters you can pass to the accessorClipboard*/
  var accessorClipboardParams: js.UndefOr[CustomAccessorParams] = js.native
  
  /** only called when data is being converted into a downloadable file. */
  var accessorDownload: js.UndefOr[CustomAccessor] = js.native
  
  /** additional parameters you can pass to the accessorDownload */
  var accessorDownloadParams: js.UndefOr[CustomAccessorParams] = js.native
  
  /**You can use the accessorHtmlOutput and accessorHtmlOutputParams options on a column definition to alter the value of data in a column before the html is generated. */
  var accessorHtmlOutput: js.UndefOr[CustomAccessor] = js.native
  
  var accessorHtmlOutputParams: js.UndefOr[CustomAccessorParams] = js.native
  
  /**  Each accessor function has its own matching params option, for example accessorDownload has accessorDownloadParams.*/
  var accessorParams: js.UndefOr[CustomAccessorParams] = js.native
  
  /**You can use the accessorPrint and accessorPrintParams options on a column definition to alter the value of data in a column before it is printed */
  var accessorPrint: js.UndefOr[CustomAccessor] = js.native
  
  var accessorPrintParams: js.UndefOr[CustomAccessorParams] = js.native
  
  var bottomCalc: js.UndefOr[ColumnCalc] = js.native
  
  var bottomCalcFormatter: js.UndefOr[Formatter] = js.native
  
  /**  additional parameters you can pass to the bottomCalcFormatter function */
  var bottomCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
  
  var bottomCalcParams: js.UndefOr[ColumnCalcParams] = js.native
  
  var clickMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.native
  
  /** If you don't want to show a particular column in the clipboard output you can set the clipboard property in its column definition object to false */
  var clipboard: js.UndefOr[Boolean] = js.native
  
  /** A column can be a "group" of columns (Example: group header column -> Measurements, grouped column -> Length, Width, Height) */
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  
  /**You can add a right click context menu to any columns cells by passing an array of menu items to the contextMenu option in that columns definition. */
  var contextMenu: js.UndefOr[js.Array[MenuObject[CellComponent] | MenuSeparator]] = js.native
  
  /** sets css classes on header and cells in this column. (value should be a string containing space separated class names) */
  var cssClass: js.UndefOr[String] = js.native
  
  /** show or hide column in downloaded data */
  var download: js.UndefOr[Boolean] = js.native
  
  /**  There are some circumstances where you may want to block editibility of a cell for one reason or another. To meet this need you can use the editable option. This lets you set a callback that is executed before the editor is built, if this callback returns true the editor is added, if it returns false the edit is aborted and the cell remains a non editable cell. The function is passed one parameter, the CellComponent of the cell about to be edited. You can also pass a boolean value instead of a function to this property.*/
  var editable: js.UndefOr[Boolean | (js.Function1[/* cell */ CellComponent, Boolean])] = js.native
  
  /** allows the user to edit the header titles */
  var editableTitle: js.UndefOr[Boolean] = js.native
  
  /** When a user clicks on an editable column the will be able to edit the value for that cell.
    By default Tabulator will use an editor that matches the current formatter for that cell. if you wish to specify a specific editor, you can set them per column using the editor option in the column definition. Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
    You can pass an optional additional parameter with the editor, editorParams that should contain an object with additional information for configuring the editor. */
  var editor: js.UndefOr[Editor] = js.native
  
  /** additional parameters you can pass to the editor   */
  var editorParams: js.UndefOr[EditorParams] = js.native
  
  /**  set how you would like the data to be formatted*/
  var formatter: js.UndefOr[Formatter] = js.native
  
  /**When copying to the clipboard you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterClipboard column definition option. You can use the formatterClipboardParams to pass in any additional params to the formatter */
  var formatterClipboard: js.UndefOr[Formatter | `false`] = js.native
  
  var formatterClipboardParams: js.UndefOr[FormatterParams] = js.native
  
  /**When the getHtml function is called you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterHtmlOutput column definition option */
  var formatterHtmlOutput: js.UndefOr[Formatter | `false`] = js.native
  
  var formatterHtmlOutputParams: js.UndefOr[FormatterParams] = js.native
  
  /**  You can pass an optional additional parameter with the formatter, formatterParams that should contain an object with additional information for configuring the formatter.*/
  var formatterParams: js.UndefOr[FormatterParams] = js.native
  
  /**When printing you may want to apply a different formatter from the one usualy used to format the cell, you can do this using the formatterPrint column definition option. You can use the formatterPrintParams to pass in any additional params to the formatter */
  var formatterPrint: js.UndefOr[Formatter | `false`] = js.native
  
  var formatterPrintParams: js.UndefOr[FormatterParams] = js.native
  
  /** You can freeze the position of columns on the left and right of the table using the frozen property in the column definition array. This will keep the column still when the table is scrolled horizontally. */
  var frozen: js.UndefOr[Boolean] = js.native
  
  /**   callback for when user clicks on the header for this column*/
  var headerClick: js.UndefOr[ColumnEventCallback] = js.native
  
  /** callback for when user right clicks on the header for this column  */
  var headerContext: js.UndefOr[ColumnEventCallback] = js.native
  
  /**You can add a right click context menu to any column by passing an array of menu items to the headerContextMenu option in that columns definition. */
  var headerContextMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.native
  
  /**  callback for when user double clicks on the header for this column */
  var headerDblClick: js.UndefOr[ColumnEventCallback] = js.native
  
  /** callback for when user double taps on a header for this column, triggered in touch displays when a user taps the same header twice in under 300ms */
  var headerDblTap: js.UndefOr[ColumnEventCallback] = js.native
  
  /**  filtering of columns from elements in the header */
  var headerFilter: js.UndefOr[Editor] = js.native
  
  /**  function to check when the header filter is empty */
  var headerFilterEmptyCheck: js.UndefOr[ValueBooleanCallback] = js.native
  
  /**  By default Tabulator will try and match the comparison type to the type of element used for the header filter.
    Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
    For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
    If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function*/
  var headerFilterFunc: js.UndefOr[
    FilterType | (js.Function4[
      /* headerValue */ js.Any, 
      /* rowValue */ js.Any, 
      /* rowdata */ js.Any, 
      /* filterparams */ js.Any, 
      Boolean
    ])
  ] = js.native
  
  /**  additional parameters object passed to the headerFilterFunc function  */
  var headerFilterFuncParams: js.UndefOr[js.Any] = js.native
  
  /** disable live filtering of the table  */
  var headerFilterLiveFilter: js.UndefOr[Boolean] = js.native
  
  /** additional parameters you can pass to the header filter */
  var headerFilterParams: js.UndefOr[EditorParams] = js.native
  
  /**  placeholder text for the header filter */
  var headerFilterPlaceholder: js.UndefOr[String] = js.native
  
  var headerHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  
  /**You can add a menu to any column by passing an array of menu items to the headerMenu option in that columns definition. */
  var headerMenu: js.UndefOr[js.Array[MenuObject[ColumnComponent] | MenuSeparator]] = js.native
  
  // Column Header
  /** By default all columns in a table are sortable by clicking on the column header, if you want to disable this behaviour, set the headerSort property to false in the column definition array: */
  var headerSort: js.UndefOr[Boolean] = js.native
  
  /** set the starting sort direction when a user first clicks on a header */
  var headerSortStartingDir: js.UndefOr[SortDirection] = js.native
  
  /** allow tristate toggling of column header sort direction */
  var headerSortTristate: js.UndefOr[Boolean] = js.native
  
  /**  callback for when user taps on a header for this column, triggered in touch displays. */
  var headerTap: js.UndefOr[ColumnEventCallback] = js.native
  
  /** callback for when user taps and holds on a header for this column, triggered in touch displays when a user taps and holds the same header for 1 second. */
  var headerTapHold: js.UndefOr[ColumnEventCallback] = js.native
  
  /** sets the on hover tooltip for the column header* * The tooltip headerTooltip can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value.
    string - a string that will be displayed for the tooltip.
    function - a callback function that returns the string for the column header*
    */
  var headerTooltip: js.UndefOr[Boolean | String | (js.Function1[/* column */ ColumnComponent, String])] = js.native
  
  /** change the orientation of the column header to vertical* * The headerVertical property can take one of three values:
    false - vertical columns disabled (default value)
    true - vertical columns enabled
    "flip" - vertical columns enabled, with text direction flipped by 180 degrees*
    */
  var headerVertical: js.UndefOr[Boolean | flip] = js.native
  
  /** When the getHtml function is called, hide the column from the output. */
  var hideInHtml: js.UndefOr[Boolean] = js.native
  
  /**If you want to set the horizontal alignment on a column by column basis, */
  var hozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  
  /** Show/Hide a particular column in the HTML output*/
  var htmlOutput: js.UndefOr[Boolean] = js.native
  
  /** sets the minimum width of this column, this should be set in pixels (this takes priority over the global option of columnMinWidth) */
  var minWidth: js.UndefOr[Double] = js.native
  
  /** Mutators are used to alter data as it is parsed into Tabulator. For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    You can set mutators on a per column basis using the mutator option in the column definition object.
    You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutator: js.UndefOr[CustomMutator] = js.native
  
  /** only called when data is changed via a user editing a cell. */
  var mutatorClipboard: js.UndefOr[CustomMutator] = js.native
  
  var mutatorClipboardParams: js.UndefOr[CustomMutatorParams] = js.native
  
  /**  only called when data is loaded via a command {eg. setData). */
  var mutatorData: js.UndefOr[CustomMutator] = js.native
  
  var mutatorDataParams: js.UndefOr[CustomMutatorParams] = js.native
  
  /** only called when data is changed via a user editing a cell. */
  var mutatorEdit: js.UndefOr[CustomMutator] = js.native
  
  var mutatorEditParams: js.UndefOr[CustomMutatorParams] = js.native
  
  /** You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator. */
  var mutatorParams: js.UndefOr[CustomMutatorParams] = js.native
  
  /** set whether column can be resized by user dragging its edges */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /** an integer to determine when the column should be hidden in responsive mode */
  var responsive: js.UndefOr[Double] = js.native
  
  /** sets the column as a row handle, allowing it to be used to drag movable rows. */
  var rowHandle: js.UndefOr[Boolean] = js.native
  
  // Data Manipulation
  /**  By default Tabulator will attempt to guess which sorter should be applied to a column based on the data contained in the first row. It can determine sorters for strings, numbers, alphanumeric sequences and booleans, anything else will be treated as a string.
  To specify a sorter to be used on a column use the sorter property in the columns definition object
  You can pass an optional additional property with sorter, sorterParams that should contain an object with additional information for configuring the sorter*/
  var sorter: js.UndefOr[
    string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* aRow */ RowComponent, 
      /* bRow */ RowComponent, 
      /* column */ ColumnComponent, 
      /* dir */ SortDirection, 
      /* sorterParams */ js.Object, 
      Double
    ])
  ] = js.native
  
  /** If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object. */
  var sorterParams: js.UndefOr[ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction] = js.native
  
  /**When copying to clipboard you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titleClipboard column definition option, which takes the same inputs as the standard title property. */
  var titleClipboard: js.UndefOr[String] = js.native
  
  /** set custom title for column in download */
  var titleDownload: js.UndefOr[String] = js.native
  
  /**  formatter function for header title */
  var titleFormatter: js.UndefOr[Formatter] = js.native
  
  /** additional parameters you can pass to the header title formatter */
  var titleFormatterParams: js.UndefOr[FormatterParams] = js.native
  
  /**When the getHtml function is called you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titleHtmlOutput column definition option, which takes the same inputs as the standard title property. */
  var titleHtmlOutput: js.UndefOr[String] = js.native
  
  /**When printing you may want to apply a different columnheader title from the one usualy used in the table. You can now do this using the titlePrint column definition option, which takes the same inputs as the standard title property. */
  var titlePrint: js.UndefOr[String] = js.native
  
  /** sets the on hover tooltip for each cell in this column * * The tooltip parameter can take three different types of value
    boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
    string - a string that will be displayed for all cells in the matching column/table.
    function - a callback function that returns the string for the cell
    * Note: setting a tooltip value on a column will override the global setting.
    */
  var tooltip: js.UndefOr[String | GlobalTooltipOption] = js.native
  
  /**  the column calculation to be displayed at the top of this column(see Column Calculations for more details) */
  var topCalc: js.UndefOr[ColumnCalc] = js.native
  
  /** formatter for the topCalc calculation cell  */
  var topCalcFormatter: js.UndefOr[Formatter] = js.native
  
  /**  additional parameters you can pass to the topCalcFormatter function */
  var topCalcFormatterParams: js.UndefOr[FormatterParams] = js.native
  
  /** additional parameters you can pass to the topCalc calculation function (see Column Calculations for more details) */
  var topCalcParams: js.UndefOr[ColumnCalcParams] = js.native
  
  /** Validators are used to ensure that any user input into your editable cells matches your requirements.
    Validators can be applied by using the validator property in a columns definition object (see Define Columns for more details). */
  var validator: js.UndefOr[
    StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String
  ] = js.native
  
  /** alter the row height to fit the contents of the cell instead of hiding overflow */
  var variableHeight: js.UndefOr[Boolean] = js.native
  
  /**If you want to set the vertical alignment on a column by column basis */
  var vertAlign: js.UndefOr[VerticalAlign] = js.native
  
  /** The widthGrow property should be used on columns without a width property set. The value is used to work out what fraction of the available will be allocated to the column. The value should be set to a number greater than 0, by default any columns with no width set have a widthGrow value of 1 */
  var widthGrow: js.UndefOr[Double] = js.native
  
  /** The widthShrink property should be used on columns with a width property set. The value is used to work out how to shrink columns with a fixed width when the table is too narrow to fit in all the columns. The value should be set to a number greater than 0, by default columns with a width set have a widthShrink value of 0, meaning they will not be shrunk if the table gets too narrow, and may cause the horizontal scrollbar to appear. */
  var widthShrink: js.UndefOr[Double] = js.native
}
object ColumnDefinition {
  
  @scala.inline
  def apply(title: String): ColumnDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  @scala.inline
  implicit class ColumnDefinitionOps[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
    
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
    def setAccessor(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessor", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessor: Self = this.set("accessor", js.undefined)
    
    @scala.inline
    def setAccessorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorClipboard", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorClipboard: Self = this.set("accessorClipboard", js.undefined)
    
    @scala.inline
    def setAccessorClipboardParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorClipboardParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorClipboardParams(value: CustomAccessorParams): Self = this.set("accessorClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorClipboardParams: Self = this.set("accessorClipboardParams", js.undefined)
    
    @scala.inline
    def setAccessorDownload(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorDownload", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorDownload: Self = this.set("accessorDownload", js.undefined)
    
    @scala.inline
    def setAccessorDownloadParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorDownloadParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorDownloadParams(value: CustomAccessorParams): Self = this.set("accessorDownloadParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorDownloadParams: Self = this.set("accessorDownloadParams", js.undefined)
    
    @scala.inline
    def setAccessorHtmlOutput(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorHtmlOutput", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorHtmlOutput: Self = this.set("accessorHtmlOutput", js.undefined)
    
    @scala.inline
    def setAccessorHtmlOutputParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorHtmlOutputParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = this.set("accessorHtmlOutputParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorHtmlOutputParams: Self = this.set("accessorHtmlOutputParams", js.undefined)
    
    @scala.inline
    def setAccessorParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorParams(value: CustomAccessorParams): Self = this.set("accessorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorParams: Self = this.set("accessorParams", js.undefined)
    
    @scala.inline
    def setAccessorPrint(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorPrint", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteAccessorPrint: Self = this.set("accessorPrint", js.undefined)
    
    @scala.inline
    def setAccessorPrintParamsFunction5(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
    ): Self = this.set("accessorPrintParams", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAccessorPrintParams(value: CustomAccessorParams): Self = this.set("accessorPrintParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessorPrintParams: Self = this.set("accessorPrintParams", js.undefined)
    
    @scala.inline
    def setBottomCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
    ): Self = this.set("bottomCalc", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBottomCalc(value: ColumnCalc): Self = this.set("bottomCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalc: Self = this.set("bottomCalc", js.undefined)
    
    @scala.inline
    def setBottomCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("bottomCalcFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBottomCalcFormatter(value: Formatter): Self = this.set("bottomCalcFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalcFormatter: Self = this.set("bottomCalcFormatter", js.undefined)
    
    @scala.inline
    def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("bottomCalcFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomCalcFormatterParams(value: FormatterParams): Self = this.set("bottomCalcFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomCalcFormatterParams: Self = this.set("bottomCalcFormatterParams", js.undefined)
    
    @scala.inline
    def setBottomCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = this.set("bottomCalcParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBottomCalcParams: Self = this.set("bottomCalcParams", js.undefined)
    
    @scala.inline
    def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = this.set("clickMenu", js.Array(value :_*))
    
    @scala.inline
    def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = this.set("clickMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickMenu: Self = this.set("clickMenu", js.undefined)
    
    @scala.inline
    def setClipboard(value: Boolean): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard: Self = this.set("clipboard", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = this.set("contextMenu", js.Array(value :_*))
    
    @scala.inline
    def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = this.set("editable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditableTitle(value: Boolean): Self = this.set("editableTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditableTitle: Self = this.set("editableTitle", js.undefined)
    
    @scala.inline
    def setEditorFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = this.set("editor", js.Any.fromFunction5(value))
    
    @scala.inline
    def setEditor(value: Editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("editorParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditorParams(value: EditorParams): Self = this.set("editorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorParams: Self = this.set("editorParams", js.undefined)
    
    @scala.inline
    def setFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatter(value: Formatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setFormatterClipboardFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterClipboard", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterClipboard(value: Formatter | `false`): Self = this.set("formatterClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterClipboard: Self = this.set("formatterClipboard", js.undefined)
    
    @scala.inline
    def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterClipboardParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterClipboardParams(value: FormatterParams): Self = this.set("formatterClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterClipboardParams: Self = this.set("formatterClipboardParams", js.undefined)
    
    @scala.inline
    def setFormatterHtmlOutputFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterHtmlOutput", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterHtmlOutput(value: Formatter | `false`): Self = this.set("formatterHtmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterHtmlOutput: Self = this.set("formatterHtmlOutput", js.undefined)
    
    @scala.inline
    def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterHtmlOutputParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterHtmlOutputParams(value: FormatterParams): Self = this.set("formatterHtmlOutputParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterHtmlOutputParams: Self = this.set("formatterHtmlOutputParams", js.undefined)
    
    @scala.inline
    def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterParams(value: FormatterParams): Self = this.set("formatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterParams: Self = this.set("formatterParams", js.undefined)
    
    @scala.inline
    def setFormatterPrintFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("formatterPrint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterPrint(value: Formatter | `false`): Self = this.set("formatterPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterPrint: Self = this.set("formatterPrint", js.undefined)
    
    @scala.inline
    def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("formatterPrintParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterPrintParams(value: FormatterParams): Self = this.set("formatterPrintParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatterPrintParams: Self = this.set("formatterPrintParams", js.undefined)
    
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    
    @scala.inline
    def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderClick: Self = this.set("headerClick", js.undefined)
    
    @scala.inline
    def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderContext: Self = this.set("headerContext", js.undefined)
    
    @scala.inline
    def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = this.set("headerContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = this.set("headerContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderContextMenu: Self = this.set("headerContextMenu", js.undefined)
    
    @scala.inline
    def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderDblClick: Self = this.set("headerDblClick", js.undefined)
    
    @scala.inline
    def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerDblTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderDblTap: Self = this.set("headerDblTap", js.undefined)
    
    @scala.inline
    def setHeaderFilterFunction5(
      value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
    ): Self = this.set("headerFilter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setHeaderFilter(value: Editor): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    
    @scala.inline
    def setHeaderFilterEmptyCheck(value: /* value */ js.Any => Boolean): Self = this.set("headerFilterEmptyCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderFilterEmptyCheck: Self = this.set("headerFilterEmptyCheck", js.undefined)
    
    @scala.inline
    def setHeaderFilterFuncFunction4(
      value: (/* headerValue */ js.Any, /* rowValue */ js.Any, /* rowdata */ js.Any, /* filterparams */ js.Any) => Boolean
    ): Self = this.set("headerFilterFunc", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHeaderFilterFunc(
      value: FilterType | (js.Function4[
          /* headerValue */ js.Any, 
          /* rowValue */ js.Any, 
          /* rowdata */ js.Any, 
          /* filterparams */ js.Any, 
          Boolean
        ])
    ): Self = this.set("headerFilterFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterFunc: Self = this.set("headerFilterFunc", js.undefined)
    
    @scala.inline
    def setHeaderFilterFuncParams(value: js.Any): Self = this.set("headerFilterFuncParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterFuncParams: Self = this.set("headerFilterFuncParams", js.undefined)
    
    @scala.inline
    def setHeaderFilterLiveFilter(value: Boolean): Self = this.set("headerFilterLiveFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterLiveFilter: Self = this.set("headerFilterLiveFilter", js.undefined)
    
    @scala.inline
    def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("headerFilterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderFilterParams(value: EditorParams): Self = this.set("headerFilterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterParams: Self = this.set("headerFilterParams", js.undefined)
    
    @scala.inline
    def setHeaderFilterPlaceholder(value: String): Self = this.set("headerFilterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilterPlaceholder: Self = this.set("headerFilterPlaceholder", js.undefined)
    
    @scala.inline
    def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = this.set("headerHozAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHozAlign: Self = this.set("headerHozAlign", js.undefined)
    
    @scala.inline
    def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = this.set("headerMenu", js.Array(value :_*))
    
    @scala.inline
    def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = this.set("headerMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderMenu: Self = this.set("headerMenu", js.undefined)
    
    @scala.inline
    def setHeaderSort(value: Boolean): Self = this.set("headerSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSort: Self = this.set("headerSort", js.undefined)
    
    @scala.inline
    def setHeaderSortStartingDir(value: SortDirection): Self = this.set("headerSortStartingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSortStartingDir: Self = this.set("headerSortStartingDir", js.undefined)
    
    @scala.inline
    def setHeaderSortTristate(value: Boolean): Self = this.set("headerSortTristate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSortTristate: Self = this.set("headerSortTristate", js.undefined)
    
    @scala.inline
    def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderTap: Self = this.set("headerTap", js.undefined)
    
    @scala.inline
    def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = this.set("headerTapHold", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderTapHold: Self = this.set("headerTapHold", js.undefined)
    
    @scala.inline
    def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = this.set("headerTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = this.set("headerTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTooltip: Self = this.set("headerTooltip", js.undefined)
    
    @scala.inline
    def setHeaderVertical(value: Boolean | flip): Self = this.set("headerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderVertical: Self = this.set("headerVertical", js.undefined)
    
    @scala.inline
    def setHideInHtml(value: Boolean): Self = this.set("hideInHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInHtml: Self = this.set("hideInHtml", js.undefined)
    
    @scala.inline
    def setHozAlign(value: ColumnDefinitionAlign): Self = this.set("hozAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHozAlign: Self = this.set("hozAlign", js.undefined)
    
    @scala.inline
    def setHtmlOutput(value: Boolean): Self = this.set("htmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlOutput: Self = this.set("htmlOutput", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMutator(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutator", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutator: Self = this.set("mutator", js.undefined)
    
    @scala.inline
    def setMutatorClipboard(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorClipboard", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorClipboard: Self = this.set("mutatorClipboard", js.undefined)
    
    @scala.inline
    def setMutatorClipboardParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorClipboardParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorClipboardParams(value: CustomMutatorParams): Self = this.set("mutatorClipboardParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorClipboardParams: Self = this.set("mutatorClipboardParams", js.undefined)
    
    @scala.inline
    def setMutatorData(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorData", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorData: Self = this.set("mutatorData", js.undefined)
    
    @scala.inline
    def setMutatorDataParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorDataParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorDataParams(value: CustomMutatorParams): Self = this.set("mutatorDataParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorDataParams: Self = this.set("mutatorDataParams", js.undefined)
    
    @scala.inline
    def setMutatorEdit(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorEdit", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteMutatorEdit: Self = this.set("mutatorEdit", js.undefined)
    
    @scala.inline
    def setMutatorEditParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorEditParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorEditParams(value: CustomMutatorParams): Self = this.set("mutatorEditParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorEditParams: Self = this.set("mutatorEditParams", js.undefined)
    
    @scala.inline
    def setMutatorParamsFunction4(
      value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
    ): Self = this.set("mutatorParams", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMutatorParams(value: CustomMutatorParams): Self = this.set("mutatorParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatorParams: Self = this.set("mutatorParams", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setResponsive(value: Double): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setRowHandle(value: Boolean): Self = this.set("rowHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHandle: Self = this.set("rowHandle", js.undefined)
    
    @scala.inline
    def setSorterFunction7(
      value: (/* a */ js.Any, /* b */ js.Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
    ): Self = this.set("sorter", js.Any.fromFunction7(value))
    
    @scala.inline
    def setSorter(
      value: string | number | alphanum | boolean | exists | date | time | datetime | array | (js.Function7[
          /* a */ js.Any, 
          /* b */ js.Any, 
          /* aRow */ RowComponent, 
          /* bRow */ RowComponent, 
          /* column */ ColumnComponent, 
          /* dir */ SortDirection, 
          /* sorterParams */ js.Object, 
          Double
        ])
    ): Self = this.set("sorter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
    
    @scala.inline
    def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = this.set("sorterParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = this.set("sorterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorterParams: Self = this.set("sorterParams", js.undefined)
    
    @scala.inline
    def setTitleClipboard(value: String): Self = this.set("titleClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleClipboard: Self = this.set("titleClipboard", js.undefined)
    
    @scala.inline
    def setTitleDownload(value: String): Self = this.set("titleDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleDownload: Self = this.set("titleDownload", js.undefined)
    
    @scala.inline
    def setTitleFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("titleFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitleFormatter(value: Formatter): Self = this.set("titleFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFormatter: Self = this.set("titleFormatter", js.undefined)
    
    @scala.inline
    def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("titleFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleFormatterParams(value: FormatterParams): Self = this.set("titleFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFormatterParams: Self = this.set("titleFormatterParams", js.undefined)
    
    @scala.inline
    def setTitleHtmlOutput(value: String): Self = this.set("titleHtmlOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleHtmlOutput: Self = this.set("titleHtmlOutput", js.undefined)
    
    @scala.inline
    def setTitlePrint(value: String): Self = this.set("titlePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitlePrint: Self = this.set("titlePrint", js.undefined)
    
    @scala.inline
    def setTooltipFunction1(value: /* cell */ CellComponent => String): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltip(value: String | GlobalTooltipOption): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTopCalcFunction3(
      value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
    ): Self = this.set("topCalc", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTopCalc(value: ColumnCalc): Self = this.set("topCalc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalc: Self = this.set("topCalc", js.undefined)
    
    @scala.inline
    def setTopCalcFormatterFunction3(
      value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
    ): Self = this.set("topCalcFormatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTopCalcFormatter(value: Formatter): Self = this.set("topCalcFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalcFormatter: Self = this.set("topCalcFormatter", js.undefined)
    
    @scala.inline
    def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = this.set("topCalcFormatterParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopCalcFormatterParams(value: FormatterParams): Self = this.set("topCalcFormatterParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopCalcFormatterParams: Self = this.set("topCalcFormatterParams", js.undefined)
    
    @scala.inline
    def setTopCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = this.set("topCalcParams", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTopCalcParams: Self = this.set("topCalcParams", js.undefined)
    
    @scala.inline
    def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = this.set("validator", js.Array(value :_*))
    
    @scala.inline
    def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setVariableHeight(value: Boolean): Self = this.set("variableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableHeight: Self = this.set("variableHeight", js.undefined)
    
    @scala.inline
    def setVertAlign(value: VerticalAlign): Self = this.set("vertAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAlign: Self = this.set("vertAlign", js.undefined)
    
    @scala.inline
    def setWidthGrow(value: Double): Self = this.set("widthGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthGrow: Self = this.set("widthGrow", js.undefined)
    
    @scala.inline
    def setWidthShrink(value: Double): Self = this.set("widthShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthShrink: Self = this.set("widthShrink", js.undefined)
  }
}
