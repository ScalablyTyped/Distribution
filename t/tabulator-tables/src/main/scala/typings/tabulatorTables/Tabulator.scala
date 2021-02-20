package typings.tabulatorTables

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import typings.std.UIEvent
import typings.tabulatorTables.Tabulator.AddditionalExportOptions
import typings.tabulatorTables.Tabulator.CellComponent
import typings.tabulatorTables.Tabulator.ColumnComponent
import typings.tabulatorTables.Tabulator.ColumnDefinition
import typings.tabulatorTables.Tabulator.ColumnLayout
import typings.tabulatorTables.Tabulator.ColumnLookup
import typings.tabulatorTables.Tabulator.DownloadOptions
import typings.tabulatorTables.Tabulator.DownloadType
import typings.tabulatorTables.Tabulator.Filter
import typings.tabulatorTables.Tabulator.FilterFunction
import typings.tabulatorTables.Tabulator.FilterParams
import typings.tabulatorTables.Tabulator.FilterType
import typings.tabulatorTables.Tabulator.GroupComponent
import typings.tabulatorTables.Tabulator.GroupValuesArg
import typings.tabulatorTables.Tabulator.Options
import typings.tabulatorTables.Tabulator.RowComponent
import typings.tabulatorTables.Tabulator.RowLookup
import typings.tabulatorTables.Tabulator.RowRangeLookup
import typings.tabulatorTables.Tabulator.ScrollToColumnPosition
import typings.tabulatorTables.Tabulator.ScrollToRowPostition
import typings.tabulatorTables.Tabulator.SortDirection
import typings.tabulatorTables.Tabulator.Sorter
import typings.tabulatorTables.Tabulator.SorterFromTable
import typings.tabulatorTables.anon.PartialColumnDefinition
import typings.tabulatorTables.anon.PickFilterfieldvalue
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.add
import typings.tabulatorTables.tabulatorTablesStrings.alphanum
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.arrow
import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.avg
import typings.tabulatorTables.tabulatorTablesStrings.blocking
import typings.tabulatorTables.tabulatorTablesStrings.boolean
import typings.tabulatorTables.tabulatorTablesStrings.both
import typings.tabulatorTables.tabulatorTablesStrings.bottom
import typings.tabulatorTables.tabulatorTablesStrings.cell
import typings.tabulatorTables.tabulatorTablesStrings.click
import typings.tabulatorTables.tabulatorTablesStrings.clipboard
import typings.tabulatorTables.tabulatorTablesStrings.collapse
import typings.tabulatorTables.tabulatorTablesStrings.columns
import typings.tabulatorTables.tabulatorTablesStrings.cookie
import typings.tabulatorTables.tabulatorTablesStrings.copy
import typings.tabulatorTables.tabulatorTablesStrings.data
import typings.tabulatorTables.tabulatorTablesStrings.date
import typings.tabulatorTables.tabulatorTablesStrings.datetime
import typings.tabulatorTables.tabulatorTablesStrings.days
import typings.tabulatorTables.tabulatorTablesStrings.delete
import typings.tabulatorTables.tabulatorTablesStrings.desc
import typings.tabulatorTables.tabulatorTablesStrings.download
import typings.tabulatorTables.tabulatorTablesStrings.edit
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.exists
import typings.tabulatorTables.tabulatorTablesStrings.filter
import typings.tabulatorTables.tabulatorTablesStrings.first
import typings.tabulatorTables.tabulatorTablesStrings.fitColumns
import typings.tabulatorTables.tabulatorTablesStrings.fitData
import typings.tabulatorTables.tabulatorTablesStrings.fitDataFill
import typings.tabulatorTables.tabulatorTablesStrings.fitDataStretch
import typings.tabulatorTables.tabulatorTablesStrings.fitDataTable
import typings.tabulatorTables.tabulatorTablesStrings.flip
import typings.tabulatorTables.tabulatorTablesStrings.form
import typings.tabulatorTables.tabulatorTablesStrings.group
import typings.tabulatorTables.tabulatorTablesStrings.header
import typings.tabulatorTables.tabulatorTablesStrings.hide
import typings.tabulatorTables.tabulatorTablesStrings.highlight
import typings.tabulatorTables.tabulatorTablesStrings.hours
import typings.tabulatorTables.tabulatorTablesStrings.hover
import typings.tabulatorTables.tabulatorTablesStrings.html
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.insert
import typings.tabulatorTables.tabulatorTablesStrings.json
import typings.tabulatorTables.tabulatorTablesStrings.landscape
import typings.tabulatorTables.tabulatorTablesStrings.last
import typings.tabulatorTables.tabulatorTablesStrings.length
import typings.tabulatorTables.tabulatorTablesStrings.load
import typings.tabulatorTables.tabulatorTablesStrings.local
import typings.tabulatorTables.tabulatorTablesStrings.manual
import typings.tabulatorTables.tabulatorTablesStrings.max
import typings.tabulatorTables.tabulatorTablesStrings.min
import typings.tabulatorTables.tabulatorTablesStrings.minutes
import typings.tabulatorTables.tabulatorTablesStrings.months
import typings.tabulatorTables.tabulatorTablesStrings.next
import typings.tabulatorTables.tabulatorTablesStrings.number
import typings.tabulatorTables.tabulatorTablesStrings.page
import typings.tabulatorTables.tabulatorTablesStrings.paste
import typings.tabulatorTables.tabulatorTablesStrings.plain
import typings.tabulatorTables.tabulatorTablesStrings.portrait
import typings.tabulatorTables.tabulatorTablesStrings.prev
import typings.tabulatorTables.tabulatorTablesStrings.remote
import typings.tabulatorTables.tabulatorTablesStrings.replace
import typings.tabulatorTables.tabulatorTablesStrings.scroll
import typings.tabulatorTables.tabulatorTablesStrings.seconds
import typings.tabulatorTables.tabulatorTablesStrings.sort
import typings.tabulatorTables.tabulatorTablesStrings.string
import typings.tabulatorTables.tabulatorTablesStrings.sum
import typings.tabulatorTables.tabulatorTablesStrings.table
import typings.tabulatorTables.tabulatorTablesStrings.time
import typings.tabulatorTables.tabulatorTablesStrings.top
import typings.tabulatorTables.tabulatorTablesStrings.update
import typings.tabulatorTables.tabulatorTablesStrings.weeks
import typings.tabulatorTables.tabulatorTablesStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Tabulator.prototype.(?!registerModule|helpers|_)\w+
@js.native
trait Tabulator extends StObject {
  
  /** If you wish to add a single column to the table, you can do this using the addColumn function.
    * This function takes three arguments:
    Columns Definition - The column definition object for the column you want to add.
    Before (optional) - Determines how to position the new column. A value of true will insert the column to the left of existing columns, a value of false will insert it to the right. If a Position argument is supplied then this will determine whether the new colum is inserted before or after this column.
    Position (optional) - The field to insert the new column next to, this can be any of the standard column component look up options.
  * 
    */
  def addColumn(definition: ColumnDefinition): js.Promise[Unit] = js.native
  def addColumn(
    definition: ColumnDefinition,
    insertRightOfTarget: js.UndefOr[scala.Nothing],
    positionTarget: ColumnLookup
  ): js.Promise[Unit] = js.native
  def addColumn(definition: ColumnDefinition, insertRightOfTarget: Boolean): js.Promise[Unit] = js.native
  def addColumn(definition: ColumnDefinition, insertRightOfTarget: Boolean, positionTarget: ColumnLookup): js.Promise[Unit] = js.native
  
  /** The addData method returns a promise, this can be used to run any other commands that have to be run after the data has been loaded into the table. By running them in the promise you ensure they are only run after the table has loaded the data. */
  def addData(): js.Promise[RowComponent] = js.native
  def addData(data: js.UndefOr[scala.Nothing], addToTop: js.UndefOr[scala.Nothing], positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addData(data: js.UndefOr[scala.Nothing], addToTop: Boolean): js.Promise[RowComponent] = js.native
  def addData(data: js.UndefOr[scala.Nothing], addToTop: Boolean, positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addData(data: js.Array[js.Object]): js.Promise[RowComponent] = js.native
  def addData(data: js.Array[js.Object], addToTop: js.UndefOr[scala.Nothing], positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addData(data: js.Array[js.Object], addToTop: Boolean): js.Promise[RowComponent] = js.native
  def addData(data: js.Array[js.Object], addToTop: Boolean, positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  
  /** If you want to add another filter to the existing filters then you can call the addFilter function: */
  def addFilter(field: String, `type`: FilterType, value: js.Any): Unit = js.native
  def addFilter(field: String, `type`: FilterType, value: js.Any, filterParams: FilterParams): Unit = js.native
  /** If you want to add another filter to the existing filters then you can call the addFilter function: */
  @JSName("addFilter")
  var addFilter_Original: FilterFunction = js.native
  
  /** You can add a row to the table using the addRow function.
    The first argument should be a row data object. If you do not pass data for a column, it will be left empty. To create a blank row (ie for a user to fill in), pass an empty object to the function.
    The second argument is optional and determines whether the row is added to the top or bottom of the table. A value of true will add the row to the top of the table, a value of false will add the row to the bottom of the table. If the parameter is not set the row will be placed according to the addRowPos global option. */
  def addRow(): js.Promise[RowComponent] = js.native
  def addRow(data: js.UndefOr[scala.Nothing], addToTop: js.UndefOr[scala.Nothing], positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addRow(data: js.UndefOr[scala.Nothing], addToTop: Boolean): js.Promise[RowComponent] = js.native
  def addRow(data: js.UndefOr[scala.Nothing], addToTop: Boolean, positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addRow(data: js.Object): js.Promise[RowComponent] = js.native
  def addRow(data: js.Object, addToTop: js.UndefOr[scala.Nothing], positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  def addRow(data: js.Object, addToTop: Boolean): js.Promise[RowComponent] = js.native
  def addRow(data: js.Object, addToTop: Boolean, positionTarget: RowLookup): js.Promise[RowComponent] = js.native
  
  /** Prevent actions from riggering an update of the Virtual DOM: */
  def blockRedraw(): Unit = js.native
  
  var browser: String = js.native
  
  var browserSlow: Boolean = js.native
  
  /**Clear the edited flag on all cells in the table or some of them */
  def clearCellEdited(): Unit = js.native
  def clearCellEdited(clear: js.Array[CellComponent]): Unit = js.native
  def clearCellEdited(clear: CellComponent): Unit = js.native
  
  /** clear the invalid state on all cells in the table */
  def clearCellValidation(): Unit = js.native
  def clearCellValidation(clearType: js.Array[CellComponent]): Unit = js.native
  def clearCellValidation(clearType: CellComponent): Unit = js.native
  
  /** You can remove all data from the table using clearData */
  def clearData(): Unit = js.native
  
  /** To remove all filters from the table, use the clearFilter function. */
  def clearFilter(includeHeaderFilters: Boolean): Unit = js.native
  
  /** To remove just the header filters, leaving the programatic filters in place, use the clearHeaderFilter function. */
  def clearHeaderFilter(): Unit = js.native
  
  /** To remove all sorting from the table, call the clearSort function. */
  def clearSort(): Unit = js.native
  
  var columnManager: js.Any = js.native
  
  /**The copyToClipboard function allows you to copy the current table data to the clipboard.
    It takes one optional argument, a Row Range Lookup option, that will determine which rows are included in the clipboard output.It can take any following strings as input:
    visible - Rows currently visible in the table viewport
    active - Rows currently in the table (rows that pass current filters etc)
    selected - Rows currently selected by the selection module (this includes not currently active rows)
    all - All rows in the table reguardless of filters 
    If you leave this argument undefined, Tabulator will use the value of the clipboardCopyRowRange property, which has a default value of active*/
  def copyToClipboard(): Unit = js.native
  def copyToClipboard(rowRangeLookup: RowRangeLookup): Unit = js.native
  
  /** To permanently remove a column from the table deleteColumn function. This function takes any of the standard column component look up options as its first parameter */
  def deleteColumn(column: ColumnLookup): js.Promise[Unit] = js.native
  
  def deleteRow(index: js.Array[RowLookup]): Unit = js.native
  /** You can delete any row in the table using the deleteRow function. */
  def deleteRow(index: RowLookup): Unit = js.native
  
  def deselectRow(): Unit = js.native
  def deselectRow(row: RowLookup): Unit = js.native
  
  /** Deconstructor */
  def destroy(): Unit = js.native
  
  def download(
    downloadType: js.Function4[
      /* columns */ js.Array[ColumnDefinition], 
      /* data */ js.Any, 
      /* options */ js.Any, 
      /* setFileContents */ js.Any, 
      _
    ],
    fileName: String
  ): Unit = js.native
  def download(
    downloadType: js.Function4[
      /* columns */ js.Array[ColumnDefinition], 
      /* data */ js.Any, 
      /* options */ js.Any, 
      /* setFileContents */ js.Any, 
      _
    ],
    fileName: String,
    params: js.UndefOr[scala.Nothing],
    filter: RowRangeLookup
  ): Unit = js.native
  def download(
    downloadType: js.Function4[
      /* columns */ js.Array[ColumnDefinition], 
      /* data */ js.Any, 
      /* options */ js.Any, 
      /* setFileContents */ js.Any, 
      _
    ],
    fileName: String,
    params: DownloadOptions
  ): Unit = js.native
  def download(
    downloadType: js.Function4[
      /* columns */ js.Array[ColumnDefinition], 
      /* data */ js.Any, 
      /* options */ js.Any, 
      /* setFileContents */ js.Any, 
      _
    ],
    fileName: String,
    params: DownloadOptions,
    filter: RowRangeLookup
  ): Unit = js.native
  /** You have a choice of four file types to choose from:
    csv - Comma separated value file
    json - JSON formatted text file
    xlsx - Excel File (Requires the SheetJS Library)
    pdf - PDF File (Requires the jsPDF Library and jsPDF-AutoTable Plugin)
    To trigger a download, call the download function, passing the file type (from the above list) as the first argument, and an optional second argument of the file name for the download (if this is left out it will be "Tabulator.ext"). The optional third argument is an object containing any setup options for the formatter, such as the delimiter choice for CSV's).
    
    The PDF downloader requires that the jsPDF Library and jsPDF-AutoTable Plugin be included on your site, this can be included with the following script tags.
    
    If you want to create a custom file type from the table data then you can pass a function to the type argument, instead of a string value. At the end of this function you must call the setFileContents function, passing the formatted data and the mime type.
    */
  def download(downloadType: DownloadType, fileName: String): Unit = js.native
  def download(
    downloadType: DownloadType,
    fileName: String,
    params: js.UndefOr[scala.Nothing],
    filter: RowRangeLookup
  ): Unit = js.native
  def download(downloadType: DownloadType, fileName: String, params: DownloadOptions): Unit = js.native
  def download(downloadType: DownloadType, fileName: String, params: DownloadOptions, filter: RowRangeLookup): Unit = js.native
  
  /** If you want to open the generated file in a new browser tab rather than downloading it straight away, you can use the downloadToTab function. This is particularly useful with the PDF downloader, as it allows you to preview the resulting PDF in a new browser ta */
  def downloadToTab(downloadType: DownloadType, fileName: String): Unit = js.native
  def downloadToTab(downloadType: DownloadType, fileName: String, params: DownloadOptions): Unit = js.native
  
  var element: HTMLElement = js.native
  
  /** A lot of the modules come with a range of default settings to make setting up your table easier, for example the sorters, formatters and editors that ship with Tabulator as standard.
    If you are using a lot of custom settings over and over again (for example a custom sorter). you can end up re-delcaring it several time for different tables. To make your life easier Tabulator allows you to extend the default setup of each module to make your custom options as easily accessible as the defaults.
    Using the extendModule function on the global Tabulator variable allows you to globally add these options to all tables.
    The function takes three arguments, the name of the module, the name of the property you want to extend, and an object containing the elements you want to add in your module. In the example below we extend the format module to add two new default formatters: */
  def extendModule(name: String, property: String, values: js.Object): Unit = js.native
  
  /** Lookup table objects for any existing table using the element they were created on. */
  def findTable(query: String): js.Array[Tabulator] = js.native
  
  var footerManager: js.Any = js.native
  
  /** You can retrieve the current AJAX URL of the table with the getAjaxUrl function.
    * 
    * This will return a HTML encoded string of the table data.
    By default getHtml will return a table containing all the data held in the Tabulator. If you only want to access the currently filtered/sorted elements, you can pass a value of true to the first argument of the function.
    */
  def getAjaxUrl(): String = js.native
  
  /** You can retrieve the results of the column calculations at any point using the getCalcResults function.* For a table without grouped rows, this will return an object with top and bottom properties, that contain a row data object for all the columns in the table for the top calculations and bottom calculations respectively.
    */
  def getCalcResults(): js.Any = js.native
  
  /** Using the getColumn function you can retrieve the Column Component  */
  def getColumn(column: ColumnLookup): ColumnComponent = js.native
  
  /** To get the current column definition array (including any changes made through user actions, such as resizing or re-ordering columns), call the getColumnDefinitions function. this will return the current columns definition array. */
  def getColumnDefinitions(): js.Array[ColumnDefinition] = js.native
  
  /** If you want to handle column layout persistence manually, for example storing it in a database to use elsewhere, you can use the getColumnLayout function to retrieve a layout object for the current table. */
  def getColumnLayout(): js.Array[ColumnLayout] = js.native
  
  /** To get an array of Column Components for the current table setup, call the getColumns function. This will only return actual data columns not column groups.
    ** To get a structured array of Column Components that includes column groups, pass a value of true as an argument.
    */
  def getColumns(): js.Array[ColumnComponent] = js.native
  def getColumns(includeColumnGroups: Boolean): js.Array[ColumnComponent] = js.native
  
  /** You can retrieve the data stored in the table using the getData function. */
  def getData(): js.Array[_] = js.native
  def getData(activeOnly: RowRangeLookup): js.Array[_] = js.native
  
  def getDataCount(): Double = js.native
  def getDataCount(activeOnly: RowRangeLookup): Double = js.native
  
  /**You can get a list of all editited cells in the table using the getEditedCells function. this will return an array of Cell Components for each cell that has been edited. */
  def getEditedCells(): js.Array[CellComponent] = js.native
  
  /** You can retrieve an array of the current programtic filters using the getFilters function, this will not include any of the header filters: */
  def getFilters(includeHeaderFilters: Boolean): js.Array[Filter] = js.native
  
  /** get grouped table data in the same format as getData() */
  def getGroupedData(): js.Any = js.native
  def getGroupedData(activeOnly: Boolean): js.Any = js.native
  
  /** You can use the getGroups function to retrieve an array of all the first level Group Components in the table. */
  def getGroups(): js.Array[GroupComponent] = js.native
  
  /**You get the current header filter value of a column */
  def getHeaderFilterValue(column: ColumnLookup): String = js.native
  
  /** If you just want to retrieve the current header filters, you can use the getHeaderFilters function: */
  def getHeaderFilters(): js.Array[Filter] = js.native
  
  /** You can use the getHistoryRedoSize function to get a count of the number of history redo actions available.*/
  def getHistoryRedoSize(): Double | `false` = js.native
  
  /** You can use the getHistoryUndoSize function to get a count of the number of history undo actions available. */
  def getHistoryUndoSize(): Double | `false` = js.native
  
  /** Returns a table built of all active rows in the table (matching filters and sorts) */
  def getHtml(): js.Any = js.native
  def getHtml(
    rowRangeLookup: js.UndefOr[scala.Nothing],
    style: js.UndefOr[scala.Nothing],
    config: AddditionalExportOptions
  ): js.Any = js.native
  def getHtml(rowRangeLookup: js.UndefOr[scala.Nothing], style: Boolean): js.Any = js.native
  def getHtml(rowRangeLookup: js.UndefOr[scala.Nothing], style: Boolean, config: AddditionalExportOptions): js.Any = js.native
  def getHtml(rowRangeLookup: RowRangeLookup): js.Any = js.native
  def getHtml(rowRangeLookup: RowRangeLookup, style: js.UndefOr[scala.Nothing], config: AddditionalExportOptions): js.Any = js.native
  def getHtml(rowRangeLookup: RowRangeLookup, style: Boolean): js.Any = js.native
  def getHtml(rowRangeLookup: RowRangeLookup, style: Boolean, config: AddditionalExportOptions): js.Any = js.native
  
  /**The getInvalidCells method returns an array of Cell Components for all cells flagged as invalid after a user edit. */
  def getInvalidCells(): js.Array[CellComponent] = js.native
  
  /** You can then access these at any point using the getLang function, which will return the language object for the currently active locale. */
  def getLang(): js.Any = js.native
  def getLang(locale: String): js.Any = js.native
  
  /** It is possible to retrieve the locale code currently being used by Tabulator using the getLocale function: */
  def getLocale(): String = js.native
  
  /** To retrieve the current page use the getPage function. this will return the number of the current page. If pagination is disabled this will return false. */
  def getPage(): Double | `false` = js.native
  
  /** To retrieve the maximum available page use the getPageMax function. this will return the number of the maximum available page. If pagination is disabled this will return false. */
  def getPageMax(): Double | `false` = js.native
  
  /** To retrieve the number of rows allowed per page you can call the getPageSize function: */
  def getPageSize(): Double = js.native
  
  /** To rereive the DOM Node of a specific row, you can retrieve the RowComponent with the getRow function, then use the getElement function on the component. The first argument is the row you are looking for, it will take any of the standard row component look up options. */
  def getRow(row: RowLookup): RowComponent = js.native
  
  /** You can retrieve the Row Component of a row at a given position in the table using getRowFromPosition function. By default this will return the row based in its position in all table data, including data currently filtered out of the table.
    If you want to get a row based on its position in the currently filtered/sorted data, you can pass a value of true to the optional second argument of the function. */
  def getRowFromPosition(position: Double): RowComponent = js.native
  def getRowFromPosition(position: Double, activeOnly: Boolean): RowComponent = js.native
  
  /** Use the getRowPosition function to retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
    The first argument is the row you are looking for, it will take any of the standard row component look up options. If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional second argument of the function.
    
    Note: If the row is not found, a value of -1 will be returned, row positions start at 0
    */
  def getRowPosition(row: RowLookup): Double = js.native
  def getRowPosition(row: RowLookup, activeOnly: Boolean): Double = js.native
  
  /** You can retrieve all the row components in the table using the getRows function.* By default getRows will return an array containing all the Row Component's held in the Tabulator. If you only want to access the currently filtered/sorted elements, you can pass a value of true to the first argument of the function.*/
  def getRows(): js.Array[RowComponent] = js.native
  def getRows(activeOnly: RowRangeLookup): js.Array[RowComponent] = js.native
  
  /** To get the data objects for the selected rows you can use the getSelectedData function.
    This will return an array of the selected rows data objects in the order in which they were selected */
  def getSelectedData(): js.Array[_] = js.native
  
  /** To get the RowComponent's for the selected rows at any time you can use the getSelectedRows function.
    This will return an array of RowComponent's for the selected rows in the order in which they were selected. */
  def getSelectedRows(): js.Array[RowComponent] = js.native
  
  /** Retrieves the details of the currently sorted column. */
  def getSorters(): js.Array[SorterFromTable] = js.native
  
  /** You can hide a visible column at any point using the hideColumn function.  */
  def hideColumn(): Unit = js.native
  def hideColumn(column: ColumnLookup): Unit = js.native
  
  var modules: js.Any = js.native
  
  /**Programmatically move a column to a new position */
  def moveColumn(fromColumn: ColumnLookup, toColumn: ColumnLookup, after: Boolean): Unit = js.native
  
  /** If you want to programmatically move a row to a new position you can use the moveRow function.
    The first argument should be the row you want to move, and can be any of the standard row component look up options.
    The second argument should be the target row that you want to move to, and can be any of the standard row component look up options.
    The third argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target */
  def moveRow(fromRow: RowLookup, toRow: RowLookup): Unit = js.native
  def moveRow(fromRow: RowLookup, toRow: RowLookup, placeAboveTarget: Boolean): Unit = js.native
  
  /*Use the navigateDown function to shift focus to the same cell in the row below.
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigateDown(): Unit = js.native
  
  /** Use the navigateLeft function to shift focus to next editable cell on the left, return false if none available on row.* 
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigateLeft(): Unit = js.native
  
  /** Use the navigateNext function to shift focus to the next editable cell on the right, if none available move to left most editable cell on the row below.* 
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigateNext(): Unit = js.native
  
  /** Use the navigatePrev function to shift focus to the next editable cell on the left, if none available move to the right most editable cell on the row above.
    * 
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigatePrev(): Unit = js.native
  
  /** Use the navigateRight function to shift focus to next editable cell on the right, return false if none available on row.* 
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigateRight(): Unit = js.native
  
  /** Use the navigateUp function to shift focus to the same cell in the row above.
    * Note: These actions will only work when a cell is editable and has focus.
    Note: Navigation commands will only focus on editable cells, that is cells with an editor and if present an editable function that returns true.
    * 
    */
  def navigateUp(): Unit = js.native
  
  /** You can change to show the next page using the previousPage function. */
  def nextPage(): js.Promise[Unit] = js.native
  
  var options: Options = js.native
  
  /** You can change to show the previous page using the previousPage function. */
  def previousPage(): js.Promise[Unit] = js.native
  
  /**You can use the print function to trigger a full page printing of the contents of the table without any other elements from the page */
  def print(): js.Any = js.native
  def print(
    rowRangeLookup: js.UndefOr[scala.Nothing],
    style: js.UndefOr[scala.Nothing],
    config: AddditionalExportOptions
  ): js.Any = js.native
  def print(rowRangeLookup: js.UndefOr[scala.Nothing], style: Boolean): js.Any = js.native
  def print(rowRangeLookup: js.UndefOr[scala.Nothing], style: Boolean, config: AddditionalExportOptions): js.Any = js.native
  def print(rowRangeLookup: RowRangeLookup): js.Any = js.native
  def print(rowRangeLookup: RowRangeLookup, style: js.UndefOr[scala.Nothing], config: AddditionalExportOptions): js.Any = js.native
  def print(rowRangeLookup: RowRangeLookup, style: Boolean): js.Any = js.native
  def print(rowRangeLookup: RowRangeLookup, style: Boolean, config: AddditionalExportOptions): js.Any = js.native
  
  /**manually trigger recalculation of column calculations */
  def recalc(): Unit = js.native
  
  /** With history enabled you can use the redo function to automatically redo user action that has been undone, the more times you call the function, the further up the history log you go. once a user interacts with the table then can no longer redo any further actions until an undo is performe */
  def redo(): Boolean = js.native
  
  /** If the size of the element containing the Tabulator changes (and you are not able to use the in built auto-resize functionality) or you create a table before its containing element is visible, it will necessary to redraw the table to make sure the rows and columns render correctly.
    This can be done by calling the redraw method. For example, to trigger a redraw whenever the viewport width is changed.
    The redraw function also has an optional boolean argument that when set to true triggers a full rerender of the table including all data on all rows.*/
  def redraw(): Unit = js.native
  def redraw(force: Boolean): Unit = js.native
  
  /** If you want to remove one filter from the current list of filters you can use the removeFilter function: */
  def removeFilter(field: String, `type`: FilterType, value: js.Any): Unit = js.native
  def removeFilter(field: String, `type`: FilterType, value: js.Any, filterParams: FilterParams): Unit = js.native
  /** If you want to remove one filter from the current list of filters you can use the removeFilter function: */
  @JSName("removeFilter")
  var removeFilter_Original: FilterFunction = js.native
  
  /** The replaceData function lets you silently replace all data in the table without updating scroll position, sort or filtering, and without triggering the ajax loading popup. This is great if you have a table you want to periodically update with new/updated information without alerting the user to a change.
    It takes the same arguments as the setData function, and behaves in the same way when loading data (ie, it can make ajax requests, parse JSON etc) */
  def replaceData(): js.Promise[Unit] = js.native
  def replaceData(data: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], config: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: js.UndefOr[scala.Nothing], params: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: js.UndefOr[scala.Nothing], params: js.Any, config: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: String): js.Promise[Unit] = js.native
  def replaceData(data: String, params: js.UndefOr[scala.Nothing], config: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: String, params: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: String, params: js.Any, config: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: js.Array[js.Object]): js.Promise[Unit] = js.native
  def replaceData(data: js.Array[js.Object], params: js.UndefOr[scala.Nothing], config: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: js.Array[js.Object], params: js.Any): js.Promise[Unit] = js.native
  def replaceData(data: js.Array[js.Object], params: js.Any, config: js.Any): js.Promise[Unit] = js.native
  
  /** This will restore automatic table redrawing and trigger an appropriate redraw if one was needed as a result of any actions that happened while the redraw was blocked. */
  def restoreRedraw(): Unit = js.native
  
  var rowManager: js.Any = js.native
  
  /** If you want to trigger an animated scroll to a column then you can use the scrollToColumn function. The first argument should be any of the standard column component look up options for the column you want to scroll to.
    The second argument is optional, and is used to set the position of the column, it should be a string with a value of either left, middle or right, if omitted it will be set to the value of the scrollToColumnPosition option which has a default value of left.
    The third argument is optional, and is a boolean used to set if the table should scroll if the column is already visible, true to scroll, false to not, if omitted it will be set to the value of the scrollToColumnIfVisible option, which defaults to true
    */
  def scrollToColumn(column: ColumnLookup): js.Promise[Unit] = js.native
  def scrollToColumn(column: ColumnLookup, position: js.UndefOr[scala.Nothing], ifVisible: Boolean): js.Promise[Unit] = js.native
  def scrollToColumn(column: ColumnLookup, position: ScrollToColumnPosition): js.Promise[Unit] = js.native
  def scrollToColumn(column: ColumnLookup, position: ScrollToColumnPosition, ifVisible: Boolean): js.Promise[Unit] = js.native
  
  /** If you want to trigger an animated scroll to a row then you can use the scrollToRow function.
    The first argument should be any of the standard row component look up options for the row you want to scroll to.
    The second argument is optional, and is used to set the position of the row, it should be a string with a value of either top, center, bottom or nearest, if omitted it will be set to the value of the scrollToRowPosition option which has a default value of top.
    The third argument is optional, and is a boolean used to set if the table should scroll if the row is already visible, true to scroll, false to not, if omitted it will be set to the value of the scrollToRowIfVisible option, which defaults to true */
  def scrollToRow(row: RowLookup): js.Promise[Unit] = js.native
  def scrollToRow(row: RowLookup, position: js.UndefOr[scala.Nothing], ifVisible: Boolean): js.Promise[Unit] = js.native
  def scrollToRow(row: RowLookup, position: ScrollToRowPostition): js.Promise[Unit] = js.native
  def scrollToRow(row: RowLookup, position: ScrollToRowPostition, ifVisible: Boolean): js.Promise[Unit] = js.native
  
  /** The searchData function allows you to retreive an array of table row data that match any filters you pass in. it accepts the same arguments as the setFilter function. */
  def searchData(field: String, `type`: FilterType, value: js.Any): js.Array[_] = js.native
  
  /** The searchRows function allows you to retreive an array of row components that match any filters you pass in. it accepts the same arguments as the setFilter function. */
  def searchRows(field: String, `type`: FilterType, value: js.Any): js.Array[RowComponent] = js.native
  
  /** To programmatically select a row you can use the selectRow function.
    To select a specific row you can pass the any of the standard row component look up options into the first argument of the function. If you leave the argument blank you will select all rows (if you have set the selectable option to a numeric value, it will be ignored when selecting all rows). If lookup value is true you will selected all current filtered rows.*/
  def selectRow(): Unit = js.native
  def selectRow(lookup: js.Array[RowLookup]): Unit = js.native
  def selectRow(lookup: RowRangeLookup): Unit = js.native
  @JSName("selectRow")
  def selectRow_true(lookup: `true`): Unit = js.native
  
  /** If you have previously used the getColumnLayout function to retrieve a tables layout, you can use the setColumnLayout function to apply it to a table. */
  def setColumnLayout(layout: ColumnLayout): Unit = js.native
  
  /** To replace the current column definitions for a table use the setColumns function. This function takes a column definition array as its only argument. */
  def setColumns(definitions: js.Array[ColumnDefinition]): Unit = js.native
  
  def setData(data: js.Any): js.Promise[Unit] = js.native
  def setData(data: js.Any, params: js.UndefOr[scala.Nothing], config: js.Any): js.Promise[Unit] = js.native
  def setData(data: js.Any, params: js.Any): js.Promise[Unit] = js.native
  def setData(data: js.Any, params: js.Any, config: js.Any): js.Promise[Unit] = js.native
  
  /** By default Tabulator will only allow files with a .json extension to be loaded into the table.
    You can allow any other type of file into the file picker by passing the extension or mime type into the first argument of the setDataFromLocalFile function as a comma separated list. This argument will accept any of the values valid for the accept field of an input element */
  def setDataFromLocalFile(extensions: String): Unit = js.native
  
  /** To set a filter you need to call the setFilter method, passing the field you wish to filter, the comparison type and the value to filter for.
    This function will replace any exiting filters on the table with the specified filter 
    
    If you want to perform a more complicated filter then you can pass a callback function to the setFilter method, you can also pass an optional second argument, an object with parameters to be passed to the filter function.
    */
  def setFilter(p1: String): Unit = js.native
  def setFilter(
    p1: String,
    p2: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: String, p2: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def setFilter(p1: String, p2: js.UndefOr[scala.Nothing], value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: String, p2: js.Object): Unit = js.native
  def setFilter(p1: String, p2: js.Object, value: js.UndefOr[scala.Nothing], filterParams: FilterParams): Unit = js.native
  def setFilter(p1: String, p2: js.Object, value: js.Any): Unit = js.native
  def setFilter(p1: String, p2: js.Object, value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: String, p2: FilterType): Unit = js.native
  def setFilter(p1: String, p2: FilterType, value: js.UndefOr[scala.Nothing], filterParams: FilterParams): Unit = js.native
  def setFilter(p1: String, p2: FilterType, value: js.Any): Unit = js.native
  def setFilter(p1: String, p2: FilterType, value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter]): Unit = js.native
  def setFilter(
    p1: js.Array[_ | Filter],
    p2: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: js.UndefOr[scala.Nothing], value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: js.Object): Unit = js.native
  def setFilter(
    p1: js.Array[_ | Filter],
    p2: js.Object,
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: js.Object, value: js.Any): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: js.Object, value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: FilterType): Unit = js.native
  def setFilter(
    p1: js.Array[_ | Filter],
    p2: FilterType,
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: FilterType, value: js.Any): Unit = js.native
  def setFilter(p1: js.Array[_ | Filter], p2: FilterType, value: js.Any, filterParams: FilterParams): Unit = js.native
  def setFilter(p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean]): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.UndefOr[scala.Nothing],
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.UndefOr[scala.Nothing],
    value: js.Any
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.UndefOr[scala.Nothing],
    value: js.Any,
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean], p2: js.Object): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.Object,
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.Object,
    value: js.Any
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: js.Object,
    value: js.Any,
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean], p2: FilterType): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: FilterType,
    value: js.UndefOr[scala.Nothing],
    filterParams: FilterParams
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: FilterType,
    value: js.Any
  ): Unit = js.native
  def setFilter(
    p1: js.Function2[/* data */ js.Any, /* filterParams */ js.Any, Boolean],
    p2: FilterType,
    value: js.Any,
    filterParams: FilterParams
  ): Unit = js.native
  
  /** You can use the setGroupBy function to change the fields that rows are grouped by. This function has one argument and takes the same values as passed to the groupBy setup option. */
  def setGroupBy(groups: String): Unit = js.native
  def setGroupBy(groups: js.Function1[/* data */ js.Any, _]): Unit = js.native
  
  def setGroupHeader(values: js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]): Unit = js.native
  /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option. */
  def setGroupHeader(
    values: js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]
  ): Unit = js.native
  
  def setGroupStartOpen(
    values: js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ]
  ): Unit = js.native
  /** You can use the setGroupStartOpen function to change the default open state of groups. This function has one argument and takes the same values as passed to the groupStartOpen setup option.
    ** Note: If you use the setGroupStartOpen or setGroupHeader before you have set any groups on the table, the table will not update until the setGroupBy function is called.
    */
  def setGroupStartOpen(values: Boolean): Unit = js.native
  
  def setGroupValues(data: GroupValuesArg): Unit = js.native
  
  /** You can programatically set the focus on a header filter element by calling the setHeaderFilterFocus function, This function takes any of the standard column component look up options as its first parameter */
  def setHeaderFilterFocus(column: ColumnLookup): Unit = js.native
  
  /** You can programatically set the header filter value of a column by calling the setHeaderFilterValue function, This function takes any of the standard column component look up options as its first parameter, with the value for the header filter as the second option */
  def setHeaderFilterValue(column: ColumnLookup, value: String): Unit = js.native
  
  def setHeight(height: String): Unit = js.native
  /** If you want to manually change the height of the table at any time, you can use the setHeight function, which will also redraw the virtual DOM if necessary. */
  def setHeight(height: Double): Unit = js.native
  
  /** You can also set the language at any point after the table has loaded using the setLocale function, which takes the same range of values as the locale setup option mentioned above. */
  def setLocale(locale: String): Unit = js.native
  def setLocale(locale: Boolean): Unit = js.native
  
  /** set the maxmum page */
  def setMaxPage(max: Double): Unit = js.native
  
  /** When pagination is enabled the table footer will contain a number of pagination controls for navigating through the data.
    In addition to these controls it is possible to change page using the setPage function 
    The setPage function takes one parameter, which should be an integer representing the page you wish to see. There are also four strings that you can pass into the parameter for special functions.
    "first" - show the first page
    "prev" - show the previous page
    "next" - show the next page
    "last" - show the last page
    The setPage method returns a promise, this can be used to run any other commands that have to be run after the data has been loaded into the table. By running them in the promise you ensure they are only run after the table has loaded the data.
    */
  def setPage(page: Double): js.Promise[Unit] = js.native
  
  /** You can change the page size at any point by using the setPageSize function. (this setting will be ignored if using remote pagination with the page size set by the server) */
  def setPageSize(size: Double): Unit = js.native
  
  /** You can load the page for a specific row using the setPageToRow function and passing in any of the standard row component look up options for the row you want to scroll to.
    ** The setPageToRow method returns a promise, this can be used to run any other commands that have to be run after the data has been loaded into the table. By running them in the promise you ensure they are only run after the table has loaded the data.
    */
  def setPageToRow(row: RowLookup): js.Promise[Unit] = js.native
  
  @JSName("setPage")
  def setPage_first(page: first): js.Promise[Unit] = js.native
  @JSName("setPage")
  def setPage_last(page: last): js.Promise[Unit] = js.native
  @JSName("setPage")
  def setPage_next(page: next): js.Promise[Unit] = js.native
  @JSName("setPage")
  def setPage_prev(page: prev): js.Promise[Unit] = js.native
  
  /** You can trigger sorting using the setSort function */
  def setSort(sortList: String): Unit = js.native
  def setSort(sortList: String, dir: SortDirection): Unit = js.native
  def setSort(sortList: js.Array[Sorter]): Unit = js.native
  def setSort(sortList: js.Array[Sorter], dir: SortDirection): Unit = js.native
  
  /** You can show a hidden column at any point using the showColumn function.  */
  def showColumn(): Unit = js.native
  def showColumn(column: ColumnLookup): Unit = js.native
  
  /** You can toggle the visibility of a column at any point using the toggleColumn function.  */
  def toggleColumn(): Unit = js.native
  def toggleColumn(column: ColumnLookup): Unit = js.native
  
  def toggleSelectRow(): Unit = js.native
  def toggleSelectRow(row: RowLookup): Unit = js.native
  
  /** With history enabled you can use the undo function to automatically undo a user action, the more times you call the function, the further up the history log you go. */
  def undo(): Boolean = js.native
  
  def updateColumnDefinition(column: ColumnLookup, definition: ColumnDefinition): js.Promise[Unit] = js.native
  
  /** If you want to update an existing set of data in the table, without completely replacing the data as the setData method would do, you can use the updateData method.
    This function takes an array of row objects and will update each row based on its index value. (the index defaults to the "id" parameter, this can be set using the index option in the tabulator constructor). Options without an index will be ignored, as will items with an index that is not already in the table data. The addRow function should be used to add new data to the table. */
  def updateData(data: js.Array[js.Object]): js.Promise[Unit] = js.native
  
  /** If the data you are passng to the table contains a mix of existing rows to be updated and new rows to be added then you can call the updateOrAddData function. This will check each row object provided and update the existing row if available, or else create a new row with the data. */
  def updateOrAddData(data: js.Array[js.Object]): js.Promise[js.Array[RowComponent]] = js.native
  
  /** If you don't know whether a row already exists you can use the updateOrAddRow function. This will check if a row with a matching index exists, if it does it will update it, if not it will add a new row with that data. This takes the same arguments as the updateRow function. */
  def updateOrAddRow(row: RowLookup, data: js.Object): js.Promise[RowComponent] = js.native
  
  /** You can update any row in the table using the updateRow function.
    The first argument is the row you want to update, it will take any of the standard row component look up options.
    The second argument should be the updated data object for the row. As with the updateData function, this will not replace the existing row data object, it will only update any of the provided parameters.
    
    Once complete, this function will trigger the rowUpdated and dataChanged events.
    This function will return true if the update was successful or false if the requested row could not be found. If the new data matches the existing row data, no update will be performed.
    */
  def updateRow(row: RowLookup, data: js.Object): Boolean = js.native
  
  /**You can validate the whole table in one go by calling the validate method on the table instance.
    *
    * This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell that has failed validation.
    */
  def validate(): `true` | js.Array[CellComponent] = js.native
}
object Tabulator {
  
