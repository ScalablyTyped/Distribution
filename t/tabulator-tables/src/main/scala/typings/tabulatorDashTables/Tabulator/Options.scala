package typings.tabulatorDashTables.Tabulator

import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import typings.tabulatorDashTables.Anon_ColumnCalcs
import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`false`
import typings.tabulatorDashTables.tabulatorDashTablesBooleans.`true`
import typings.tabulatorDashTables.tabulatorDashTablesStrings.active
import typings.tabulatorDashTables.tabulatorDashTablesStrings.add
import typings.tabulatorDashTables.tabulatorDashTablesStrings.arrow
import typings.tabulatorDashTables.tabulatorDashTablesStrings.both
import typings.tabulatorDashTables.tabulatorDashTablesStrings.bottom
import typings.tabulatorDashTables.tabulatorDashTablesStrings.cell
import typings.tabulatorDashTables.tabulatorDashTablesStrings.click
import typings.tabulatorDashTables.tabulatorDashTablesStrings.collapse
import typings.tabulatorDashTables.tabulatorDashTablesStrings.columns
import typings.tabulatorDashTables.tabulatorDashTablesStrings.cookie
import typings.tabulatorDashTables.tabulatorDashTablesStrings.copy
import typings.tabulatorDashTables.tabulatorDashTablesStrings.delete
import typings.tabulatorDashTables.tabulatorDashTablesStrings.field
import typings.tabulatorDashTables.tabulatorDashTablesStrings.filter
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitColumns
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitData
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitDataFill
import typings.tabulatorDashTables.tabulatorDashTablesStrings.fitDataStretch
import typings.tabulatorDashTables.tabulatorDashTablesStrings.form
import typings.tabulatorDashTables.tabulatorDashTablesStrings.group
import typings.tabulatorDashTables.tabulatorDashTablesStrings.header
import typings.tabulatorDashTables.tabulatorDashTablesStrings.hide
import typings.tabulatorDashTables.tabulatorDashTablesStrings.highlight
import typings.tabulatorDashTables.tabulatorDashTablesStrings.insert
import typings.tabulatorDashTables.tabulatorDashTablesStrings.json
import typings.tabulatorDashTables.tabulatorDashTablesStrings.load
import typings.tabulatorDashTables.tabulatorDashTablesStrings.local
import typings.tabulatorDashTables.tabulatorDashTablesStrings.middle
import typings.tabulatorDashTables.tabulatorDashTablesStrings.page
import typings.tabulatorDashTables.tabulatorDashTablesStrings.paste
import typings.tabulatorDashTables.tabulatorDashTablesStrings.remote
import typings.tabulatorDashTables.tabulatorDashTablesStrings.replace
import typings.tabulatorDashTables.tabulatorDashTablesStrings.scroll
import typings.tabulatorDashTables.tabulatorDashTablesStrings.selected
import typings.tabulatorDashTables.tabulatorDashTablesStrings.sort
import typings.tabulatorDashTables.tabulatorDashTablesStrings.table
import typings.tabulatorDashTables.tabulatorDashTablesStrings.top
import typings.tabulatorDashTables.tabulatorDashTablesStrings.update
import typings.tabulatorDashTables.tabulatorDashTablesStrings.value
import typings.tabulatorDashTables.tabulatorDashTablesStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tabulatorDashTables.Tabulator.OptionsCell because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined  */ trait Options
  extends OptionsCells
     with OptionsGeneral
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
     with OptionsHTML

