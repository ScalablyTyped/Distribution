package typings.tabulatorTables.mod

import typings.std.Element
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCallBackMethods extends StObject {
  
  def ajaxError(): Unit
  
  def cellClick(event: UIEvent, cell: CellComponent): Unit
  
  def cellContext(event: UIEvent, cell: CellComponent): Unit
  
  def cellDblClick(event: UIEvent, cell: CellComponent): Unit
  
  def cellDblTap(event: UIEvent, cell: CellComponent): Unit
  
  def cellEditCancelled(cell: CellComponent): Unit
  
  def cellEdited(cell: CellComponent): Unit
  
  def cellEditing(cell: CellComponent): Unit
  
  def cellMouseDown(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseEnter(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseLeave(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseMove(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseOut(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseOver(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseUp(event: UIEvent, cell: CellComponent): Unit
  
  def cellTap(event: UIEvent, cell: CellComponent): Unit
  
  def cellTapHold(event: UIEvent, cell: CellComponent): Unit
  
  def clipboardCopied(clipboard: String): Unit
  
  def clipboardPasteError(clipboard: String): Unit
  
  def clipboardPasted(clipboard: String, rowData: js.Array[Any], rows: js.Array[RowComponent]): Unit
  
  def columnMoved(column: ColumnComponent, columns: js.Array[ColumnComponent]): Unit
  
  def columnResized(column: ColumnComponent): Unit
  
  def columnTitleChanged(column: ColumnComponent): Unit
  
  def columnVisibilityChanged(column: ColumnComponent, visible: Boolean): Unit
  
  def dataChanged(data: js.Array[Any]): Unit
  
  def dataFiltered(filters: js.Array[Filter], rows: js.Array[RowComponent]): Unit
  
  def dataFiltering(filters: js.Array[Filter]): Unit
  
  def dataGrouped(groups: js.Array[GroupComponent]): Unit
  
  def dataGrouping(): Unit
  
  def dataLoadError(error: js.Error): Unit
  
  def dataLoaded(data: js.Array[Any]): Unit
  
  def dataLoading(data: js.Array[Any]): Unit
  
  def dataProcessed(): Unit
  
  def dataProcessing(): Unit
  
  def dataSorted(sorters: js.Array[SorterFromTable], rows: js.Array[RowComponent]): Unit
  
  def dataSorting(sorters: js.Array[SorterFromTable]): Unit
  
  def dataTreeRowCollapsed(row: RowComponent, level: Double): Unit
  
  def dataTreeRowExpanded(row: RowComponent, level: Double): Unit
  
  def downloadComplete(): Unit
  
  def groupClick(event: UIEvent, group: GroupComponent): Unit
  
  def groupContext(event: UIEvent, group: GroupComponent): Unit
  
  def groupDblClick(event: UIEvent, group: GroupComponent): Unit
  
  def groupDblTap(event: UIEvent, group: GroupComponent): Unit
  
  def groupMouseDown(event: UIEvent, group: GroupComponent): Unit
  
  def groupMouseUp(event: UIEvent, group: GroupComponent): Unit
  
  def groupTap(event: UIEvent, group: GroupComponent): Unit
  
  def groupTapHold(event: UIEvent, group: GroupComponent): Unit
  
  def groupVisibilityChanged(group: GroupComponent, visible: Boolean): Unit
  
  def headerClick(event: UIEvent, column: ColumnComponent): Unit
  
  def headerContext(event: UIEvent, column: ColumnComponent): Unit
  
  def headerDblClick(event: UIEvent, column: ColumnComponent): Unit
  
  def headerDblTap(event: UIEvent, column: ColumnComponent): Unit
  
  def headerMouseDown(event: UIEvent, column: ColumnComponent): Unit
  
  def headerMouseUp(event: UIEvent, column: ColumnComponent): Unit
  
  def headerTap(event: UIEvent, column: ColumnComponent): Unit
  
  def headerTapHold(event: UIEvent, column: ColumnComponent): Unit
  
  def historyRedo(action: HistoryAction, component: Any, data: js.Array[Any]): Unit
  
  def historyUndo(action: HistoryAction, component: Any, data: js.Array[Any]): Unit
  
  def htmlImported(): Unit
  
  def htmlImporting(): Unit
  
  def localized(locale: String, lang: Any): Unit
  
  def menuClosed(cell: CellComponent): Unit
  
  def menuOpened(cell: CellComponent): Unit
  
  def movableRowsElementDrop(event: UIEvent, element: Element, row: RowComponent): Unit
  
  def movableRowsReceived(fromRow: RowComponent, toRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivedFailed(fromRow: RowComponent, toRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivingStart(fromRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivingStop(fromTable: Tabulator): Unit
  
  def movableRowsSendingStart(toTables: js.Array[Tabulator]): Unit
  
  def movableRowsSendingStop(toTables: js.Array[Tabulator]): Unit
  
  def movableRowsSent(fromRow: RowComponent, toRow: RowComponent, toTable: Tabulator): Unit
  
  def movableRowsSentFailed(fromRow: RowComponent, toRow: RowComponent, toTable: Tabulator): Unit
  
  def pageLoaded(pageNo: Double): Unit
  
  def popupClosed(cell: CellComponent): Unit
  
  def popupOpen(cell: CellComponent): Unit
  
  def renderComplete(): Unit
  
  def renderStarted(): Unit
  
  def rowAdded(row: RowComponent): Unit
  
  def rowClick(event: UIEvent, row: RowComponent): Unit
  
  def rowContext(event: UIEvent, row: RowComponent): Unit
  
  def rowDblClick(event: UIEvent, row: RowComponent): Unit
  
  def rowDblTap(event: UIEvent, row: RowComponent): Unit
  
  def rowDeleted(row: RowComponent): Unit
  
  def rowDeselected(row: RowComponent): Unit
  
  def rowMouseDown(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseEnter(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseLeave(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseMove(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseOut(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseOver(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseUp(event: UIEvent, row: RowComponent): Unit
  
  def rowMoved(row: RowComponent): Unit
  
  def rowMoving(row: RowComponent): Unit
  
  def rowResized(row: RowComponent): Unit
  
  def rowSelected(row: RowComponent): Unit
  
  def rowSelectionChanged(): Unit
  
  def rowTap(event: UIEvent, row: RowComponent): Unit
  
  def rowTapHold(event: UIEvent, row: RowComponent): Unit
  
  def rowUpdated(row: RowComponent): Unit
  
  def scrollHorizontal(left: Double): Unit
  
  def scrollVertical(top: Double): Unit
  
  def tableBuilding(): Unit
  
  def tableBuilt(): Unit
  
  def tableDestroyed(): Unit
  
  def validationFailed(cell: CellComponent, value: Any, validators: js.Array[Validator]): Unit
}
object EventCallBackMethods {
  
  inline def apply(
    ajaxError: () => Unit,
    cellClick: (UIEvent, CellComponent) => Unit,
    cellContext: (UIEvent, CellComponent) => Unit,
    cellDblClick: (UIEvent, CellComponent) => Unit,
    cellDblTap: (UIEvent, CellComponent) => Unit,
    cellEditCancelled: CellComponent => Unit,
    cellEdited: CellComponent => Unit,
    cellEditing: CellComponent => Unit,
    cellMouseDown: (UIEvent, CellComponent) => Unit,
    cellMouseEnter: (UIEvent, CellComponent) => Unit,
    cellMouseLeave: (UIEvent, CellComponent) => Unit,
    cellMouseMove: (UIEvent, CellComponent) => Unit,
    cellMouseOut: (UIEvent, CellComponent) => Unit,
    cellMouseOver: (UIEvent, CellComponent) => Unit,
    cellMouseUp: (UIEvent, CellComponent) => Unit,
    cellTap: (UIEvent, CellComponent) => Unit,
    cellTapHold: (UIEvent, CellComponent) => Unit,
    clipboardCopied: String => Unit,
    clipboardPasteError: String => Unit,
    clipboardPasted: (String, js.Array[Any], js.Array[RowComponent]) => Unit,
    columnMoved: (ColumnComponent, js.Array[ColumnComponent]) => Unit,
    columnResized: ColumnComponent => Unit,
    columnTitleChanged: ColumnComponent => Unit,
    columnVisibilityChanged: (ColumnComponent, Boolean) => Unit,
    dataChanged: js.Array[Any] => Unit,
    dataFiltered: (js.Array[Filter], js.Array[RowComponent]) => Unit,
    dataFiltering: js.Array[Filter] => Unit,
    dataGrouped: js.Array[GroupComponent] => Unit,
    dataGrouping: () => Unit,
    dataLoadError: js.Error => Unit,
    dataLoaded: js.Array[Any] => Unit,
    dataLoading: js.Array[Any] => Unit,
    dataProcessed: () => Unit,
    dataProcessing: () => Unit,
    dataSorted: (js.Array[SorterFromTable], js.Array[RowComponent]) => Unit,
    dataSorting: js.Array[SorterFromTable] => Unit,
    dataTreeRowCollapsed: (RowComponent, Double) => Unit,
    dataTreeRowExpanded: (RowComponent, Double) => Unit,
    downloadComplete: () => Unit,
    groupClick: (UIEvent, GroupComponent) => Unit,
    groupContext: (UIEvent, GroupComponent) => Unit,
    groupDblClick: (UIEvent, GroupComponent) => Unit,
    groupDblTap: (UIEvent, GroupComponent) => Unit,
    groupMouseDown: (UIEvent, GroupComponent) => Unit,
    groupMouseUp: (UIEvent, GroupComponent) => Unit,
    groupTap: (UIEvent, GroupComponent) => Unit,
    groupTapHold: (UIEvent, GroupComponent) => Unit,
    groupVisibilityChanged: (GroupComponent, Boolean) => Unit,
    headerClick: (UIEvent, ColumnComponent) => Unit,
    headerContext: (UIEvent, ColumnComponent) => Unit,
    headerDblClick: (UIEvent, ColumnComponent) => Unit,
    headerDblTap: (UIEvent, ColumnComponent) => Unit,
    headerMouseDown: (UIEvent, ColumnComponent) => Unit,
    headerMouseUp: (UIEvent, ColumnComponent) => Unit,
    headerTap: (UIEvent, ColumnComponent) => Unit,
    headerTapHold: (UIEvent, ColumnComponent) => Unit,
    historyRedo: (HistoryAction, Any, js.Array[Any]) => Unit,
    historyUndo: (HistoryAction, Any, js.Array[Any]) => Unit,
    htmlImported: () => Unit,
    htmlImporting: () => Unit,
    localized: (String, Any) => Unit,
    menuClosed: CellComponent => Unit,
    menuOpened: CellComponent => Unit,
    movableRowsElementDrop: (UIEvent, Element, RowComponent) => Unit,
    movableRowsReceived: (RowComponent, RowComponent, Tabulator) => Unit,
    movableRowsReceivedFailed: (RowComponent, RowComponent, Tabulator) => Unit,
    movableRowsReceivingStart: (RowComponent, Tabulator) => Unit,
    movableRowsReceivingStop: Tabulator => Unit,
    movableRowsSendingStart: js.Array[Tabulator] => Unit,
    movableRowsSendingStop: js.Array[Tabulator] => Unit,
    movableRowsSent: (RowComponent, RowComponent, Tabulator) => Unit,
    movableRowsSentFailed: (RowComponent, RowComponent, Tabulator) => Unit,
    pageLoaded: Double => Unit,
    popupClosed: CellComponent => Unit,
    popupOpen: CellComponent => Unit,
    renderComplete: () => Unit,
    renderStarted: () => Unit,
    rowAdded: RowComponent => Unit,
    rowClick: (UIEvent, RowComponent) => Unit,
    rowContext: (UIEvent, RowComponent) => Unit,
    rowDblClick: (UIEvent, RowComponent) => Unit,
    rowDblTap: (UIEvent, RowComponent) => Unit,
    rowDeleted: RowComponent => Unit,
    rowDeselected: RowComponent => Unit,
    rowMouseDown: (UIEvent, RowComponent) => Unit,
    rowMouseEnter: (UIEvent, RowComponent) => Unit,
    rowMouseLeave: (UIEvent, RowComponent) => Unit,
    rowMouseMove: (UIEvent, RowComponent) => Unit,
    rowMouseOut: (UIEvent, RowComponent) => Unit,
    rowMouseOver: (UIEvent, RowComponent) => Unit,
    rowMouseUp: (UIEvent, RowComponent) => Unit,
    rowMoved: RowComponent => Unit,
    rowMoving: RowComponent => Unit,
    rowResized: RowComponent => Unit,
    rowSelected: RowComponent => Unit,
    rowSelectionChanged: () => Unit,
    rowTap: (UIEvent, RowComponent) => Unit,
    rowTapHold: (UIEvent, RowComponent) => Unit,
    rowUpdated: RowComponent => Unit,
    scrollHorizontal: Double => Unit,
    scrollVertical: Double => Unit,
    tableBuilding: () => Unit,
    tableBuilt: () => Unit,
    tableDestroyed: () => Unit,
    validationFailed: (CellComponent, Any, js.Array[Validator]) => Unit
  ): EventCallBackMethods = {
    val __obj = js.Dynamic.literal(ajaxError = js.Any.fromFunction0(ajaxError), cellClick = js.Any.fromFunction2(cellClick), cellContext = js.Any.fromFunction2(cellContext), cellDblClick = js.Any.fromFunction2(cellDblClick), cellDblTap = js.Any.fromFunction2(cellDblTap), cellEditCancelled = js.Any.fromFunction1(cellEditCancelled), cellEdited = js.Any.fromFunction1(cellEdited), cellEditing = js.Any.fromFunction1(cellEditing), cellMouseDown = js.Any.fromFunction2(cellMouseDown), cellMouseEnter = js.Any.fromFunction2(cellMouseEnter), cellMouseLeave = js.Any.fromFunction2(cellMouseLeave), cellMouseMove = js.Any.fromFunction2(cellMouseMove), cellMouseOut = js.Any.fromFunction2(cellMouseOut), cellMouseOver = js.Any.fromFunction2(cellMouseOver), cellMouseUp = js.Any.fromFunction2(cellMouseUp), cellTap = js.Any.fromFunction2(cellTap), cellTapHold = js.Any.fromFunction2(cellTapHold), clipboardCopied = js.Any.fromFunction1(clipboardCopied), clipboardPasteError = js.Any.fromFunction1(clipboardPasteError), clipboardPasted = js.Any.fromFunction3(clipboardPasted), columnMoved = js.Any.fromFunction2(columnMoved), columnResized = js.Any.fromFunction1(columnResized), columnTitleChanged = js.Any.fromFunction1(columnTitleChanged), columnVisibilityChanged = js.Any.fromFunction2(columnVisibilityChanged), dataChanged = js.Any.fromFunction1(dataChanged), dataFiltered = js.Any.fromFunction2(dataFiltered), dataFiltering = js.Any.fromFunction1(dataFiltering), dataGrouped = js.Any.fromFunction1(dataGrouped), dataGrouping = js.Any.fromFunction0(dataGrouping), dataLoadError = js.Any.fromFunction1(dataLoadError), dataLoaded = js.Any.fromFunction1(dataLoaded), dataLoading = js.Any.fromFunction1(dataLoading), dataProcessed = js.Any.fromFunction0(dataProcessed), dataProcessing = js.Any.fromFunction0(dataProcessing), dataSorted = js.Any.fromFunction2(dataSorted), dataSorting = js.Any.fromFunction1(dataSorting), dataTreeRowCollapsed = js.Any.fromFunction2(dataTreeRowCollapsed), dataTreeRowExpanded = js.Any.fromFunction2(dataTreeRowExpanded), downloadComplete = js.Any.fromFunction0(downloadComplete), groupClick = js.Any.fromFunction2(groupClick), groupContext = js.Any.fromFunction2(groupContext), groupDblClick = js.Any.fromFunction2(groupDblClick), groupDblTap = js.Any.fromFunction2(groupDblTap), groupMouseDown = js.Any.fromFunction2(groupMouseDown), groupMouseUp = js.Any.fromFunction2(groupMouseUp), groupTap = js.Any.fromFunction2(groupTap), groupTapHold = js.Any.fromFunction2(groupTapHold), groupVisibilityChanged = js.Any.fromFunction2(groupVisibilityChanged), headerClick = js.Any.fromFunction2(headerClick), headerContext = js.Any.fromFunction2(headerContext), headerDblClick = js.Any.fromFunction2(headerDblClick), headerDblTap = js.Any.fromFunction2(headerDblTap), headerMouseDown = js.Any.fromFunction2(headerMouseDown), headerMouseUp = js.Any.fromFunction2(headerMouseUp), headerTap = js.Any.fromFunction2(headerTap), headerTapHold = js.Any.fromFunction2(headerTapHold), historyRedo = js.Any.fromFunction3(historyRedo), historyUndo = js.Any.fromFunction3(historyUndo), htmlImported = js.Any.fromFunction0(htmlImported), htmlImporting = js.Any.fromFunction0(htmlImporting), localized = js.Any.fromFunction2(localized), menuClosed = js.Any.fromFunction1(menuClosed), menuOpened = js.Any.fromFunction1(menuOpened), movableRowsElementDrop = js.Any.fromFunction3(movableRowsElementDrop), movableRowsReceived = js.Any.fromFunction3(movableRowsReceived), movableRowsReceivedFailed = js.Any.fromFunction3(movableRowsReceivedFailed), movableRowsReceivingStart = js.Any.fromFunction2(movableRowsReceivingStart), movableRowsReceivingStop = js.Any.fromFunction1(movableRowsReceivingStop), movableRowsSendingStart = js.Any.fromFunction1(movableRowsSendingStart), movableRowsSendingStop = js.Any.fromFunction1(movableRowsSendingStop), movableRowsSent = js.Any.fromFunction3(movableRowsSent), movableRowsSentFailed = js.Any.fromFunction3(movableRowsSentFailed), pageLoaded = js.Any.fromFunction1(pageLoaded), popupClosed = js.Any.fromFunction1(popupClosed), popupOpen = js.Any.fromFunction1(popupOpen), renderComplete = js.Any.fromFunction0(renderComplete), renderStarted = js.Any.fromFunction0(renderStarted), rowAdded = js.Any.fromFunction1(rowAdded), rowClick = js.Any.fromFunction2(rowClick), rowContext = js.Any.fromFunction2(rowContext), rowDblClick = js.Any.fromFunction2(rowDblClick), rowDblTap = js.Any.fromFunction2(rowDblTap), rowDeleted = js.Any.fromFunction1(rowDeleted), rowDeselected = js.Any.fromFunction1(rowDeselected), rowMouseDown = js.Any.fromFunction2(rowMouseDown), rowMouseEnter = js.Any.fromFunction2(rowMouseEnter), rowMouseLeave = js.Any.fromFunction2(rowMouseLeave), rowMouseMove = js.Any.fromFunction2(rowMouseMove), rowMouseOut = js.Any.fromFunction2(rowMouseOut), rowMouseOver = js.Any.fromFunction2(rowMouseOver), rowMouseUp = js.Any.fromFunction2(rowMouseUp), rowMoved = js.Any.fromFunction1(rowMoved), rowMoving = js.Any.fromFunction1(rowMoving), rowResized = js.Any.fromFunction1(rowResized), rowSelected = js.Any.fromFunction1(rowSelected), rowSelectionChanged = js.Any.fromFunction0(rowSelectionChanged), rowTap = js.Any.fromFunction2(rowTap), rowTapHold = js.Any.fromFunction2(rowTapHold), rowUpdated = js.Any.fromFunction1(rowUpdated), scrollHorizontal = js.Any.fromFunction1(scrollHorizontal), scrollVertical = js.Any.fromFunction1(scrollVertical), tableBuilding = js.Any.fromFunction0(tableBuilding), tableBuilt = js.Any.fromFunction0(tableBuilt), tableDestroyed = js.Any.fromFunction0(tableDestroyed), validationFailed = js.Any.fromFunction3(validationFailed))
    __obj.asInstanceOf[EventCallBackMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventCallBackMethods] (val x: Self) extends AnyVal {
    
    inline def setAjaxError(value: () => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction0(value))
    
    inline def setCellClick(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction2(value))
    
    inline def setCellContext(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellContext", js.Any.fromFunction2(value))
    
    inline def setCellDblClick(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2(value))
    
    inline def setCellDblTap(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2(value))
    
    inline def setCellEditCancelled(value: CellComponent => Unit): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1(value))
    
    inline def setCellEdited(value: CellComponent => Unit): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1(value))
    
    inline def setCellEditing(value: CellComponent => Unit): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1(value))
    
    inline def setCellMouseDown(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2(value))
    
    inline def setCellMouseEnter(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2(value))
    
    inline def setCellMouseLeave(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2(value))
    
    inline def setCellMouseMove(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2(value))
    
    inline def setCellMouseOut(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2(value))
    
    inline def setCellMouseOver(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2(value))
    
    inline def setCellMouseUp(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2(value))
    
    inline def setCellTap(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellTap", js.Any.fromFunction2(value))
    
    inline def setCellTapHold(value: (UIEvent, CellComponent) => Unit): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2(value))
    
    inline def setClipboardCopied(value: String => Unit): Self = StObject.set(x, "clipboardCopied", js.Any.fromFunction1(value))
    
    inline def setClipboardPasteError(value: String => Unit): Self = StObject.set(x, "clipboardPasteError", js.Any.fromFunction1(value))
    
    inline def setClipboardPasted(value: (String, js.Array[Any], js.Array[RowComponent]) => Unit): Self = StObject.set(x, "clipboardPasted", js.Any.fromFunction3(value))
    
    inline def setColumnMoved(value: (ColumnComponent, js.Array[ColumnComponent]) => Unit): Self = StObject.set(x, "columnMoved", js.Any.fromFunction2(value))
    
    inline def setColumnResized(value: ColumnComponent => Unit): Self = StObject.set(x, "columnResized", js.Any.fromFunction1(value))
    
    inline def setColumnTitleChanged(value: ColumnComponent => Unit): Self = StObject.set(x, "columnTitleChanged", js.Any.fromFunction1(value))
    
    inline def setColumnVisibilityChanged(value: (ColumnComponent, Boolean) => Unit): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2(value))
    
    inline def setDataChanged(value: js.Array[Any] => Unit): Self = StObject.set(x, "dataChanged", js.Any.fromFunction1(value))
    
    inline def setDataFiltered(value: (js.Array[Filter], js.Array[RowComponent]) => Unit): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2(value))
    
    inline def setDataFiltering(value: js.Array[Filter] => Unit): Self = StObject.set(x, "dataFiltering", js.Any.fromFunction1(value))
    
    inline def setDataGrouped(value: js.Array[GroupComponent] => Unit): Self = StObject.set(x, "dataGrouped", js.Any.fromFunction1(value))
    
    inline def setDataGrouping(value: () => Unit): Self = StObject.set(x, "dataGrouping", js.Any.fromFunction0(value))
    
    inline def setDataLoadError(value: js.Error => Unit): Self = StObject.set(x, "dataLoadError", js.Any.fromFunction1(value))
    
    inline def setDataLoaded(value: js.Array[Any] => Unit): Self = StObject.set(x, "dataLoaded", js.Any.fromFunction1(value))
    
    inline def setDataLoading(value: js.Array[Any] => Unit): Self = StObject.set(x, "dataLoading", js.Any.fromFunction1(value))
    
    inline def setDataProcessed(value: () => Unit): Self = StObject.set(x, "dataProcessed", js.Any.fromFunction0(value))
    
    inline def setDataProcessing(value: () => Unit): Self = StObject.set(x, "dataProcessing", js.Any.fromFunction0(value))
    
    inline def setDataSorted(value: (js.Array[SorterFromTable], js.Array[RowComponent]) => Unit): Self = StObject.set(x, "dataSorted", js.Any.fromFunction2(value))
    
    inline def setDataSorting(value: js.Array[SorterFromTable] => Unit): Self = StObject.set(x, "dataSorting", js.Any.fromFunction1(value))
    
    inline def setDataTreeRowCollapsed(value: (RowComponent, Double) => Unit): Self = StObject.set(x, "dataTreeRowCollapsed", js.Any.fromFunction2(value))
    
    inline def setDataTreeRowExpanded(value: (RowComponent, Double) => Unit): Self = StObject.set(x, "dataTreeRowExpanded", js.Any.fromFunction2(value))
    
    inline def setDownloadComplete(value: () => Unit): Self = StObject.set(x, "downloadComplete", js.Any.fromFunction0(value))
    
    inline def setGroupClick(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupClick", js.Any.fromFunction2(value))
    
    inline def setGroupContext(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupContext", js.Any.fromFunction2(value))
    
    inline def setGroupDblClick(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupDblClick", js.Any.fromFunction2(value))
    
    inline def setGroupDblTap(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupDblTap", js.Any.fromFunction2(value))
    
    inline def setGroupMouseDown(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupMouseDown", js.Any.fromFunction2(value))
    
    inline def setGroupMouseUp(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupMouseUp", js.Any.fromFunction2(value))
    
    inline def setGroupTap(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupTap", js.Any.fromFunction2(value))
    
    inline def setGroupTapHold(value: (UIEvent, GroupComponent) => Unit): Self = StObject.set(x, "groupTapHold", js.Any.fromFunction2(value))
    
    inline def setGroupVisibilityChanged(value: (GroupComponent, Boolean) => Unit): Self = StObject.set(x, "groupVisibilityChanged", js.Any.fromFunction2(value))
    
    inline def setHeaderClick(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction2(value))
    
    inline def setHeaderContext(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerContext", js.Any.fromFunction2(value))
    
    inline def setHeaderDblClick(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2(value))
    
    inline def setHeaderDblTap(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2(value))
    
    inline def setHeaderMouseDown(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseDown", js.Any.fromFunction2(value))
    
    inline def setHeaderMouseUp(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerMouseUp", js.Any.fromFunction2(value))
    
    inline def setHeaderTap(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerTap", js.Any.fromFunction2(value))
    
    inline def setHeaderTapHold(value: (UIEvent, ColumnComponent) => Unit): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2(value))
    
    inline def setHistoryRedo(value: (HistoryAction, Any, js.Array[Any]) => Unit): Self = StObject.set(x, "historyRedo", js.Any.fromFunction3(value))
    
    inline def setHistoryUndo(value: (HistoryAction, Any, js.Array[Any]) => Unit): Self = StObject.set(x, "historyUndo", js.Any.fromFunction3(value))
    
    inline def setHtmlImported(value: () => Unit): Self = StObject.set(x, "htmlImported", js.Any.fromFunction0(value))
    
    inline def setHtmlImporting(value: () => Unit): Self = StObject.set(x, "htmlImporting", js.Any.fromFunction0(value))
    
    inline def setLocalized(value: (String, Any) => Unit): Self = StObject.set(x, "localized", js.Any.fromFunction2(value))
    
    inline def setMenuClosed(value: CellComponent => Unit): Self = StObject.set(x, "menuClosed", js.Any.fromFunction1(value))
    
    inline def setMenuOpened(value: CellComponent => Unit): Self = StObject.set(x, "menuOpened", js.Any.fromFunction1(value))
    
    inline def setMovableRowsElementDrop(value: (UIEvent, Element, RowComponent) => Unit): Self = StObject.set(x, "movableRowsElementDrop", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceived(value: (RowComponent, RowComponent, Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceived", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceivedFailed(value: (RowComponent, RowComponent, Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivedFailed", js.Any.fromFunction3(value))
    
    inline def setMovableRowsReceivingStart(value: (RowComponent, Tabulator) => Unit): Self = StObject.set(x, "movableRowsReceivingStart", js.Any.fromFunction2(value))
    
    inline def setMovableRowsReceivingStop(value: Tabulator => Unit): Self = StObject.set(x, "movableRowsReceivingStop", js.Any.fromFunction1(value))
    
    inline def setMovableRowsSendingStart(value: js.Array[Tabulator] => Unit): Self = StObject.set(x, "movableRowsSendingStart", js.Any.fromFunction1(value))
    
    inline def setMovableRowsSendingStop(value: js.Array[Tabulator] => Unit): Self = StObject.set(x, "movableRowsSendingStop", js.Any.fromFunction1(value))
    
    inline def setMovableRowsSent(value: (RowComponent, RowComponent, Tabulator) => Unit): Self = StObject.set(x, "movableRowsSent", js.Any.fromFunction3(value))
    
    inline def setMovableRowsSentFailed(value: (RowComponent, RowComponent, Tabulator) => Unit): Self = StObject.set(x, "movableRowsSentFailed", js.Any.fromFunction3(value))
    
    inline def setPageLoaded(value: Double => Unit): Self = StObject.set(x, "pageLoaded", js.Any.fromFunction1(value))
    
    inline def setPopupClosed(value: CellComponent => Unit): Self = StObject.set(x, "popupClosed", js.Any.fromFunction1(value))
    
    inline def setPopupOpen(value: CellComponent => Unit): Self = StObject.set(x, "popupOpen", js.Any.fromFunction1(value))
    
    inline def setRenderComplete(value: () => Unit): Self = StObject.set(x, "renderComplete", js.Any.fromFunction0(value))
    
    inline def setRenderStarted(value: () => Unit): Self = StObject.set(x, "renderStarted", js.Any.fromFunction0(value))
    
    inline def setRowAdded(value: RowComponent => Unit): Self = StObject.set(x, "rowAdded", js.Any.fromFunction1(value))
    
    inline def setRowClick(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowClick", js.Any.fromFunction2(value))
    
    inline def setRowContext(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowContext", js.Any.fromFunction2(value))
    
    inline def setRowDblClick(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowDblClick", js.Any.fromFunction2(value))
    
    inline def setRowDblTap(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowDblTap", js.Any.fromFunction2(value))
    
    inline def setRowDeleted(value: RowComponent => Unit): Self = StObject.set(x, "rowDeleted", js.Any.fromFunction1(value))
    
    inline def setRowDeselected(value: RowComponent => Unit): Self = StObject.set(x, "rowDeselected", js.Any.fromFunction1(value))
    
    inline def setRowMouseDown(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseDown", js.Any.fromFunction2(value))
    
    inline def setRowMouseEnter(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseEnter", js.Any.fromFunction2(value))
    
    inline def setRowMouseLeave(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseLeave", js.Any.fromFunction2(value))
    
    inline def setRowMouseMove(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseMove", js.Any.fromFunction2(value))
    
    inline def setRowMouseOut(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseOut", js.Any.fromFunction2(value))
    
    inline def setRowMouseOver(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseOver", js.Any.fromFunction2(value))
    
    inline def setRowMouseUp(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowMouseUp", js.Any.fromFunction2(value))
    
    inline def setRowMoved(value: RowComponent => Unit): Self = StObject.set(x, "rowMoved", js.Any.fromFunction1(value))
    
    inline def setRowMoving(value: RowComponent => Unit): Self = StObject.set(x, "rowMoving", js.Any.fromFunction1(value))
    
    inline def setRowResized(value: RowComponent => Unit): Self = StObject.set(x, "rowResized", js.Any.fromFunction1(value))
    
    inline def setRowSelected(value: RowComponent => Unit): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1(value))
    
    inline def setRowSelectionChanged(value: () => Unit): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction0(value))
    
    inline def setRowTap(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowTap", js.Any.fromFunction2(value))
    
    inline def setRowTapHold(value: (UIEvent, RowComponent) => Unit): Self = StObject.set(x, "rowTapHold", js.Any.fromFunction2(value))
    
    inline def setRowUpdated(value: RowComponent => Unit): Self = StObject.set(x, "rowUpdated", js.Any.fromFunction1(value))
    
    inline def setScrollHorizontal(value: Double => Unit): Self = StObject.set(x, "scrollHorizontal", js.Any.fromFunction1(value))
    
    inline def setScrollVertical(value: Double => Unit): Self = StObject.set(x, "scrollVertical", js.Any.fromFunction1(value))
    
    inline def setTableBuilding(value: () => Unit): Self = StObject.set(x, "tableBuilding", js.Any.fromFunction0(value))
    
    inline def setTableBuilt(value: () => Unit): Self = StObject.set(x, "tableBuilt", js.Any.fromFunction0(value))
    
    inline def setTableDestroyed(value: () => Unit): Self = StObject.set(x, "tableDestroyed", js.Any.fromFunction0(value))
    
    inline def setValidationFailed(value: (CellComponent, Any, js.Array[Validator]) => Unit): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3(value))
  }
}