  @js.native
  trait AddditionalExportOptions extends StObject {
    
    var columnCalcs: js.UndefOr[Boolean] = js.native
    
    var columnGroups: js.UndefOr[Boolean] = js.native
    
    var columnHeaders: js.UndefOr[Boolean] = js.native
    
    var dataTree: js.UndefOr[Boolean] = js.native
    
    /**Show only raw unformatted cell values in the clipboard output */
    var formatCells: js.UndefOr[Boolean] = js.native
    
    var rowGroups: js.UndefOr[Boolean] = js.native
  }
  object AddditionalExportOptions {
    
    @scala.inline
    def apply(): AddditionalExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddditionalExportOptions]
    }
    
    @scala.inline
    implicit class AddditionalExportOptionsMutableBuilder[Self <: AddditionalExportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnCalcs(value: Boolean): Self = StObject.set(x, "columnCalcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCalcsUndefined: Self = StObject.set(x, "columnCalcs", js.undefined)
      
      @scala.inline
      def setColumnGroups(value: Boolean): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
      
      @scala.inline
      def setColumnHeaders(value: Boolean): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
      
      @scala.inline
      def setDataTree(value: Boolean): Self = StObject.set(x, "dataTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeUndefined: Self = StObject.set(x, "dataTree", js.undefined)
      
      @scala.inline
      def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatCellsUndefined: Self = StObject.set(x, "formatCells", js.undefined)
      
      @scala.inline
      def setRowGroups(value: Boolean): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
    }
  }
  
  @js.native
  trait AjaxConfig extends StObject {
    
    var credentials: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[JSONRecord] = js.native
    
    var method: js.UndefOr[HttpMethod] = js.native
    
    var mode: js.UndefOr[String] = js.native
  }
  object AjaxConfig {
    
    @scala.inline
    def apply(): AjaxConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxConfig]
    }
    
    @scala.inline
    implicit class AjaxConfigMutableBuilder[Self <: AjaxConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setHeaders(value: JSONRecord): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait AjaxContentType extends StObject {
    
    def body(url: String, config: js.Any, params: js.Any): js.Any = js.native
    
    var headers: JSONRecord = js.native
  }
  object AjaxContentType {
    
    @scala.inline
    def apply(body: (String, js.Any, js.Any) => js.Any, headers: JSONRecord): AjaxContentType = {
      val __obj = js.Dynamic.literal(body = js.Any.fromFunction3(body), headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxContentType]
    }
    
    @scala.inline
    implicit class AjaxContentTypeMutableBuilder[Self <: AjaxContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: (String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "body", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaders(value: JSONRecord): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.center
    - typings.tabulatorTables.tabulatorTablesStrings.left
    - typings.tabulatorTables.tabulatorTablesStrings.right
    - typings.tabulatorTables.tabulatorTablesStrings.justify
  */
  trait Align extends StObject
  object Align {
    
    @scala.inline
    def center: typings.tabulatorTables.tabulatorTablesStrings.center = "center".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.center]
    
    @scala.inline
    def justify: typings.tabulatorTables.tabulatorTablesStrings.justify = "justify".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.justify]
    
    @scala.inline
    def left: typings.tabulatorTables.tabulatorTablesStrings.left = "left".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.left]
    
    @scala.inline
    def right: typings.tabulatorTables.tabulatorTablesStrings.right = "right".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.right]
  }
  
  @js.native
  trait AutoCompleteParams
    extends SharedEditorParams
       with SharedSelectAutoCompleteEditorParams
       with _EditorParams {
    
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var emptyPlaceholder: js.UndefOr[String | HTMLElement] = js.native
    
    var freetext: js.UndefOr[Boolean] = js.native
    
    var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
    
    var searchFunc: js.UndefOr[
        js.Function2[
          /* term */ String, 
          /* values */ js.Array[String], 
          js.Array[String] | js.Promise[js.Array[String]]
        ]
      ] = js.native
    
    /**If you return a promise from the searchFunc callback then a "Searching..." placeholder will be displayed until the promise resolved.
      You can customise this placeholder using the searchingPlaceholder option. */
    var searchingPlaceholder: js.UndefOr[String | HTMLElement] = js.native
    
    var showListOnEmpty: js.UndefOr[Boolean] = js.native
    
    var values: `true` | (js.Array[_ | String]) | JSONRecord | String = js.native
    
    var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
  }
  object AutoCompleteParams {
    
    @scala.inline
    def apply(values: `true` | (js.Array[_ | String]) | JSONRecord | String): AutoCompleteParams = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteParams]
    }
    
    @scala.inline
    implicit class AutoCompleteParamsMutableBuilder[Self <: AutoCompleteParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setEmptyPlaceholder(value: String | HTMLElement): Self = StObject.set(x, "emptyPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyPlaceholderUndefined: Self = StObject.set(x, "emptyPlaceholder", js.undefined)
      
      @scala.inline
      def setFreetext(value: Boolean): Self = StObject.set(x, "freetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreetextUndefined: Self = StObject.set(x, "freetext", js.undefined)
      
      @scala.inline
      def setListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = StObject.set(x, "listItemFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setListItemFormatterUndefined: Self = StObject.set(x, "listItemFormatter", js.undefined)
      
      @scala.inline
      def setSearchFunc(
        value: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "searchFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearchFuncUndefined: Self = StObject.set(x, "searchFunc", js.undefined)
      
      @scala.inline
      def setSearchingPlaceholder(value: String | HTMLElement): Self = StObject.set(x, "searchingPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchingPlaceholderUndefined: Self = StObject.set(x, "searchingPlaceholder", js.undefined)
      
      @scala.inline
      def setShowListOnEmpty(value: Boolean): Self = StObject.set(x, "showListOnEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowListOnEmptyUndefined: Self = StObject.set(x, "showListOnEmpty", js.undefined)
      
      @scala.inline
      def setValues(value: `true` | (js.Array[_ | String]) | JSONRecord | String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: (js.Any | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setVerticalNavigation(value: editor | table | hybrid): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
    }
  }
  
  @js.native
  trait CalculationComponent extends StObject {
    
    def getCell(column: String): CellComponent = js.native
    def getCell(column: HTMLElement): CellComponent = js.native
    /** The getCell function returns the CellComponent for the specified column from this row.*/
    def getCell(column: ColumnComponent): CellComponent = js.native
    
    /** The getCells function returns an array of CellComponent objects, one for each cell in the row.*/
    def getCells(): js.Array[CellComponent] = js.native
    
    /** The getData function returns the data object for the row.*/
    def getData(): js.Any = js.native
    
    /** The getElement function returns the DOM node for the row.*/
    def getElement(): HTMLElement = js.native
    
    /** The getTable function returns the Tabulator object for the table containing the row. */
    def getTable(): Tabulator = js.native
  }
  
  @js.native
  trait CellCallbacks extends StObject {
    
    // Cell Events
    /** callback for when user clicks on a cell in this column  */
    var cellClick: js.UndefOr[CellEventCallback] = js.native
    
    /** callback for when user right clicks on a cell in this column */
    var cellContext: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when user double clicks on a cell in this column */
    var cellDblClick: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms.  */
    var cellDblTap: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when an edit on a cell in this column is aborted by the user  */
    var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
    
    /** callback for when a cell in this column has been edited by the user */
    var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
    
    // Cell editing
    /** callback for when a cell in this column is being edited by the user */
    var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
    
    /** callback for when the mouse pointer enters a cell */
    var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when the mouse pointer leaves a cell */
    var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
    
    /** callback for when the mouse pointer moves over a cell  */
    var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
    
    /** callback for when the mouse pointer enters a cell or one of its child elements */
    var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when the mouse pointer enters a cell or one of its child elements */
    var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
    
    /** callback for when user taps on a cell in this column, triggered in touch displays.  */
    var cellTap: js.UndefOr[CellEventCallback] = js.native
    
    /**  callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second.*/
    var cellTapHold: js.UndefOr[CellEventCallback] = js.native
  }
  object CellCallbacks {
    
    @scala.inline
    def apply(): CellCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellCallbacks]
    }
    
    @scala.inline
    implicit class CellCallbacksMutableBuilder[Self <: CellCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
      
      @scala.inline
      def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
      
      @scala.inline
      def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
      
      @scala.inline
      def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
      
      @scala.inline
      def setCellEdited(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
      
      @scala.inline
      def setCellEditing(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
      
      @scala.inline
      def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      @scala.inline
      def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      @scala.inline
      def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
      
      @scala.inline
      def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
      
      @scala.inline
      def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      @scala.inline
      def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
      
      @scala.inline
      def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
    }
  }
  
  @js.native
  trait CellComponent extends StObject {
    
    /** You and programatically cancel a cell edit that is currently in progress by calling the cancelEdit function */
    def cancelEdit(): Unit = js.native
    
    /** If you are making manual adjustments to elements contained withing the cell, or the cell itself, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the checkHeight function to check if the height of the cell has changed and normalize the row if it has. */
    def checkHeight(): Unit = js.native
    
    /**The clearEdited can be called on a Cell Component to clear the edited flag used by the isEdited function and mark the cell as unedited. */
    def clearEdited(): Unit = js.native
    
    /**The clearValidation can be called on a Cell Component to clear the invalid flag used by the isValid function and mark the cell as valid. */
    def clearValidation(): Unit = js.native
    
    /** You and programatically cause a cell to open its editor element using the edit function */
    def edit(): Unit = js.native
    def edit(ignoreEditable: Boolean): Unit = js.native
    
    /** The getColumn function returns the ColumnComponent for the column that contains the cell. */
    def getColumn(): ColumnComponent = js.native
    
    /** The getData function returns the data for the row that contains the cell. */
    def getData(): js.Object = js.native
    
    /** The getElement function returns the DOM node for the cell. */
    def getElement(): HTMLElement = js.native
    
    /** The getField function returns the field name for the column that contains the cell. */
    def getField(): String = js.native
    
    def getInitialValue(): js.Any = js.native
    
    /** The getOldValue function returns the previous value of the cell. Very usefull in the event of cell update callbacks. */
    def getOldValue(): js.Any = js.native
    
    /** The getRow function returns the RowComponent for the row that contains the cell. */
    def getRow(): RowComponent = js.native
    
    /** The getTable function returns the Tabulator object for the table containing the cell. */
    def getTable(): Tabulator = js.native
    
    /** The getValue function returns the current value for the cell. */
    def getValue(): js.Any = js.native
    
    /**You can call the isEdited function on any Cell Component to see if it has been editied. it will return true if it has been edited or false if it has not. */
    def isEdited(): Boolean = js.native
    
    /**The isValid can be called on a Cell Component to check if a cell has previously passed a validation check without revalidating it. */
    def isValid(): Boolean = js.native
    
    /** When a cell is being edited it is possible to move the editor focus from the current cell to one if its neighbours. There are a number of functions that can be called on the nav function to move the focus in different directions. */
    def nav(): CellNavigation = js.native
    
    def restoreInitialValue(): js.Any = js.native
    
    /** The restoreOldValue reverts the value of the cell back to its previous value, without triggering any of the cell edit callbacks. */
    def restoreOldValue(): js.Any = js.native
    
    /** You can change the value of the cell using the setValue function. The first parameter should be the new value for the cell, the second optional parameter will apply the column mutators to the value when set to true (default = true). */
    def setValue(value: js.Any): Unit = js.native
    def setValue(value: js.Any, mutate: Boolean): Unit = js.native
    
    /**You can validate a cell by calling the validate method on any Cell Component */
    def validate(): Boolean = js.native
  }
  
  type CellEditEventCallback = js.Function1[/* cell */ CellComponent, Unit]
  
  type CellEventCallback = js.Function2[/* e */ UIEvent, /* cell */ CellComponent, Unit]
  
  // Components-------------------------------------------------------------------
  @js.native
  trait CellNavigation extends StObject {
    
    /** down - move to the same cell in the row below */
    def down(): Unit = js.native
    
    /** left - next editable cell on the left, return false if none available on row */
    def left(): Boolean = js.native
    
    /** next - next editable cell on the right, if none available move to left most editable cell on the row below */
    def next(): Boolean = js.native
    
    /** prev - next editable cell on the left, if none available move to the right most editable cell on the row above */
    def prev(): Boolean = js.native
    
    /** right - next editable cell on the right, return false if none available on row */
    def right(): Boolean = js.native
    
    /** up - move to the same cell in the row above */
    def up(): Unit = js.native
  }
  object CellNavigation {
    
    @scala.inline
    def apply(
      down: () => Unit,
      left: () => Boolean,
      next: () => Boolean,
      prev: () => Boolean,
      right: () => Boolean,
      up: () => Unit
    ): CellNavigation = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), left = js.Any.fromFunction0(left), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), right = js.Any.fromFunction0(right), up = js.Any.fromFunction0(up))
      __obj.asInstanceOf[CellNavigation]
    }
    
    @scala.inline
    implicit class CellNavigationMutableBuilder[Self <: CellNavigation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: () => Unit): Self = StObject.set(x, "down", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeft(value: () => Boolean): Self = StObject.set(x, "left", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => Boolean): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrev(value: () => Boolean): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRight(value: () => Boolean): Self = StObject.set(x, "right", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUp(value: () => Unit): Self = StObject.set(x, "up", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CheckboxParams
    extends SharedEditorParams
       with _EditorParams {
    
    var indeterminateValue: js.UndefOr[String] = js.native
    
    // tick
    var tristate: js.UndefOr[Boolean] = js.native
  }
  object CheckboxParams {
    
    @scala.inline
    def apply(): CheckboxParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxParams]
    }
    
    @scala.inline
    implicit class CheckboxParamsMutableBuilder[Self <: CheckboxParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndeterminateValue(value: String): Self = StObject.set(x, "indeterminateValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateValueUndefined: Self = StObject.set(x, "indeterminateValue", js.undefined)
      
      @scala.inline
      def setTristate(value: Boolean): Self = StObject.set(x, "tristate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTristateUndefined: Self = StObject.set(x, "tristate", js.undefined)
    }
  }
  
  type Color = String | js.Array[js.Any] | ValueStringCallback
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.avg
    - typings.tabulatorTables.tabulatorTablesStrings.max
    - typings.tabulatorTables.tabulatorTablesStrings.min
    - typings.tabulatorTables.tabulatorTablesStrings.sum
    - typings.tabulatorTables.tabulatorTablesStrings.concat
    - typings.tabulatorTables.tabulatorTablesStrings.count
    - js.Function3[
  / * values * / js.Array[js.Any], 
  / * data * / js.Array[js.Any], 
  / * calcParams * / js.Object, 
  js.Any]
  */
  type ColumnCalc = _ColumnCalc | (js.Function3[
    /* values */ js.Array[js.Any], 
    /* data */ js.Array[js.Any], 
    /* calcParams */ js.Object, 
    js.Any
  ])
  
  type ColumnCalcParams = js.Function2[/* values */ js.Any, /* data */ js.Any, js.Any]
  
  @js.native
  trait ColumnComponent extends _ColumnLookup {
    
    /** The delete function deletes the column, removing it from the table*/
    def delete(): js.Promise[Unit] = js.native
    
    /** The getCells function returns an array of CellComponent objects, one for each cell in the column.*/
    def getCells(): js.Array[CellComponent] = js.native
    
    /** The getDefinition function returns the column definition object for the column.*/
    def getDefinition(): ColumnDefinition = js.native
    
    /*The getElement function returns the DOM node for the colum*/
    def getElement(): HTMLElement = js.native
    
    /** The getField function returns the field name for the column.*/
    def getField(): String = js.native
    
    /**Get the current header filter value of a column */
    def getHeaderFilterValue(): js.Any = js.native
    
    /** The getNextColumn function returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false. */
    def getNextColumn(): ColumnComponent | `false` = js.native
    
    /** The getParentColumn function returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false */
    def getParentColumn(): ColumnComponent | `false` = js.native
    
    /** The getPrevColumn function returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false. */
    def getPrevColumn(): ColumnComponent | `false` = js.native
    
    /** The getSubColumns function returns an array of ColumnComponent objects, one for each sub column of this column. */
    def getSubColumns(): js.Array[ColumnComponent] = js.native
    
    /** The getTable function returns the Tabulator object for the table containing the column */
    def getTable(): Tabulator = js.native
    
    /**rRturns the width of the column in pixels */
    def getWidth(): Double = js.native
    
    /** The headerFilterFocus function will place focus on the header filter element for this column if it exists. */
    def headerFilterFocus(): Unit = js.native
    
    /** The hide function hides the column if it is visible.*/
    def hide(): Unit = js.native
    
    /** The isVisible function returns a boolean to show if the column is visible, a value of true means it is visible.*/
    def isVisible(): Boolean = js.native
    
    /**You can move a column component next to another column using the move function */
    def move(toColumn: ColumnLookup, after: Boolean): Unit = js.native
    
    /** The reloadHeaderFilter function rebuilds the header filter element, updating any params passed into the editor used to generate the filter. */
    def reloadHeaderFilter(): Unit = js.native
    
    /** The scrollTo function will scroll the table to the column if it is visible. */
    def scrollTo(): js.Promise[Unit] = js.native
    
    /** The setHeaderFilterValue function set the value of the columns header filter element to the value provided in the first argument. */
    def setHeaderFilterValue(value: js.Any): Unit = js.native
    
    /**You can set the width of a column using the setWidth function, passing the width of the column in pixes as an integer as the first argument.Passing a value of true to the function will resize the column to fit its contents */
    def setWidth(width: Double): Unit = js.native
    @JSName("setWidth")
    def setWidth_true(width: `true`): Unit = js.native
    
    /** The show function shows the column if it is hidden.*/
    def show(): Unit = js.native
    
    /** The toggle function toggles the visibility of the column, switching between hidden and visible.*/
    def toggle(): Unit = js.native
    
    /** Update the definition of a column */
    def updateDefinition(definition: ColumnDefinition): js.Promise[Unit] = js.native
    
    /**You can validate a column
      *
      This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell in that column that has failed validation.             */
    def validate(): `true` | js.Array[CellComponent] = js.native
  }
  
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
    implicit class ColumnDefinitionMutableBuilder[Self <: ColumnDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessor(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessor", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorClipboard(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorClipboard", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorClipboardParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorClipboardParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorClipboardParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorClipboardParamsUndefined: Self = StObject.set(x, "accessorClipboardParams", js.undefined)
      
      @scala.inline
      def setAccessorClipboardUndefined: Self = StObject.set(x, "accessorClipboard", js.undefined)
      
      @scala.inline
      def setAccessorDownload(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorDownload", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorDownloadParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorDownloadParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorDownloadParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorDownloadParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorDownloadParamsUndefined: Self = StObject.set(x, "accessorDownloadParams", js.undefined)
      
      @scala.inline
      def setAccessorDownloadUndefined: Self = StObject.set(x, "accessorDownload", js.undefined)
      
      @scala.inline
      def setAccessorHtmlOutput(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorHtmlOutput", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorHtmlOutputParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorHtmlOutputParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorHtmlOutputParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorHtmlOutputParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorHtmlOutputParamsUndefined: Self = StObject.set(x, "accessorHtmlOutputParams", js.undefined)
      
      @scala.inline
      def setAccessorHtmlOutputUndefined: Self = StObject.set(x, "accessorHtmlOutput", js.undefined)
      
      @scala.inline
      def setAccessorParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorParamsUndefined: Self = StObject.set(x, "accessorParams", js.undefined)
      
      @scala.inline
      def setAccessorPrint(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* AccessorParams */ js.Any, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorPrint", js.Any.fromFunction6(value))
      
      @scala.inline
      def setAccessorPrintParams(value: CustomAccessorParams): Self = StObject.set(x, "accessorPrintParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessorPrintParamsFunction5(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | download | clipboard, /* column */ js.UndefOr[ColumnComponent], /* row */ js.UndefOr[RowComponent]) => js.Any
      ): Self = StObject.set(x, "accessorPrintParams", js.Any.fromFunction5(value))
      
      @scala.inline
      def setAccessorPrintParamsUndefined: Self = StObject.set(x, "accessorPrintParams", js.undefined)
      
      @scala.inline
      def setAccessorPrintUndefined: Self = StObject.set(x, "accessorPrint", js.undefined)
      
      @scala.inline
      def setAccessorUndefined: Self = StObject.set(x, "accessor", js.undefined)
      
      @scala.inline
      def setBottomCalc(value: ColumnCalc): Self = StObject.set(x, "bottomCalc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatter(value: Formatter): Self = StObject.set(x, "bottomCalcFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "bottomCalcFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBottomCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "bottomCalcFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "bottomCalcFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBottomCalcFormatterParamsUndefined: Self = StObject.set(x, "bottomCalcFormatterParams", js.undefined)
      
      @scala.inline
      def setBottomCalcFormatterUndefined: Self = StObject.set(x, "bottomCalcFormatter", js.undefined)
      
      @scala.inline
      def setBottomCalcFunction3(
        value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
      ): Self = StObject.set(x, "bottomCalc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBottomCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = StObject.set(x, "bottomCalcParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBottomCalcParamsUndefined: Self = StObject.set(x, "bottomCalcParams", js.undefined)
      
      @scala.inline
      def setBottomCalcUndefined: Self = StObject.set(x, "bottomCalc", js.undefined)
      
      @scala.inline
      def setClickMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "clickMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickMenuUndefined: Self = StObject.set(x, "clickMenu", js.undefined)
      
      @scala.inline
      def setClickMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "clickMenu", js.Array(value :_*))
      
      @scala.inline
      def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setContextMenu(value: js.Array[MenuObject[CellComponent] | MenuSeparator]): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setContextMenuVarargs(value: (MenuObject[CellComponent] | MenuSeparator)*): Self = StObject.set(x, "contextMenu", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | (js.Function1[/* cell */ CellComponent, Boolean])): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableFunction1(value: /* cell */ CellComponent => Boolean): Self = StObject.set(x, "editable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditableTitle(value: Boolean): Self = StObject.set(x, "editableTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableTitleUndefined: Self = StObject.set(x, "editableTitle", js.undefined)
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEditor(value: Editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "editor", js.Any.fromFunction5(value))
      
      @scala.inline
      def setEditorParams(value: EditorParams): Self = StObject.set(x, "editorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "editorParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorParamsUndefined: Self = StObject.set(x, "editorParams", js.undefined)
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setFormatter(value: Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboard(value: Formatter | `false`): Self = StObject.set(x, "formatterClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboardFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterClipboard", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterClipboardParams(value: FormatterParams): Self = StObject.set(x, "formatterClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterClipboardParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterClipboardParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterClipboardParamsUndefined: Self = StObject.set(x, "formatterClipboardParams", js.undefined)
      
      @scala.inline
      def setFormatterClipboardUndefined: Self = StObject.set(x, "formatterClipboard", js.undefined)
      
      @scala.inline
      def setFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterHtmlOutput(value: Formatter | `false`): Self = StObject.set(x, "formatterHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterHtmlOutputFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterHtmlOutput", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterHtmlOutputParams(value: FormatterParams): Self = StObject.set(x, "formatterHtmlOutputParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterHtmlOutputParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterHtmlOutputParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterHtmlOutputParamsUndefined: Self = StObject.set(x, "formatterHtmlOutputParams", js.undefined)
      
      @scala.inline
      def setFormatterHtmlOutputUndefined: Self = StObject.set(x, "formatterHtmlOutput", js.undefined)
      
      @scala.inline
      def setFormatterParams(value: FormatterParams): Self = StObject.set(x, "formatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterParamsUndefined: Self = StObject.set(x, "formatterParams", js.undefined)
      
      @scala.inline
      def setFormatterPrint(value: Formatter | `false`): Self = StObject.set(x, "formatterPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPrintFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "formatterPrint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatterPrintParams(value: FormatterParams): Self = StObject.set(x, "formatterPrintParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPrintParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "formatterPrintParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterPrintParamsUndefined: Self = StObject.set(x, "formatterPrintParams", js.undefined)
      
      @scala.inline
      def setFormatterPrintUndefined: Self = StObject.set(x, "formatterPrint", js.undefined)
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setHeaderClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
      
      @scala.inline
      def setHeaderContext(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderContextMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderContextMenuUndefined: Self = StObject.set(x, "headerContextMenu", js.undefined)
      
      @scala.inline
      def setHeaderContextMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerContextMenu", js.Array(value :_*))
      
      @scala.inline
      def setHeaderContextUndefined: Self = StObject.set(x, "headerContext", js.undefined)
      
      @scala.inline
      def setHeaderDblClick(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderDblClickUndefined: Self = StObject.set(x, "headerDblClick", js.undefined)
      
      @scala.inline
      def setHeaderDblTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderDblTapUndefined: Self = StObject.set(x, "headerDblTap", js.undefined)
      
      @scala.inline
      def setHeaderFilter(value: Editor): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterEmptyCheck(value: /* value */ js.Any => Boolean): Self = StObject.set(x, "headerFilterEmptyCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderFilterEmptyCheckUndefined: Self = StObject.set(x, "headerFilterEmptyCheck", js.undefined)
      
      @scala.inline
      def setHeaderFilterFunc(
        value: FilterType | (js.Function4[
              /* headerValue */ js.Any, 
              /* rowValue */ js.Any, 
              /* rowdata */ js.Any, 
              /* filterparams */ js.Any, 
              Boolean
            ])
      ): Self = StObject.set(x, "headerFilterFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterFuncFunction4(
        value: (/* headerValue */ js.Any, /* rowValue */ js.Any, /* rowdata */ js.Any, /* filterparams */ js.Any) => Boolean
      ): Self = StObject.set(x, "headerFilterFunc", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHeaderFilterFuncParams(value: js.Any): Self = StObject.set(x, "headerFilterFuncParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterFuncParamsUndefined: Self = StObject.set(x, "headerFilterFuncParams", js.undefined)
      
      @scala.inline
      def setHeaderFilterFuncUndefined: Self = StObject.set(x, "headerFilterFunc", js.undefined)
      
      @scala.inline
      def setHeaderFilterFunction5(
        value: (/* cell */ CellComponent, /* onRendered */ EmptyCallback, /* success */ ValueBooleanCallback, /* cancel */ ValueVoidCallback, /* editorParams */ js.Object) => HTMLElement | `false`
      ): Self = StObject.set(x, "headerFilter", js.Any.fromFunction5(value))
      
      @scala.inline
      def setHeaderFilterLiveFilter(value: Boolean): Self = StObject.set(x, "headerFilterLiveFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterLiveFilterUndefined: Self = StObject.set(x, "headerFilterLiveFilter", js.undefined)
      
      @scala.inline
      def setHeaderFilterParams(value: EditorParams): Self = StObject.set(x, "headerFilterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "headerFilterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderFilterParamsUndefined: Self = StObject.set(x, "headerFilterParams", js.undefined)
      
      @scala.inline
      def setHeaderFilterPlaceholder(value: String): Self = StObject.set(x, "headerFilterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterPlaceholderUndefined: Self = StObject.set(x, "headerFilterPlaceholder", js.undefined)
      
      @scala.inline
      def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
      
      @scala.inline
      def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "headerHozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHozAlignUndefined: Self = StObject.set(x, "headerHozAlign", js.undefined)
      
      @scala.inline
      def setHeaderMenu(value: js.Array[MenuObject[ColumnComponent] | MenuSeparator]): Self = StObject.set(x, "headerMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderMenuUndefined: Self = StObject.set(x, "headerMenu", js.undefined)
      
      @scala.inline
      def setHeaderMenuVarargs(value: (MenuObject[ColumnComponent] | MenuSeparator)*): Self = StObject.set(x, "headerMenu", js.Array(value :_*))
      
      @scala.inline
      def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortStartingDir(value: SortDirection): Self = StObject.set(x, "headerSortStartingDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortStartingDirUndefined: Self = StObject.set(x, "headerSortStartingDir", js.undefined)
      
      @scala.inline
      def setHeaderSortTristate(value: Boolean): Self = StObject.set(x, "headerSortTristate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortTristateUndefined: Self = StObject.set(x, "headerSortTristate", js.undefined)
      
      @scala.inline
      def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
      
      @scala.inline
      def setHeaderTap(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTapHold(value: (/* e */ UIEvent, /* column */ ColumnComponent) => Unit): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeaderTapHoldUndefined: Self = StObject.set(x, "headerTapHold", js.undefined)
      
      @scala.inline
      def setHeaderTapUndefined: Self = StObject.set(x, "headerTap", js.undefined)
      
      @scala.inline
      def setHeaderTooltip(value: Boolean | String | (js.Function1[/* column */ ColumnComponent, String])): Self = StObject.set(x, "headerTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTooltipFunction1(value: /* column */ ColumnComponent => String): Self = StObject.set(x, "headerTooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTooltipUndefined: Self = StObject.set(x, "headerTooltip", js.undefined)
      
      @scala.inline
      def setHeaderVertical(value: Boolean | flip): Self = StObject.set(x, "headerVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVerticalUndefined: Self = StObject.set(x, "headerVertical", js.undefined)
      
      @scala.inline
      def setHideInHtml(value: Boolean): Self = StObject.set(x, "hideInHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInHtmlUndefined: Self = StObject.set(x, "hideInHtml", js.undefined)
      
      @scala.inline
      def setHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "hozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHozAlignUndefined: Self = StObject.set(x, "hozAlign", js.undefined)
      
      @scala.inline
      def setHtmlOutput(value: Boolean): Self = StObject.set(x, "htmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlOutputUndefined: Self = StObject.set(x, "htmlOutput", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMutator(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutator", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorClipboard(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorClipboard", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorClipboardParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorClipboardParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorClipboardParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorClipboardParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorClipboardParamsUndefined: Self = StObject.set(x, "mutatorClipboardParams", js.undefined)
      
      @scala.inline
      def setMutatorClipboardUndefined: Self = StObject.set(x, "mutatorClipboard", js.undefined)
      
      @scala.inline
      def setMutatorData(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorData", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorDataParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorDataParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorDataParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorDataParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorDataParamsUndefined: Self = StObject.set(x, "mutatorDataParams", js.undefined)
      
      @scala.inline
      def setMutatorDataUndefined: Self = StObject.set(x, "mutatorData", js.undefined)
      
      @scala.inline
      def setMutatorEdit(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* mutatorParams */ js.Any, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorEdit", js.Any.fromFunction5(value))
      
      @scala.inline
      def setMutatorEditParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorEditParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorEditParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorEditParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorEditParamsUndefined: Self = StObject.set(x, "mutatorEditParams", js.undefined)
      
      @scala.inline
      def setMutatorEditUndefined: Self = StObject.set(x, "mutatorEdit", js.undefined)
      
      @scala.inline
      def setMutatorParams(value: CustomMutatorParams): Self = StObject.set(x, "mutatorParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutatorParamsFunction4(
        value: (/* value */ js.Any, /* data */ js.Any, /* type */ data | edit, /* cell */ js.UndefOr[CellComponent]) => js.Any
      ): Self = StObject.set(x, "mutatorParams", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMutatorParamsUndefined: Self = StObject.set(x, "mutatorParams", js.undefined)
      
      @scala.inline
      def setMutatorUndefined: Self = StObject.set(x, "mutator", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResponsive(value: Double): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRowHandle(value: Boolean): Self = StObject.set(x, "rowHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHandleUndefined: Self = StObject.set(x, "rowHandle", js.undefined)
      
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
      ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterFunction7(
        value: (/* a */ js.Any, /* b */ js.Any, /* aRow */ RowComponent, /* bRow */ RowComponent, /* column */ ColumnComponent, /* dir */ SortDirection, /* sorterParams */ js.Object) => Double
      ): Self = StObject.set(x, "sorter", js.Any.fromFunction7(value))
      
      @scala.inline
      def setSorterParams(value: ColumnDefinitionSorterParams | ColumnSorterParamLookupFunction): Self = StObject.set(x, "sorterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorterParamsFunction2(value: (/* column */ ColumnComponent, /* dir */ SortDirection) => js.Object): Self = StObject.set(x, "sorterParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSorterParamsUndefined: Self = StObject.set(x, "sorterParams", js.undefined)
      
      @scala.inline
      def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      @scala.inline
      def setTitleClipboard(value: String): Self = StObject.set(x, "titleClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleClipboardUndefined: Self = StObject.set(x, "titleClipboard", js.undefined)
      
      @scala.inline
      def setTitleDownload(value: String): Self = StObject.set(x, "titleDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleDownloadUndefined: Self = StObject.set(x, "titleDownload", js.undefined)
      
      @scala.inline
      def setTitleFormatter(value: Formatter): Self = StObject.set(x, "titleFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "titleFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleFormatterParams(value: FormatterParams): Self = StObject.set(x, "titleFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "titleFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleFormatterParamsUndefined: Self = StObject.set(x, "titleFormatterParams", js.undefined)
      
      @scala.inline
      def setTitleFormatterUndefined: Self = StObject.set(x, "titleFormatter", js.undefined)
      
      @scala.inline
      def setTitleHtmlOutput(value: String): Self = StObject.set(x, "titleHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleHtmlOutputUndefined: Self = StObject.set(x, "titleHtmlOutput", js.undefined)
      
      @scala.inline
      def setTitlePrint(value: String): Self = StObject.set(x, "titlePrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePrintUndefined: Self = StObject.set(x, "titlePrint", js.undefined)
      
      @scala.inline
      def setTooltip(value: String | GlobalTooltipOption): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTopCalc(value: ColumnCalc): Self = StObject.set(x, "topCalc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatter(value: Formatter): Self = StObject.set(x, "topCalcFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatterFunction3(
        value: (/* cell */ CellComponent, /* formatterParams */ js.Object, /* onRendered */ EmptyCallback) => String | HTMLElement
      ): Self = StObject.set(x, "topCalcFormatter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopCalcFormatterParams(value: FormatterParams): Self = StObject.set(x, "topCalcFormatterParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopCalcFormatterParamsFunction1(value: /* cell */ CellComponent => js.Object): Self = StObject.set(x, "topCalcFormatterParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTopCalcFormatterParamsUndefined: Self = StObject.set(x, "topCalcFormatterParams", js.undefined)
      
      @scala.inline
      def setTopCalcFormatterUndefined: Self = StObject.set(x, "topCalcFormatter", js.undefined)
      
      @scala.inline
      def setTopCalcFunction3(
        value: (/* values */ js.Array[js.Any], /* data */ js.Array[js.Any], /* calcParams */ js.Object) => js.Any
      ): Self = StObject.set(x, "topCalc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopCalcParams(value: (/* values */ js.Any, /* data */ js.Any) => js.Any): Self = StObject.set(x, "topCalcParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTopCalcParamsUndefined: Self = StObject.set(x, "topCalcParams", js.undefined)
      
      @scala.inline
      def setTopCalcUndefined: Self = StObject.set(x, "topCalc", js.undefined)
      
      @scala.inline
      def setValidator(value: StandardValidatorType | (js.Array[StandardValidatorType | Validator]) | Validator | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setValidatorVarargs(value: (StandardValidatorType | Validator)*): Self = StObject.set(x, "validator", js.Array(value :_*))
      
      @scala.inline
      def setVariableHeight(value: Boolean): Self = StObject.set(x, "variableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableHeightUndefined: Self = StObject.set(x, "variableHeight", js.undefined)
      
      @scala.inline
      def setVertAlign(value: VerticalAlign): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAlignUndefined: Self = StObject.set(x, "vertAlign", js.undefined)
      
      @scala.inline
      def setWidthGrow(value: Double): Self = StObject.set(x, "widthGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthGrowUndefined: Self = StObject.set(x, "widthGrow", js.undefined)
      
      @scala.inline
      def setWidthShrink(value: Double): Self = StObject.set(x, "widthShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthShrinkUndefined: Self = StObject.set(x, "widthShrink", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.left
    - typings.tabulatorTables.tabulatorTablesStrings.center
    - typings.tabulatorTables.tabulatorTablesStrings.right
  */
  trait ColumnDefinitionAlign extends StObject
  object ColumnDefinitionAlign {
    
    @scala.inline
    def center: typings.tabulatorTables.tabulatorTablesStrings.center = "center".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.center]
    
    @scala.inline
    def left: typings.tabulatorTables.tabulatorTablesStrings.left = "left".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.left]
    
    @scala.inline
    def right: typings.tabulatorTables.tabulatorTablesStrings.right = "right".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.right]
  }
  
  @js.native
  trait ColumnDefinitionSorterParams extends StObject {
    
    var alignEmptyValues: js.UndefOr[top | bottom] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String | Boolean] = js.native
    
    var `type`: js.UndefOr[length | sum | max | min | avg] = js.native
  }
  object ColumnDefinitionSorterParams {
    
    @scala.inline
    def apply(): ColumnDefinitionSorterParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnDefinitionSorterParams]
    }
    
    @scala.inline
    implicit class ColumnDefinitionSorterParamsMutableBuilder[Self <: ColumnDefinitionSorterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignEmptyValues(value: top | bottom): Self = StObject.set(x, "alignEmptyValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignEmptyValuesUndefined: Self = StObject.set(x, "alignEmptyValues", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocale(value: String | Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setType(value: length | sum | max | min | avg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ColumnEventCallback = js.Function2[/* e */ UIEvent, /* column */ ColumnComponent, Unit]
  
  @js.native
  trait ColumnLayout extends StObject {
    
    /** field - Required (not required in icon/button columns) this is the key for this column in the data array*/
    var field: js.UndefOr[String] = js.native
    
    /** title - Required This is the title that will be displayed in the header for this column */
    var title: String = js.native
    
    /** visible - (boolean, default - true) determines if the column is visible. (see Column Visibility for more details */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best) */
    var width: js.UndefOr[Double | String] = js.native
  }
  object ColumnLayout {
    
    @scala.inline
    def apply(title: String): ColumnLayout = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnLayout]
    }
    
    @scala.inline
    implicit class ColumnLayoutMutableBuilder[Self <: ColumnLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.ColumnComponent
    - typings.tabulatorTables.Tabulator.ColumnDefinition
    - typings.std.HTMLElement
    - java.lang.String
  */
  type ColumnLookup = _ColumnLookup | HTMLElement | String
  
  type ColumnSorterParamLookupFunction = js.Function2[/* column */ ColumnComponent, /* dir */ SortDirection, js.Object]
  
  type CustomAccessor = js.Function6[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | download | clipboard, 
    /* AccessorParams */ js.Any, 
    /* column */ js.UndefOr[ColumnComponent], 
    /* row */ js.UndefOr[RowComponent], 
    js.Any
  ]
  
  type CustomAccessorParams = js.Object | (js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | download | clipboard, 
    /* column */ js.UndefOr[ColumnComponent], 
    /* row */ js.UndefOr[RowComponent], 
    js.Any
  ])
  
  type CustomMutator = js.Function5[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | edit, 
    /* mutatorParams */ js.Any, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ]
  
  type CustomMutatorParams = js.Object | (js.Function4[
    /* value */ js.Any, 
    /* data */ js.Any, 
    /* type */ data | edit, 
    /* cell */ js.UndefOr[CellComponent], 
    js.Any
  ])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tabulatorTables.Tabulator._FormatterParams because Already inherited */ @js.native
  trait DateTimeDifferenceParams extends DateTimeParams {
    
    // Date Time Difference
    var date: js.UndefOr[js.Any] = js.native
    
    var humanize: js.UndefOr[Boolean] = js.native
    
    var suffix: js.UndefOr[Boolean] = js.native
    
    var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.native
  }
  object DateTimeDifferenceParams {
    
    @scala.inline
    def apply(): DateTimeDifferenceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeDifferenceParams]
    }
    
    @scala.inline
    implicit class DateTimeDifferenceParamsMutableBuilder[Self <: DateTimeDifferenceParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setHumanize(value: Boolean): Self = StObject.set(x, "humanize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanizeUndefined: Self = StObject.set(x, "humanize", js.undefined)
      
      @scala.inline
      def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUnit(value: years | months | weeks | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeParams extends _FormatterParams {
    
    // datetime
    var inputFormat: js.UndefOr[String] = js.native
    
    var invalidPlaceholder: js.UndefOr[`true` | String | Double | ValueStringCallback] = js.native
    
    var outputFormat: js.UndefOr[String] = js.native
    
    var timezone: js.UndefOr[String] = js.native
  }
  object DateTimeParams {
    
    @scala.inline
    def apply(): DateTimeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeParams]
    }
    
    @scala.inline
    implicit class DateTimeParamsMutableBuilder[Self <: DateTimeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputFormat(value: String): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
      
      @scala.inline
      def setInvalidPlaceholder(value: `true` | String | Double | ValueStringCallback): Self = StObject.set(x, "invalidPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidPlaceholderFunction1(value: /* value */ js.Any => String): Self = StObject.set(x, "invalidPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvalidPlaceholderUndefined: Self = StObject.set(x, "invalidPlaceholder", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  @js.native
  trait DownloadCSV extends StObject {
    
    /** If you need the output CSV to include a byte order mark (BOM) to ensure that output with UTF-8 characters can be correctly interpereted across didfferent applications, you should set the bom option to true */
    var bom: js.UndefOr[Boolean] = js.native
    
    /** By default CSV files are created using a comma (,) delimiter. If you need to change this for any reason the you can pass the options object with a delimiter property to the download function which will then use this delimiter instead of the comma. */
    var delimiter: js.UndefOr[String] = js.native
  }
  object DownloadCSV {
    
    @scala.inline
    def apply(): DownloadCSV = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadCSV]
    }
    
    @scala.inline
    implicit class DownloadCSVMutableBuilder[Self <: DownloadCSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    }
  }
  
  @js.native
  trait DownloadHTML extends StObject {
    
    /** By default the HTML output is a simple unstyled table. if you would like to match the current table styling you can set the style property to true  */
    var style: js.UndefOr[Boolean] = js.native
  }
  object DownloadHTML {
    
    @scala.inline
    def apply(): DownloadHTML = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadHTML]
    }
    
    @scala.inline
    implicit class DownloadHTMLMutableBuilder[Self <: DownloadHTML] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tabulatorTables.Tabulator.DownloadPDF because var conflicts: documentProcessing. Inlined orientation, title, rowGroupStyles, rowCalcStyles, jsPDF, autoTable */ @js.native
  trait DownloadOptions
    extends DownloadCSV
       with DownloadXLXS
       with DownloadHTML {
    
    var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.native
    
    var jsPDF: js.UndefOr[js.Any] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var rowCalcStyles: js.UndefOr[js.Any] = js.native
    
    var rowGroupStyles: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object DownloadOptions {
    
    @scala.inline
    def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoTable(value: js.Object | (js.Function1[/* doc */ js.Any, _])): Self = StObject.set(x, "autoTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTableFunction1(value: /* doc */ js.Any => _): Self = StObject.set(x, "autoTable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutoTableUndefined: Self = StObject.set(x, "autoTable", js.undefined)
      
      @scala.inline
      def setJsPDF(value: js.Any): Self = StObject.set(x, "jsPDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsPDFUndefined: Self = StObject.set(x, "jsPDF", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setRowCalcStyles(value: js.Any): Self = StObject.set(x, "rowCalcStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCalcStylesUndefined: Self = StObject.set(x, "rowCalcStyles", js.undefined)
      
      @scala.inline
      def setRowGroupStyles(value: js.Any): Self = StObject.set(x, "rowGroupStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupStylesUndefined: Self = StObject.set(x, "rowGroupStyles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait DownloadPDF extends StObject {
    
    var autoTable: js.UndefOr[js.Object | (js.Function1[/* doc */ js.Any, _])] = js.native
    
    /**An optional callback documentProcessing can be set on the download config object, that is passed the jsPDF document object after the auto-table creation to allow full customisation of the PDF */
    var documentProcessing: js.UndefOr[js.Function1[/* doc */ js.Any, _]] = js.native
    
    var jsPDF: js.UndefOr[js.Any] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
    
    var rowCalcStyles: js.UndefOr[js.Any] = js.native
    
    var rowGroupStyles: js.UndefOr[js.Any] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object DownloadPDF {
    
    @scala.inline
    def apply(): DownloadPDF = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadPDF]
    }
    
    @scala.inline
    implicit class DownloadPDFMutableBuilder[Self <: DownloadPDF] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoTable(value: js.Object | (js.Function1[/* doc */ js.Any, _])): Self = StObject.set(x, "autoTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoTableFunction1(value: /* doc */ js.Any => _): Self = StObject.set(x, "autoTable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutoTableUndefined: Self = StObject.set(x, "autoTable", js.undefined)
      
      @scala.inline
      def setDocumentProcessing(value: /* doc */ js.Any => _): Self = StObject.set(x, "documentProcessing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocumentProcessingUndefined: Self = StObject.set(x, "documentProcessing", js.undefined)
      
      @scala.inline
      def setJsPDF(value: js.Any): Self = StObject.set(x, "jsPDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsPDFUndefined: Self = StObject.set(x, "jsPDF", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setRowCalcStyles(value: js.Any): Self = StObject.set(x, "rowCalcStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCalcStylesUndefined: Self = StObject.set(x, "rowCalcStyles", js.undefined)
      
      @scala.inline
      def setRowGroupStyles(value: js.Any): Self = StObject.set(x, "rowGroupStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupStylesUndefined: Self = StObject.set(x, "rowGroupStyles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.csv
    - typings.tabulatorTables.tabulatorTablesStrings.json
    - typings.tabulatorTables.tabulatorTablesStrings.xlsx
    - typings.tabulatorTables.tabulatorTablesStrings.pdf
    - typings.tabulatorTables.tabulatorTablesStrings.html
  */
  trait DownloadType extends StObject
  object DownloadType {
    
    @scala.inline
    def csv: typings.tabulatorTables.tabulatorTablesStrings.csv = "csv".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.csv]
    
    @scala.inline
    def html: typings.tabulatorTables.tabulatorTablesStrings.html = "html".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.html]
    
    @scala.inline
    def json: typings.tabulatorTables.tabulatorTablesStrings.json = "json".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.json]
    
    @scala.inline
    def pdf: typings.tabulatorTables.tabulatorTablesStrings.pdf = "pdf".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.pdf]
    
    @scala.inline
    def xlsx: typings.tabulatorTables.tabulatorTablesStrings.xlsx = "xlsx".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.xlsx]
  }
  
  @js.native
  trait DownloadXLXS extends StObject {
    
    var documentProcessing: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
    
    /** The sheet name must be a valid Excel sheet name, and cannot include any of the following characters \, /, *, [, ], :,  */
    var sheetName: js.UndefOr[String] = js.native
  }
  object DownloadXLXS {
    
    @scala.inline
    def apply(): DownloadXLXS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadXLXS]
    }
    
    @scala.inline
    implicit class DownloadXLXSMutableBuilder[Self <: DownloadXLXS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentProcessing(value: /* input */ js.Any => _): Self = StObject.set(x, "documentProcessing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocumentProcessingUndefined: Self = StObject.set(x, "documentProcessing", js.undefined)
      
      @scala.inline
      def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesBooleans.`true`
    - typings.tabulatorTables.tabulatorTablesStrings.input
    - typings.tabulatorTables.tabulatorTablesStrings.textarea
    - typings.tabulatorTables.tabulatorTablesStrings.number
    - typings.tabulatorTables.tabulatorTablesStrings.range
    - typings.tabulatorTables.tabulatorTablesStrings.tickCross
    - typings.tabulatorTables.tabulatorTablesStrings.star
    - typings.tabulatorTables.tabulatorTablesStrings.select
    - typings.tabulatorTables.tabulatorTablesStrings.autocomplete
    - js.Function5[
  / * cell * / typings.tabulatorTables.Tabulator.CellComponent, 
  / * onRendered * / typings.tabulatorTables.Tabulator.EmptyCallback, 
  / * success * / typings.tabulatorTables.Tabulator.ValueBooleanCallback, 
  / * cancel * / typings.tabulatorTables.Tabulator.ValueVoidCallback, 
  / * editorParams * / js.Object, 
  typings.std.HTMLElement | typings.tabulatorTables.tabulatorTablesBooleans.`false`]
  */
  type Editor = _Editor | (js.Function5[
    /* cell */ CellComponent, 
    /* onRendered */ EmptyCallback, 
    /* success */ ValueBooleanCallback, 
    /* cancel */ ValueVoidCallback, 
    /* editorParams */ js.Object, 
    HTMLElement | `false`
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.NumberParams
    - typings.tabulatorTables.Tabulator.CheckboxParams
    - typings.tabulatorTables.Tabulator.SelectParams
    - typings.tabulatorTables.Tabulator.AutoCompleteParams
    - typings.tabulatorTables.Tabulator.InputParams
    - typings.tabulatorTables.Tabulator.TextAreaParams
    - js.Function1[/ * cell * / typings.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type EditorParams = _EditorParams | (js.Function1[/* cell */ CellComponent, js.Object])
  
  type EmptyCallback = js.Function1[/* callback */ js.Function0[Unit], Unit]
  
  @js.native
  trait Filter extends StObject {
    
    var field: String = js.native
    
    var `type`: FilterType = js.native
    
    var value: js.Any = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(field: String, `type`: FilterType, value: js.Any): Filter = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: FilterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterFunction = js.Function4[
    /* field */ String, 
    /* type */ FilterType, 
    /* value */ js.Any, 
    /* filterParams */ js.UndefOr[FilterParams], 
    Unit
  ]
  
  @js.native
  trait FilterParams extends StObject {
    
    var matchAll: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[String] = js.native
  }
  object FilterParams {
    
    @scala.inline
    def apply(): FilterParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterParams]
    }
    
    @scala.inline
    implicit class FilterParamsMutableBuilder[Self <: FilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchAll(value: Boolean): Self = StObject.set(x, "matchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAllUndefined: Self = StObject.set(x, "matchAll", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.Equalssign
    - typings.tabulatorTables.tabulatorTablesStrings.ExclamationmarkEqualssign
    - typings.tabulatorTables.tabulatorTablesStrings.like
    - typings.tabulatorTables.tabulatorTablesStrings.Lessthansign
    - typings.tabulatorTables.tabulatorTablesStrings.Greaterthansign
    - typings.tabulatorTables.tabulatorTablesStrings.LessthansignEqualssign
    - typings.tabulatorTables.tabulatorTablesStrings.GreaterthansignEqualssign
    - typings.tabulatorTables.tabulatorTablesStrings.in
    - typings.tabulatorTables.tabulatorTablesStrings.regex
    - typings.tabulatorTables.tabulatorTablesStrings.starts
    - typings.tabulatorTables.tabulatorTablesStrings.ends
  */
  trait FilterType extends StObject
  object FilterType {
    
    @scala.inline
    def Equalssign: typings.tabulatorTables.tabulatorTablesStrings.Equalssign = "=".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.Equalssign]
    
    @scala.inline
    def ExclamationmarkEqualssign: typings.tabulatorTables.tabulatorTablesStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.ExclamationmarkEqualssign]
    
    @scala.inline
    def Greaterthansign: typings.tabulatorTables.tabulatorTablesStrings.Greaterthansign = ">".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typings.tabulatorTables.tabulatorTablesStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typings.tabulatorTables.tabulatorTablesStrings.Lessthansign = "<".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typings.tabulatorTables.tabulatorTablesStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.LessthansignEqualssign]
    
    @scala.inline
    def ends: typings.tabulatorTables.tabulatorTablesStrings.ends = "ends".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.ends]
    
    @scala.inline
    def in: typings.tabulatorTables.tabulatorTablesStrings.in = "in".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.in]
    
    @scala.inline
    def like: typings.tabulatorTables.tabulatorTablesStrings.like = "like".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.like]
    
    @scala.inline
    def regex: typings.tabulatorTables.tabulatorTablesStrings.regex = "regex".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.regex]
    
    @scala.inline
    def starts: typings.tabulatorTables.tabulatorTablesStrings.starts = "starts".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.starts]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.plaintext
    - typings.tabulatorTables.tabulatorTablesStrings.textarea
    - typings.tabulatorTables.tabulatorTablesStrings.html
    - typings.tabulatorTables.tabulatorTablesStrings.money
    - typings.tabulatorTables.tabulatorTablesStrings.image
    - typings.tabulatorTables.tabulatorTablesStrings.datetime
    - typings.tabulatorTables.tabulatorTablesStrings.datetimediff
    - typings.tabulatorTables.tabulatorTablesStrings.link
    - typings.tabulatorTables.tabulatorTablesStrings.tickCross
    - typings.tabulatorTables.tabulatorTablesStrings.color
    - typings.tabulatorTables.tabulatorTablesStrings.star
    - typings.tabulatorTables.tabulatorTablesStrings.traffic
    - typings.tabulatorTables.tabulatorTablesStrings.progress
    - typings.tabulatorTables.tabulatorTablesStrings.lookup
    - typings.tabulatorTables.tabulatorTablesStrings.buttonTick
    - typings.tabulatorTables.tabulatorTablesStrings.buttonCross
    - typings.tabulatorTables.tabulatorTablesStrings.rownum
    - typings.tabulatorTables.tabulatorTablesStrings.handle
    - typings.tabulatorTables.tabulatorTablesStrings.rowSelection
    - typings.tabulatorTables.tabulatorTablesStrings.responsiveCollapse
    - js.Function3[
  / * cell * / typings.tabulatorTables.Tabulator.CellComponent, 
  / * formatterParams * / js.Object, 
  / * onRendered * / typings.tabulatorTables.Tabulator.EmptyCallback, 
  java.lang.String | typings.std.HTMLElement]
  */
  type Formatter = _Formatter | (js.Function3[
    /* cell */ CellComponent, 
    /* formatterParams */ js.Object, 
    /* onRendered */ EmptyCallback, 
    String | HTMLElement
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.Tabulator.MoneyParams
    - typings.tabulatorTables.Tabulator.ImageParams
    - typings.tabulatorTables.Tabulator.LinkParams
    - typings.tabulatorTables.Tabulator.DateTimeParams
    - typings.tabulatorTables.Tabulator.DateTimeDifferenceParams
    - typings.tabulatorTables.Tabulator.TickCrossParams
    - typings.tabulatorTables.Tabulator.TrafficParams
    - typings.tabulatorTables.Tabulator.StarRatingParams
    - typings.tabulatorTables.Tabulator.RowSelectionParams
    - typings.tabulatorTables.Tabulator.JSONRecord
    - js.Function1[/ * cell * / typings.tabulatorTables.Tabulator.CellComponent, js.Object]
  */
  type FormatterParams = _FormatterParams | (js.Function1[/* cell */ CellComponent, js.Object]) | JSONRecord
  
  type GlobalTooltipOption = Boolean | (js.Function1[/* cell */ CellComponent, String])
  
  @js.native
  trait GroupComponent extends StObject {
    
    /** The getElement function returns the DOM node for the group header. */
    def getElement(): HTMLElement = js.native
    
    /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
    def getField(): String = js.native
    
    /** The getKey function returns the unique key that is shared between all rows in this group. */
    def getKey(): js.Any = js.native
    
    /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false */
    def getParentGroup(): GroupComponent | `false` = js.native
    
    /** The getRows function returns an array of RowComponent objects, one for each row in the group */
    def getRows(): js.Array[RowComponent] = js.native
    
    /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
    def getSubGroups(): js.Array[GroupComponent] = js.native
    
    /** The getTable function returns the Tabulator object for the table containing the group */
    def getTable(): Tabulator = js.native
    
    /** The hide function hides the group if it is visible. */
    def hide(): Unit = js.native
    
    /**  The isVisible function returns a boolean to show if the group is visible, a value of true means it is visible.*/
    def isVisible(): Boolean = js.native
    
    /** The show function shows the group if it is hidden. */
    def show(): Unit = js.native
    
    /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
    def toggle(): Unit = js.native
  }
  object GroupComponent {
    
    @scala.inline
    def apply(
      getElement: () => HTMLElement,
      getField: () => String,
      getKey: () => js.Any,
      getParentGroup: () => GroupComponent | `false`,
      getRows: () => js.Array[RowComponent],
      getSubGroups: () => js.Array[GroupComponent],
      getTable: () => Tabulator,
      hide: () => Unit,
      isVisible: () => Boolean,
      show: () => Unit,
      toggle: () => Unit
    ): GroupComponent = {
      val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction0(getElement), getField = js.Any.fromFunction0(getField), getKey = js.Any.fromFunction0(getKey), getParentGroup = js.Any.fromFunction0(getParentGroup), getRows = js.Any.fromFunction0(getRows), getSubGroups = js.Any.fromFunction0(getSubGroups), getTable = js.Any.fromFunction0(getTable), hide = js.Any.fromFunction0(hide), isVisible = js.Any.fromFunction0(isVisible), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[GroupComponent]
    }
    
    @scala.inline
    implicit class GroupComponentMutableBuilder[Self <: GroupComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetKey(value: () => js.Any): Self = StObject.set(x, "getKey", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentGroup(value: () => GroupComponent | `false`): Self = StObject.set(x, "getParentGroup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRows(value: () => js.Array[RowComponent]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSubGroups(value: () => js.Array[GroupComponent]): Self = StObject.set(x, "getSubGroups", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTable(value: () => Tabulator): Self = StObject.set(x, "getTable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  type GroupContextMenuSignature = (js.Array[MenuObject[GroupComponent] | MenuSeparator]) | (js.Function2[
    /* component */ GroupComponent, 
    /* e */ MouseEvent, 
    MenuObject[GroupComponent] | `false` | js.Array[js.Any]
  ])
  
  type GroupEventCallback = js.Function2[/* e */ UIEvent, /* group */ GroupComponent, Unit]
  
  type GroupValuesArg = js.Array[js.Array[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.cellEdit
    - typings.tabulatorTables.tabulatorTablesStrings.rowAdd
    - typings.tabulatorTables.tabulatorTablesStrings.rowDelete
    - typings.tabulatorTables.tabulatorTablesStrings.rowMoved
  */
  trait HistoryAction extends StObject
  object HistoryAction {
    
    @scala.inline
    def cellEdit: typings.tabulatorTables.tabulatorTablesStrings.cellEdit = "cellEdit".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.cellEdit]
    
    @scala.inline
    def rowAdd: typings.tabulatorTables.tabulatorTablesStrings.rowAdd = "rowAdd".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.rowAdd]
    
    @scala.inline
    def rowDelete: typings.tabulatorTables.tabulatorTablesStrings.rowDelete = "rowDelete".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.rowDelete]
    
    @scala.inline
    def rowMoved: typings.tabulatorTables.tabulatorTablesStrings.rowMoved = "rowMoved".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.rowMoved]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.GET
    - typings.tabulatorTables.tabulatorTablesStrings.POST
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    @scala.inline
    def GET: typings.tabulatorTables.tabulatorTablesStrings.GET = "GET".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.GET]
    
    @scala.inline
    def POST: typings.tabulatorTables.tabulatorTablesStrings.POST = "POST".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.POST]
  }
  
  @js.native
  trait ImageParams extends _FormatterParams {
    
    // Image
    var height: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object ImageParams {
    
    @scala.inline
    def apply(): ImageParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageParams]
    }
    
    @scala.inline
    implicit class ImageParamsMutableBuilder[Self <: ImageParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait InputParams
    extends SharedEditorParams
       with _EditorParams {
    
    /**Changes input type to 'search' and shows an 'X' clear button to clear the cell value easily */
    var search: js.UndefOr[Boolean] = js.native
  }
  object InputParams {
    
    @scala.inline
    def apply(): InputParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputParams]
    }
    
    @scala.inline
    implicit class InputParamsMutableBuilder[Self <: InputParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  type JSONRecord = Record[String, String | Double | Boolean]
  
  @js.native
  trait KeyBinding extends StObject {
    
    var copyToClipboard: js.UndefOr[String | Boolean] = js.native
    
    var navDown: js.UndefOr[String | Boolean] = js.native
    
    var navLeft: js.UndefOr[String | Boolean] = js.native
    
    var navNext: js.UndefOr[String | Boolean] = js.native
    
    var navPrev: js.UndefOr[String | Boolean] = js.native
    
    var navRight: js.UndefOr[String | Boolean] = js.native
    
    var navUp: js.UndefOr[String | Boolean] = js.native
    
    var redo: js.UndefOr[String | Boolean] = js.native
    
    var scrollPageDown: js.UndefOr[String | Boolean] = js.native
    
    var scrollPageUp: js.UndefOr[String | Boolean] = js.native
    
    var scrollToEnd: js.UndefOr[String | Boolean] = js.native
    
    var scrollToStart: js.UndefOr[String | Boolean] = js.native
    
    var undo: js.UndefOr[String | Boolean] = js.native
  }
  object KeyBinding {
    
    @scala.inline
    def apply(): KeyBinding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyBinding]
    }
    
    @scala.inline
    implicit class KeyBindingMutableBuilder[Self <: KeyBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyToClipboard(value: String | Boolean): Self = StObject.set(x, "copyToClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyToClipboardUndefined: Self = StObject.set(x, "copyToClipboard", js.undefined)
      
      @scala.inline
      def setNavDown(value: String | Boolean): Self = StObject.set(x, "navDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavDownUndefined: Self = StObject.set(x, "navDown", js.undefined)
      
      @scala.inline
      def setNavLeft(value: String | Boolean): Self = StObject.set(x, "navLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavLeftUndefined: Self = StObject.set(x, "navLeft", js.undefined)
      
      @scala.inline
      def setNavNext(value: String | Boolean): Self = StObject.set(x, "navNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavNextUndefined: Self = StObject.set(x, "navNext", js.undefined)
      
      @scala.inline
      def setNavPrev(value: String | Boolean): Self = StObject.set(x, "navPrev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavPrevUndefined: Self = StObject.set(x, "navPrev", js.undefined)
      
      @scala.inline
      def setNavRight(value: String | Boolean): Self = StObject.set(x, "navRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavRightUndefined: Self = StObject.set(x, "navRight", js.undefined)
      
      @scala.inline
      def setNavUp(value: String | Boolean): Self = StObject.set(x, "navUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavUpUndefined: Self = StObject.set(x, "navUp", js.undefined)
      
      @scala.inline
      def setRedo(value: String | Boolean): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
      
      @scala.inline
      def setScrollPageDown(value: String | Boolean): Self = StObject.set(x, "scrollPageDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPageDownUndefined: Self = StObject.set(x, "scrollPageDown", js.undefined)
      
      @scala.inline
      def setScrollPageUp(value: String | Boolean): Self = StObject.set(x, "scrollPageUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPageUpUndefined: Self = StObject.set(x, "scrollPageUp", js.undefined)
      
      @scala.inline
      def setScrollToEnd(value: String | Boolean): Self = StObject.set(x, "scrollToEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToEndUndefined: Self = StObject.set(x, "scrollToEnd", js.undefined)
      
      @scala.inline
      def setScrollToStart(value: String | Boolean): Self = StObject.set(x, "scrollToStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToStartUndefined: Self = StObject.set(x, "scrollToStart", js.undefined)
      
      @scala.inline
      def setUndo(value: String | Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    }
  }
  
  @js.native
  trait LinkParams extends _FormatterParams {
    
    var download: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | (js.Function1[/* cell */ CellComponent, String])] = js.native
    
    // Link
    var labelField: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var urlField: js.UndefOr[String] = js.native
    
    var urlPrefix: js.UndefOr[String] = js.native
  }
  object LinkParams {
    
    @scala.inline
    def apply(): LinkParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkParams]
    }
    
    @scala.inline
    implicit class LinkParamsMutableBuilder[Self <: LinkParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setLabel(value: String | (js.Function1[/* cell */ CellComponent, String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
      
      @scala.inline
      def setLabelFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlField(value: String): Self = StObject.set(x, "urlField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFieldUndefined: Self = StObject.set(x, "urlField", js.undefined)
      
      @scala.inline
      def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait MenuObject[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */] extends StObject {
    
    def action(e: js.Any, component: T): js.Any = js.native
    
    var disabled: js.UndefOr[Boolean | (js.Function1[/* component */ T, Boolean])] = js.native
    
    var label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement]) = js.native
  }
  object MenuObject {
    
    @scala.inline
    def apply[T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */](
      action: (js.Any, T) => js.Any,
      label: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])
    ): MenuObject[T] = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuObject[T]]
    }
    
    @scala.inline
    implicit class MenuObjectMutableBuilder[Self <: MenuObject[_], T /* <: RowComponent | CellComponent | ColumnComponent | GroupComponent */] (val x: Self with MenuObject[T]) extends AnyVal {
      
      @scala.inline
      def setAction(value: (js.Any, T) => js.Any): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisabled(value: Boolean | (js.Function1[/* component */ T, Boolean])): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledFunction1(value: /* component */ T => Boolean): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String | HTMLElement | (js.Function1[/* component */ T, String | HTMLElement])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction1(value: /* component */ T => String | HTMLElement): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MenuSeparator extends StObject {
    
    var separator: js.UndefOr[Boolean] = js.native
  }
  object MenuSeparator {
    
    @scala.inline
    def apply(): MenuSeparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuSeparator]
    }
    
    @scala.inline
    implicit class MenuSeparatorMutableBuilder[Self <: MenuSeparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  @js.native
  trait MoneyParams extends _FormatterParams {
    
    // Money
    var decimal: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[Boolean | Double] = js.native
    
    var symbol: js.UndefOr[String] = js.native
    
    var symbolAfter: js.UndefOr[Boolean] = js.native
    
    var thousand: js.UndefOr[String] = js.native
  }
  object MoneyParams {
    
    @scala.inline
    def apply(): MoneyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoneyParams]
    }
    
    @scala.inline
    implicit class MoneyParamsMutableBuilder[Self <: MoneyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setPrecision(value: Boolean | Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolAfter(value: Boolean): Self = StObject.set(x, "symbolAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolAfterUndefined: Self = StObject.set(x, "symbolAfter", js.undefined)
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
    }
  }
  
  @js.native
  trait NumberParams
    extends SharedEditorParams
       with _EditorParams {
    
    var max: js.UndefOr[Double] = js.native
    
    // range,number
    var min: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var verticalNavigation: js.UndefOr[editor | table] = js.native
  }
  object NumberParams {
    
    @scala.inline
    def apply(): NumberParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberParams]
    }
    
    @scala.inline
    implicit class NumberParamsMutableBuilder[Self <: NumberParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setVerticalNavigation(value: editor | table): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tabulatorTables.Tabulator.OptionsCell because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined cellHozAlign, cellVertAlign */ @js.native
  trait Options
    extends OptionsCells
       with OptionsGeneral
       with OptionsMenu
       with OptionsHistory
       with OptionsLocale
       with OptionsDownload
       with OptionsColumns
       with OptionsRows
       with OptionsData
       with OptionsSorting
       with OptionsFiltering
       with OptionsRowGrouping
       with OptionsPagination
       with OptionsPersistentConfiguration
       with OptionsClipboard
       with OptionsDataTree
       with OptionsHTML {
    
    var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
    
    var cellVertAlign: js.UndefOr[VerticalAlign] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "cellHozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHozAlignUndefined: Self = StObject.set(x, "cellHozAlign", js.undefined)
      
      @scala.inline
      def setCellVertAlign(value: VerticalAlign): Self = StObject.set(x, "cellVertAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellVertAlignUndefined: Self = StObject.set(x, "cellVertAlign", js.undefined)
    }
  }
  
  @js.native
  trait OptionsCell extends StObject {
    
    /** The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object. */
    var cellClick: js.UndefOr[CellEventCallback] = js.native
    
    var cellContext: js.UndefOr[CellEventCallback] = js.native
    
    var cellDblClick: js.UndefOr[CellEventCallback] = js.native
    
    var cellDblTap: js.UndefOr[CellEventCallback] = js.native
    
    var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
    
    var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
    
    var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
    
    var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
    
    var cellTap: js.UndefOr[CellEventCallback] = js.native
    
    var cellTapHold: js.UndefOr[CellEventCallback] = js.native
    
    var cellVertAlign: js.UndefOr[VerticalAlign] = js.native
  }
  object OptionsCell {
    
    @scala.inline
    def apply(): OptionsCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsCell]
    }
    
    @scala.inline
    implicit class OptionsCellMutableBuilder[Self <: OptionsCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellContextUndefined: Self = StObject.set(x, "cellContext", js.undefined)
      
      @scala.inline
      def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblClickUndefined: Self = StObject.set(x, "cellDblClick", js.undefined)
      
      @scala.inline
      def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellDblTapUndefined: Self = StObject.set(x, "cellDblTap", js.undefined)
      
      @scala.inline
      def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditCancelledUndefined: Self = StObject.set(x, "cellEditCancelled", js.undefined)
      
      @scala.inline
      def setCellEdited(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditedUndefined: Self = StObject.set(x, "cellEdited", js.undefined)
      
      @scala.inline
      def setCellEditing(value: /* cell */ CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellEditingUndefined: Self = StObject.set(x, "cellEditing", js.undefined)
      
      @scala.inline
      def setCellHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "cellHozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellHozAlignUndefined: Self = StObject.set(x, "cellHozAlign", js.undefined)
      
      @scala.inline
      def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseEnterUndefined: Self = StObject.set(x, "cellMouseEnter", js.undefined)
      
      @scala.inline
      def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseLeaveUndefined: Self = StObject.set(x, "cellMouseLeave", js.undefined)
      
      @scala.inline
      def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseMoveUndefined: Self = StObject.set(x, "cellMouseMove", js.undefined)
      
      @scala.inline
      def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOutUndefined: Self = StObject.set(x, "cellMouseOut", js.undefined)
      
      @scala.inline
      def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellMouseOverUndefined: Self = StObject.set(x, "cellMouseOver", js.undefined)
      
      @scala.inline
      def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellTapHoldUndefined: Self = StObject.set(x, "cellTapHold", js.undefined)
      
      @scala.inline
      def setCellTapUndefined: Self = StObject.set(x, "cellTap", js.undefined)
      
      @scala.inline
      def setCellVertAlign(value: VerticalAlign): Self = StObject.set(x, "cellVertAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellVertAlignUndefined: Self = StObject.set(x, "cellVertAlign", js.undefined)
    }
  }
  
  @js.native
  trait OptionsCells extends CellCallbacks {
    
    /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
    var validationFailed: js.UndefOr[
        js.Function3[
          /* cell */ CellComponent, 
          /* value */ js.Any, 
          /* validators */ js.Array[StandardValidatorType | Validator], 
          Unit
        ]
      ] = js.native
  }
  object OptionsCells {
    
    @scala.inline
    def apply(): OptionsCells = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsCells]
    }
    
    @scala.inline
    implicit class OptionsCellsMutableBuilder[Self <: OptionsCells] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidationFailed(
        value: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit
      ): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidationFailedUndefined: Self = StObject.set(x, "validationFailed", js.undefined)
    }
  }
  
  @js.native
  trait OptionsClipboard extends StObject {
    
    /** You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
      true - enable clipboard copy and paste
      "copy" - enable only copy functionality
      "paste" - enable only paste functionality
      false - disable all clipboard functionality (default) */
    var clipboard: js.UndefOr[Boolean | copy | paste] = js.native
    
    /** The clipboardCopied event is triggered whenever data is copied to the clipboard. */
    var clipboardCopied: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** By default Tabulator includes column headers, row groups and column calculations in the clipboard output.
      You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the clipboardCopyConfig option in the table definition: */
    var clipboardCopyConfig: js.UndefOr[AddditionalExportOptions | Boolean] = js.native
    
    /**You can alter the finished output to the clipboard using the clipboardCopyFormatter callback. The callback function receives two arguments, the first is a string representing the type of content to be formatted (either "plain" or "html" depending on the type of data entering the clipboard). The second argument is the string that is about to be insered into the clipboard. The function and should return a string that will be inserted into the clipboard */
    var clipboardCopyFormatter: js.UndefOr[table | (js.Function2[/* type */ plain | html, /* output */ String, String])] = js.native
    
    /** By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property: */
    var clipboardCopyHeader: js.UndefOr[Boolean] = js.native
    
    /**The clipboardCopyRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the clipboard output: */
    var clipboardCopyRowRange: js.UndefOr[RowRangeLookup] = js.native
    
    /** By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
      If you want to only copy the unstyled data then you should set the clipboardCopyStyled option to false in the table options object:  */
    var clipboardCopyStyled: js.UndefOr[Boolean] = js.native
    
    /** Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
      insert - Inserts data into the table using the addRows function (default)
      update - Updates data in the table using the updateOrAddData function
      replace - replaces all data in the table using the setData function */
    var clipboardPasteAction: js.UndefOr[insert | update | replace] = js.native
    
    /** The clipboardPasteError event is triggered whenever an atempt to paste data into the table has failed because it was rejected by the paste parser. */
    var clipboardPasteError: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**  Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the tada into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
      It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
      The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
      If you extend the clipboard module to add your own parser, you can set it to be used as default with the clipboardPasteParser property.*/
    var clipboardPasteParser: js.UndefOr[String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])] = js.native
    
    /** The clipboardPasted event is triggered whenever data is successfuly pasted into the table. */
    var clipboardPasted: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**When copying to clipboard you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderClipboard table option, which takes the same inputs as the standard groupHeader property. */
    var groupHeaderClipboard: js.UndefOr[
        (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ] = js.native
    
    /**When the getHtml function is called you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderHtmlOutput table option, which takes the same inputs as the standard groupHeader property. */
    var groupHeaderHtmlOutput: js.UndefOr[
        (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ] = js.native
  }
  object OptionsClipboard {
    
    @scala.inline
    def apply(): OptionsClipboard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsClipboard]
    }
    
    @scala.inline
    implicit class OptionsClipboardMutableBuilder[Self <: OptionsClipboard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClipboard(value: Boolean | copy | paste): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopied(value: () => Unit): Self = StObject.set(x, "clipboardCopied", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClipboardCopiedUndefined: Self = StObject.set(x, "clipboardCopied", js.undefined)
      
      @scala.inline
      def setClipboardCopyConfig(value: AddditionalExportOptions | Boolean): Self = StObject.set(x, "clipboardCopyConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopyConfigUndefined: Self = StObject.set(x, "clipboardCopyConfig", js.undefined)
      
      @scala.inline
      def setClipboardCopyFormatter(value: table | (js.Function2[/* type */ plain | html, /* output */ String, String])): Self = StObject.set(x, "clipboardCopyFormatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopyFormatterFunction2(value: (/* type */ plain | html, /* output */ String) => String): Self = StObject.set(x, "clipboardCopyFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClipboardCopyFormatterUndefined: Self = StObject.set(x, "clipboardCopyFormatter", js.undefined)
      
      @scala.inline
      def setClipboardCopyHeader(value: Boolean): Self = StObject.set(x, "clipboardCopyHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopyHeaderUndefined: Self = StObject.set(x, "clipboardCopyHeader", js.undefined)
      
      @scala.inline
      def setClipboardCopyRowRange(value: RowRangeLookup): Self = StObject.set(x, "clipboardCopyRowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopyRowRangeUndefined: Self = StObject.set(x, "clipboardCopyRowRange", js.undefined)
      
      @scala.inline
      def setClipboardCopyStyled(value: Boolean): Self = StObject.set(x, "clipboardCopyStyled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardCopyStyledUndefined: Self = StObject.set(x, "clipboardCopyStyled", js.undefined)
      
      @scala.inline
      def setClipboardPasteAction(value: insert | update | replace): Self = StObject.set(x, "clipboardPasteAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardPasteActionUndefined: Self = StObject.set(x, "clipboardPasteAction", js.undefined)
      
      @scala.inline
      def setClipboardPasteError(value: () => Unit): Self = StObject.set(x, "clipboardPasteError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClipboardPasteErrorUndefined: Self = StObject.set(x, "clipboardPasteError", js.undefined)
      
      @scala.inline
      def setClipboardPasteParser(value: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]])): Self = StObject.set(x, "clipboardPasteParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardPasteParserFunction1(value: /* clipboard */ js.Any => js.Array[_]): Self = StObject.set(x, "clipboardPasteParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClipboardPasteParserUndefined: Self = StObject.set(x, "clipboardPasteParser", js.undefined)
      
      @scala.inline
      def setClipboardPasted(value: () => Unit): Self = StObject.set(x, "clipboardPasted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClipboardPastedUndefined: Self = StObject.set(x, "clipboardPasted", js.undefined)
      
      @scala.inline
      def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      @scala.inline
      def setGroupHeaderClipboard(
        value: (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              String
            ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ): Self = StObject.set(x, "groupHeaderClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderClipboardFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
      ): Self = StObject.set(x, "groupHeaderClipboard", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupHeaderClipboardUndefined: Self = StObject.set(x, "groupHeaderClipboard", js.undefined)
      
      @scala.inline
      def setGroupHeaderClipboardVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = StObject.set(x, "groupHeaderClipboard", js.Array(value :_*))
      
      @scala.inline
      def setGroupHeaderHtmlOutput(
        value: (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              String
            ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ): Self = StObject.set(x, "groupHeaderHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderHtmlOutputFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
      ): Self = StObject.set(x, "groupHeaderHtmlOutput", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupHeaderHtmlOutputUndefined: Self = StObject.set(x, "groupHeaderHtmlOutput", js.undefined)
      
      @scala.inline
      def setGroupHeaderHtmlOutputVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = StObject.set(x, "groupHeaderHtmlOutput", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionsColumns extends StObject {
    
    /**
      * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data.
      */
    var autoColumns: js.UndefOr[Boolean] = js.native
    
    var autoColumnsDefinitions: js.UndefOr[
        (js.Function1[
          /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]], 
          js.Array[ColumnDefinition]
        ]) | js.Array[ColumnDefinition] | (Record[String, PartialColumnDefinition])
      ] = js.native
    
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
    
    var headerHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
    
    /** The headerSort option can now be set in the table options to affect all columns as well as in column definitions. */
    var headerSort: js.UndefOr[Boolean] = js.native
    
    var headerSortElement: js.UndefOr[String] = js.native
    
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
    implicit class OptionsColumnsMutableBuilder[Self <: OptionsColumns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoColumns(value: Boolean): Self = StObject.set(x, "autoColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoColumnsDefinitions(
        value: (js.Function1[
              /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]], 
              js.Array[ColumnDefinition]
            ]) | js.Array[ColumnDefinition] | (Record[String, PartialColumnDefinition])
      ): Self = StObject.set(x, "autoColumnsDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoColumnsDefinitionsFunction1(
        value: /* columnDefinitions */ js.UndefOr[js.Array[ColumnDefinition]] => js.Array[ColumnDefinition]
      ): Self = StObject.set(x, "autoColumnsDefinitions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutoColumnsDefinitionsUndefined: Self = StObject.set(x, "autoColumnsDefinitions", js.undefined)
      
      @scala.inline
      def setAutoColumnsDefinitionsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "autoColumnsDefinitions", js.Array(value :_*))
      
      @scala.inline
      def setAutoColumnsUndefined: Self = StObject.set(x, "autoColumns", js.undefined)
      
      @scala.inline
      def setColumnCalcs(value: Boolean | both | table | group): Self = StObject.set(x, "columnCalcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCalcsUndefined: Self = StObject.set(x, "columnCalcs", js.undefined)
      
      @scala.inline
      def setColumnHeaderSortMulti(value: Boolean): Self = StObject.set(x, "columnHeaderSortMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderSortMultiUndefined: Self = StObject.set(x, "columnHeaderSortMulti", js.undefined)
      
      @scala.inline
      def setColumnHeaderVertAlign(value: VerticalAlign): Self = StObject.set(x, "columnHeaderVertAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnHeaderVertAlignUndefined: Self = StObject.set(x, "columnHeaderVertAlign", js.undefined)
      
      @scala.inline
      def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMinWidthUndefined: Self = StObject.set(x, "columnMinWidth", js.undefined)
      
      @scala.inline
      def setColumnMoved(value: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => Unit): Self = StObject.set(x, "columnMoved", js.Any.fromFunction2(value))
      
      @scala.inline
      def setColumnMovedUndefined: Self = StObject.set(x, "columnMoved", js.undefined)
      
      @scala.inline
      def setColumnResized(value: /* column */ ColumnComponent => Unit): Self = StObject.set(x, "columnResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnResizedUndefined: Self = StObject.set(x, "columnResized", js.undefined)
      
      @scala.inline
      def setColumnTitleChanged(value: /* column */ ColumnComponent => Unit): Self = StObject.set(x, "columnTitleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColumnTitleChangedUndefined: Self = StObject.set(x, "columnTitleChanged", js.undefined)
      
      @scala.inline
      def setColumnVisibilityChanged(value: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setColumnVisibilityChangedUndefined: Self = StObject.set(x, "columnVisibilityChanged", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnDefinition]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setHeaderFilterPlaceholder(value: String): Self = StObject.set(x, "headerFilterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterPlaceholderUndefined: Self = StObject.set(x, "headerFilterPlaceholder", js.undefined)
      
      @scala.inline
      def setHeaderHozAlign(value: ColumnDefinitionAlign): Self = StObject.set(x, "headerHozAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHozAlignUndefined: Self = StObject.set(x, "headerHozAlign", js.undefined)
      
      @scala.inline
      def setHeaderSort(value: Boolean): Self = StObject.set(x, "headerSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortElement(value: String): Self = StObject.set(x, "headerSortElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortElementUndefined: Self = StObject.set(x, "headerSortElement", js.undefined)
      
      @scala.inline
      def setHeaderSortTristate(value: Boolean): Self = StObject.set(x, "headerSortTristate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSortTristateUndefined: Self = StObject.set(x, "headerSortTristate", js.undefined)
      
      @scala.inline
      def setHeaderSortUndefined: Self = StObject.set(x, "headerSort", js.undefined)
      
      @scala.inline
      def setHeaderVisible(value: Boolean): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
      
      @scala.inline
      def setLayout(value: fitData | fitColumns | fitDataFill | fitDataStretch | fitDataTable): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutColumnsOnNewData(value: Boolean): Self = StObject.set(x, "layoutColumnsOnNewData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutColumnsOnNewDataUndefined: Self = StObject.set(x, "layoutColumnsOnNewData", js.undefined)
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMovableColumns(value: Boolean): Self = StObject.set(x, "movableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableColumnsUndefined: Self = StObject.set(x, "movableColumns", js.undefined)
      
      @scala.inline
      def setNestedFieldSeparator(value: String | Boolean): Self = StObject.set(x, "nestedFieldSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedFieldSeparatorUndefined: Self = StObject.set(x, "nestedFieldSeparator", js.undefined)
      
      @scala.inline
      def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setResizableColumns(value: `true` | `false` | header | cell): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
      
      @scala.inline
      def setResponsiveLayout(value: Boolean | hide | collapse): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveLayoutCollapseFormatter(value: /* data */ js.Array[_] => _): Self = StObject.set(x, "responsiveLayoutCollapseFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponsiveLayoutCollapseFormatterUndefined: Self = StObject.set(x, "responsiveLayoutCollapseFormatter", js.undefined)
      
      @scala.inline
      def setResponsiveLayoutCollapseStartOpen(value: Boolean): Self = StObject.set(x, "responsiveLayoutCollapseStartOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveLayoutCollapseStartOpenUndefined: Self = StObject.set(x, "responsiveLayoutCollapseStartOpen", js.undefined)
      
      @scala.inline
      def setResponsiveLayoutCollapseUseFormatters(value: Boolean): Self = StObject.set(x, "responsiveLayoutCollapseUseFormatters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveLayoutCollapseUseFormattersUndefined: Self = StObject.set(x, "responsiveLayoutCollapseUseFormatters", js.undefined)
      
      @scala.inline
      def setResponsiveLayoutUndefined: Self = StObject.set(x, "responsiveLayout", js.undefined)
      
      @scala.inline
      def setScrollToColumnIfVisible(value: Boolean): Self = StObject.set(x, "scrollToColumnIfVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumnIfVisibleUndefined: Self = StObject.set(x, "scrollToColumnIfVisible", js.undefined)
      
      @scala.inline
      def setScrollToColumnPosition(value: ScrollToColumnPosition): Self = StObject.set(x, "scrollToColumnPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToColumnPositionUndefined: Self = StObject.set(x, "scrollToColumnPosition", js.undefined)
      
      @scala.inline
      def setTooltipsHeader(value: Boolean): Self = StObject.set(x, "tooltipsHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsHeaderUndefined: Self = StObject.set(x, "tooltipsHeader", js.undefined)
    }
  }
  
  @js.native
  trait OptionsData extends StObject {
    
    /** The HTTP request type for Ajax requests or config object for the request     */
    var ajaxConfig: js.UndefOr[HttpMethod | AjaxConfig] = js.native
    
    /** When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers. * * The ajaxContentType option can take one of two values:
      "form" - send parameters as form data (default option)
      "json" - send parameters as JSON encoded string
      If you want to use a custom content type then you can pass a content type formatter object into the ajaxContentType option. this object must have two properties, the headers property should contain all headers that should be sent with the request and the body property should contain a function that returns the body content of the request
      */
    var ajaxContentType: js.UndefOr[form | json | AjaxContentType] = js.native
    
    /** The ajaxError callback is triggered there is an error response to an ajax request. */
    var ajaxError: js.UndefOr[
        js.Function3[/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any, Unit]
      ] = js.native
    
    /** Send filter config to server instead of processing locally     */
    var ajaxFiltering: js.UndefOr[Boolean] = js.native
    
    /** Show loader while data is loading, can also take a function that must return a boolean     */
    var ajaxLoader: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
    /** html for the loader element in the event of an error     */
    var ajaxLoaderError: js.UndefOr[String] = js.native
    
    /** html for loader element     */
    var ajaxLoaderLoading: js.UndefOr[String] = js.native
    
    /** Parameters to be passed to remote Ajax data loading request     */
    var ajaxParams: js.UndefOr[js.Object] = js.native
    
    /** If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
      To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reusues the functionality of the pagination module to sequentially load the data.
      With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
      There are two different progressive loading modes, to give you a choice of how data is loaded into the table.     */
    var ajaxProgressiveLoad: js.UndefOr[load | scroll] = js.native
    
    /** By default tabulator will make the requests to fill the table as quickly as possible. On some servers these repeates requests from the same client may trigger rate limiting or security systems. In this case you can use the ajaxProgressiveLoadDelay option to add a delay in milliseconds between each page request. */
    var ajaxProgressiveLoadDelay: js.UndefOr[Double] = js.native
    
    /** The ajaxProgressiveLoadScrollMargin property determines how close to the bottom of the table in pixels, the scroll bar must be before the next page worth of data is loaded, by default it is set to twice the height of the table. */
    var ajaxProgressiveLoadScrollMargin: js.UndefOr[Double] = js.native
    
    /** callback function to replace inbuilt ajax request functionality     */
    var ajaxRequestFunc: js.UndefOr[
        js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, js.Promise[_]]
      ] = js.native
    
    /** The ajaxRequesting callback is triggered when ever an ajax request is made. */
    var ajaxRequesting: js.UndefOr[js.Function2[/* url */ String, /* params */ js.Any, Boolean]] = js.native
    
    /** The ajaxResponse callback is triggered when a successful ajax request has been made. This callback can also be used to modify the received data before it is parsed by the table. If you use this callback it must return the data to be parsed by Tabulator, otherwise no data will be rendered */
    var ajaxResponse: js.UndefOr[js.Function3[/* url */ String, /* params */ js.Any, /* response */ js.Any, _]] = js.native
    
    /** Send sorter config to server instead of processing locally     */
    var ajaxSorting: js.UndefOr[Boolean] = js.native
    
    /** If you wish to retrieve your data from a remote source you can set the URL for the request in the ajaxURL option. */
    var ajaxURL: js.UndefOr[String] = js.native
    
    /** If you need more control over the url of the request that you can get from the ajaxURL and ajaxParams properties, the you can use the ajaxURLGenerator property to pass in a callback that will generate the URL for you.
      The callback should return a string representing the URL to be requested. */
    var ajaxURLGenerator: js.UndefOr[js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, String]] = js.native
    
    /** Array to hold data that should be loaded on table creation     */
    var data: js.UndefOr[js.Array[_]] = js.native
    
    /** A unique index value should be present for each row of data if you want to be able to programatically alter that data at a later point, this should be either numeric or a string. By default Tabulator will look for this value in the id field for the data. If you wish to use a different field as the index, set this using the index option parameter. */
    var index: js.UndefOr[Double | String] = js.native
  }
  object OptionsData {
    
    @scala.inline
    def apply(): OptionsData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsData]
    }
    
    @scala.inline
    implicit class OptionsDataMutableBuilder[Self <: OptionsData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxConfig(value: HttpMethod | AjaxConfig): Self = StObject.set(x, "ajaxConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxConfigUndefined: Self = StObject.set(x, "ajaxConfig", js.undefined)
      
      @scala.inline
      def setAjaxContentType(value: form | json | AjaxContentType): Self = StObject.set(x, "ajaxContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxContentTypeUndefined: Self = StObject.set(x, "ajaxContentType", js.undefined)
      
      @scala.inline
      def setAjaxError(value: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
      
      @scala.inline
      def setAjaxFiltering(value: Boolean): Self = StObject.set(x, "ajaxFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxFilteringUndefined: Self = StObject.set(x, "ajaxFiltering", js.undefined)
      
      @scala.inline
      def setAjaxLoader(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "ajaxLoader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxLoaderError(value: String): Self = StObject.set(x, "ajaxLoaderError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxLoaderErrorUndefined: Self = StObject.set(x, "ajaxLoaderError", js.undefined)
      
      @scala.inline
      def setAjaxLoaderFunction0(value: () => Boolean): Self = StObject.set(x, "ajaxLoader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAjaxLoaderLoading(value: String): Self = StObject.set(x, "ajaxLoaderLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxLoaderLoadingUndefined: Self = StObject.set(x, "ajaxLoaderLoading", js.undefined)
      
      @scala.inline
      def setAjaxLoaderUndefined: Self = StObject.set(x, "ajaxLoader", js.undefined)
      
      @scala.inline
      def setAjaxParams(value: js.Object): Self = StObject.set(x, "ajaxParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxParamsUndefined: Self = StObject.set(x, "ajaxParams", js.undefined)
      
      @scala.inline
      def setAjaxProgressiveLoad(value: load | scroll): Self = StObject.set(x, "ajaxProgressiveLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxProgressiveLoadDelay(value: Double): Self = StObject.set(x, "ajaxProgressiveLoadDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxProgressiveLoadDelayUndefined: Self = StObject.set(x, "ajaxProgressiveLoadDelay", js.undefined)
      
      @scala.inline
      def setAjaxProgressiveLoadScrollMargin(value: Double): Self = StObject.set(x, "ajaxProgressiveLoadScrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxProgressiveLoadScrollMarginUndefined: Self = StObject.set(x, "ajaxProgressiveLoadScrollMargin", js.undefined)
      
      @scala.inline
      def setAjaxProgressiveLoadUndefined: Self = StObject.set(x, "ajaxProgressiveLoad", js.undefined)
      
      @scala.inline
      def setAjaxRequestFunc(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_]): Self = StObject.set(x, "ajaxRequestFunc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAjaxRequestFuncUndefined: Self = StObject.set(x, "ajaxRequestFunc", js.undefined)
      
      @scala.inline
      def setAjaxRequesting(value: (/* url */ String, /* params */ js.Any) => Boolean): Self = StObject.set(x, "ajaxRequesting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAjaxRequestingUndefined: Self = StObject.set(x, "ajaxRequesting", js.undefined)
      
      @scala.inline
      def setAjaxResponse(value: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => _): Self = StObject.set(x, "ajaxResponse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAjaxResponseUndefined: Self = StObject.set(x, "ajaxResponse", js.undefined)
      
      @scala.inline
      def setAjaxSorting(value: Boolean): Self = StObject.set(x, "ajaxSorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxSortingUndefined: Self = StObject.set(x, "ajaxSorting", js.undefined)
      
      @scala.inline
      def setAjaxURL(value: String): Self = StObject.set(x, "ajaxURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxURLGenerator(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => String): Self = StObject.set(x, "ajaxURLGenerator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAjaxURLGeneratorUndefined: Self = StObject.set(x, "ajaxURLGenerator", js.undefined)
      
      @scala.inline
      def setAjaxURLUndefined: Self = StObject.set(x, "ajaxURL", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  @js.native
  trait OptionsDataTree extends StObject {
    
    /** To enable data trees in your table, set the dataTree property to true in your table constructor: */
    var dataTree: js.UndefOr[Boolean] = js.native
    
    /** Show tree branch icon     */
    var dataTreeBranchElement: js.UndefOr[Boolean | String] = js.native
    
    /** By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor: */
    var dataTreeChildField: js.UndefOr[String] = js.native
    
    /** Tree level indent in pixels     */
    var dataTreeChildIndent: js.UndefOr[Double] = js.native
    
    /** The toggle button that allows users to collapse and expand the column can be customised to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
      Both options can take either an html string representing the contents of the toggle element */
    var dataTreeCollapseElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
    
    /**  By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the feild name of the column to the dataTreeElementColumn setup option*/
    var dataTreeElementColumn: js.UndefOr[Boolean | String] = js.native
    
    /** The toggle button that allows users to expand the column */
    var dataTreeExpandElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
    
    var dataTreeFilter: js.UndefOr[Boolean] = js.native
    
    /**Propagte selection events from parent rows to children */
    var dataTreeSelectPropagate: js.UndefOr[Boolean] = js.native
    
    var dataTreeSort: js.UndefOr[Boolean] = js.native
    
    /**  By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.*
      This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed: */
    var dataTreeStartExpanded: js.UndefOr[
        Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
      ] = js.native
  }
  object OptionsDataTree {
    
    @scala.inline
    def apply(): OptionsDataTree = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsDataTree]
    }
    
    @scala.inline
    implicit class OptionsDataTreeMutableBuilder[Self <: OptionsDataTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataTree(value: Boolean): Self = StObject.set(x, "dataTree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeBranchElement(value: Boolean | String): Self = StObject.set(x, "dataTreeBranchElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeBranchElementUndefined: Self = StObject.set(x, "dataTreeBranchElement", js.undefined)
      
      @scala.inline
      def setDataTreeChildField(value: String): Self = StObject.set(x, "dataTreeChildField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeChildFieldUndefined: Self = StObject.set(x, "dataTreeChildField", js.undefined)
      
      @scala.inline
      def setDataTreeChildIndent(value: Double): Self = StObject.set(x, "dataTreeChildIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeChildIndentUndefined: Self = StObject.set(x, "dataTreeChildIndent", js.undefined)
      
      @scala.inline
      def setDataTreeCollapseElement(value: String | HTMLElement | Boolean): Self = StObject.set(x, "dataTreeCollapseElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeCollapseElementUndefined: Self = StObject.set(x, "dataTreeCollapseElement", js.undefined)
      
      @scala.inline
      def setDataTreeElementColumn(value: Boolean | String): Self = StObject.set(x, "dataTreeElementColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeElementColumnUndefined: Self = StObject.set(x, "dataTreeElementColumn", js.undefined)
      
      @scala.inline
      def setDataTreeExpandElement(value: String | HTMLElement | Boolean): Self = StObject.set(x, "dataTreeExpandElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeExpandElementUndefined: Self = StObject.set(x, "dataTreeExpandElement", js.undefined)
      
      @scala.inline
      def setDataTreeFilter(value: Boolean): Self = StObject.set(x, "dataTreeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeFilterUndefined: Self = StObject.set(x, "dataTreeFilter", js.undefined)
      
      @scala.inline
      def setDataTreeSelectPropagate(value: Boolean): Self = StObject.set(x, "dataTreeSelectPropagate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeSelectPropagateUndefined: Self = StObject.set(x, "dataTreeSelectPropagate", js.undefined)
      
      @scala.inline
      def setDataTreeSort(value: Boolean): Self = StObject.set(x, "dataTreeSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeSortUndefined: Self = StObject.set(x, "dataTreeSort", js.undefined)
      
      @scala.inline
      def setDataTreeStartExpanded(
        value: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
      ): Self = StObject.set(x, "dataTreeStartExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTreeStartExpandedFunction2(value: (/* row */ RowComponent, /* level */ Double) => Boolean): Self = StObject.set(x, "dataTreeStartExpanded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataTreeStartExpandedUndefined: Self = StObject.set(x, "dataTreeStartExpanded", js.undefined)
      
      @scala.inline
      def setDataTreeStartExpandedVarargs(value: Boolean*): Self = StObject.set(x, "dataTreeStartExpanded", js.Array(value :_*))
      
      @scala.inline
      def setDataTreeUndefined: Self = StObject.set(x, "dataTree", js.undefined)
    }
  }
  
  @js.native
  trait OptionsDownload extends StObject {
    
    /** The downloadComplete callback is triggered when the user has been prompted to download the file. */
    var downloadComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** By default Tabulator includes column headers, row groups and column calculations in the download output.
      You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition: */
    var downloadConfig: js.UndefOr[AddditionalExportOptions] = js.native
    
    /** The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
      In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
      If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file. */
    var downloadReady: js.UndefOr[js.Function2[/* fileContents */ js.Any, /* blob */ js.Any, _]] = js.native
    
    /**By deafault, only the active rows (rows that have passed filtering) will be included in the download the downloadRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the download output */
    var downloadRowRange: js.UndefOr[RowRangeLookup] = js.native
  }
  object OptionsDownload {
    
    @scala.inline
    def apply(): OptionsDownload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsDownload]
    }
    
    @scala.inline
    implicit class OptionsDownloadMutableBuilder[Self <: OptionsDownload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadComplete(value: () => Unit): Self = StObject.set(x, "downloadComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDownloadCompleteUndefined: Self = StObject.set(x, "downloadComplete", js.undefined)
      
      @scala.inline
      def setDownloadConfig(value: AddditionalExportOptions): Self = StObject.set(x, "downloadConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadConfigUndefined: Self = StObject.set(x, "downloadConfig", js.undefined)
      
      @scala.inline
      def setDownloadReady(value: (/* fileContents */ js.Any, /* blob */ js.Any) => _): Self = StObject.set(x, "downloadReady", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDownloadReadyUndefined: Self = StObject.set(x, "downloadReady", js.undefined)
      
      @scala.inline
      def setDownloadRowRange(value: RowRangeLookup): Self = StObject.set(x, "downloadRowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRowRangeUndefined: Self = StObject.set(x, "downloadRowRange", js.undefined)
    }
  }
  
  @js.native
  trait OptionsFiltering extends StObject {
    
    /** The dataFiltered callback is triggered after the table dataset is filtered. */
    var dataFiltered: js.UndefOr[
        js.Function2[/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent], Unit]
      ] = js.native
    
    /** The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens. */
    var dataFiltering: js.UndefOr[js.Function1[/* filters */ js.Array[Filter], Unit]] = js.native
    
    /**When using real time header filtering, Tabulator will wait 300 miliseconds after a keystroke before triggering the filter. You can customise this delay by using the headerFilterLiveFilterDelay table setup option */
    var headerFilterLiveFilterDelay: js.UndefOr[Double] = js.native
    
    /** Array of filters to be applied on load.     */
    var initialFilter: js.UndefOr[js.Array[Filter]] = js.native
    
    /** array of initial values for header filters.     */
    var initialHeaderFilter: js.UndefOr[js.Array[PickFilterfieldvalue]] = js.native
  }
  object OptionsFiltering {
    
    @scala.inline
    def apply(): OptionsFiltering = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsFiltering]
    }
    
    @scala.inline
    implicit class OptionsFilteringMutableBuilder[Self <: OptionsFiltering] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFiltered(value: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Unit): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataFilteredUndefined: Self = StObject.set(x, "dataFiltered", js.undefined)
      
      @scala.inline
      def setDataFiltering(value: /* filters */ js.Array[Filter] => Unit): Self = StObject.set(x, "dataFiltering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataFilteringUndefined: Self = StObject.set(x, "dataFiltering", js.undefined)
      
      @scala.inline
      def setHeaderFilterLiveFilterDelay(value: Double): Self = StObject.set(x, "headerFilterLiveFilterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFilterLiveFilterDelayUndefined: Self = StObject.set(x, "headerFilterLiveFilterDelay", js.undefined)
      
      @scala.inline
      def setInitialFilter(value: js.Array[Filter]): Self = StObject.set(x, "initialFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialFilterUndefined: Self = StObject.set(x, "initialFilter", js.undefined)
      
      @scala.inline
      def setInitialFilterVarargs(value: Filter*): Self = StObject.set(x, "initialFilter", js.Array(value :_*))
      
      @scala.inline
      def setInitialHeaderFilter(value: js.Array[PickFilterfieldvalue]): Self = StObject.set(x, "initialHeaderFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialHeaderFilterUndefined: Self = StObject.set(x, "initialHeaderFilter", js.undefined)
      
      @scala.inline
      def setInitialHeaderFilterVarargs(value: PickFilterfieldvalue*): Self = StObject.set(x, "initialHeaderFilter", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionsGeneral extends StObject {
    
    // Not listed in options--------------------
    /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false */
    var autoResize: js.UndefOr[Boolean] = js.native
    
    /** The dataChanged callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
    var dataChanged: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /** The dataLoaded callback is triggered when a new set of data is loaded into the table. */
    var dataLoaded: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /** The dataLoading callback is triggered whenever new data is loaded into the table. */
    var dataLoading: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
    
    /** The dataSorted callback is triggered after the table dataset is sorted. */
    var dataSorted: js.UndefOr[
        js.Function2[/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent], Unit]
      ] = js.native
    
    /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
    var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[Sorter], Unit]] = js.native
    
    /** Footer  element to display for the table     */
    var footerElement: js.UndefOr[String | HTMLElement] = js.native
    
    /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data.     */
    var height: js.UndefOr[String | Double | `false`] = js.native
    
    /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
    var htmlImported: js.UndefOr[EmptyCallback] = js.native
    
    /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
    var htmlImporting: js.UndefOr[EmptyCallback] = js.native
    
    /** Setting the invalidOptionWarnings option to false will disable console warning messages for invalid properties in the table constructor and column definition object */
    var invalidOptionWarnings: js.UndefOr[Boolean] = js.native
    
    /** Keybinding configuration object     */
    var keybindings: js.UndefOr[`false` | KeyBinding] = js.native
    
    /** Can be set to any valid CSS value. By setting this you can allow your table to expand to fit the data, but not overflow its parent element. Whene there are too many rows to fit in the available space, the vertical scroll bar will be shown. This has the added benefit of improving load times on larger tables */
    var maxHeight: js.UndefOr[String | Double] = js.native
    
    /** With a variable table height you can set the minimum height of the table either defined in the min-height CSS property for the element or set it using the minHeight option in the table constructor, this can be set to any valid CSS value  */
    var minHeight: js.UndefOr[String | Double] = js.native
    
    /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
    var pageLoaded: js.UndefOr[js.Function1[/* pageno */ Double, Unit]] = js.native
    
    /** placeholder element to display on empty table     */
    var placeholder: js.UndefOr[String | HTMLElement] = js.native
    
    /** * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
      This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
      You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
      Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself*/
    var reactiveData: js.UndefOr[Boolean] = js.native
    
    /** The renderComplete callback is triggered after the table has been rendered */
    var renderComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
      Data is loaded into the table when setData is called
      A page is loaded through any form of pagination
      Rows are added to the table during progressive rendering
      Columns are changed by setColumns
      The data is filtered
      The data is sorted
      The redraw function is called */
    var renderStarted: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Callback is triggered when the table is horizontally scrolled. */
    var scrollHorizontal: js.UndefOr[js.Function1[/* left */ js.Any, Unit]] = js.native
    
    /** Callback is triggered when the table is vertically scrolled. */
    var scrollVertical: js.UndefOr[js.Function1[/* top */ js.Any, Unit]] = js.native
    
    /** When a the tabulator constructor is called, the tableBuilding callback will triggered */
    var tableBuilding: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
    var tableBuilt: js.UndefOr[js.Function0[Unit]] = js.native
    
    var textDirection: js.UndefOr[TextDirection] = js.native
    
    /** When to regenerate cell tooltip value     */
    var tooltipGenerationMode: js.UndefOr[load | hover] = js.native
    
    /** Function to generate tooltips for cells     */
    var tooltips: js.UndefOr[GlobalTooltipOption] = js.native
    
    /**There are now three different validation modes available to customise the validation experience:
      blocking - if a user enters an invalid value while editing, they are blocked from leaving the cell until a valid value is entered (default)
      
      highlight - if a user enters an invalid value, then the edit will complete as usual and they are allowed to exit the cell but a highlight is applied to the cell using the tabulator-validation-fail class
      
      manual - no vaildation is automatically performed on edit, but it can be triggered by calling the validate funtion on the table or any Component Object */
    var validationMode: js.UndefOr[blocking | highlight | manual] = js.native
    
    /** Enable rendering using the Virtual DOM engine     */
    var virtualDom: js.UndefOr[Boolean] = js.native
    
    /** Manually set the size of the virtual DOM buffer     */
    var virtualDomBuffer: js.UndefOr[Boolean | Double] = js.native
    
    var virtualDomHoz: js.UndefOr[Boolean] = js.native
  }
  object OptionsGeneral {
    
    @scala.inline
    def apply(): OptionsGeneral = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsGeneral]
    }
    
    @scala.inline
    implicit class OptionsGeneralMutableBuilder[Self <: OptionsGeneral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
      
      @scala.inline
      def setDataChanged(value: /* data */ js.Any => Unit): Self = StObject.set(x, "dataChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataChangedUndefined: Self = StObject.set(x, "dataChanged", js.undefined)
      
      @scala.inline
      def setDataLoaded(value: /* data */ js.Any => Unit): Self = StObject.set(x, "dataLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataLoadedUndefined: Self = StObject.set(x, "dataLoaded", js.undefined)
      
      @scala.inline
      def setDataLoading(value: /* data */ js.Any => Unit): Self = StObject.set(x, "dataLoading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataLoadingUndefined: Self = StObject.set(x, "dataLoading", js.undefined)
      
      @scala.inline
      def setDataSorted(value: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Unit): Self = StObject.set(x, "dataSorted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataSortedUndefined: Self = StObject.set(x, "dataSorted", js.undefined)
      
      @scala.inline
      def setDataSorting(value: /* sorters */ js.Array[Sorter] => Unit): Self = StObject.set(x, "dataSorting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataSortingUndefined: Self = StObject.set(x, "dataSorting", js.undefined)
      
      @scala.inline
      def setFooterElement(value: String | HTMLElement): Self = StObject.set(x, "footerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterElementUndefined: Self = StObject.set(x, "footerElement", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double | `false`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlImported(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "htmlImported", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHtmlImportedUndefined: Self = StObject.set(x, "htmlImported", js.undefined)
      
      @scala.inline
      def setHtmlImporting(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "htmlImporting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHtmlImportingUndefined: Self = StObject.set(x, "htmlImporting", js.undefined)
      
      @scala.inline
      def setInvalidOptionWarnings(value: Boolean): Self = StObject.set(x, "invalidOptionWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidOptionWarningsUndefined: Self = StObject.set(x, "invalidOptionWarnings", js.undefined)
      
      @scala.inline
      def setKeybindings(value: `false` | KeyBinding): Self = StObject.set(x, "keybindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeybindingsUndefined: Self = StObject.set(x, "keybindings", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setPageLoaded(value: /* pageno */ Double => Unit): Self = StObject.set(x, "pageLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageLoadedUndefined: Self = StObject.set(x, "pageLoaded", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String | HTMLElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReactiveData(value: Boolean): Self = StObject.set(x, "reactiveData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactiveDataUndefined: Self = StObject.set(x, "reactiveData", js.undefined)
      
      @scala.inline
      def setRenderComplete(value: () => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderCompleteUndefined: Self = StObject.set(x, "renderComplete", js.undefined)
      
      @scala.inline
      def setRenderStarted(value: () => Unit): Self = StObject.set(x, "renderStarted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderStartedUndefined: Self = StObject.set(x, "renderStarted", js.undefined)
      
      @scala.inline
      def setScrollHorizontal(value: /* left */ js.Any => Unit): Self = StObject.set(x, "scrollHorizontal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollHorizontalUndefined: Self = StObject.set(x, "scrollHorizontal", js.undefined)
      
      @scala.inline
      def setScrollVertical(value: /* top */ js.Any => Unit): Self = StObject.set(x, "scrollVertical", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollVerticalUndefined: Self = StObject.set(x, "scrollVertical", js.undefined)
      
      @scala.inline
      def setTableBuilding(value: () => Unit): Self = StObject.set(x, "tableBuilding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTableBuildingUndefined: Self = StObject.set(x, "tableBuilding", js.undefined)
      
      @scala.inline
      def setTableBuilt(value: () => Unit): Self = StObject.set(x, "tableBuilt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTableBuiltUndefined: Self = StObject.set(x, "tableBuilt", js.undefined)
      
      @scala.inline
      def setTextDirection(value: TextDirection): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      @scala.inline
      def setTooltipGenerationMode(value: load | hover): Self = StObject.set(x, "tooltipGenerationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipGenerationModeUndefined: Self = StObject.set(x, "tooltipGenerationMode", js.undefined)
      
      @scala.inline
      def setTooltips(value: GlobalTooltipOption): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsFunction1(value: /* cell */ CellComponent => String): Self = StObject.set(x, "tooltips", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      @scala.inline
      def setValidationMode(value: blocking | highlight | manual): Self = StObject.set(x, "validationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationModeUndefined: Self = StObject.set(x, "validationMode", js.undefined)
      
      @scala.inline
      def setVirtualDom(value: Boolean): Self = StObject.set(x, "virtualDom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualDomBuffer(value: Boolean | Double): Self = StObject.set(x, "virtualDomBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualDomBufferUndefined: Self = StObject.set(x, "virtualDomBuffer", js.undefined)
      
      @scala.inline
      def setVirtualDomHoz(value: Boolean): Self = StObject.set(x, "virtualDomHoz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualDomHozUndefined: Self = StObject.set(x, "virtualDomHoz", js.undefined)
      
      @scala.inline
      def setVirtualDomUndefined: Self = StObject.set(x, "virtualDom", js.undefined)
    }
  }
  
  @js.native
  trait OptionsHTML extends StObject {
    
    var groupHeaderDownload: js.UndefOr[
        (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ] = js.native
    
    var htmlOutputConfig: js.UndefOr[AddditionalExportOptions] = js.native
    
    /**By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn. While this ise useful in most cases, some users prefer tohave more controll over the print output, for example showing all rows of the table, instead of just those visible with the current position of the scroll bar.
      Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor. 
      
      This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
      It also has the benifit that because it is an HTML table, if it corsses a page break your browser will uatomatically add the column headers in at the top of the next page.
      */
    var printAsHtml: js.UndefOr[Boolean] = js.native
    
    /**The HTML table will contain column header groups, row groups, and column calculations.
      You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition */
    var printConfig: js.UndefOr[AddditionalExportOptions] = js.native
    
    /**You can use the printFooter table setup option to define a footer to be displayed when the table is printed. */
    var printFooter: js.UndefOr[StandardStringParam] = js.native
    
    /**The printFormatter table setup option allows you to carry out any manipulation of the print output before it is displayed to the user for printing*/
    var printFormatter: js.UndefOr[js.Function2[/* tableHolderElement */ js.Any, /* tableElement */ js.Any, _]] = js.native
    
    /**You can use the printHeader table setup option to define a header to be displayed when the table is printed. */
    var printHeader: js.UndefOr[StandardStringParam] = js.native
    
    /**By default, only the rows currently visible in the Tabulator will be added to the HTML table. For custom row ranges it is also possible to pass a function into the printRowRange option that should return an array of Row Components */
    var printRowRange: js.UndefOr[RowRangeLookup | js.Function0[js.Array[RowComponent]]] = js.native
    
    /**If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table */
    var printStyled: js.UndefOr[Boolean] = js.native
  }
  object OptionsHTML {
    
    @scala.inline
    def apply(): OptionsHTML = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsHTML]
    }
    
    @scala.inline
    implicit class OptionsHTMLMutableBuilder[Self <: OptionsHTML] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupHeaderDownload(
        value: (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              String
            ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ): Self = StObject.set(x, "groupHeaderDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderDownloadFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
      ): Self = StObject.set(x, "groupHeaderDownload", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupHeaderDownloadUndefined: Self = StObject.set(x, "groupHeaderDownload", js.undefined)
      
      @scala.inline
      def setGroupHeaderDownloadVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = StObject.set(x, "groupHeaderDownload", js.Array(value :_*))
      
      @scala.inline
      def setHtmlOutputConfig(value: AddditionalExportOptions): Self = StObject.set(x, "htmlOutputConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlOutputConfigUndefined: Self = StObject.set(x, "htmlOutputConfig", js.undefined)
      
      @scala.inline
      def setPrintAsHtml(value: Boolean): Self = StObject.set(x, "printAsHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintAsHtmlUndefined: Self = StObject.set(x, "printAsHtml", js.undefined)
      
      @scala.inline
      def setPrintConfig(value: AddditionalExportOptions): Self = StObject.set(x, "printConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintConfigUndefined: Self = StObject.set(x, "printConfig", js.undefined)
      
      @scala.inline
      def setPrintFooter(value: StandardStringParam): Self = StObject.set(x, "printFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintFooterFunction0(value: () => String | HTMLElement): Self = StObject.set(x, "printFooter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrintFooterUndefined: Self = StObject.set(x, "printFooter", js.undefined)
      
      @scala.inline
      def setPrintFormatter(value: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => _): Self = StObject.set(x, "printFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrintFormatterUndefined: Self = StObject.set(x, "printFormatter", js.undefined)
      
      @scala.inline
      def setPrintHeader(value: StandardStringParam): Self = StObject.set(x, "printHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintHeaderFunction0(value: () => String | HTMLElement): Self = StObject.set(x, "printHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrintHeaderUndefined: Self = StObject.set(x, "printHeader", js.undefined)
      
      @scala.inline
      def setPrintRowRange(value: RowRangeLookup | js.Function0[js.Array[RowComponent]]): Self = StObject.set(x, "printRowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintRowRangeFunction0(value: () => js.Array[RowComponent]): Self = StObject.set(x, "printRowRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrintRowRangeUndefined: Self = StObject.set(x, "printRowRange", js.undefined)
      
      @scala.inline
      def setPrintStyled(value: Boolean): Self = StObject.set(x, "printStyled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintStyledUndefined: Self = StObject.set(x, "printStyled", js.undefined)
    }
  }
  
  @js.native
  trait OptionsHistory extends StObject {
    
    /** Enable user interaction history functionality     */
    var history: js.UndefOr[Boolean] = js.native
    
    /** The historyRedo event is triggered when the redo action is triggered. */
    var historyRedo: js.UndefOr[
        js.Function3[
          /* action */ HistoryAction, 
          /* component */ CellComponent | RowComponent, 
          /* data */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /** The historyUndo event is triggered when the undo action is triggered. */
    var historyUndo: js.UndefOr[
        js.Function3[
          /* action */ HistoryAction, 
          /* component */ CellComponent | RowComponent, 
          /* data */ js.Any, 
          Unit
        ]
      ] = js.native
  }
  object OptionsHistory {
    
    @scala.inline
    def apply(): OptionsHistory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsHistory]
    }
    
    @scala.inline
    implicit class OptionsHistoryMutableBuilder[Self <: OptionsHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryRedo(
        value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
      ): Self = StObject.set(x, "historyRedo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHistoryRedoUndefined: Self = StObject.set(x, "historyRedo", js.undefined)
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryUndo(
        value: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit
      ): Self = StObject.set(x, "historyUndo", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHistoryUndoUndefined: Self = StObject.set(x, "historyUndo", js.undefined)
    }
  }
  
  @js.native
  trait OptionsLocale extends StObject {
    
    /** You can store as many languages as you like, creating an object inside the langs object with a property of the locale code for that language. A list of locale codes can be found here.
      At present there are three parts of the table that can be localised, the column headers, the header filter placeholder text and the pagination buttons. To localize the pagination buttons, create a pagination property inside your language object and give it the properties outlined below.
      If you wish you can also localize column titles by adding a columns property to your language object. You should store a property of the field name of the column you wish to change, with a value of its title. Any fields that match this will use this title instead of the one provided by the column definition array. */
    var langs: js.UndefOr[js.Any] = js.native
    
    /** You can set the current local in one of two ways. If you want to set it when the table is created, simply include the locale option in your Tabulator constructor. You can either pass in a string matching one of the language options you have defined, or pass in the boolean true which will cause Tabulator to auto-detect the browsers language settings from the navigator.language object. */
    var locale: js.UndefOr[Boolean | String] = js.native
    
    /** When a localization event has occurred , the localized callback will triggered, passing the current locale code and language object: */
    var localized: js.UndefOr[js.Function2[/* locale */ String, /* lang */ js.Any, Unit]] = js.native
  }
  object OptionsLocale {
    
    @scala.inline
    def apply(): OptionsLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsLocale]
    }
    
    @scala.inline
    implicit class OptionsLocaleMutableBuilder[Self <: OptionsLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLangs(value: js.Any): Self = StObject.set(x, "langs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangsUndefined: Self = StObject.set(x, "langs", js.undefined)
      
      @scala.inline
      def setLocale(value: Boolean | String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocalized(value: (/* locale */ String, /* lang */ js.Any) => Unit): Self = StObject.set(x, "localized", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    }
  }
  
  @js.native
  trait OptionsMenu extends StObject {
    
    var groupClickMenu: js.UndefOr[GroupContextMenuSignature] = js.native
    
    var groupContextMenu: js.UndefOr[js.Array[MenuObject[GroupComponent]]] = js.native
    
    var rowClickMenu: js.UndefOr[RowContextMenuSignature] = js.native
    
    var rowContextMenu: js.UndefOr[RowContextMenuSignature] = js.native
  }
  object OptionsMenu {
    
    @scala.inline
    def apply(): OptionsMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsMenu]
    }
    
    @scala.inline
    implicit class OptionsMenuMutableBuilder[Self <: OptionsMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupClickMenu(value: GroupContextMenuSignature): Self = StObject.set(x, "groupClickMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupClickMenuFunction2(
        value: (/* component */ GroupComponent, /* e */ MouseEvent) => MenuObject[GroupComponent] | `false` | js.Array[js.Any]
      ): Self = StObject.set(x, "groupClickMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupClickMenuUndefined: Self = StObject.set(x, "groupClickMenu", js.undefined)
      
      @scala.inline
      def setGroupClickMenuVarargs(value: (MenuObject[GroupComponent] | MenuSeparator)*): Self = StObject.set(x, "groupClickMenu", js.Array(value :_*))
      
      @scala.inline
      def setGroupContextMenu(value: js.Array[MenuObject[GroupComponent]]): Self = StObject.set(x, "groupContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupContextMenuUndefined: Self = StObject.set(x, "groupContextMenu", js.undefined)
      
      @scala.inline
      def setGroupContextMenuVarargs(value: MenuObject[GroupComponent]*): Self = StObject.set(x, "groupContextMenu", js.Array(value :_*))
      
      @scala.inline
      def setRowClickMenu(value: RowContextMenuSignature): Self = StObject.set(x, "rowClickMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClickMenuFunction2(
        value: (/* component */ RowComponent, /* e */ MouseEvent) => MenuObject[RowComponent] | `false` | js.Array[js.Any]
      ): Self = StObject.set(x, "rowClickMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowClickMenuUndefined: Self = StObject.set(x, "rowClickMenu", js.undefined)
      
      @scala.inline
      def setRowClickMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = StObject.set(x, "rowClickMenu", js.Array(value :_*))
      
      @scala.inline
      def setRowContextMenu(value: RowContextMenuSignature): Self = StObject.set(x, "rowContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowContextMenuFunction2(
        value: (/* component */ RowComponent, /* e */ MouseEvent) => MenuObject[RowComponent] | `false` | js.Array[js.Any]
      ): Self = StObject.set(x, "rowContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowContextMenuUndefined: Self = StObject.set(x, "rowContextMenu", js.undefined)
      
      @scala.inline
      def setRowContextMenuVarargs(value: (MenuObject[RowComponent] | MenuSeparator)*): Self = StObject.set(x, "rowContextMenu", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionsPagination extends StObject {
    
    /** Choose pagination method, "local" or "remote"     */
    var pagination: js.UndefOr[remote | local] = js.native
    
    /** When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
      If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
      page - add rows relative to current page (default)
      table - add rows relative to the table */
    var paginationAddRow: js.UndefOr[table | page] = js.native
    
    /**  The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5.*/
    var paginationButtonCount: js.UndefOr[Double] = js.native
    
    /** Lookup list to link expected data feilds from the server to their function    * default* {
      "current_page":"current_page",
      "last_page":"last_page",
      "data":"data",
      }* *
      */
    var paginationDataReceived: js.UndefOr[Record[String, String]] = js.native
    
    /** Lookup list to link fields expected by the server to their function* default:* {
      "page":"page",
      "size":"size",
      "sorters":"sorters",
      "filters":"filters",
      }
      */
    var paginationDataSent: js.UndefOr[Record[String, String]] = js.native
    
    /**  By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option.*/
    var paginationElement: js.UndefOr[HTMLElement | String] = js.native
    
    /** Specify that a specific page should be loaded when the table first load */
    var paginationInitialPage: js.UndefOr[Double] = js.native
    
    /** Set the number of rows in each page     */
    var paginationSize: js.UndefOr[Double] = js.native
    
    /**  Setting this option to true will cause Tabulator to create a list of page size options, that are multiples of the current page size. In the example below, the list will have the values of 5, 10, 15 and 20.
      When using the page size selector like this, if you use the setPageSize function to set the page size to a value not in the list, the list will be regenerated using the new page size as the starting valuer    */
    var paginationSizeSelector: js.UndefOr[`true` | (js.Array[_ | Double])] = js.native
  }
  object OptionsPagination {
    
    @scala.inline
    def apply(): OptionsPagination = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsPagination]
    }
    
    @scala.inline
    implicit class OptionsPaginationMutableBuilder[Self <: OptionsPagination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPagination(value: remote | local): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAddRow(value: table | page): Self = StObject.set(x, "paginationAddRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationAddRowUndefined: Self = StObject.set(x, "paginationAddRow", js.undefined)
      
      @scala.inline
      def setPaginationButtonCount(value: Double): Self = StObject.set(x, "paginationButtonCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationButtonCountUndefined: Self = StObject.set(x, "paginationButtonCount", js.undefined)
      
      @scala.inline
      def setPaginationDataReceived(value: Record[String, String]): Self = StObject.set(x, "paginationDataReceived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationDataReceivedUndefined: Self = StObject.set(x, "paginationDataReceived", js.undefined)
      
      @scala.inline
      def setPaginationDataSent(value: Record[String, String]): Self = StObject.set(x, "paginationDataSent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationDataSentUndefined: Self = StObject.set(x, "paginationDataSent", js.undefined)
      
      @scala.inline
      def setPaginationElement(value: HTMLElement | String): Self = StObject.set(x, "paginationElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationElementUndefined: Self = StObject.set(x, "paginationElement", js.undefined)
      
      @scala.inline
      def setPaginationInitialPage(value: Double): Self = StObject.set(x, "paginationInitialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationInitialPageUndefined: Self = StObject.set(x, "paginationInitialPage", js.undefined)
      
      @scala.inline
      def setPaginationSize(value: Double): Self = StObject.set(x, "paginationSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationSizeSelector(value: `true` | (js.Array[_ | Double])): Self = StObject.set(x, "paginationSizeSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationSizeSelectorUndefined: Self = StObject.set(x, "paginationSizeSelector", js.undefined)
      
      @scala.inline
      def setPaginationSizeSelectorVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "paginationSizeSelector", js.Array(value :_*))
      
      @scala.inline
      def setPaginationSizeUndefined: Self = StObject.set(x, "paginationSize", js.undefined)
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    }
  }
  
  @js.native
  trait OptionsPersistentConfiguration extends StObject {
    
    /**By setting the persistence property to true the table will persist the sort, filter, group (groupBy, groupStartOpen, groupHeader), pagination (paginationSize), and column (title, width, visibility, order) configuration of the table */
    var persistence: js.UndefOr[`true` | PersistenceOptions] = js.native
    
    /** ID tag used to identify persistent storage information     */
    var persistenceID: js.UndefOr[String] = js.native
    
    /**  Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
      local - (string) Store the persistence information in the localStorage object
      cookie - (string) Store the persistence information in a cookie
      true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)    */
    var persistenceMode: js.UndefOr[local | cookie | `true`] = js.native
    
    /**The persistenceReaderFunc function will receive two arguments, the persistance id of the table, and the type of data to be written. This function must synchronously return the data in the format in which it was passed to the persistenceWriterFunc function. It should return a value of false if no data was present */
    var persistenceReaderFunc: js.UndefOr[
        js.Function2[/* id */ String, /* type */ sort | filter | group | page | columns, _]
      ] = js.native
    
    /**The persistenceWriterFunc function will receive three arguments, the persistance id of the table, the type of data to be written and an object or array representing the data */
    var persistenceWriterFunc: js.UndefOr[
        js.Function3[
          /* id */ String, 
          /* type */ sort | filter | group | page | columns, 
          /* data */ js.Any, 
          _
        ]
      ] = js.native
    
    /**  You can ensure the data filtering is stored for the next page load by setting the persistentFilter option to true*/
    var persistentFilter: js.UndefOr[Boolean] = js.native
    
    /** Enable persistsnt storage of column layout information     */
    var persistentLayout: js.UndefOr[Boolean] = js.native
    
    /** You can ensure the data sorting is stored for the next page load by setting the persistentSort option to true */
    var persistentSort: js.UndefOr[Boolean] = js.native
  }
  object OptionsPersistentConfiguration {
    
    @scala.inline
    def apply(): OptionsPersistentConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsPersistentConfiguration]
    }
    
    @scala.inline
    implicit class OptionsPersistentConfigurationMutableBuilder[Self <: OptionsPersistentConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistence(value: `true` | PersistenceOptions): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceID(value: String): Self = StObject.set(x, "persistenceID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceIDUndefined: Self = StObject.set(x, "persistenceID", js.undefined)
      
      @scala.inline
      def setPersistenceMode(value: local | cookie | `true`): Self = StObject.set(x, "persistenceMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceModeUndefined: Self = StObject.set(x, "persistenceMode", js.undefined)
      
      @scala.inline
      def setPersistenceReaderFunc(value: (/* id */ String, /* type */ sort | filter | group | page | columns) => _): Self = StObject.set(x, "persistenceReaderFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPersistenceReaderFuncUndefined: Self = StObject.set(x, "persistenceReaderFunc", js.undefined)
      
      @scala.inline
      def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      @scala.inline
      def setPersistenceWriterFunc(
        value: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => _
      ): Self = StObject.set(x, "persistenceWriterFunc", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPersistenceWriterFuncUndefined: Self = StObject.set(x, "persistenceWriterFunc", js.undefined)
      
      @scala.inline
      def setPersistentFilter(value: Boolean): Self = StObject.set(x, "persistentFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentFilterUndefined: Self = StObject.set(x, "persistentFilter", js.undefined)
      
      @scala.inline
      def setPersistentLayout(value: Boolean): Self = StObject.set(x, "persistentLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentLayoutUndefined: Self = StObject.set(x, "persistentLayout", js.undefined)
      
      @scala.inline
      def setPersistentSort(value: Boolean): Self = StObject.set(x, "persistentSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentSortUndefined: Self = StObject.set(x, "persistentSort", js.undefined)
    }
  }
  
  @js.native
  trait OptionsRowGrouping extends StObject {
    
    /** The dataGrouping callback is triggered whenever a data grouping event occurs, after grouping happens. */
    var dataGrouped: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens. */
    var dataGrouping: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** String/function to select field to group rows by     */
    var groupBy: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
    
    /** The groupClick callback is triggered when a user clicks on a group header. */
    var groupClick: js.UndefOr[GroupEventCallback] = js.native
    
    /** show/hide column calculations when group is closed     */
    var groupClosedShowCalcs: js.UndefOr[Boolean] = js.native
    
    /** The groupContext callback is triggered when a user right clicks on a group header.
      If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
    var groupContext: js.UndefOr[GroupEventCallback] = js.native
    
    /** The groupDblClick callback is triggered when a user double clicks on a group header. */
    var groupDblClick: js.UndefOr[GroupEventCallback] = js.native
    
    /** The groupDblTap callback is triggered when a user taps on a group header on a touch display twice in under 300ms. */
    var groupDblTap: js.UndefOr[GroupEventCallback] = js.native
    
    /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option.     */
    var groupHeader: js.UndefOr[
        (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ] = js.native
    
    /**When printing you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderPrint table option, which takes the same inputs as the standard groupHeader property. */
    var groupHeaderPrint: js.UndefOr[
        (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ] = js.native
    
    /** You can set the default open state of groups using the groupStartOpen property* * This can take one of three possible values:
      true - all groups start open (default value)
      false - all groups start closed
      function() - a callback to decide if a group should start open or closed
      Group Open Function
      If you want to decide on a group by group basis which should start open or closed then you can pass a function to the groupStartOpen property. This should return true if the group should start open or false if the group should start closed.
      */
    var groupStartOpen: js.UndefOr[
        Boolean | (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          Boolean
        ])
      ] = js.native
    
    /** The groupTap callback is triggered when a user taps on a group header on a touch display. */
    var groupTap: js.UndefOr[GroupEventCallback] = js.native
    
    /** The groupTapHold callback is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second */
    var groupTapHold: js.UndefOr[GroupEventCallback] = js.native
    
    /** By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behaviour you can use the groupToggleElement option to choose a different option:* * The option can take one of three values:
      arrow - togggle group on arrow element click
      header - toggle group on click anywhere on the group header element
      false - prevent clicking anywhere in the group toggling the group
      */
    var groupToggleElement: js.UndefOr[arrow | header | `false`] = js.native
    
    var groupUpdateOnCellEdit: js.UndefOr[Boolean] = js.native
    
    /** By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
      This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level     */
    var groupValues: js.UndefOr[GroupValuesArg] = js.native
    
    /** The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states. */
    var groupVisibilityChanged: js.UndefOr[js.Function2[/* group */ GroupComponent, /* visible */ Boolean, Unit]] = js.native
  }
  object OptionsRowGrouping {
    
    @scala.inline
    def apply(): OptionsRowGrouping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsRowGrouping]
    }
    
    @scala.inline
    implicit class OptionsRowGroupingMutableBuilder[Self <: OptionsRowGrouping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataGrouped(value: () => Unit): Self = StObject.set(x, "dataGrouped", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataGroupedUndefined: Self = StObject.set(x, "dataGrouped", js.undefined)
      
      @scala.inline
      def setDataGrouping(value: () => Unit): Self = StObject.set(x, "dataGrouping", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
      
      @scala.inline
      def setGroupBy(value: String | (js.Function1[/* data */ js.Any, _])): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByFunction1(value: /* data */ js.Any => _): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupClickUndefined: Self = StObject.set(x, "groupClick", js.undefined)
      
      @scala.inline
      def setGroupClosedShowCalcs(value: Boolean): Self = StObject.set(x, "groupClosedShowCalcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupClosedShowCalcsUndefined: Self = StObject.set(x, "groupClosedShowCalcs", js.undefined)
      
      @scala.inline
      def setGroupContext(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupContextUndefined: Self = StObject.set(x, "groupContext", js.undefined)
      
      @scala.inline
      def setGroupDblClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupDblClickUndefined: Self = StObject.set(x, "groupDblClick", js.undefined)
      
      @scala.inline
      def setGroupDblTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupDblTapUndefined: Self = StObject.set(x, "groupDblTap", js.undefined)
      
      @scala.inline
      def setGroupHeader(
        value: (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              String
            ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
      ): Self = StObject.set(x, "groupHeader", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupHeaderPrint(
        value: (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              String
            ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
      ): Self = StObject.set(x, "groupHeaderPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderPrintFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
      ): Self = StObject.set(x, "groupHeaderPrint", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupHeaderPrintUndefined: Self = StObject.set(x, "groupHeaderPrint", js.undefined)
      
      @scala.inline
      def setGroupHeaderPrintVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = StObject.set(x, "groupHeaderPrint", js.Array(value :_*))
      
      @scala.inline
      def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
      
      @scala.inline
      def setGroupHeaderVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = StObject.set(x, "groupHeader", js.Array(value :_*))
      
      @scala.inline
      def setGroupStartOpen(
        value: Boolean | (js.Function4[
              /* value */ js.Any, 
              /* count */ Double, 
              /* data */ js.Any, 
              /* group */ GroupComponent, 
              Boolean
            ])
      ): Self = StObject.set(x, "groupStartOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupStartOpenFunction4(
        value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => Boolean
      ): Self = StObject.set(x, "groupStartOpen", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGroupStartOpenUndefined: Self = StObject.set(x, "groupStartOpen", js.undefined)
      
      @scala.inline
      def setGroupTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupTapHold(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupTapHoldUndefined: Self = StObject.set(x, "groupTapHold", js.undefined)
      
      @scala.inline
      def setGroupTapUndefined: Self = StObject.set(x, "groupTap", js.undefined)
      
      @scala.inline
      def setGroupToggleElement(value: arrow | header | `false`): Self = StObject.set(x, "groupToggleElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupToggleElementUndefined: Self = StObject.set(x, "groupToggleElement", js.undefined)
      
      @scala.inline
      def setGroupUpdateOnCellEdit(value: Boolean): Self = StObject.set(x, "groupUpdateOnCellEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUpdateOnCellEditUndefined: Self = StObject.set(x, "groupUpdateOnCellEdit", js.undefined)
      
      @scala.inline
      def setGroupValues(value: GroupValuesArg): Self = StObject.set(x, "groupValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupValuesUndefined: Self = StObject.set(x, "groupValues", js.undefined)
      
      @scala.inline
      def setGroupValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "groupValues", js.Array(value :_*))
      
      @scala.inline
      def setGroupVisibilityChanged(value: (/* group */ GroupComponent, /* visible */ Boolean) => Unit): Self = StObject.set(x, "groupVisibilityChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGroupVisibilityChangedUndefined: Self = StObject.set(x, "groupVisibilityChanged", js.undefined)
    }
  }
  
  @js.native
  trait OptionsRows extends StObject {
    
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
        js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Unit]
      ] = js.native
    
    /** The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.*/
    var movableRowsReceivedFailed: js.UndefOr[
        js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, Unit]
      ] = js.native
    
    /**  The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
      There are several inbuilt receiver functions:
      insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
      add - adds row to the table
      update - updates the row it is dropped on with the sent rows data
      replace - replaces the row it is dropped on with the sent row*/
    var movableRowsReceiver: js.UndefOr[
        insert | add | update | replace | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, _])
      ] = js.native
    
    /** The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table. */
    var movableRowsReceivingStart: js.UndefOr[js.Function2[/* fromRow */ RowComponent, /* toTable */ Tabulator, Unit]] = js.native
    
    /** The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.*/
    var movableRowsReceivingStop: js.UndefOr[js.Function1[/* fromTable */ Tabulator, Unit]] = js.native
    
    /** The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
      There are several inbuilt sender functions:
      false - do nothing(default)
      delete - deletes the row from the table
      You can also pass a callback to the movableRowsSender option for custom sender functionality
      */
    var movableRowsSender: js.UndefOr[
        `false` | delete | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, _])
      ] = js.native
    
    /** The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table. */
    var movableRowsSendingStart: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
    
    /** The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled. */
    var movableRowsSendingStop: js.UndefOr[js.Function1[/* toTables */ js.Array[_], Unit]] = js.native
    
    /** The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table. */
    var movableRowsSent: js.UndefOr[
        js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Unit]
      ] = js.native
    
    /** The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.*/
    var movableRowsSentFailed: js.UndefOr[
        js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, Unit]
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
    implicit class OptionsRowsMutableBuilder[Self <: OptionsRows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRowPos(value: bottom | top): Self = StObject.set(x, "addRowPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddRowPosUndefined: Self = StObject.set(x, "addRowPos", js.undefined)
      
      @scala.inline
      def setDataTreeRowCollapsed(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = StObject.set(x, "dataTreeRowCollapsed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataTreeRowCollapsedUndefined: Self = StObject.set(x, "dataTreeRowCollapsed", js.undefined)
      
      @scala.inline
      def setDataTreeRowExpanded(value: (/* row */ RowComponent, /* level */ Double) => Unit): Self = StObject.set(x, "dataTreeRowExpanded", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDataTreeRowExpandedUndefined: Self = StObject.set(x, "dataTreeRowExpanded", js.undefined)
      
      @scala.inline
      def setMovableRows(value: Boolean): Self = StObject.set(x, "movableRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableRowsConnectedElements(value: String | HTMLElement): Self = StObject.set(x, "movableRowsConnectedElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableRowsConnectedElementsUndefined: Self = StObject.set(x, "movableRowsConnectedElements", js.undefined)
      
      @scala.inline
      def setMovableRowsConnectedTables(value: String | (js.Array[HTMLElement | String]) | HTMLElement): Self = StObject.set(x, "movableRowsConnectedTables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableRowsConnectedTablesUndefined: Self = StObject.set(x, "movableRowsConnectedTables", js.undefined)
      
      @scala.inline
      def setMovableRowsConnectedTablesVarargs(value: (HTMLElement | String)*): Self = StObject.set(x, "movableRowsConnectedTables", js.Array(value :_*))
      
      @scala.inline
      def setMovableRowsElementDrop(value: (/* e */ MouseEvent, /* element */ HTMLElement, /* row */ RowComponent) => _): Self = StObject.set(x, "movableRowsElementDrop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsElementDropUndefined: Self = StObject.set(x, "movableRowsElementDrop", js.undefined)
      
      @scala.inline
      def setMovableRowsReceived(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceived", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsReceivedFailed(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivedFailed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsReceivedFailedUndefined: Self = StObject.set(x, "movableRowsReceivedFailed", js.undefined)
      
      @scala.inline
      def setMovableRowsReceivedUndefined: Self = StObject.set(x, "movableRowsReceived", js.undefined)
      
      @scala.inline
      def setMovableRowsReceiver(
        value: insert | add | update | replace | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator, _])
      ): Self = StObject.set(x, "movableRowsReceiver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableRowsReceiverFunction3(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ Tabulator) => _): Self = StObject.set(x, "movableRowsReceiver", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsReceiverUndefined: Self = StObject.set(x, "movableRowsReceiver", js.undefined)
      
      @scala.inline
      def setMovableRowsReceivingStart(value: (/* fromRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivingStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMovableRowsReceivingStartUndefined: Self = StObject.set(x, "movableRowsReceivingStart", js.undefined)
      
      @scala.inline
      def setMovableRowsReceivingStop(value: /* fromTable */ Tabulator => Unit): Self = StObject.set(x, "movableRowsReceivingStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMovableRowsReceivingStopUndefined: Self = StObject.set(x, "movableRowsReceivingStop", js.undefined)
      
      @scala.inline
      def setMovableRowsSender(
        value: `false` | delete | (js.Function3[/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator, _])
      ): Self = StObject.set(x, "movableRowsSender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovableRowsSenderFunction3(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => _): Self = StObject.set(x, "movableRowsSender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsSenderUndefined: Self = StObject.set(x, "movableRowsSender", js.undefined)
      
      @scala.inline
      def setMovableRowsSendingStart(value: /* toTables */ js.Array[_] => Unit): Self = StObject.set(x, "movableRowsSendingStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMovableRowsSendingStartUndefined: Self = StObject.set(x, "movableRowsSendingStart", js.undefined)
      
      @scala.inline
      def setMovableRowsSendingStop(value: /* toTables */ js.Array[_] => Unit): Self = StObject.set(x, "movableRowsSendingStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMovableRowsSendingStopUndefined: Self = StObject.set(x, "movableRowsSendingStop", js.undefined)
      
      @scala.inline
      def setMovableRowsSent(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsSent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsSentFailed(value: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ Tabulator) => Unit): Self = StObject.set(x, "movableRowsSentFailed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMovableRowsSentFailedUndefined: Self = StObject.set(x, "movableRowsSentFailed", js.undefined)
      
      @scala.inline
      def setMovableRowsSentUndefined: Self = StObject.set(x, "movableRowsSent", js.undefined)
      
      @scala.inline
      def setMovableRowsUndefined: Self = StObject.set(x, "movableRows", js.undefined)
      
      @scala.inline
      def setResizableRows(value: Boolean): Self = StObject.set(x, "resizableRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableRowsUndefined: Self = StObject.set(x, "resizableRows", js.undefined)
      
      @scala.inline
      def setRowAdded(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowAddedUndefined: Self = StObject.set(x, "rowAdded", js.undefined)
      
      @scala.inline
      def setRowClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowClickUndefined: Self = StObject.set(x, "rowClick", js.undefined)
      
      @scala.inline
      def setRowContext(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowContext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowContextUndefined: Self = StObject.set(x, "rowContext", js.undefined)
      
      @scala.inline
      def setRowDblClick(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowDblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowDblClickUndefined: Self = StObject.set(x, "rowDblClick", js.undefined)
      
      @scala.inline
      def setRowDblTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowDblTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowDblTapUndefined: Self = StObject.set(x, "rowDblTap", js.undefined)
      
      @scala.inline
      def setRowDeleted(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowDeleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDeletedUndefined: Self = StObject.set(x, "rowDeleted", js.undefined)
      
      @scala.inline
      def setRowDeselected(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowDeselected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowDeselectedUndefined: Self = StObject.set(x, "rowDeselected", js.undefined)
      
      @scala.inline
      def setRowFormatter(value: /* row */ RowComponent => _): Self = StObject.set(x, "rowFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowFormatterClipboard(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = StObject.set(x, "rowFormatterClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowFormatterClipboardFunction1(value: /* row */ RowComponent => _): Self = StObject.set(x, "rowFormatterClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowFormatterClipboardUndefined: Self = StObject.set(x, "rowFormatterClipboard", js.undefined)
      
      @scala.inline
      def setRowFormatterHtmlOutput(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = StObject.set(x, "rowFormatterHtmlOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowFormatterHtmlOutputFunction1(value: /* row */ RowComponent => _): Self = StObject.set(x, "rowFormatterHtmlOutput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowFormatterHtmlOutputUndefined: Self = StObject.set(x, "rowFormatterHtmlOutput", js.undefined)
      
      @scala.inline
      def setRowFormatterPrint(value: `false` | (js.Function1[/* row */ RowComponent, _])): Self = StObject.set(x, "rowFormatterPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowFormatterPrintFunction1(value: /* row */ RowComponent => _): Self = StObject.set(x, "rowFormatterPrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowFormatterPrintUndefined: Self = StObject.set(x, "rowFormatterPrint", js.undefined)
      
      @scala.inline
      def setRowFormatterUndefined: Self = StObject.set(x, "rowFormatter", js.undefined)
      
      @scala.inline
      def setRowMouseEnter(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowMouseEnterUndefined: Self = StObject.set(x, "rowMouseEnter", js.undefined)
      
      @scala.inline
      def setRowMouseLeave(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowMouseLeaveUndefined: Self = StObject.set(x, "rowMouseLeave", js.undefined)
      
      @scala.inline
      def setRowMouseMove(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowMouseMoveUndefined: Self = StObject.set(x, "rowMouseMove", js.undefined)
      
      @scala.inline
      def setRowMouseOut(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowMouseOutUndefined: Self = StObject.set(x, "rowMouseOut", js.undefined)
      
      @scala.inline
      def setRowMouseOver(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowMouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowMouseOverUndefined: Self = StObject.set(x, "rowMouseOver", js.undefined)
      
      @scala.inline
      def setRowMoved(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowMoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowMovedUndefined: Self = StObject.set(x, "rowMoved", js.undefined)
      
      @scala.inline
      def setRowResized(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowResized", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowResizedUndefined: Self = StObject.set(x, "rowResized", js.undefined)
      
      @scala.inline
      def setRowSelected(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowSelectedUndefined: Self = StObject.set(x, "rowSelected", js.undefined)
      
      @scala.inline
      def setRowSelectionChanged(value: (/* data */ js.Array[_], /* rows */ js.Array[RowComponent]) => Unit): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowSelectionChangedUndefined: Self = StObject.set(x, "rowSelectionChanged", js.undefined)
      
      @scala.inline
      def setRowTap(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowTap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowTapHold(value: (/* e */ UIEvent, /* row */ RowComponent) => Unit): Self = StObject.set(x, "rowTapHold", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowTapHoldUndefined: Self = StObject.set(x, "rowTapHold", js.undefined)
      
      @scala.inline
      def setRowTapUndefined: Self = StObject.set(x, "rowTap", js.undefined)
      
      @scala.inline
      def setRowUpdated(value: /* row */ RowComponent => Unit): Self = StObject.set(x, "rowUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowUpdatedUndefined: Self = StObject.set(x, "rowUpdated", js.undefined)
      
      @scala.inline
      def setScrollToRowIfVisible(value: Boolean): Self = StObject.set(x, "scrollToRowIfVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRowIfVisibleUndefined: Self = StObject.set(x, "scrollToRowIfVisible", js.undefined)
      
      @scala.inline
      def setScrollToRowPosition(value: ScrollToRowPostition): Self = StObject.set(x, "scrollToRowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToRowPositionUndefined: Self = StObject.set(x, "scrollToRowPosition", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean | Double | highlight): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableCheck(value: /* row */ RowComponent => Boolean): Self = StObject.set(x, "selectableCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectableCheckUndefined: Self = StObject.set(x, "selectableCheck", js.undefined)
      
      @scala.inline
      def setSelectablePersistence(value: Boolean): Self = StObject.set(x, "selectablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectablePersistenceUndefined: Self = StObject.set(x, "selectablePersistence", js.undefined)
      
      @scala.inline
      def setSelectableRangeMode(value: click): Self = StObject.set(x, "selectableRangeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableRangeModeUndefined: Self = StObject.set(x, "selectableRangeMode", js.undefined)
      
      @scala.inline
      def setSelectableRollingSelection(value: Boolean): Self = StObject.set(x, "selectableRollingSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableRollingSelectionUndefined: Self = StObject.set(x, "selectableRollingSelection", js.undefined)
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setTabEndNewRow(value: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _])): Self = StObject.set(x, "tabEndNewRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabEndNewRowFunction1(value: /* row */ RowComponent => _): Self = StObject.set(x, "tabEndNewRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabEndNewRowUndefined: Self = StObject.set(x, "tabEndNewRow", js.undefined)
    }
  }
  
  @js.native
  trait OptionsSorting extends StObject {
    
    /** Array of sorters to be applied on load.     */
    var initialSort: js.UndefOr[js.Array[Sorter]] = js.native
    
    /** reverse the order that multiple sorters are applied to the table.     */
    var sortOrderReverse: js.UndefOr[Boolean] = js.native
  }
  object OptionsSorting {
    
    @scala.inline
    def apply(): OptionsSorting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSorting]
    }
    
    @scala.inline
    implicit class OptionsSortingMutableBuilder[Self <: OptionsSorting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialSort(value: js.Array[Sorter]): Self = StObject.set(x, "initialSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSortUndefined: Self = StObject.set(x, "initialSort", js.undefined)
      
      @scala.inline
      def setInitialSortVarargs(value: Sorter*): Self = StObject.set(x, "initialSort", js.Array(value :_*))
      
      @scala.inline
      def setSortOrderReverse(value: Boolean): Self = StObject.set(x, "sortOrderReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderReverseUndefined: Self = StObject.set(x, "sortOrderReverse", js.undefined)
    }
  }
  
  @js.native
  trait PersistenceGroupOptions extends StObject {
    
    var groupBy: js.UndefOr[Boolean] = js.native
    
    var groupHeader: js.UndefOr[Boolean] = js.native
    
    var groupStartOpen: js.UndefOr[Boolean] = js.native
  }
  object PersistenceGroupOptions {
    
    @scala.inline
    def apply(): PersistenceGroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistenceGroupOptions]
    }
    
    @scala.inline
    implicit class PersistenceGroupOptionsMutableBuilder[Self <: PersistenceGroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupBy(value: Boolean): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupHeader(value: Boolean): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
      
      @scala.inline
      def setGroupStartOpen(value: Boolean): Self = StObject.set(x, "groupStartOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupStartOpenUndefined: Self = StObject.set(x, "groupStartOpen", js.undefined)
    }
  }
  
  @js.native
  trait PersistenceOptions extends StObject {
    
    var columns: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var filter: js.UndefOr[Boolean] = js.native
    
    var group: js.UndefOr[Boolean | PersistenceGroupOptions] = js.native
    
    var page: js.UndefOr[Boolean | PersistencePageOptions] = js.native
    
    var sort: js.UndefOr[Boolean] = js.native
  }
  object PersistenceOptions {
    
    @scala.inline
    def apply(): PersistenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistenceOptions]
    }
    
    @scala.inline
    implicit class PersistenceOptionsMutableBuilder[Self <: PersistenceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: Boolean | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGroup(value: Boolean | PersistenceGroupOptions): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setPage(value: Boolean | PersistencePageOptions): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait PersistencePageOptions extends StObject {
    
    var page: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Boolean] = js.native
  }
  object PersistencePageOptions {
    
    @scala.inline
    def apply(): PersistencePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistencePageOptions]
    }
    
    @scala.inline
    implicit class PersistencePageOptionsMutableBuilder[Self <: PersistencePageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ProgressBarParams extends TrafficParams {
    
    // Progress Bar
    var legend: js.UndefOr[String | `true` | ValueStringCallback] = js.native
    
    var legendAlign: js.UndefOr[Align] = js.native
    
    var legendColor: js.UndefOr[Color] = js.native
  }
  object ProgressBarParams {
    
    @scala.inline
    def apply(): ProgressBarParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarParams]
    }
    
    @scala.inline
    implicit class ProgressBarParamsMutableBuilder[Self <: ProgressBarParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLegend(value: String | `true` | ValueStringCallback): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendAlign(value: Align): Self = StObject.set(x, "legendAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendAlignUndefined: Self = StObject.set(x, "legendAlign", js.undefined)
      
      @scala.inline
      def setLegendColor(value: Color): Self = StObject.set(x, "legendColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendColorFunction1(value: /* value */ js.Any => String): Self = StObject.set(x, "legendColor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendColorUndefined: Self = StObject.set(x, "legendColor", js.undefined)
      
      @scala.inline
      def setLegendColorVarargs(value: js.Any*): Self = StObject.set(x, "legendColor", js.Array(value :_*))
      
      @scala.inline
      def setLegendFunction1(value: /* value */ js.Any => String): Self = StObject.set(x, "legend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    }
  }
  
  type RowChangedCallback = js.Function1[/* row */ RowComponent, Unit]
  
  @js.native
  trait RowComponent extends CalculationComponent {
    
    /**Add child rows to a data tree row
      *
      * The first argument should be a row data object. If you do not pass data for a column, it will be left empty. To create a blank row (ie for a user to fill in), pass an empty object to the function.
      *
      * The second argument is optional and determines whether the row is added to the top or bottom of the array of child rows. A value of true will add the row to the top of the array, a value of false will add the row to the bottom of the array. If the parameter is not set the row will be placed according to the addRowPos global option.
      *
      * If you want to add the row next to an existing row you can pass an optional third argument to the function that will position the new row next to the specified row (above or below based on the value of the second argument). This argument will take any of the standard row component look up options. This must be a row that has the same parent as the row you want to add
      **/
    def addTreeChild(rowData: js.Object): Unit = js.native
    def addTreeChild(rowData: js.Object, position: js.UndefOr[scala.Nothing], existingRow: RowComponent): Unit = js.native
    def addTreeChild(rowData: js.Object, position: Boolean): Unit = js.native
    def addTreeChild(rowData: js.Object, position: Boolean, existingRow: RowComponent): Unit = js.native
    
    /** The delete function deletes the row, removing its data from the table
      *
      * The delete method returns a promise, this can be used to run any other commands that have to be run after the row has been deleted. By running them in the promise you ensure they are only run after the row has been deleted.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /** The deselect function will deselect the current row.*/
    def deselect(): Unit = js.native
    
    /** You can freeze a row at the top of the table by calling the freeze function. This will insert the row above the scrolling portion of the table in the table header. */
    def freeze(): Unit = js.native
    
    /** When using grouped rows, you can retrieve the group component for the current row using the getGroup function. */
    def getGroup(): GroupComponent = js.native
    
    /** The getIndex function returns the index value for the row. (this is the value from the defined index column, NOT the row's position in the table)*/
    def getIndex(): js.Any = js.native
    
    /** The getNextRow function returns the Row Component for the next visible row in the table, if there is no next row it will return a value of false */
    def getNextRow(): RowComponent | `false` = js.native
    
    /** Use the getPosition function to retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
      If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional first argument of the function. */
    def getPosition(): Double = js.native
    def getPosition(filteredPosition: Boolean): Double = js.native
    
    /** The getNextRow function returns the Row Component for the previous visible row in the table, if there is no next row it will return a value of false */
    def getPrevRow(): RowComponent | `false` = js.native
    
    /** When the tree structure is enabled the getTreeChildren function will return an array of Row Components for this rows children. */
    def getTreeChildren(): js.Array[RowComponent] = js.native
    
    /** When the tree structure is enabled the getTreeParent function will return the Row Component for the parent of this row. If no parent exists, a value of false will be returned. */
    def getTreeParent(): RowComponent | `false` = js.native
    
    /**The isFrozen function on a Row Component will return a boolean representing the current frozen state of the row. */
    def isFrozen(): Boolean = js.native
    
    /** The isSelected function will return a boolean representing the current selected state of the row. */
    def isSelected(): Boolean = js.native
    
    def move(lookup: Double): Unit = js.native
    def move(lookup: Double, belowTarget: Boolean): Unit = js.native
    def move(lookup: HTMLElement): Unit = js.native
    def move(lookup: HTMLElement, belowTarget: Boolean): Unit = js.native
    /**  You can move a row next to another row using the move function.
      The first argument should be the target row that you want to move to, and can be any of the standard row component look up options.
      The second argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target*/
    def move(lookup: RowComponent): Unit = js.native
    def move(lookup: RowComponent, belowTarget: Boolean): Unit = js.native
    
    /** If you are making manual adjustments to elements contained within the row, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the normalizeHeight function to do this.*/
    def normalizeHeight(): Unit = js.native
    
    /** The pageTo function will load the page for the row if it passes the current filters.*/
    def pageTo(): js.Promise[Unit] = js.native
    
    /** If you want to re-format a row once it has been rendered to re-trigger the cell formatters and the rowFormatter callback, Call the reformat function. */
    def reformat(): Unit = js.native
    
    /** The scrollTo function will scroll the table to the row if it passes the current filters.*/
    def scrollTo(): js.Promise[Unit] = js.native
    
    /** The select function will select the current row.*/
    def select(): Unit = js.native
    
    /** The deselect function will toggle the current row.*/
    def toggleSelect(): Unit = js.native
    
    /** When the tree structure is enabled the treeCollapse function will collapse current row and hide its children */
    def treeCollapse(): Unit = js.native
    
    /** When the tree structure is enabled the treeExpand function will expand current row and show its children. */
    def treeExpand(): Unit = js.native
    
    /** When the tree structure is enabled the treeToggle function will toggle the collapsed state of the current row. */
    def treeToggle(): Unit = js.native
    
    /** A frozen row can be unfrozen using the unfreeze function. This will remove the row from the table header and re-insert it back in the table. */
    def unfreeze(): Unit = js.native
    
    /** You can update the data in the row using the update function. You should pass an object to the function containing any fields you wish to update. This object will not replace the row data, only the fields included in the object will be updated.*/
    def update(data: js.Object): js.Promise[Unit] = js.native
    
    /**You can validate the whole table in one go by calling the validate method on the table instance.
      *
      This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell in that row that has failed validation.     */
    def validate(): `true` | js.Array[CellComponent] = js.native
  }
  
  type RowContextMenuSignature = (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function2[
    /* component */ RowComponent, 
    /* e */ MouseEvent, 
    MenuObject[RowComponent] | `false` | js.Array[js.Any]
  ])
  
  type RowEventCallback = js.Function2[/* e */ UIEvent, /* row */ RowComponent, Unit]
  
  type RowLookup = RowComponent | HTMLElement | String | Double | (js.Array[Double | String])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.visible
    - typings.tabulatorTables.tabulatorTablesStrings.active
    - typings.tabulatorTables.tabulatorTablesStrings.selected
    - typings.tabulatorTables.tabulatorTablesStrings.all
  */
  trait RowRangeLookup extends StObject
  object RowRangeLookup {
    
    @scala.inline
    def active: typings.tabulatorTables.tabulatorTablesStrings.active = "active".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.active]
    
    @scala.inline
    def all: typings.tabulatorTables.tabulatorTablesStrings.all = "all".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.all]
    
    @scala.inline
    def selected: typings.tabulatorTables.tabulatorTablesStrings.selected = "selected".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.selected]
    
    @scala.inline
    def visible: typings.tabulatorTables.tabulatorTablesStrings.visible = "visible".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.visible]
  }
  
  @js.native
  trait RowSelectionParams extends _FormatterParams {
    
    var rowRange: js.UndefOr[RowRangeLookup] = js.native
  }
  object RowSelectionParams {
    
    @scala.inline
    def apply(): RowSelectionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowSelectionParams]
    }
    
    @scala.inline
    implicit class RowSelectionParamsMutableBuilder[Self <: RowSelectionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRowRange(value: RowRangeLookup): Self = StObject.set(x, "rowRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowRangeUndefined: Self = StObject.set(x, "rowRange", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.left
    - typings.tabulatorTables.tabulatorTablesStrings.center
    - typings.tabulatorTables.tabulatorTablesStrings.middle
    - typings.tabulatorTables.tabulatorTablesStrings.right
  */
  trait ScrollToColumnPosition extends StObject
  object ScrollToColumnPosition {
    
    @scala.inline
    def center: typings.tabulatorTables.tabulatorTablesStrings.center = "center".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.center]
    
    @scala.inline
    def left: typings.tabulatorTables.tabulatorTablesStrings.left = "left".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.left]
    
    @scala.inline
    def middle: typings.tabulatorTables.tabulatorTablesStrings.middle = "middle".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.middle]
    
    @scala.inline
    def right: typings.tabulatorTables.tabulatorTablesStrings.right = "right".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.top
    - typings.tabulatorTables.tabulatorTablesStrings.center
    - typings.tabulatorTables.tabulatorTablesStrings.bottom
    - typings.tabulatorTables.tabulatorTablesStrings.nearest
  */
  trait ScrollToRowPostition extends StObject
  object ScrollToRowPostition {
    
    @scala.inline
    def bottom: typings.tabulatorTables.tabulatorTablesStrings.bottom = "bottom".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.bottom]
    
    @scala.inline
    def center: typings.tabulatorTables.tabulatorTablesStrings.center = "center".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.center]
    
    @scala.inline
    def nearest: typings.tabulatorTables.tabulatorTablesStrings.nearest = "nearest".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.nearest]
    
    @scala.inline
    def top: typings.tabulatorTables.tabulatorTablesStrings.top = "top".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.top]
  }
  
  @js.native
  trait SelectLabelValue extends StObject {
    
    var label: String = js.native
    
    var value: String | Double | Boolean = js.native
  }
  object SelectLabelValue {
    
    @scala.inline
    def apply(label: String, value: String | Double | Boolean): SelectLabelValue = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectLabelValue]
    }
    
    @scala.inline
    implicit class SelectLabelValueMutableBuilder[Self <: SelectLabelValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectParams
    extends SharedEditorParams
       with SharedSelectAutoCompleteEditorParams
       with _EditorParams {
    
    var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
    
    var multiselect: js.UndefOr[Boolean | Double] = js.native
    
    var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String = js.native
    
    var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
  }
  object SelectParams {
    
    @scala.inline
    def apply(values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): SelectParams = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectParams]
    }
    
    @scala.inline
    implicit class SelectParamsMutableBuilder[Self <: SelectParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = StObject.set(x, "listItemFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setListItemFormatterUndefined: Self = StObject.set(x, "listItemFormatter", js.undefined)
      
      @scala.inline
      def setMultiselect(value: Boolean | Double): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      @scala.inline
      def setValues(value: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: (SelectParamsGroup | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setVerticalNavigation(value: editor | table | hybrid): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
    }
  }
  
  @js.native
  trait SelectParamsGroup extends StObject {
    
    var elementAttributes: js.UndefOr[js.Object] = js.native
    
    var label: String = js.native
    
    var options: js.UndefOr[js.Array[SelectLabelValue]] = js.native
    
    var value: js.UndefOr[String | Double | Boolean] = js.native
  }
  object SelectParamsGroup {
    
    @scala.inline
    def apply(label: String): SelectParamsGroup = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectParamsGroup]
    }
    
    @scala.inline
    implicit class SelectParamsGroupMutableBuilder[Self <: SelectParamsGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElementAttributes(value: js.Object): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[SelectLabelValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: SelectLabelValue*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SharedEditorParams extends StObject {
    
    var elementAttributes: js.UndefOr[JSONRecord] = js.native
    
    /**Built in editors based on input elements such as the input, number, textarea and autocomplete editors have the ability to mask the users input to restrict it to match a given pattern.
      This can be set by passing a string to the the mask option in the columns editorParams 
      Each character in the string passed to the mask option defines what type of character can be entered in that position in the editor.
      A - Only a letter is valid in this position
      9 - Only a number is valid in this position
      * - Any character is valid in this position
      Any other character - The character in this position must be the same as the mask
      For example, a mask string of "AAA-999" would require the user to enter three letters followed by a hyphen followed by three numbers
      
      f you want to use the characters A, 9 or * as fixed characters then it is possible to change the characters looked for in the mask by using the maskLetterChar, maskNumberChar and maskWildcardChar options in the editorParams*/
    var mask: js.UndefOr[String] = js.native
    
    /** you are using fixed characters in your mask (any character other that A, 9 or *), then you can get the mask to automatically fill in these characters for you as you type by setting the maskAutoFill option in the editorParams to true */
    var maskAutoFill: js.UndefOr[Boolean] = js.native
    
    var maskLetterChar: js.UndefOr[String] = js.native
    
    var maskNumberChar: js.UndefOr[String] = js.native
    
    var maskWildcardChar: js.UndefOr[String] = js.native
  }
  object SharedEditorParams {
    
    @scala.inline
    def apply(): SharedEditorParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedEditorParams]
    }
    
    @scala.inline
    implicit class SharedEditorParamsMutableBuilder[Self <: SharedEditorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElementAttributes(value: JSONRecord): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAutoFill(value: Boolean): Self = StObject.set(x, "maskAutoFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskAutoFillUndefined: Self = StObject.set(x, "maskAutoFill", js.undefined)
      
      @scala.inline
      def setMaskLetterChar(value: String): Self = StObject.set(x, "maskLetterChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskLetterCharUndefined: Self = StObject.set(x, "maskLetterChar", js.undefined)
      
      @scala.inline
      def setMaskNumberChar(value: String): Self = StObject.set(x, "maskNumberChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskNumberCharUndefined: Self = StObject.set(x, "maskNumberChar", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskWildcardChar(value: String): Self = StObject.set(x, "maskWildcardChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskWildcardCharUndefined: Self = StObject.set(x, "maskWildcardChar", js.undefined)
    }
  }
  
  @js.native
  trait SharedSelectAutoCompleteEditorParams extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var sortValuesList: js.UndefOr[asc | desc] = js.native
  }
  object SharedSelectAutoCompleteEditorParams {
    
    @scala.inline
    def apply(): SharedSelectAutoCompleteEditorParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
    }
    
    @scala.inline
    implicit class SharedSelectAutoCompleteEditorParamsMutableBuilder[Self <: SharedSelectAutoCompleteEditorParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setSortValuesList(value: asc | desc): Self = StObject.set(x, "sortValuesList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortValuesListUndefined: Self = StObject.set(x, "sortValuesList", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.asc
    - typings.tabulatorTables.tabulatorTablesStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    @scala.inline
    def asc: typings.tabulatorTables.tabulatorTablesStrings.asc = "asc".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.asc]
    
    @scala.inline
    def desc: typings.tabulatorTables.tabulatorTablesStrings.desc = "desc".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.desc]
  }
  
  @js.native
  trait Sorter extends StObject {
    
    var column: String = js.native
    
    var dir: SortDirection = js.native
  }
  object Sorter {
    
    @scala.inline
    def apply(column: String, dir: SortDirection): Sorter = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sorter]
    }
    
    @scala.inline
    implicit class SorterMutableBuilder[Self <: Sorter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: SortDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SorterFromTable extends StObject {
    
    /** The column component for the sorted column. */
    var column: ColumnComponent = js.native
    
    /** A string of either `asc` or `desc` indicating the direction of sort. */
    var dir: SortDirection = js.native
    
    /** A string of the field name for the sorted column. */
    var field: String = js.native
  }
  object SorterFromTable {
    
    @scala.inline
    def apply(column: ColumnComponent, dir: SortDirection, field: String): SorterFromTable = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SorterFromTable]
    }
    
    @scala.inline
    implicit class SorterFromTableMutableBuilder[Self <: SorterFromTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: SortDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  type StandardStringParam = String | HTMLElement | (js.Function0[String | HTMLElement])
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.required
    - typings.tabulatorTables.tabulatorTablesStrings.unique
    - typings.tabulatorTables.tabulatorTablesStrings.integer
    - typings.tabulatorTables.tabulatorTablesStrings.float
    - typings.tabulatorTables.tabulatorTablesStrings.numeric
    - typings.tabulatorTables.tabulatorTablesStrings.string
  */
  trait StandardValidatorType extends StObject
  object StandardValidatorType {
    
    @scala.inline
    def float: typings.tabulatorTables.tabulatorTablesStrings.float = "float".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.float]
    
    @scala.inline
    def integer: typings.tabulatorTables.tabulatorTablesStrings.integer = "integer".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.integer]
    
    @scala.inline
    def numeric: typings.tabulatorTables.tabulatorTablesStrings.numeric = "numeric".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.numeric]
    
    @scala.inline
    def required: typings.tabulatorTables.tabulatorTablesStrings.required = "required".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.required]
    
    @scala.inline
    def string: typings.tabulatorTables.tabulatorTablesStrings.string = "string".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.string]
    
    @scala.inline
    def unique: typings.tabulatorTables.tabulatorTablesStrings.unique = "unique".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.unique]
  }
  
  @js.native
  trait StarRatingParams extends _FormatterParams {
    
    // Star Rating
    var stars: js.UndefOr[Double] = js.native
  }
  object StarRatingParams {
    
    @scala.inline
    def apply(): StarRatingParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarRatingParams]
    }
    
    @scala.inline
    implicit class StarRatingParamsMutableBuilder[Self <: StarRatingParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStars(value: Double): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarsUndefined: Self = StObject.set(x, "stars", js.undefined)
    }
  }
  
  @js.native
  trait TextAreaParams
    extends SharedEditorParams
       with _EditorParams {
    
    var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
  }
  object TextAreaParams {
    
    @scala.inline
    def apply(): TextAreaParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaParams]
    }
    
    @scala.inline
    implicit class TextAreaParamsMutableBuilder[Self <: TextAreaParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerticalNavigation(value: editor | table | hybrid): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.auto
    - typings.tabulatorTables.tabulatorTablesStrings.ltr
    - typings.tabulatorTables.tabulatorTablesStrings.rtl
  */
  trait TextDirection extends StObject
  object TextDirection {
    
    @scala.inline
    def auto: typings.tabulatorTables.tabulatorTablesStrings.auto = "auto".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.auto]
    
    @scala.inline
    def ltr: typings.tabulatorTables.tabulatorTablesStrings.ltr = "ltr".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.ltr]
    
    @scala.inline
    def rtl: typings.tabulatorTables.tabulatorTablesStrings.rtl = "rtl".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.rtl]
  }
  
  @js.native
  trait TickCrossParams extends _FormatterParams {
    
    // Tick Cross
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var allowTruthy: js.UndefOr[Boolean] = js.native
    
    var crossElement: js.UndefOr[Boolean | String] = js.native
    
    var tickElement: js.UndefOr[Boolean | String] = js.native
  }
  object TickCrossParams {
    
    @scala.inline
    def apply(): TickCrossParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TickCrossParams]
    }
    
    @scala.inline
    implicit class TickCrossParamsMutableBuilder[Self <: TickCrossParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setAllowTruthy(value: Boolean): Self = StObject.set(x, "allowTruthy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTruthyUndefined: Self = StObject.set(x, "allowTruthy", js.undefined)
      
      @scala.inline
      def setCrossElement(value: Boolean | String): Self = StObject.set(x, "crossElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossElementUndefined: Self = StObject.set(x, "crossElement", js.undefined)
      
      @scala.inline
      def setTickElement(value: Boolean | String): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
    }
  }
  
  @js.native
  trait TrafficParams extends _FormatterParams {
    
    var color: js.UndefOr[Color] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    // Traffic
    var min: js.UndefOr[Double] = js.native
  }
  object TrafficParams {
    
    @scala.inline
    def apply(): TrafficParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficParams]
    }
    
    @scala.inline
    implicit class TrafficParamsMutableBuilder[Self <: TrafficParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorFunction1(value: /* value */ js.Any => String): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: js.Any*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait Validator extends StObject {
    
    var parameters: js.UndefOr[js.Any] = js.native
    
    var `type`: StandardValidatorType | (js.Function3[
        /* cell */ CellComponent, 
        /* value */ js.Any, 
        /* parameters */ js.UndefOr[js.Any], 
        Boolean
      ]) = js.native
  }
  object Validator {
    
    @scala.inline
    def apply(
      `type`: StandardValidatorType | (js.Function3[
          /* cell */ CellComponent, 
          /* value */ js.Any, 
          /* parameters */ js.UndefOr[js.Any], 
          Boolean
        ])
    ): Validator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validator]
    }
    
    @scala.inline
    implicit class ValidatorMutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setType(
        value: StandardValidatorType | (js.Function3[
              /* cell */ CellComponent, 
              /* value */ js.Any, 
              /* parameters */ js.UndefOr[js.Any], 
              Boolean
            ])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction3(
        value: (/* cell */ CellComponent, /* value */ js.Any, /* parameters */ js.UndefOr[js.Any]) => Boolean
      ): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
    }
  }
  
  type ValueBooleanCallback = js.Function1[/* value */ js.Any, Boolean]
  
  type ValueStringCallback = js.Function1[/* value */ js.Any, String]
  
  type ValueVoidCallback = js.Function1[/* value */ js.Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tabulatorTables.tabulatorTablesStrings.top
    - typings.tabulatorTables.tabulatorTablesStrings.middle
    - typings.tabulatorTables.tabulatorTablesStrings.bottom
  */
  trait VerticalAlign extends StObject
  object VerticalAlign {
    
    @scala.inline
    def bottom: typings.tabulatorTables.tabulatorTablesStrings.bottom = "bottom".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.bottom]
    
    @scala.inline
    def middle: typings.tabulatorTables.tabulatorTablesStrings.middle = "middle".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.middle]
    
    @scala.inline
    def top: typings.tabulatorTables.tabulatorTablesStrings.top = "top".asInstanceOf[typings.tabulatorTables.tabulatorTablesStrings.top]
  }
  
  trait _ColumnCalc extends StObject
  
  trait _ColumnLookup extends StObject
  
  trait _Editor extends StObject
  
  trait _EditorParams extends StObject
  object _EditorParams {
    
    @scala.inline
    def AutoCompleteParams(values: `true` | (js.Array[_ | String]) | JSONRecord | String): typings.tabulatorTables.Tabulator.AutoCompleteParams = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.AutoCompleteParams]
    }
    
    @scala.inline
    def CheckboxParams(): typings.tabulatorTables.Tabulator.CheckboxParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.CheckboxParams]
    }
    
    @scala.inline
    def InputParams(): typings.tabulatorTables.Tabulator.InputParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.InputParams]
    }
    
    @scala.inline
    def NumberParams(): typings.tabulatorTables.Tabulator.NumberParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.NumberParams]
    }
    
    @scala.inline
    def SelectParams(values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): typings.tabulatorTables.Tabulator.SelectParams = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.SelectParams]
    }
    
    @scala.inline
    def TextAreaParams(): typings.tabulatorTables.Tabulator.TextAreaParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.TextAreaParams]
    }
  }
  
  trait _Formatter extends StObject
  
  trait _FormatterParams extends StObject
  object _FormatterParams {
    
    @scala.inline
    def DateTimeDifferenceParams(): typings.tabulatorTables.Tabulator.DateTimeDifferenceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.DateTimeDifferenceParams]
    }
    
    @scala.inline
    def DateTimeParams(): typings.tabulatorTables.Tabulator.DateTimeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.DateTimeParams]
    }
    
    @scala.inline
    def ImageParams(): typings.tabulatorTables.Tabulator.ImageParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.ImageParams]
    }
    
    @scala.inline
    def LinkParams(): typings.tabulatorTables.Tabulator.LinkParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.LinkParams]
    }
    
    @scala.inline
    def MoneyParams(): typings.tabulatorTables.Tabulator.MoneyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.MoneyParams]
    }
    
    @scala.inline
    def RowSelectionParams(): typings.tabulatorTables.Tabulator.RowSelectionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.RowSelectionParams]
    }
    
    @scala.inline
    def StarRatingParams(): typings.tabulatorTables.Tabulator.StarRatingParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.StarRatingParams]
    }
    
    @scala.inline
    def TickCrossParams(): typings.tabulatorTables.Tabulator.TickCrossParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.TickCrossParams]
    }
    
    @scala.inline
    def TrafficParams(): typings.tabulatorTables.Tabulator.TrafficParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.tabulatorTables.Tabulator.TrafficParams]
    }
  }
}