object Options {
  @scala.inline
  def apply(
    addRowPos: bottom | top = null,
    ajaxConfig: HttpMethod | AjaxConfig = null,
    ajaxContentType: form | json | AjaxContentType = null,
    ajaxError: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Unit = null,
    ajaxFiltering: js.UndefOr[Boolean] = js.undefined,
    ajaxLoader: Boolean | js.Function0[Boolean] = null,
    ajaxLoaderError: String = null,
    ajaxLoaderLoading: String = null,
    ajaxParams: js.Object = null,
    ajaxProgressiveLoad: load | scroll = null,
    ajaxProgressiveLoadDelay: Int | Double = null,
    ajaxProgressiveLoadScrollMargin: Int | Double = null,
    ajaxRequestFunc: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_] = null,
    ajaxRequesting: (/* url */ String, /* params */ js.Any) => Boolean = null,
    ajaxResponse: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => _ = null,
    ajaxSorting: js.UndefOr[Boolean] = js.undefined,
    ajaxURL: String = null,
    ajaxURLGenerator: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => String = null,
    autoColumns: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    blockRedraw: () => Unit = null,
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellEditCancelled: /* cell */ CellComponent => Unit = null,
    cellEdited: /* cell */ CellComponent => Unit = null,
    cellEditing: /* cell */ CellComponent => Unit = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    clipboard: Boolean | copy | paste = null,
    clipboardCopied: () => Unit = null,
    clipboardCopyConfig: Anon_ColumnCalcs | Boolean = null,
    clipboardCopyFormatter: table | (js.Function1[/* rowData */ js.Array[_], String]) = null,
    clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined,
    clipboardCopySelector: active | table | selected | visible = null,
    clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined,
    clipboardPasteAction: insert | update | replace = null,
    clipboardPasteError: () => Unit = null,
    clipboardPasteParser: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]]) = null,
    clipboardPasted: () => Unit = null,
    columnCalcs: Boolean | both | table | group = null,
    columnHeaderSortMulti: js.UndefOr[Boolean] = js.undefined,
    columnHeaderVertAlign: top | middle | bottom = null,
    columnMinWidth: Int | Double = null,
    columnMoved: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => Unit = null,
    columnResized: /* column */ ColumnComponent => Unit = null,
    columnTitleChanged: /* column */ ColumnComponent => Unit = null,
    columnVisibilityChanged: (/* column */ ColumnComponent, /* visible */ Boolean) => Unit = null,
    columns: js.Array[ColumnDefinition] = null,
    data: js.Array[_] = null,
    dataEdited: /* data */ js.Any => Unit = null,
    dataFiltered: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Unit = null,
    dataFiltering: /* filters */ js.Array[Filter] => Unit = null,
    dataGrouped: () => Unit = null,
    dataGrouping: () => Unit = null,
    dataLoaded: /* data */ js.Any => Unit = null,
    dataLoading: /* data */ js.Any => Unit = null,
    dataSorted: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Unit = null,
    dataSorting: /* sorters */ js.Array[Sorter] => Unit = null,
    dataTree: js.UndefOr[Boolean] = js.undefined,
    dataTreeBranchElement: Boolean | String = null,
    dataTreeChildField: String = null,
    dataTreeChildIndent: Int | Double = null,
    dataTreeCollapseElement: String | HTMLElement | Boolean = null,
    dataTreeElementColumn: Boolean | String = null,
    dataTreeExpandElement: String | HTMLElement | Boolean = null,
    dataTreeRowCollapsed: (/* row */ RowComponent, /* level */ Double) => Unit = null,
    dataTreeRowExpanded: (/* row */ RowComponent, /* level */ Double) => Unit = null,
    dataTreeStartExpanded: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean]) = null,
    downloadComplete: () => Unit = null,
    downloadConfig: AddditionalExportOptions = null,
    downloadDataFormatter: /* data */ js.Array[_] => _ = null,
    downloadReady: (/* fileContents */ js.Any, /* blob */ js.Any) => _ = null,
    footerElement: String | HTMLElement = null,
    groupBy: String | (js.Function1[/* data */ js.Any, _]) = null,
    groupClick: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupClosedShowCalcs: js.UndefOr[Boolean] = js.undefined,
    groupContext: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupDblClick: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupDblTap: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupHeader: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null,
    groupStartOpen: Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ]) = null,
    groupTap: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupTapHold: (/* e */ js.Any, /* group */ GroupComponent) => Unit = null,
    groupToggleElement: arrow | header | `false` = null,
    groupValues: js.Array[js.Array[_]] = null,
    groupVisibilityChanged: (/* group */ GroupComponent, /* visible */ Boolean) => Unit = null,
    headerFilterPlaceholder: String = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerVisible: js.UndefOr[Boolean] = js.undefined,
    height: String | Double | `false` = null,
    history: js.UndefOr[Boolean] = js.undefined,
    historyRedo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit = null,
    historyUndo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Unit = null,
    htmlImported: /* callback */ js.Function0[Unit] => Unit = null,
    htmlImporting: /* callback */ js.Function0[Unit] => Unit = null,
    htmlOutputConfig: AddditionalExportOptions = null,
    index: Double | String = null,
    initialFilter: js.Array[Filter] = null,
    initialHeaderFilter: js.Array[Pick[Filter, field | value]] = null,
    initialSort: js.Array[Sorter] = null,
    invalidOptionWarnings: js.UndefOr[Boolean] = js.undefined,
    keybindings: `false` | KeyBinding = null,
    langs: js.Any = null,
    layout: fitData | fitColumns | fitDataFill | fitDataStretch = null,
    layoutColumnsOnNewData: js.UndefOr[Boolean] = js.undefined,
    locale: Boolean | String = null,
    localized: (/* locale */ String, /* lang */ js.Any) => Unit = null,
    movableColumns: js.UndefOr[Boolean] = js.undefined,
    movableRows: js.UndefOr[Boolean] = js.undefined,
    movableRowsConnectedTables: String | (js.Array[HTMLElement | String]) | HTMLElement = null,
    movableRowsReceived: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typings.tabulatorDashTables.Tabulator) => Unit = null,
    movableRowsReceivedFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typings.tabulatorDashTables.Tabulator) => Unit = null,
    movableRowsReceiver: insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typings.tabulatorDashTables.Tabulator, 
      _
    ]) = null,
    movableRowsReceivingStart: (/* fromRow */ RowComponent, /* toTable */ typings.tabulatorDashTables.Tabulator) => Unit = null,
    movableRowsReceivingStop: /* fromTable */ typings.tabulatorDashTables.Tabulator => Unit = null,
    movableRowsSender: `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typings.tabulatorDashTables.Tabulator, 
      _
    ]) = null,
    movableRowsSendingStart: /* toTables */ js.Array[_] => Unit = null,
    movableRowsSendingStop: /* toTables */ js.Array[_] => Unit = null,
    movableRowsSent: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typings.tabulatorDashTables.Tabulator) => Unit = null,
    movableRowsSentFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typings.tabulatorDashTables.Tabulator) => Unit = null,
    nestedFieldSeparator: String | Boolean = null,
    pageLoaded: /* pageno */ Double => Unit = null,
    pagination: remote | local = null,
    paginationAddRow: table | page = null,
    paginationButtonCount: Int | Double = null,
    paginationDataReceived: Record[String, String] = null,
    paginationDataSent: Record[String, String] = null,
    paginationElement: HTMLElement | String = null,
    paginationInitialPage: Int | Double = null,
    paginationSize: Int | Double = null,
    paginationSizeSelector: `true` | js.Array[Double] = null,
    persistence: `true` | PersistenceOptions = null,
    persistenceID: String = null,
    persistenceMode: local | cookie | `true` = null,
    persistenceReaderFunc: (/* id */ String, /* type */ sort | filter | group | page | columns) => _ = null,
    persistenceWriterFunc: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => _ = null,
    persistentFilter: js.UndefOr[Boolean] = js.undefined,
    persistentLayout: js.UndefOr[Boolean] = js.undefined,
    persistentSort: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | HTMLElement = null,
    print: js.UndefOr[Boolean] = js.undefined,
    printAsHtml: js.UndefOr[Boolean] = js.undefined,
    printConfig: AddditionalExportOptions = null,
    printCopyStyle: js.UndefOr[Boolean] = js.undefined,
    printFooter: StandardStringParam = null,
    printFormatter: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => _ = null,
    printHeader: StandardStringParam = null,
    printVisibleRows: js.UndefOr[Boolean] = js.undefined,
    reactiveData: js.UndefOr[Boolean] = js.undefined,
    renderComplete: () => Unit = null,
    renderStarted: () => Unit = null,
    resizableColumns: `true` | `false` | header | cell = null,
    resizableRows: js.UndefOr[Boolean] = js.undefined,
    responsiveLayout: Boolean | hide | collapse = null,
    responsiveLayoutCollapseFormatter: /* data */ js.Array[_] => _ = null,
    responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.undefined,
    responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.undefined,
    restoreRedraw: () => Unit = null,
    rowAdded: /* row */ RowComponent => Unit = null,
    rowClick: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowContext: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowDblClick: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowDblTap: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowDeleted: /* row */ RowComponent => Unit = null,
    rowDeselected: /* row */ RowComponent => Unit = null,
    rowFormatter: /* row */ RowComponent => _ = null,
    rowMouseEnter: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowMouseLeave: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowMouseMove: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowMouseOut: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowMouseOver: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowMoved: /* row */ RowComponent => Unit = null,
    rowResized: /* row */ RowComponent => Unit = null,
    rowSelected: /* row */ RowComponent => Unit = null,
    rowSelectionChanged: (/* data */ js.Array[_], /* rows */ js.Array[RowComponent]) => Unit = null,
    rowTap: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowTapHold: (/* e */ js.Any, /* row */ RowComponent) => Unit = null,
    rowUpdated: /* row */ RowComponent => Unit = null,
    scrollHorizontal: /* left */ js.Any => Unit = null,
    scrollToColumnIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToColumnPosition: ScrollToColumnPosition = null,
    scrollToRowIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToRowPosition: ScrollToRowPostition = null,
    scrollVertical: /* top */ js.Any => Unit = null,
    selectable: Boolean | Double | highlight = null,
    selectableCheck: /* row */ RowComponent => Boolean = null,
    selectablePersistence: js.UndefOr[Boolean] = js.undefined,
    selectableRangeMode: click = null,
    selectableRollingSelection: js.UndefOr[Boolean] = js.undefined,
    sortOrderReverse: js.UndefOr[Boolean] = js.undefined,
    tabEndNewRow: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _]) = null,
    tableBuilding: () => Unit = null,
    tableBuilt: () => Unit = null,
    tooltipGenerationMode: load = null,
    tooltips: GlobalTooltipOption = null,
    tooltipsHeader: js.UndefOr[Boolean] = js.undefined,
    validationFailed: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit = null,
    virtualDom: js.UndefOr[Boolean] = js.undefined,
    virtualDomBuffer: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addRowPos != null) __obj.updateDynamic("addRowPos")(addRowPos.asInstanceOf[js.Any])
    if (ajaxConfig != null) __obj.updateDynamic("ajaxConfig")(ajaxConfig.asInstanceOf[js.Any])
    if (ajaxContentType != null) __obj.updateDynamic("ajaxContentType")(ajaxContentType.asInstanceOf[js.Any])
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction3(ajaxError))
    if (!js.isUndefined(ajaxFiltering)) __obj.updateDynamic("ajaxFiltering")(ajaxFiltering.asInstanceOf[js.Any])
    if (ajaxLoader != null) __obj.updateDynamic("ajaxLoader")(ajaxLoader.asInstanceOf[js.Any])
    if (ajaxLoaderError != null) __obj.updateDynamic("ajaxLoaderError")(ajaxLoaderError.asInstanceOf[js.Any])
    if (ajaxLoaderLoading != null) __obj.updateDynamic("ajaxLoaderLoading")(ajaxLoaderLoading.asInstanceOf[js.Any])
    if (ajaxParams != null) __obj.updateDynamic("ajaxParams")(ajaxParams.asInstanceOf[js.Any])
    if (ajaxProgressiveLoad != null) __obj.updateDynamic("ajaxProgressiveLoad")(ajaxProgressiveLoad.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadDelay != null) __obj.updateDynamic("ajaxProgressiveLoadDelay")(ajaxProgressiveLoadDelay.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadScrollMargin != null) __obj.updateDynamic("ajaxProgressiveLoadScrollMargin")(ajaxProgressiveLoadScrollMargin.asInstanceOf[js.Any])
    if (ajaxRequestFunc != null) __obj.updateDynamic("ajaxRequestFunc")(js.Any.fromFunction3(ajaxRequestFunc))
    if (ajaxRequesting != null) __obj.updateDynamic("ajaxRequesting")(js.Any.fromFunction2(ajaxRequesting))
    if (ajaxResponse != null) __obj.updateDynamic("ajaxResponse")(js.Any.fromFunction3(ajaxResponse))
    if (!js.isUndefined(ajaxSorting)) __obj.updateDynamic("ajaxSorting")(ajaxSorting.asInstanceOf[js.Any])
    if (ajaxURL != null) __obj.updateDynamic("ajaxURL")(ajaxURL.asInstanceOf[js.Any])
    if (ajaxURLGenerator != null) __obj.updateDynamic("ajaxURLGenerator")(js.Any.fromFunction3(ajaxURLGenerator))
    if (!js.isUndefined(autoColumns)) __obj.updateDynamic("autoColumns")(autoColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (blockRedraw != null) __obj.updateDynamic("blockRedraw")(js.Any.fromFunction0(blockRedraw))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2(cellClick))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2(cellContext))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2(cellDblClick))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2(cellDblTap))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1(cellEditCancelled))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1(cellEdited))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1(cellEditing))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2(cellMouseLeave))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2(cellMouseMove))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2(cellMouseOut))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2(cellMouseOver))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2(cellTap))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2(cellTapHold))
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (clipboardCopied != null) __obj.updateDynamic("clipboardCopied")(js.Any.fromFunction0(clipboardCopied))
    if (clipboardCopyConfig != null) __obj.updateDynamic("clipboardCopyConfig")(clipboardCopyConfig.asInstanceOf[js.Any])
    if (clipboardCopyFormatter != null) __obj.updateDynamic("clipboardCopyFormatter")(clipboardCopyFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyHeader)) __obj.updateDynamic("clipboardCopyHeader")(clipboardCopyHeader.asInstanceOf[js.Any])
    if (clipboardCopySelector != null) __obj.updateDynamic("clipboardCopySelector")(clipboardCopySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyStyled)) __obj.updateDynamic("clipboardCopyStyled")(clipboardCopyStyled.asInstanceOf[js.Any])
    if (clipboardPasteAction != null) __obj.updateDynamic("clipboardPasteAction")(clipboardPasteAction.asInstanceOf[js.Any])
    if (clipboardPasteError != null) __obj.updateDynamic("clipboardPasteError")(js.Any.fromFunction0(clipboardPasteError))
    if (clipboardPasteParser != null) __obj.updateDynamic("clipboardPasteParser")(clipboardPasteParser.asInstanceOf[js.Any])
    if (clipboardPasted != null) __obj.updateDynamic("clipboardPasted")(js.Any.fromFunction0(clipboardPasted))
    if (columnCalcs != null) __obj.updateDynamic("columnCalcs")(columnCalcs.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaderSortMulti)) __obj.updateDynamic("columnHeaderSortMulti")(columnHeaderSortMulti.asInstanceOf[js.Any])
    if (columnHeaderVertAlign != null) __obj.updateDynamic("columnHeaderVertAlign")(columnHeaderVertAlign.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnMoved != null) __obj.updateDynamic("columnMoved")(js.Any.fromFunction2(columnMoved))
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction1(columnResized))
    if (columnTitleChanged != null) __obj.updateDynamic("columnTitleChanged")(js.Any.fromFunction1(columnTitleChanged))
    if (columnVisibilityChanged != null) __obj.updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2(columnVisibilityChanged))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataEdited != null) __obj.updateDynamic("dataEdited")(js.Any.fromFunction1(dataEdited))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2(dataFiltered))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction1(dataFiltering))
    if (dataGrouped != null) __obj.updateDynamic("dataGrouped")(js.Any.fromFunction0(dataGrouped))
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(js.Any.fromFunction0(dataGrouping))
    if (dataLoaded != null) __obj.updateDynamic("dataLoaded")(js.Any.fromFunction1(dataLoaded))
    if (dataLoading != null) __obj.updateDynamic("dataLoading")(js.Any.fromFunction1(dataLoading))
    if (dataSorted != null) __obj.updateDynamic("dataSorted")(js.Any.fromFunction2(dataSorted))
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(js.Any.fromFunction1(dataSorting))
    if (!js.isUndefined(dataTree)) __obj.updateDynamic("dataTree")(dataTree.asInstanceOf[js.Any])
    if (dataTreeBranchElement != null) __obj.updateDynamic("dataTreeBranchElement")(dataTreeBranchElement.asInstanceOf[js.Any])
    if (dataTreeChildField != null) __obj.updateDynamic("dataTreeChildField")(dataTreeChildField.asInstanceOf[js.Any])
    if (dataTreeChildIndent != null) __obj.updateDynamic("dataTreeChildIndent")(dataTreeChildIndent.asInstanceOf[js.Any])
    if (dataTreeCollapseElement != null) __obj.updateDynamic("dataTreeCollapseElement")(dataTreeCollapseElement.asInstanceOf[js.Any])
    if (dataTreeElementColumn != null) __obj.updateDynamic("dataTreeElementColumn")(dataTreeElementColumn.asInstanceOf[js.Any])
    if (dataTreeExpandElement != null) __obj.updateDynamic("dataTreeExpandElement")(dataTreeExpandElement.asInstanceOf[js.Any])
    if (dataTreeRowCollapsed != null) __obj.updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2(dataTreeRowCollapsed))
    if (dataTreeRowExpanded != null) __obj.updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2(dataTreeRowExpanded))
    if (dataTreeStartExpanded != null) __obj.updateDynamic("dataTreeStartExpanded")(dataTreeStartExpanded.asInstanceOf[js.Any])
    if (downloadComplete != null) __obj.updateDynamic("downloadComplete")(js.Any.fromFunction0(downloadComplete))
    if (downloadConfig != null) __obj.updateDynamic("downloadConfig")(downloadConfig.asInstanceOf[js.Any])
    if (downloadDataFormatter != null) __obj.updateDynamic("downloadDataFormatter")(js.Any.fromFunction1(downloadDataFormatter))
    if (downloadReady != null) __obj.updateDynamic("downloadReady")(js.Any.fromFunction2(downloadReady))
    if (footerElement != null) __obj.updateDynamic("footerElement")(footerElement.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupClick != null) __obj.updateDynamic("groupClick")(js.Any.fromFunction2(groupClick))
    if (!js.isUndefined(groupClosedShowCalcs)) __obj.updateDynamic("groupClosedShowCalcs")(groupClosedShowCalcs.asInstanceOf[js.Any])
    if (groupContext != null) __obj.updateDynamic("groupContext")(js.Any.fromFunction2(groupContext))
    if (groupDblClick != null) __obj.updateDynamic("groupDblClick")(js.Any.fromFunction2(groupDblClick))
    if (groupDblTap != null) __obj.updateDynamic("groupDblTap")(js.Any.fromFunction2(groupDblTap))
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (groupStartOpen != null) __obj.updateDynamic("groupStartOpen")(groupStartOpen.asInstanceOf[js.Any])
    if (groupTap != null) __obj.updateDynamic("groupTap")(js.Any.fromFunction2(groupTap))
    if (groupTapHold != null) __obj.updateDynamic("groupTapHold")(js.Any.fromFunction2(groupTapHold))
    if (groupToggleElement != null) __obj.updateDynamic("groupToggleElement")(groupToggleElement.asInstanceOf[js.Any])
    if (groupValues != null) __obj.updateDynamic("groupValues")(groupValues.asInstanceOf[js.Any])
    if (groupVisibilityChanged != null) __obj.updateDynamic("groupVisibilityChanged")(js.Any.fromFunction2(groupVisibilityChanged))
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.asInstanceOf[js.Any])
    if (!js.isUndefined(headerVisible)) __obj.updateDynamic("headerVisible")(headerVisible.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyRedo != null) __obj.updateDynamic("historyRedo")(js.Any.fromFunction3(historyRedo))
    if (historyUndo != null) __obj.updateDynamic("historyUndo")(js.Any.fromFunction3(historyUndo))
    if (htmlImported != null) __obj.updateDynamic("htmlImported")(js.Any.fromFunction1(htmlImported))
    if (htmlImporting != null) __obj.updateDynamic("htmlImporting")(js.Any.fromFunction1(htmlImporting))
    if (htmlOutputConfig != null) __obj.updateDynamic("htmlOutputConfig")(htmlOutputConfig.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (initialFilter != null) __obj.updateDynamic("initialFilter")(initialFilter.asInstanceOf[js.Any])
    if (initialHeaderFilter != null) __obj.updateDynamic("initialHeaderFilter")(initialHeaderFilter.asInstanceOf[js.Any])
    if (initialSort != null) __obj.updateDynamic("initialSort")(initialSort.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidOptionWarnings)) __obj.updateDynamic("invalidOptionWarnings")(invalidOptionWarnings.asInstanceOf[js.Any])
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings.asInstanceOf[js.Any])
    if (langs != null) __obj.updateDynamic("langs")(langs.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutColumnsOnNewData)) __obj.updateDynamic("layoutColumnsOnNewData")(layoutColumnsOnNewData.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(js.Any.fromFunction2(localized))
    if (!js.isUndefined(movableColumns)) __obj.updateDynamic("movableColumns")(movableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(movableRows)) __obj.updateDynamic("movableRows")(movableRows.asInstanceOf[js.Any])
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
    if (nestedFieldSeparator != null) __obj.updateDynamic("nestedFieldSeparator")(nestedFieldSeparator.asInstanceOf[js.Any])
    if (pageLoaded != null) __obj.updateDynamic("pageLoaded")(js.Any.fromFunction1(pageLoaded))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationAddRow != null) __obj.updateDynamic("paginationAddRow")(paginationAddRow.asInstanceOf[js.Any])
    if (paginationButtonCount != null) __obj.updateDynamic("paginationButtonCount")(paginationButtonCount.asInstanceOf[js.Any])
    if (paginationDataReceived != null) __obj.updateDynamic("paginationDataReceived")(paginationDataReceived.asInstanceOf[js.Any])
    if (paginationDataSent != null) __obj.updateDynamic("paginationDataSent")(paginationDataSent.asInstanceOf[js.Any])
    if (paginationElement != null) __obj.updateDynamic("paginationElement")(paginationElement.asInstanceOf[js.Any])
    if (paginationInitialPage != null) __obj.updateDynamic("paginationInitialPage")(paginationInitialPage.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (paginationSizeSelector != null) __obj.updateDynamic("paginationSizeSelector")(paginationSizeSelector.asInstanceOf[js.Any])
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistenceID != null) __obj.updateDynamic("persistenceID")(persistenceID.asInstanceOf[js.Any])
    if (persistenceMode != null) __obj.updateDynamic("persistenceMode")(persistenceMode.asInstanceOf[js.Any])
    if (persistenceReaderFunc != null) __obj.updateDynamic("persistenceReaderFunc")(js.Any.fromFunction2(persistenceReaderFunc))
    if (persistenceWriterFunc != null) __obj.updateDynamic("persistenceWriterFunc")(js.Any.fromFunction3(persistenceWriterFunc))
    if (!js.isUndefined(persistentFilter)) __obj.updateDynamic("persistentFilter")(persistentFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentLayout)) __obj.updateDynamic("persistentLayout")(persistentLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentSort)) __obj.updateDynamic("persistentSort")(persistentSort.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(printAsHtml)) __obj.updateDynamic("printAsHtml")(printAsHtml.asInstanceOf[js.Any])
    if (printConfig != null) __obj.updateDynamic("printConfig")(printConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(printCopyStyle)) __obj.updateDynamic("printCopyStyle")(printCopyStyle.asInstanceOf[js.Any])
    if (printFooter != null) __obj.updateDynamic("printFooter")(printFooter.asInstanceOf[js.Any])
    if (printFormatter != null) __obj.updateDynamic("printFormatter")(js.Any.fromFunction2(printFormatter))
    if (printHeader != null) __obj.updateDynamic("printHeader")(printHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(printVisibleRows)) __obj.updateDynamic("printVisibleRows")(printVisibleRows.asInstanceOf[js.Any])
    if (!js.isUndefined(reactiveData)) __obj.updateDynamic("reactiveData")(reactiveData.asInstanceOf[js.Any])
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction0(renderComplete))
    if (renderStarted != null) __obj.updateDynamic("renderStarted")(js.Any.fromFunction0(renderStarted))
    if (resizableColumns != null) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableRows)) __obj.updateDynamic("resizableRows")(resizableRows.asInstanceOf[js.Any])
    if (responsiveLayout != null) __obj.updateDynamic("responsiveLayout")(responsiveLayout.asInstanceOf[js.Any])
    if (responsiveLayoutCollapseFormatter != null) __obj.updateDynamic("responsiveLayoutCollapseFormatter")(js.Any.fromFunction1(responsiveLayoutCollapseFormatter))
    if (!js.isUndefined(responsiveLayoutCollapseStartOpen)) __obj.updateDynamic("responsiveLayoutCollapseStartOpen")(responsiveLayoutCollapseStartOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveLayoutCollapseUseFormatters)) __obj.updateDynamic("responsiveLayoutCollapseUseFormatters")(responsiveLayoutCollapseUseFormatters.asInstanceOf[js.Any])
    if (restoreRedraw != null) __obj.updateDynamic("restoreRedraw")(js.Any.fromFunction0(restoreRedraw))
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(js.Any.fromFunction1(rowAdded))
    if (rowClick != null) __obj.updateDynamic("rowClick")(js.Any.fromFunction2(rowClick))
    if (rowContext != null) __obj.updateDynamic("rowContext")(js.Any.fromFunction2(rowContext))
    if (rowDblClick != null) __obj.updateDynamic("rowDblClick")(js.Any.fromFunction2(rowDblClick))
    if (rowDblTap != null) __obj.updateDynamic("rowDblTap")(js.Any.fromFunction2(rowDblTap))
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(js.Any.fromFunction1(rowDeleted))
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(js.Any.fromFunction1(rowDeselected))
    if (rowFormatter != null) __obj.updateDynamic("rowFormatter")(js.Any.fromFunction1(rowFormatter))
    if (rowMouseEnter != null) __obj.updateDynamic("rowMouseEnter")(js.Any.fromFunction2(rowMouseEnter))
    if (rowMouseLeave != null) __obj.updateDynamic("rowMouseLeave")(js.Any.fromFunction2(rowMouseLeave))
    if (rowMouseMove != null) __obj.updateDynamic("rowMouseMove")(js.Any.fromFunction2(rowMouseMove))
    if (rowMouseOut != null) __obj.updateDynamic("rowMouseOut")(js.Any.fromFunction2(rowMouseOut))
    if (rowMouseOver != null) __obj.updateDynamic("rowMouseOver")(js.Any.fromFunction2(rowMouseOver))
    if (rowMoved != null) __obj.updateDynamic("rowMoved")(js.Any.fromFunction1(rowMoved))
    if (rowResized != null) __obj.updateDynamic("rowResized")(js.Any.fromFunction1(rowResized))
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1(rowSelected))
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2(rowSelectionChanged))
    if (rowTap != null) __obj.updateDynamic("rowTap")(js.Any.fromFunction2(rowTap))
    if (rowTapHold != null) __obj.updateDynamic("rowTapHold")(js.Any.fromFunction2(rowTapHold))
    if (rowUpdated != null) __obj.updateDynamic("rowUpdated")(js.Any.fromFunction1(rowUpdated))
    if (scrollHorizontal != null) __obj.updateDynamic("scrollHorizontal")(js.Any.fromFunction1(scrollHorizontal))
    if (!js.isUndefined(scrollToColumnIfVisible)) __obj.updateDynamic("scrollToColumnIfVisible")(scrollToColumnIfVisible.asInstanceOf[js.Any])
    if (scrollToColumnPosition != null) __obj.updateDynamic("scrollToColumnPosition")(scrollToColumnPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToRowIfVisible)) __obj.updateDynamic("scrollToRowIfVisible")(scrollToRowIfVisible.asInstanceOf[js.Any])
    if (scrollToRowPosition != null) __obj.updateDynamic("scrollToRowPosition")(scrollToRowPosition.asInstanceOf[js.Any])
    if (scrollVertical != null) __obj.updateDynamic("scrollVertical")(js.Any.fromFunction1(scrollVertical))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectableCheck != null) __obj.updateDynamic("selectableCheck")(js.Any.fromFunction1(selectableCheck))
    if (!js.isUndefined(selectablePersistence)) __obj.updateDynamic("selectablePersistence")(selectablePersistence.asInstanceOf[js.Any])
    if (selectableRangeMode != null) __obj.updateDynamic("selectableRangeMode")(selectableRangeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRollingSelection)) __obj.updateDynamic("selectableRollingSelection")(selectableRollingSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrderReverse)) __obj.updateDynamic("sortOrderReverse")(sortOrderReverse.asInstanceOf[js.Any])
    if (tabEndNewRow != null) __obj.updateDynamic("tabEndNewRow")(tabEndNewRow.asInstanceOf[js.Any])
    if (tableBuilding != null) __obj.updateDynamic("tableBuilding")(js.Any.fromFunction0(tableBuilding))
    if (tableBuilt != null) __obj.updateDynamic("tableBuilt")(js.Any.fromFunction0(tableBuilt))
    if (tooltipGenerationMode != null) __obj.updateDynamic("tooltipGenerationMode")(tooltipGenerationMode.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipsHeader)) __obj.updateDynamic("tooltipsHeader")(tooltipsHeader.asInstanceOf[js.Any])
    if (validationFailed != null) __obj.updateDynamic("validationFailed")(js.Any.fromFunction3(validationFailed))
    if (!js.isUndefined(virtualDom)) __obj.updateDynamic("virtualDom")(virtualDom.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualDomBuffer)) __obj.updateDynamic("virtualDomBuffer")(virtualDomBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

