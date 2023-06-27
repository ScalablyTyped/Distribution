package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.DataStore
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixProxy
import typings.webix.mod.WebixTemplate
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.excelviewer")
@js.native
open class excelviewer ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$customPrint")
  def $customPrint(args: Any*): Any = js.native
  @JSName("$customPrint")
  var $customPrint_Original: WebixCallback = js.native
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event, pointer: String): String = js.native
  
  @JSName("$dragHTML")
  def $dragHTML(args: Any*): Any = js.native
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback = js.native
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  
  @JSName("$dragMark")
  def $dragMark(context: obj, ev: Event): Boolean = js.native
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$dropAllow")
  def $dropAllow(args: Any*): Any = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  
  @JSName("$dropHTML")
  def $dropHTML(args: Any*): Any = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  
  @JSName("$hasYScroll")
  var $hasYScroll: Any = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_excelviewer: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  @JSName("$touch")
  def $touch(args: Any*): Any = js.native
  @JSName("$touch")
  var $touch_Original: WebixCallback = js.native
  
  def add(obj: obj): String | Double = js.native
  def add(obj: obj, index: Double): String | Double = js.native
  
  def addCellCss(id: String, name: String, css: String, silent: Boolean): Unit = js.native
  
  def addCss(id: String, css: String): Unit = js.native
  def addCss(id: String, css: String, silent: Boolean): Unit = js.native
  def addCss(id: Double, css: String): Unit = js.native
  def addCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def addRowCss(id: String, css: String): Unit = js.native
  
  def addSelectArea(start: obj, end: obj, preserve: Boolean): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: String): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: String, css: String): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: String, css: String, handle: Boolean): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: String, css: Unit, handle: Boolean): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: Unit, css: String): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: Unit, css: String, handle: Boolean): Unit = js.native
  def addSelectArea(start: obj, end: obj, preserve: Boolean, area_name: Unit, css: Unit, handle: Boolean): Unit = js.native
  
  def addSpan(id: String, column: String, width: Double, height: Double): Unit = js.native
  def addSpan(id: String, column: String, width: Double, height: Double, value: String): Unit = js.native
  def addSpan(id: String, column: String, width: Double, height: Double, value: String, css: String): Unit = js.native
  def addSpan(id: String, column: String, width: Double, height: Double, value: Unit, css: String): Unit = js.native
  def addSpan(id: Double, column: String, width: Double, height: Double): Unit = js.native
  def addSpan(id: Double, column: String, width: Double, height: Double, value: String): Unit = js.native
  def addSpan(id: Double, column: String, width: Double, height: Double, value: String, css: String): Unit = js.native
  def addSpan(id: Double, column: String, width: Double, height: Double, value: Unit, css: String): Unit = js.native
  def addSpan(id: obj, column: String, width: Double, height: Double): Unit = js.native
  def addSpan(id: obj, column: String, width: Double, height: Double, value: String): Unit = js.native
  def addSpan(id: obj, column: String, width: Double, height: Double, value: String, css: String): Unit = js.native
  def addSpan(id: obj, column: String, width: Double, height: Double, value: Unit, css: String): Unit = js.native
  
  def adjustColumn(id: String): Unit = js.native
  def adjustColumn(id: String, mode: String): Unit = js.native
  def adjustColumn(id: Double): Unit = js.native
  def adjustColumn(id: Double, mode: String): Unit = js.native
  
  def adjustRowHeight(): Unit = js.native
  def adjustRowHeight(columnId: String): Unit = js.native
  def adjustRowHeight(columnId: String, silent: Boolean): Unit = js.native
  def adjustRowHeight(columnId: Unit, silent: Boolean): Unit = js.native
  
  def attachEvent(`type`: excelviewerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: excelviewerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearCss(css: String): Unit = js.native
  def clearCss(css: String, silent: Boolean): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  def closeSub(id: String): Unit = js.native
  def closeSub(id: Double): Unit = js.native
  
  def collectValues(id: String, mode: obj): js.Array[Any] = js.native
  def collectValues(id: Double, mode: obj): js.Array[Any] = js.native
  
  def columnId(index: Double): String | Double = js.native
  
  @JSName("config")
  var config_excelviewer: excelviewerConfig = js.native
  
  def copy(sid: String, tindex: Double): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: Unit, details: obj): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: obj): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: obj, details: obj): Unit = js.native
  def copy(sid: Double, tindex: Double): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: Unit, details: obj): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: obj): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: obj, details: obj): Unit = js.native
  
  def count(): Double = js.native
  
  var data: DataStore = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def eachColumn(handler: WebixCallback): Unit = js.native
  def eachColumn(handler: WebixCallback, all: Boolean): Unit = js.native
  
  def eachRow(handler: WebixCallback): Unit = js.native
  def eachRow(handler: WebixCallback, all: Boolean): Unit = js.native
  
  def edit(id: obj): Unit = js.native
  
  def editCancel(): Unit = js.native
  
  def editCell(row: String, col: String): Unit = js.native
  def editCell(row: String, col: String, preserve: Boolean): Unit = js.native
  def editCell(row: String, col: String, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: String, col: String, preserve: Unit, show: Boolean): Unit = js.native
  def editCell(row: String, col: Double): Unit = js.native
  def editCell(row: String, col: Double, preserve: Boolean): Unit = js.native
  def editCell(row: String, col: Double, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: String, col: Double, preserve: Unit, show: Boolean): Unit = js.native
  def editCell(row: Double, col: String): Unit = js.native
  def editCell(row: Double, col: String, preserve: Boolean): Unit = js.native
  def editCell(row: Double, col: String, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: Double, col: String, preserve: Unit, show: Boolean): Unit = js.native
  def editCell(row: Double, col: Double): Unit = js.native
  def editCell(row: Double, col: Double, preserve: Boolean): Unit = js.native
  def editCell(row: Double, col: Double, preserve: Boolean, show: Boolean): Unit = js.native
  def editCell(row: Double, col: Double, preserve: Unit, show: Boolean): Unit = js.native
  
  def editColumn(id: String): Unit = js.native
  
  def editNext(): Unit = js.native
  
  def editRow(id: String): Unit = js.native
  
  def editStop(): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback): Unit = js.native
  def filter(text: WebixCallback, value: String): Unit = js.native
  def filter(text: WebixCallback, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate): Unit = js.native
  def filter(text: WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate, value: Unit, preserve: Boolean): Unit = js.native
  
  def filterByAll(): Unit = js.native
  
  def find(criterion: WebixCallback): Any = js.native
  def find(criterion: WebixCallback, first: Boolean): Any = js.native
  
  def focusEditor(id: obj): Unit = js.native
  
  def freezeRow(id: String, state: Boolean): Unit = js.native
  def freezeRow(id: Double, state: Boolean): Unit = js.native
  
  def getAllSelectAreas(): obj = js.native
  
  def getColumnConfig(id: String): obj = js.native
  
  def getColumnIndex(id: String): Double = js.native
  def getColumnIndex(id: Double): Double = js.native
  
  def getColumns(all: Boolean): js.Array[Any] = js.native
  
  def getCss(rowId: String, columnId: String): String = js.native
  def getCss(rowId: String, columnId: Double): String = js.native
  def getCss(rowId: Double, columnId: String): String = js.native
  def getCss(rowId: Double, columnId: Double): String = js.native
  
  def getEditState(): obj = js.native
  
  def getEditor(): obj = js.native
  def getEditor(id: String): obj = js.native
  
  def getEditorValue(): String = js.native
  
  def getFilter(columnID: String): Any = js.native
  def getFilter(columnID: Double): Any = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getFooterNode(columnId: String): HTMLElement = js.native
  def getFooterNode(columnId: String, rowIndex: Double): HTMLElement = js.native
  
  def getHeaderContent(id: String): obj = js.native
  def getHeaderContent(id: Double): obj = js.native
  
  def getHeaderNode(columnId: String): HTMLElement = js.native
  def getHeaderNode(columnId: String, rowIndex: Double): HTMLElement = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): obj = js.native
  def getItem(id: Double): obj = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def getLastId(): Double | String = js.native
  
  def getNextId(id: String): String | Double = js.native
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getPage(): Double = js.native
  
  def getPager(): obj = js.native
  
  def getPrevId(id: String): String | Double = js.native
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getScrollState(): obj = js.native
  
  def getSelectArea(area_name: String): obj = js.native
  
  def getSelectedId(): Any = js.native
  def getSelectedId(asArray: Boolean): Any = js.native
  def getSelectedId(asArray: Boolean, asString: Boolean): Any = js.native
  def getSelectedId(asArray: Unit, asString: Boolean): Any = js.native
  
  def getSelectedItem(): obj = js.native
  def getSelectedItem(as_array: Boolean): obj = js.native
  
  def getSheets(): js.Array[Any] = js.native
  
  def getSpan(): js.Array[Any] = js.native
  
  def getSpanNode(id: obj): HTMLElement = js.native
  
  def getState(): obj = js.native
  
  def getSubView(id: String): obj = js.native
  def getSubView(id: Double): obj = js.native
  
  def getText(rowid: String, colid: String): String = js.native
  def getText(rowid: String, colid: Double): String = js.native
  def getText(rowid: Double, colid: String): String = js.native
  def getText(rowid: Double, colid: Double): String = js.native
  
  def getVisibleCount(): Double = js.native
  
  def group(config: obj): Unit = js.native
  def group(config: obj, target: String): Unit = js.native
  def group(config: obj, target: Double): Unit = js.native
  
  def hasCss(id: String, css: String): Boolean = js.native
  def hasCss(id: Double, css: String): Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  var headerContent: obj = js.native
  
  def hideColumn(id: String): Unit = js.native
  def hideColumn(id: String, options: Unit, silent: Boolean): Unit = js.native
  def hideColumn(id: String, options: Unit, silent: Boolean, mode: Boolean): Unit = js.native
  def hideColumn(id: String, options: Unit, silent: Unit, mode: Boolean): Unit = js.native
  def hideColumn(id: String, options: obj): Unit = js.native
  def hideColumn(id: String, options: obj, silent: Boolean): Unit = js.native
  def hideColumn(id: String, options: obj, silent: Boolean, mode: Boolean): Unit = js.native
  def hideColumn(id: String, options: obj, silent: Unit, mode: Boolean): Unit = js.native
  def hideColumn(id: Double): Unit = js.native
  def hideColumn(id: Double, options: Unit, silent: Boolean): Unit = js.native
  def hideColumn(id: Double, options: Unit, silent: Boolean, mode: Boolean): Unit = js.native
  def hideColumn(id: Double, options: Unit, silent: Unit, mode: Boolean): Unit = js.native
  def hideColumn(id: Double, options: obj): Unit = js.native
  def hideColumn(id: Double, options: obj, silent: Boolean): Unit = js.native
  def hideColumn(id: Double, options: obj, silent: Boolean, mode: Boolean): Unit = js.native
  def hideColumn(id: Double, options: obj, silent: Unit, mode: Boolean): Unit = js.native
  
  def hideOverlay(): Unit = js.native
  
  def isColumnVisible(id: String): Boolean = js.native
  def isColumnVisible(id: Double): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[Any] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean, clear: Boolean): js.Promise[Any] = js.native
  
  def locate(node: Event): obj = js.native
  def locate(node: HTMLElement): obj = js.native
  
  def mapCells(startrow: Double, startcol: String, numrows: Double, numcols: Double, callback: WebixCallback): Unit = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def markSorting(): Unit = js.native
  def markSorting(column_id: String): Unit = js.native
  def markSorting(column_id: String, direction: String): Unit = js.native
  def markSorting(column_id: String, direction: String, preserve: Boolean): Unit = js.native
  def markSorting(column_id: String, direction: Unit, preserve: Boolean): Unit = js.native
  def markSorting(column_id: Unit, direction: String): Unit = js.native
  def markSorting(column_id: Unit, direction: String, preserve: Boolean): Unit = js.native
  def markSorting(column_id: Unit, direction: Unit, preserve: Boolean): Unit = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj, details: obj): String = js.native
  
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
  
  def on_click(args: Any*): Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  var on_context: obj = js.native
  
  def on_dblclick(args: Any*): Any = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  
  def on_mouse_move(args: Any*): Any = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  
  def openSub(id: String): Unit = js.native
  def openSub(id: Double): Unit = js.native
  
  def parse(data: String): Unit = js.native
  def parse(data: String, `type`: String): Unit = js.native
  def parse(data: String, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: String, `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any]): Unit = js.native
  def parse(data: js.Array[Any], `type`: String): Unit = js.native
  def parse(data: js.Array[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any]): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: obj): Unit = js.native
  def parse(data: obj, `type`: String): Unit = js.native
  def parse(data: obj, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: obj, `type`: Unit, clear: Boolean): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def refreshColumns(): Unit = js.native
  def refreshColumns(config: js.Array[Any]): Unit = js.native
  
  def refreshFilter(id: String): Unit = js.native
  def refreshFilter(id: Double): Unit = js.native
  
  def refreshSelectArea(): Unit = js.native
  
  def registerFilter(`object`: HTMLElement, config: obj, controller: obj): Unit = js.native
  def registerFilter(`object`: obj, config: obj, controller: obj): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeCellCss(id: String, name: String, css_name: String, silent: Boolean): Unit = js.native
  
  def removeCss(id: String, css: String): Unit = js.native
  def removeCss(id: String, css: String, silent: Boolean): Unit = js.native
  def removeCss(id: Double, css: String): Unit = js.native
  def removeCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def removeRowCss(id: String, css_name: String): Unit = js.native
  
  def removeSelectArea(area_name: String): Unit = js.native
  
  def removeSpan(id: String, column: String): Unit = js.native
  def removeSpan(id: Double, column: String): Unit = js.native
  
  def render(id: String, data: obj, operation: String): Unit = js.native
  def render(id: Double, data: obj, operation: String): Unit = js.native
  
  def resizeSubView(id: String): Unit = js.native
  def resizeSubView(id: Double): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(all: Boolean): js.Array[Any] = js.native
  
  def setColumnWidth(id: String, width: Double): Unit = js.native
  def setColumnWidth(id: Double, width: Double): Unit = js.native
  
  def setPage(page: Double): Unit = js.native
  
  def setRowHeight(id: String, height: Double): Unit = js.native
  def setRowHeight(id: Double, height: Double): Unit = js.native
  
  def setState(state: obj): Unit = js.native
  
  def showCell(row: String, column: String): Unit = js.native
  
  def showColumn(id: String): Unit = js.native
  def showColumn(id: String, options: Unit, silent: Boolean): Unit = js.native
  def showColumn(id: String, options: obj): Unit = js.native
  def showColumn(id: String, options: obj, silent: Boolean): Unit = js.native
  def showColumn(id: Double): Unit = js.native
  def showColumn(id: Double, options: Unit, silent: Boolean): Unit = js.native
  def showColumn(id: Double, options: obj): Unit = js.native
  def showColumn(id: Double, options: obj, silent: Boolean): Unit = js.native
  
  def showColumnBatch(batch: String, preserve: Boolean): Unit = js.native
  def showColumnBatch(batch: Double, preserve: Boolean): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  def showItemByIndex(index: Double): Unit = js.native
  
  def showOverlay(message: String): Unit = js.native
  
  def showSheet(name: String): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: obj): Unit = js.native
  def sync(source: obj, filter: Unit, silent: Boolean): Unit = js.native
  def sync(source: obj, filter: WebixCallback): Unit = js.native
  def sync(source: obj, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def ungroup(mode: Boolean): Unit = js.native
  
  def updateItem(id: String, data: obj): Unit = js.native
  def updateItem(id: Double, data: obj): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
  
  var waitData: js.Promise[Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[Any] = js.native
}
