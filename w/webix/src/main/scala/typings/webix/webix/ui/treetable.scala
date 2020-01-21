package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import typings.std.HTMLElement
import typings.webix.webix.DataStore
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.treetable")
@js.native
class treetable () extends baseview {
  @JSName("$customPrint")
  var $customPrint_Original: WebixCallback = js.native
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$touch")
  var $touch_Original: WebixCallback = js.native
  @JSName("config")
  var config_treetable: treetableConfig = js.native
  var data: DataStore = js.native
  var headerContent: js.Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  var waitData: js.Promise[_] = js.native
  @JSName("$customPrint")
  def $customPrint(args: js.Any*): js.Any = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event_): String = js.native
  @JSName("$dragHTML")
  def $dragHTML(args: js.Any*): js.Any = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event_): HTMLElement = js.native
  @JSName("$dragMark")
  def $dragMark(context: js.Any, ev: Event_): Boolean = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event_): Unit = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event_): Unit = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  @JSName("$dropHTML")
  def $dropHTML(args: js.Any*): js.Any = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event_, text: String): Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  @JSName("$touch")
  def $touch(args: js.Any*): js.Any = js.native
  def add(obj: js.Any): String = js.native
  def add(obj: js.Any, index: Double): String = js.native
  def add(obj: js.Any, index: Double, parentId: String): String = js.native
  def addCellCss(id: String, name: String, css: String): Unit = js.native
  def addCss(id: String, css: String): Unit = js.native
  def addCss(id: String, css: String, silent: Boolean): Unit = js.native
  def addCss(id: Double, css: String): Unit = js.native
  def addCss(id: Double, css: String, silent: Boolean): Unit = js.native
  def addRowCss(id: String, css: String): Unit = js.native
  def addSelectArea(start: js.Any, end: js.Any, preserve: Boolean): Unit = js.native
  def addSelectArea(start: js.Any, end: js.Any, preserve: Boolean, area_name: String): Unit = js.native
  def addSelectArea(start: js.Any, end: js.Any, preserve: Boolean, area_name: String, css: String): Unit = js.native
  def addSelectArea(start: js.Any, end: js.Any, preserve: Boolean, area_name: String, css: String, handle: Boolean): Unit = js.native
  def addSpan(id: js.Any, column: String, width: Double, height: Double): Unit = js.native
  def addSpan(id: js.Any, column: String, width: Double, height: Double, value: String): Unit = js.native
  def addSpan(id: js.Any, column: String, width: Double, height: Double, value: String, css: String): Unit = js.native
  def adjustColumn(id: String): Unit = js.native
  def adjustColumn(id: String, mode: String): Unit = js.native
  def adjustColumn(id: Double): Unit = js.native
  def adjustColumn(id: Double, mode: String): Unit = js.native
  def adjustRowHeight(): Unit = js.native
  def adjustRowHeight(columnId: String): Unit = js.native
  def adjustRowHeight(columnId: String, silent: Boolean): Unit = js.native
  def attachEvent(`type`: treetableEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: treetableEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def checkAll(): Unit = js.native
  def checkAll(id: String): Unit = js.native
  def checkAll(id: Double): Unit = js.native
  def checkItem(id: String): Unit = js.native
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  def clearCss(css: String): Unit = js.native
  def clearCss(css: String, silent: Boolean): Unit = js.native
  def clearSelection(): Unit = js.native
  def clearValidation(): Unit = js.native
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  def closeAll(): Unit = js.native
  def closeSub(id: String): Unit = js.native
  def closeSub(id: Double): Unit = js.native
  def collectValues(id: String, mode: js.Any): js.Array[_] = js.native
  def collectValues(id: Double, mode: js.Any): js.Array[_] = js.native
  def columnId(index: Double): String | Double = js.native
  def copy(sid: String, tindex: Double): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview, details: js.Any): Double = js.native
  def copy(sid: Double, tindex: Double): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview, details: js.Any): Double = js.native
  def count(): Double = js.native
  def detachEvent(id: String): Unit = js.native
  def eachColumn(handler: WebixCallback): Unit = js.native
  def eachColumn(handler: WebixCallback, all: Boolean): Unit = js.native
  def eachRow(handler: WebixCallback): Unit = js.native
  def edit(id: js.Any): Unit = js.native
  def editCancel(): Unit = js.native
  def editCell(row: String, col: String): Unit = js.native
  def editCell(row: String, col: String, preserve: Boolean): Unit = js.native
  def editCell(row: String, col: String, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: String, col: Double): Unit = js.native
  def editCell(row: String, col: Double, preserve: Boolean): Unit = js.native
  def editCell(row: String, col: Double, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: Double, col: String): Unit = js.native
  def editCell(row: Double, col: String, preserve: Boolean): Unit = js.native
  def editCell(row: Double, col: String, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: Double, col: Double): Unit = js.native
  def editCell(row: Double, col: Double, preserve: Boolean): Unit = js.native
  def editCell(row: Double, col: Double, preserve: Boolean, show: Boolean): Unit = js.native
  def editColumn(id: String): Unit = js.native
  def editNext(): Unit = js.native
  def editRow(id: String): Unit = js.native
  def editStop(): Unit = js.native
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  def filter(text: WebixCallback | WebixTemplate): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def filterByAll(): Unit = js.native
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  def focusEditor(id: js.Any): Unit = js.native
  def getAllSelectAreas(): js.Any = js.native
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  def getChecked(): js.Array[_] = js.native
  def getColumnConfig(id: String): js.Any = js.native
  def getColumnIndex(id: String): Double = js.native
  def getColumnIndex(id: Double): Double = js.native
  def getCss(rowId: String, columnId: String): String = js.native
  def getCss(rowId: String, columnId: Double): String = js.native
  def getCss(rowId: Double, columnId: String): String = js.native
  def getCss(rowId: Double, columnId: Double): String = js.native
  def getEditState(): js.Any = js.native
  def getEditor(): js.Any = js.native
  def getEditor(row: js.Any): js.Any = js.native
  def getEditor(row: js.Any, column: String): js.Any = js.native
  def getEditor(row: js.Any, column: Double): js.Any = js.native
  def getEditorValue(): String = js.native
  def getFilter(columnID: String): js.Any = js.native
  def getFilter(columnID: Double): js.Any = js.native
  def getFirstChildId(id: String): String = js.native
  def getFirstChildId(id: Double): String = js.native
  def getFirstId(): Double | String = js.native
  def getFooterNode(columnId: String): HTMLElement = js.native
  def getFooterNode(columnId: String, rowIndex: Double): HTMLElement = js.native
  def getHeaderContent(id: String): StringDictionary[js.Any] = js.native
  def getHeaderContent(id: Double): StringDictionary[js.Any] = js.native
  def getHeaderNode(columnId: String): HTMLElement = js.native
  def getHeaderNode(columnId: String, rowIndex: Double): HTMLElement = js.native
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  def getItem(id: String): js.Any = js.native
  def getItem(id: Double): js.Any = js.native
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def getLastId(): Double | String = js.native
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  def getNextSiblingId(id: String): String | Double = js.native
  def getNextSiblingId(id: Double): String | Double = js.native
  def getOpenItems(): js.Array[_] = js.native
  def getPage(): Double = js.native
  def getPager(): js.Any = js.native
  def getParentId(id: String): String | Double = js.native
  def getParentId(id: Double): String | Double = js.native
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  def getPrevSiblingId(id: String): String | Double = js.native
  def getPrevSiblingId(id: Double): String | Double = js.native
  def getScrollState(): js.Any = js.native
  def getSelectArea(area_name: String): js.Any = js.native
  def getSelectedId(asArray: Boolean, asString: Boolean): js.Any = js.native
  def getSelectedItem(): js.Any = js.native
  def getSelectedItem(as_array: Boolean): js.Any = js.native
  def getSpan(): js.Array[_] = js.native
  def getSpanNode(id: js.Any): HTMLElement = js.native
  def getState(): js.Any = js.native
  def getSubView(id: String): js.Any = js.native
  def getSubView(id: Double): js.Any = js.native
  def getText(rowid: String, colid: String): String = js.native
  def getText(rowid: String, colid: Double): String = js.native
  def getText(rowid: Double, colid: String): String = js.native
  def getText(rowid: Double, colid: Double): String = js.native
  def getVisibleCount(): Double = js.native
  def group(config: js.Any): Unit = js.native
  def group(config: js.Any, target: String): Unit = js.native
  def group(config: js.Any, target: Double): Unit = js.native
  def hasCss(id: String, css: String): Boolean = js.native
  def hasCss(id: Double, css: String): Boolean = js.native
  def hasEvent(name: String): Boolean = js.native
  def hideColumn(id: String): Unit = js.native
  def hideColumn(id: String, options: js.Any): Unit = js.native
  def hideColumn(id: String, options: js.Any, silent: Boolean): Unit = js.native
  def hideColumn(id: String, options: js.Any, silent: Boolean, mode: Boolean): Unit = js.native
  def hideColumn(id: Double): Unit = js.native
  def hideColumn(id: Double, options: js.Any): Unit = js.native
  def hideColumn(id: Double, options: js.Any, silent: Boolean): Unit = js.native
  def hideColumn(id: Double, options: js.Any, silent: Boolean, mode: Boolean): Unit = js.native
  def hideOverlay(): Unit = js.native
  def ignoreUndo(functor: WebixCallback): Unit = js.native
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  def isBranchOpen(id: String): Boolean = js.native
  def isBranchOpen(id: Double): Boolean = js.native
  def isChecked(id: String): Boolean = js.native
  def isChecked(id: Double): Boolean = js.native
  def isColumnVisible(id: String): Boolean = js.native
  def isColumnVisible(id: Double): Boolean = js.native
  def isSelected(id: String): Unit = js.native
  def isSelected(id: Double): Unit = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[_] = js.native
  def locate(node: Event_): js.Any = js.native
  def locate(node: HTMLElement): js.Any = js.native
  def mapCells(startrow: Double, startcol: String, numrows: Double, numcols: Double, callback: WebixCallback): Unit = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def mapSelection(callback: WebixCallback): Unit = js.native
  def markSorting(column_id: String, direction: String): Unit = js.native
  def move(sid: String, tindex: Double): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
  def move(sid: Double, tindex: Double): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
  def moveBottom(id: String): Unit = js.native
  def moveBottom(id: Double): Unit = js.native
  def moveColumn(id: String, index: Double): Unit = js.native
  def moveDown(id: String, step: Double): Unit = js.native
  def moveDown(id: Double, step: Double): Unit = js.native
  def moveSelection(direction: String): Unit = js.native
  def moveTop(id: String): Unit = js.native
  def moveTop(id: Double): Unit = js.native
  def moveUp(id: String, step: Double): Unit = js.native
  def moveUp(id: Double, step: Double): Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def open(id: String): Unit = js.native
  def open(id: String, show: Boolean): Unit = js.native
  def open(id: Double): Unit = js.native
  def open(id: Double, show: Boolean): Unit = js.native
  def openAll(): Unit = js.native
  def openSub(id: String): Unit = js.native
  def openSub(id: Double): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  def refreshColumns(): Unit = js.native
  def refreshColumns(config: js.Array[_]): Unit = js.native
  def refreshColumns(config: js.Array[_], reset: Boolean): Unit = js.native
  def refreshFilter(id: String): Unit = js.native
  def refreshFilter(id: Double): Unit = js.native
  def refreshSelectArea(): Unit = js.native
  def registerFilter(`object`: js.Any, config: js.Any, controller: js.Any): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  def removeCellCss(id: String, name: String, css_name: String): Unit = js.native
  def removeCss(id: String, css: String): Unit = js.native
  def removeCss(id: String, css: String, silent: Boolean): Unit = js.native
  def removeCss(id: Double, css: String): Unit = js.native
  def removeCss(id: Double, css: String, silent: Boolean): Unit = js.native
  def removeRowCss(id: String, css_name: String): Unit = js.native
  def removeSelectArea(area_name: String): Unit = js.native
  def removeSpan(id: String, column: String): Unit = js.native
  def removeSpan(id: Double, column: String): Unit = js.native
  def removeUndo(id: String): Unit = js.native
  def render(id: String, data: js.Any, operation: String): Unit = js.native
  def render(id: Double, data: js.Any, operation: String): Unit = js.native
  def resizeSubView(id: String): Unit = js.native
  def resizeSubView(id: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def select(row_id: String, preserve: Boolean): Unit = js.native
  def select(row_id: Double, preserve: Boolean): Unit = js.native
  def selectAll(): Unit = js.native
  def selectRange(row_id: String, end_row_id: String): Unit = js.native
  def selectRange(row_id: String, end_row_id: String, preserve: Boolean): Unit = js.native
  def selectRange(row_id: String, end_row_id: Double): Unit = js.native
  def selectRange(row_id: String, end_row_id: Double, preserve: Boolean): Unit = js.native
  def selectRange(row_id: Double, end_row_id: String): Unit = js.native
  def selectRange(row_id: Double, end_row_id: String, preserve: Boolean): Unit = js.native
  def selectRange(row_id: Double, end_row_id: Double): Unit = js.native
  def selectRange(row_id: Double, end_row_id: Double, preserve: Boolean): Unit = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(id: String): js.Array[_] = js.native
  def serialize(id: String, all: Boolean): js.Array[_] = js.native
  def serialize(id: Double): js.Array[_] = js.native
  def serialize(id: Double, all: Boolean): js.Array[_] = js.native
  def setColumnWidth(id: String, width: Double): Unit = js.native
  def setColumnWidth(id: Double, width: Double): Unit = js.native
  def setPage(page: Double): Unit = js.native
  def setRowHeight(id: String, height: Double): Unit = js.native
  def setRowHeight(id: Double, height: Double): Unit = js.native
  def setState(state: js.Any): Unit = js.native
  def showCell(row: String, column: String): Unit = js.native
  def showColumn(id: String): Unit = js.native
  def showColumn(id: Double): Unit = js.native
  def showColumnBatch(batch: String, preserve: Boolean): Unit = js.native
  def showColumnBatch(batch: Double, preserve: Boolean): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  def showItemByIndex(index: Double): Unit = js.native
  def showOverlay(message: String): Unit = js.native
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
  def uncheckAll(): Unit = js.native
  def uncheckAll(id: String): Unit = js.native
  def uncheckAll(id: Double): Unit = js.native
  def uncheckItem(id: String): Unit = js.native
  def undo(id: String): Unit = js.native
  def ungroup(mode: Boolean): Unit = js.native
  def unselect(row_id: String): Unit = js.native
  def unselect(row_id: Double): Unit = js.native
  def unselectAll(): Unit = js.native
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
  def waitSave(handler: WebixCallback): js.Promise[_] = js.native
}

