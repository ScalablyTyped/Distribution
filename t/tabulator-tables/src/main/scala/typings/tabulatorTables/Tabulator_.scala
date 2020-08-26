package typings.tabulatorTables

import typings.std.HTMLElement
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
import typings.tabulatorTables.Tabulator.Options
import typings.tabulatorTables.Tabulator.RowComponent
import typings.tabulatorTables.Tabulator.RowLookup
import typings.tabulatorTables.Tabulator.RowRangeLookup
import typings.tabulatorTables.Tabulator.ScrollToColumnPosition
import typings.tabulatorTables.Tabulator.ScrollToRowPostition
import typings.tabulatorTables.Tabulator.SortDirection
import typings.tabulatorTables.Tabulator.Sorter
import typings.tabulatorTables.Tabulator.SorterFromTable
import typings.tabulatorTables.Tabulator.VisibleRowRangeLookup
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.active
import typings.tabulatorTables.tabulatorTablesStrings.all
import typings.tabulatorTables.tabulatorTablesStrings.first
import typings.tabulatorTables.tabulatorTablesStrings.last
import typings.tabulatorTables.tabulatorTablesStrings.next
import typings.tabulatorTables.tabulatorTablesStrings.prev
import typings.tabulatorTables.tabulatorTablesStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tabulator.prototype.(?!registerModule|helpers|_)\w+
@js.native
trait Tabulator_ extends js.Object {
  /** If you want to add another filter to the existing filters then you can call the addFilter function: */
  @JSName("addFilter")
  var addFilter_Original: FilterFunction = js.native
  var browser: String = js.native
  var browserSlow: Boolean = js.native
  var columnManager: js.Any = js.native
  var element: HTMLElement = js.native
  var footerManager: js.Any = js.native
  var modules: js.Any = js.native
  var options: Options = js.native
  /** If you want to remove one filter from the current list of filters you can use the removeFilter function: */
  @JSName("removeFilter")
  var removeFilter_Original: FilterFunction = js.native
  var rowManager: js.Any = js.native
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
  /** A lot of the modules come with a range of default settings to make setting up your table easier, for example the sorters, formatters and editors that ship with Tabulator as standard.
    If you are using a lot of custom settings over and over again (for example a custom sorter). you can end up re-delcaring it several time for different tables. To make your life easier Tabulator allows you to extend the default setup of each module to make your custom options as easily accessible as the defaults.
    Using the extendModule function on the global Tabulator variable allows you to globally add these options to all tables.
    The function takes three arguments, the name of the module, the name of the property you want to extend, and an object containing the elements you want to add in your module. In the example below we extend the format module to add two new default formatters: */
  def extendModule(name: String, property: String, values: js.Object): Unit = js.native
  /** Lookup table objects for any existing table using the element they were created on. */
  def findTable(query: String): js.Array[Tabulator] = js.native
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
  def getData(activeOnly: VisibleRowRangeLookup): js.Array[_] = js.native
  def getDataCount(): Double = js.native
  def getDataCount(activeOnly: VisibleRowRangeLookup): Double = js.native
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
  def getRows(activeOnly: VisibleRowRangeLookup): js.Array[RowComponent] = js.native
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
  @JSName("selectRow")
  def selectRow_active(lookup: active): Unit = js.native
  @JSName("selectRow")
  def selectRow_all(lookup: all): Unit = js.native
  @JSName("selectRow")
  def selectRow_true(lookup: `true`): Unit = js.native
  @JSName("selectRow")
  def selectRow_visible(lookup: visible): Unit = js.native
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
    
    Once complete, this function will trigger the rowUpdated and dataEdited events.
    This function will return true if the update was successful or false if the requested row could not be found. If the new data matches the existing row data, no update will be performed.
    */
  def updateRow(row: RowLookup, data: js.Object): Boolean = js.native
  /**You can validate the whole table in one go by calling the validate method on the table instance.
    *
    * This will return a value of true if every cell passes validation, if any cells fail, then it will return an array of Cell Components representing each cell that has failed validation.
    */
  def validate(): `true` | js.Array[CellComponent] = js.native
}

