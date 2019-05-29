package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends OptionsGeneral
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
     with OptionsCell

object Options {
  @scala.inline
  def apply(
    addRowPos: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top = null,
    ajaxConfig: HttpMethod | AjaxConfig = null,
    ajaxContentType: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.form | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.json | AjaxContentType = null,
    ajaxError: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => scala.Unit = null,
    ajaxFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    ajaxLoader: scala.Boolean | js.Function0[scala.Boolean] = null,
    ajaxLoaderError: java.lang.String = null,
    ajaxLoaderLoading: java.lang.String = null,
    ajaxParams: js.Object = null,
    ajaxProgressiveLoad: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.load | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.scroll = null,
    ajaxProgressiveLoadDelay: scala.Int | scala.Double = null,
    ajaxProgressiveLoadScrollMargin: scala.Int | scala.Double = null,
    ajaxRequestFunc: (/* url */ java.lang.String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_] = null,
    ajaxRequesting: (/* url */ java.lang.String, /* params */ js.Any) => scala.Boolean = null,
    ajaxResponse: (/* url */ java.lang.String, /* params */ js.Any, /* response */ js.Any) => _ = null,
    ajaxSorting: js.UndefOr[scala.Boolean] = js.undefined,
    ajaxURL: java.lang.String = null,
    ajaxURLGenerator: (/* url */ java.lang.String, /* config */ js.Any, /* params */ js.Any) => java.lang.String = null,
    autoColumns: js.UndefOr[scala.Boolean] = js.undefined,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    cellClick: CellEventCallback = null,
    cellContext: CellEventCallback = null,
    cellDblClick: CellEventCallback = null,
    cellDblTap: CellEventCallback = null,
    cellEditCancelled: CellEditEventCallback = null,
    cellEdited: CellEditEventCallback = null,
    cellEditing: CellEditEventCallback = null,
    cellMouseEnter: CellEventCallback = null,
    cellMouseLeave: CellEventCallback = null,
    cellMouseMove: CellEventCallback = null,
    cellMouseOut: CellEventCallback = null,
    cellMouseOver: CellEventCallback = null,
    cellTap: CellEventCallback = null,
    cellTapHold: CellEventCallback = null,
    clipboard: scala.Boolean | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.copy | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.paste = null,
    clipboardCopied: () => scala.Unit = null,
    clipboardCopyConfig: tabulatorDashTablesLib.Anon_ColumnCalcs | scala.Boolean = null,
    clipboardCopyFormatter: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.table | (js.Function1[/* rowData */ js.Array[_], java.lang.String]) = null,
    clipboardCopyHeader: js.UndefOr[scala.Boolean] = js.undefined,
    clipboardCopySelector: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.active | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.table | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.selected = null,
    clipboardCopyStyled: js.UndefOr[scala.Boolean] = js.undefined,
    clipboardPasteAction: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.insert | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.update | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.replace = null,
    clipboardPasteError: () => scala.Unit = null,
    clipboardPasteParser: java.lang.String | (js.Function1[/* clipboard */ js.Any, js.Array[_]]) = null,
    clipboardPasted: () => scala.Unit = null,
    columnCalcs: scala.Boolean | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.both | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.table | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.group = null,
    columnHeaderSortMulti: js.UndefOr[scala.Boolean] = js.undefined,
    columnMinWidth: scala.Int | scala.Double = null,
    columnMoved: (/* column */ ColumnComponent, /* columns */ js.Array[_]) => scala.Unit = null,
    columnResized: /* column */ ColumnComponent => scala.Unit = null,
    columnTitleChanged: /* column */ ColumnComponent => scala.Unit = null,
    columnVertAlign: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.top | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.middle | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.bottom = null,
    columnVisibilityChanged: (/* column */ ColumnComponent, /* visible */ scala.Boolean) => scala.Unit = null,
    columns: js.Array[ColumnDefinition] = null,
    data: js.Array[_] = null,
    dataEdited: /* data */ js.Any => scala.Unit = null,
    dataFiltered: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => scala.Unit = null,
    dataFiltering: /* filters */ js.Array[Filter] => scala.Unit = null,
    dataGrouped: () => scala.Unit = null,
    dataGrouping: () => scala.Unit = null,
    dataLoaded: /* data */ js.Any => scala.Unit = null,
    dataLoading: /* data */ js.Any => scala.Unit = null,
    dataSorted: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => scala.Unit = null,
    dataSorting: /* sorters */ js.Array[Sorter] => scala.Unit = null,
    dataTree: js.UndefOr[scala.Boolean] = js.undefined,
    dataTreeBranchElement: scala.Boolean | java.lang.String = null,
    dataTreeChildField: java.lang.String = null,
    dataTreeChildIndent: scala.Int | scala.Double = null,
    dataTreeCollapseElement: java.lang.String | stdLib.HTMLElement | scala.Boolean = null,
    dataTreeElementColumn: scala.Boolean | java.lang.String = null,
    dataTreeExpandElement: java.lang.String | stdLib.HTMLElement | scala.Boolean = null,
    dataTreeRowCollapsed: (/* row */ RowComponent, /* level */ scala.Double) => scala.Unit = null,
    dataTreeRowExpanded: (/* row */ RowComponent, /* level */ scala.Double) => scala.Unit = null,
    dataTreeStartExpanded: scala.Boolean | js.Array[scala.Boolean] | (js.Function2[/* row */ RowComponent, /* level */ scala.Double, scala.Boolean]) = null,
    downloadComplete: () => scala.Unit = null,
    downloadConfig: tabulatorDashTablesLib.Anon_ColumnCalcsColumnGroups = null,
    downloadDataFormatter: /* data */ js.Array[_] => _ = null,
    downloadReady: (/* fileContents */ js.Any, /* blob */ js.Any) => _ = null,
    footerElement: java.lang.String | stdLib.HTMLElement = null,
    groupBy: java.lang.String | (js.Function1[/* data */ js.Any, _]) = null,
    groupClick: GroupEventCallback = null,
    groupClosedShowCalcs: js.UndefOr[scala.Boolean] = js.undefined,
    groupContext: GroupEventCallback = null,
    groupDblClick: GroupEventCallback = null,
    groupDblTap: GroupEventCallback = null,
    groupHeader: (js.Function4[
      /* value */ js.Any, 
      /* count */ scala.Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      java.lang.String
    ]) | (js.Array[
      js.Function3[/* value */ _, /* count */ scala.Double, /* data */ _, java.lang.String]
    ]) = null,
    groupStartOpen: scala.Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ scala.Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      scala.Boolean
    ]) = null,
    groupTap: GroupEventCallback = null,
    groupTapHold: GroupEventCallback = null,
    groupToggleElement: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.arrow | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.header | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = null,
    groupValues: js.Array[js.Array[_]] = null,
    groupVisibilityChanged: (/* group */ GroupComponent, /* visible */ scala.Boolean) => scala.Unit = null,
    headerFilterPlaceholder: java.lang.String = null,
    height: java.lang.String | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = null,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    historyRedo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => scala.Unit = null,
    historyUndo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => scala.Unit = null,
    htmlImported: EmptyCallback = null,
    htmlImporting: EmptyCallback = null,
    index: scala.Double | java.lang.String = null,
    initialFilter: js.Array[Filter] = null,
    initialHeaderFilter: js.Array[
      stdLib.Pick[
        Filter, 
        tabulatorDashTablesLib.tabulatorDashTablesLibStrings.field | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.value
      ]
    ] = null,
    initialSort: js.Array[Sorter] = null,
    keybindings: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | KeyBinding = null,
    langs: js.Any = null,
    layout: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.fitData | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.fitColumns | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.fitDataFill = null,
    layoutColumnsOnNewData: js.UndefOr[scala.Boolean] = js.undefined,
    locale: scala.Boolean | java.lang.String = null,
    localized: (/* locale */ java.lang.String, /* lang */ js.Any) => scala.Unit = null,
    movableColumns: js.UndefOr[scala.Boolean] = js.undefined,
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
    nestedFieldSeparator: java.lang.String | scala.Boolean = null,
    pageLoaded: /* pageno */ scala.Double => scala.Unit = null,
    pagination: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.remote | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.local = null,
    paginationAddRow: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.table | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.page = null,
    paginationButtonCount: scala.Int | scala.Double = null,
    paginationDataReceived: stdLib.Record[java.lang.String, java.lang.String] = null,
    paginationDataSent: stdLib.Record[java.lang.String, java.lang.String] = null,
    paginationElement: stdLib.HTMLElement | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.string = null,
    paginationSize: scala.Int | scala.Double = null,
    paginationSizeSelector: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | js.Array[scala.Double] = null,
    persistenceID: java.lang.String = null,
    persistenceMode: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.local | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.cookie | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` = null,
    persistentFilter: js.UndefOr[scala.Boolean] = js.undefined,
    persistentLayout: js.UndefOr[scala.Boolean] = js.undefined,
    persistentSort: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String | stdLib.HTMLElement = null,
    reactiveData: js.UndefOr[scala.Boolean] = js.undefined,
    renderComplete: () => scala.Unit = null,
    renderStarted: () => scala.Unit = null,
    resizableColumns: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`true` | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.header | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.cell = null,
    resizableRows: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveLayout: scala.Boolean | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.hide | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.collapse = null,
    responsiveLayoutCollapseFormatter: /* data */ js.Array[_] => _ = null,
    responsiveLayoutCollapseStartOpen: js.UndefOr[scala.Boolean] = js.undefined,
    responsiveLayoutCollapseUseFormatters: js.UndefOr[scala.Boolean] = js.undefined,
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
    scrollToColumnIfVisible: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToColumnPosition: ScrollToColumnPosition = null,
    scrollToRowIfVisible: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToRowPosition: ScrollToRowPostition = null,
    selectable: scala.Boolean | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibStrings.highlight = null,
    selectableCheck: /* row */ RowComponent => scala.Boolean = null,
    selectablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    selectableRangeMode: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.click = null,
    selectableRollingSelection: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrderReverse: js.UndefOr[scala.Boolean] = js.undefined,
    tableBuilding: () => scala.Unit = null,
    tableBuilt: () => scala.Unit = null,
    tooltipGenerationMode: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.load = null,
    tooltips: GlobalTooltipOption = null,
    tooltipsHeader: js.UndefOr[scala.Boolean] = js.undefined,
    virtualDom: js.UndefOr[scala.Boolean] = js.undefined,
    virtualDomBuffer: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addRowPos != null) __obj.updateDynamic("addRowPos")(addRowPos.asInstanceOf[js.Any])
    if (ajaxConfig != null) __obj.updateDynamic("ajaxConfig")(ajaxConfig.asInstanceOf[js.Any])
    if (ajaxContentType != null) __obj.updateDynamic("ajaxContentType")(ajaxContentType.asInstanceOf[js.Any])
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction3(ajaxError))
    if (!js.isUndefined(ajaxFiltering)) __obj.updateDynamic("ajaxFiltering")(ajaxFiltering)
    if (ajaxLoader != null) __obj.updateDynamic("ajaxLoader")(ajaxLoader.asInstanceOf[js.Any])
    if (ajaxLoaderError != null) __obj.updateDynamic("ajaxLoaderError")(ajaxLoaderError)
    if (ajaxLoaderLoading != null) __obj.updateDynamic("ajaxLoaderLoading")(ajaxLoaderLoading)
    if (ajaxParams != null) __obj.updateDynamic("ajaxParams")(ajaxParams)
    if (ajaxProgressiveLoad != null) __obj.updateDynamic("ajaxProgressiveLoad")(ajaxProgressiveLoad.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadDelay != null) __obj.updateDynamic("ajaxProgressiveLoadDelay")(ajaxProgressiveLoadDelay.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadScrollMargin != null) __obj.updateDynamic("ajaxProgressiveLoadScrollMargin")(ajaxProgressiveLoadScrollMargin.asInstanceOf[js.Any])
    if (ajaxRequestFunc != null) __obj.updateDynamic("ajaxRequestFunc")(js.Any.fromFunction3(ajaxRequestFunc))
    if (ajaxRequesting != null) __obj.updateDynamic("ajaxRequesting")(js.Any.fromFunction2(ajaxRequesting))
    if (ajaxResponse != null) __obj.updateDynamic("ajaxResponse")(js.Any.fromFunction3(ajaxResponse))
    if (!js.isUndefined(ajaxSorting)) __obj.updateDynamic("ajaxSorting")(ajaxSorting)
    if (ajaxURL != null) __obj.updateDynamic("ajaxURL")(ajaxURL)
    if (ajaxURLGenerator != null) __obj.updateDynamic("ajaxURLGenerator")(js.Any.fromFunction3(ajaxURLGenerator))
    if (!js.isUndefined(autoColumns)) __obj.updateDynamic("autoColumns")(autoColumns)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (cellClick != null) __obj.updateDynamic("cellClick")(cellClick)
    if (cellContext != null) __obj.updateDynamic("cellContext")(cellContext)
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(cellDblClick)
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(cellDblTap)
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(cellEditCancelled)
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(cellEdited)
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(cellEditing)
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(cellMouseEnter)
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(cellMouseLeave)
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(cellMouseMove)
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(cellMouseOut)
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(cellMouseOver)
    if (cellTap != null) __obj.updateDynamic("cellTap")(cellTap)
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(cellTapHold)
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    if (clipboardCopied != null) __obj.updateDynamic("clipboardCopied")(js.Any.fromFunction0(clipboardCopied))
    if (clipboardCopyConfig != null) __obj.updateDynamic("clipboardCopyConfig")(clipboardCopyConfig.asInstanceOf[js.Any])
    if (clipboardCopyFormatter != null) __obj.updateDynamic("clipboardCopyFormatter")(clipboardCopyFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyHeader)) __obj.updateDynamic("clipboardCopyHeader")(clipboardCopyHeader)
    if (clipboardCopySelector != null) __obj.updateDynamic("clipboardCopySelector")(clipboardCopySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyStyled)) __obj.updateDynamic("clipboardCopyStyled")(clipboardCopyStyled)
    if (clipboardPasteAction != null) __obj.updateDynamic("clipboardPasteAction")(clipboardPasteAction.asInstanceOf[js.Any])
    if (clipboardPasteError != null) __obj.updateDynamic("clipboardPasteError")(js.Any.fromFunction0(clipboardPasteError))
    if (clipboardPasteParser != null) __obj.updateDynamic("clipboardPasteParser")(clipboardPasteParser.asInstanceOf[js.Any])
    if (clipboardPasted != null) __obj.updateDynamic("clipboardPasted")(js.Any.fromFunction0(clipboardPasted))
    if (columnCalcs != null) __obj.updateDynamic("columnCalcs")(columnCalcs.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaderSortMulti)) __obj.updateDynamic("columnHeaderSortMulti")(columnHeaderSortMulti)
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnMoved != null) __obj.updateDynamic("columnMoved")(js.Any.fromFunction2(columnMoved))
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction1(columnResized))
    if (columnTitleChanged != null) __obj.updateDynamic("columnTitleChanged")(js.Any.fromFunction1(columnTitleChanged))
    if (columnVertAlign != null) __obj.updateDynamic("columnVertAlign")(columnVertAlign.asInstanceOf[js.Any])
    if (columnVisibilityChanged != null) __obj.updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2(columnVisibilityChanged))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataEdited != null) __obj.updateDynamic("dataEdited")(js.Any.fromFunction1(dataEdited))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2(dataFiltered))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction1(dataFiltering))
    if (dataGrouped != null) __obj.updateDynamic("dataGrouped")(js.Any.fromFunction0(dataGrouped))
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(js.Any.fromFunction0(dataGrouping))
    if (dataLoaded != null) __obj.updateDynamic("dataLoaded")(js.Any.fromFunction1(dataLoaded))
    if (dataLoading != null) __obj.updateDynamic("dataLoading")(js.Any.fromFunction1(dataLoading))
    if (dataSorted != null) __obj.updateDynamic("dataSorted")(js.Any.fromFunction2(dataSorted))
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(js.Any.fromFunction1(dataSorting))
    if (!js.isUndefined(dataTree)) __obj.updateDynamic("dataTree")(dataTree)
    if (dataTreeBranchElement != null) __obj.updateDynamic("dataTreeBranchElement")(dataTreeBranchElement.asInstanceOf[js.Any])
    if (dataTreeChildField != null) __obj.updateDynamic("dataTreeChildField")(dataTreeChildField)
    if (dataTreeChildIndent != null) __obj.updateDynamic("dataTreeChildIndent")(dataTreeChildIndent.asInstanceOf[js.Any])
    if (dataTreeCollapseElement != null) __obj.updateDynamic("dataTreeCollapseElement")(dataTreeCollapseElement.asInstanceOf[js.Any])
    if (dataTreeElementColumn != null) __obj.updateDynamic("dataTreeElementColumn")(dataTreeElementColumn.asInstanceOf[js.Any])
    if (dataTreeExpandElement != null) __obj.updateDynamic("dataTreeExpandElement")(dataTreeExpandElement.asInstanceOf[js.Any])
    if (dataTreeRowCollapsed != null) __obj.updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2(dataTreeRowCollapsed))
    if (dataTreeRowExpanded != null) __obj.updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2(dataTreeRowExpanded))
    if (dataTreeStartExpanded != null) __obj.updateDynamic("dataTreeStartExpanded")(dataTreeStartExpanded.asInstanceOf[js.Any])
    if (downloadComplete != null) __obj.updateDynamic("downloadComplete")(js.Any.fromFunction0(downloadComplete))
    if (downloadConfig != null) __obj.updateDynamic("downloadConfig")(downloadConfig)
    if (downloadDataFormatter != null) __obj.updateDynamic("downloadDataFormatter")(js.Any.fromFunction1(downloadDataFormatter))
    if (downloadReady != null) __obj.updateDynamic("downloadReady")(js.Any.fromFunction2(downloadReady))
    if (footerElement != null) __obj.updateDynamic("footerElement")(footerElement.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupClick != null) __obj.updateDynamic("groupClick")(groupClick)
    if (!js.isUndefined(groupClosedShowCalcs)) __obj.updateDynamic("groupClosedShowCalcs")(groupClosedShowCalcs)
    if (groupContext != null) __obj.updateDynamic("groupContext")(groupContext)
    if (groupDblClick != null) __obj.updateDynamic("groupDblClick")(groupDblClick)
    if (groupDblTap != null) __obj.updateDynamic("groupDblTap")(groupDblTap)
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (groupStartOpen != null) __obj.updateDynamic("groupStartOpen")(groupStartOpen.asInstanceOf[js.Any])
    if (groupTap != null) __obj.updateDynamic("groupTap")(groupTap)
    if (groupTapHold != null) __obj.updateDynamic("groupTapHold")(groupTapHold)
    if (groupToggleElement != null) __obj.updateDynamic("groupToggleElement")(groupToggleElement.asInstanceOf[js.Any])
    if (groupValues != null) __obj.updateDynamic("groupValues")(groupValues)
    if (groupVisibilityChanged != null) __obj.updateDynamic("groupVisibilityChanged")(js.Any.fromFunction2(groupVisibilityChanged))
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (historyRedo != null) __obj.updateDynamic("historyRedo")(js.Any.fromFunction3(historyRedo))
    if (historyUndo != null) __obj.updateDynamic("historyUndo")(js.Any.fromFunction3(historyUndo))
    if (htmlImported != null) __obj.updateDynamic("htmlImported")(htmlImported)
    if (htmlImporting != null) __obj.updateDynamic("htmlImporting")(htmlImporting)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (initialFilter != null) __obj.updateDynamic("initialFilter")(initialFilter)
    if (initialHeaderFilter != null) __obj.updateDynamic("initialHeaderFilter")(initialHeaderFilter)
    if (initialSort != null) __obj.updateDynamic("initialSort")(initialSort)
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings.asInstanceOf[js.Any])
    if (langs != null) __obj.updateDynamic("langs")(langs)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutColumnsOnNewData)) __obj.updateDynamic("layoutColumnsOnNewData")(layoutColumnsOnNewData)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(js.Any.fromFunction2(localized))
    if (!js.isUndefined(movableColumns)) __obj.updateDynamic("movableColumns")(movableColumns)
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
    if (nestedFieldSeparator != null) __obj.updateDynamic("nestedFieldSeparator")(nestedFieldSeparator.asInstanceOf[js.Any])
    if (pageLoaded != null) __obj.updateDynamic("pageLoaded")(js.Any.fromFunction1(pageLoaded))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationAddRow != null) __obj.updateDynamic("paginationAddRow")(paginationAddRow.asInstanceOf[js.Any])
    if (paginationButtonCount != null) __obj.updateDynamic("paginationButtonCount")(paginationButtonCount.asInstanceOf[js.Any])
    if (paginationDataReceived != null) __obj.updateDynamic("paginationDataReceived")(paginationDataReceived)
    if (paginationDataSent != null) __obj.updateDynamic("paginationDataSent")(paginationDataSent)
    if (paginationElement != null) __obj.updateDynamic("paginationElement")(paginationElement.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (paginationSizeSelector != null) __obj.updateDynamic("paginationSizeSelector")(paginationSizeSelector.asInstanceOf[js.Any])
    if (persistenceID != null) __obj.updateDynamic("persistenceID")(persistenceID)
    if (persistenceMode != null) __obj.updateDynamic("persistenceMode")(persistenceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentFilter)) __obj.updateDynamic("persistentFilter")(persistentFilter)
    if (!js.isUndefined(persistentLayout)) __obj.updateDynamic("persistentLayout")(persistentLayout)
    if (!js.isUndefined(persistentSort)) __obj.updateDynamic("persistentSort")(persistentSort)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(reactiveData)) __obj.updateDynamic("reactiveData")(reactiveData)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction0(renderComplete))
    if (renderStarted != null) __obj.updateDynamic("renderStarted")(js.Any.fromFunction0(renderStarted))
    if (resizableColumns != null) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableRows)) __obj.updateDynamic("resizableRows")(resizableRows)
    if (responsiveLayout != null) __obj.updateDynamic("responsiveLayout")(responsiveLayout.asInstanceOf[js.Any])
    if (responsiveLayoutCollapseFormatter != null) __obj.updateDynamic("responsiveLayoutCollapseFormatter")(js.Any.fromFunction1(responsiveLayoutCollapseFormatter))
    if (!js.isUndefined(responsiveLayoutCollapseStartOpen)) __obj.updateDynamic("responsiveLayoutCollapseStartOpen")(responsiveLayoutCollapseStartOpen)
    if (!js.isUndefined(responsiveLayoutCollapseUseFormatters)) __obj.updateDynamic("responsiveLayoutCollapseUseFormatters")(responsiveLayoutCollapseUseFormatters)
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
    if (!js.isUndefined(scrollToColumnIfVisible)) __obj.updateDynamic("scrollToColumnIfVisible")(scrollToColumnIfVisible)
    if (scrollToColumnPosition != null) __obj.updateDynamic("scrollToColumnPosition")(scrollToColumnPosition)
    if (!js.isUndefined(scrollToRowIfVisible)) __obj.updateDynamic("scrollToRowIfVisible")(scrollToRowIfVisible)
    if (scrollToRowPosition != null) __obj.updateDynamic("scrollToRowPosition")(scrollToRowPosition)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectableCheck != null) __obj.updateDynamic("selectableCheck")(js.Any.fromFunction1(selectableCheck))
    if (!js.isUndefined(selectablePersistence)) __obj.updateDynamic("selectablePersistence")(selectablePersistence)
    if (selectableRangeMode != null) __obj.updateDynamic("selectableRangeMode")(selectableRangeMode)
    if (!js.isUndefined(selectableRollingSelection)) __obj.updateDynamic("selectableRollingSelection")(selectableRollingSelection)
    if (!js.isUndefined(sortOrderReverse)) __obj.updateDynamic("sortOrderReverse")(sortOrderReverse)
    if (tableBuilding != null) __obj.updateDynamic("tableBuilding")(js.Any.fromFunction0(tableBuilding))
    if (tableBuilt != null) __obj.updateDynamic("tableBuilt")(js.Any.fromFunction0(tableBuilt))
    if (tooltipGenerationMode != null) __obj.updateDynamic("tooltipGenerationMode")(tooltipGenerationMode)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipsHeader)) __obj.updateDynamic("tooltipsHeader")(tooltipsHeader)
    if (!js.isUndefined(virtualDom)) __obj.updateDynamic("virtualDom")(virtualDom)
    if (!js.isUndefined(virtualDomBuffer)) __obj.updateDynamic("virtualDomBuffer")(virtualDomBuffer)
    __obj.asInstanceOf[Options]
  }
}

