package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait spreadsheet extends baseview {
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  var comments: js.Any = js.native
  @JSName("config")
  var config_spreadsheet: spreadsheetConfig = js.native
  def addFilter(rowId: Double, columnId: Double): Unit = js.native
  def addImage(rowId: Double, columnId: Double, url: String): Unit = js.native
  def addSheet(content: js.Any): Unit = js.native
  def addSparkline(rowId: Double, columnId: Double, config: js.Any): Unit = js.native
  def addStyle(styleProps: js.Any, baseStyle: js.Any): Unit = js.native
  def alert(config: js.Any): HTMLElement = js.native
  def attachEvent(`type`: spreadsheetEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: spreadsheetEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def changeDecimals(row: Double, column: Double, change: Double): Unit = js.native
  def clearRange(rangeStr: String, `type`: js.Any): Unit = js.native
  def clearSheet(): Unit = js.native
  def combineCells(): Unit = js.native
  def combineCells(range: js.Any): Unit = js.native
  def compactStyles(): Unit = js.native
  def confirm(config: js.Any): Unit = js.native
  def deleteColumn(columnId: Double): Unit = js.native
  def deleteRow(rowId: Double): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def eachSelectedCell(handler: WebixCallback): Unit = js.native
  def editSheet(name: String): Unit = js.native
  def filterSpreadSheet(): Unit = js.native
  def freezeColumns(columns: Double): Unit = js.native
  def freezeRows(rows: Double): Unit = js.native
  def getActiveSheet(): String = js.native
  def getCellEditor(row: Double, column: Double): js.Any = js.native
  def getCellValue(row: Double, column: Double): String = js.native
  def getColumn(id: String): js.Any = js.native
  def getRow(id: String): js.Any = js.native
  def getSelectedId(): js.Array[_] = js.native
  def getSelectedRange(): String = js.native
  def getSheetData(sheet_name: String): Unit = js.native
  def getStyle(row: Double, column: Double): js.Any = js.native
  def groupUndo(func: WebixCallback): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def hideColumn(columnId: Double, state: Boolean): Unit = js.native
  def hideGridlines(state: Boolean): Unit = js.native
  def hideHeaders(state: Boolean): Unit = js.native
  def hideRow(rowId: Double, state: Boolean): Unit = js.native
  def ignoreUndo(func: WebixCallback): Unit = js.native
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  def insertColumn(columnId: Double): Unit = js.native
  def insertRow(rowId: Double): Unit = js.native
  def isCellLocked(rowId: Double, columnId: Double): Boolean = js.native
  def isColumnVisible(columnId: Double): Boolean = js.native
  def isRowVisible(rowId: Double): Boolean = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def lockCell(row: js.Any, column: js.Any, state: Boolean): Unit = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def recalculate(): Unit = js.native
  def redo(): Unit = js.native
  def refresh(): Unit = js.native
  def registerMathMethod(name: String, handler: WebixCallback): Unit = js.native
  def removeFilter(): Unit = js.native
  def removeSheet(name: String): Unit = js.native
  def renameSheet(name: String, newName: String): Unit = js.native
  def reset(): Unit = js.native
  def resetUndo(): Unit = js.native
  def saveCell(row: Double, column: Double): Unit = js.native
  def serialize(): js.Any = js.native
  def serialize(options: js.Any): js.Any = js.native
  def setCellEditor(rowId: Double, columnId: Double, editorObject: js.Any): Unit = js.native
  def setCellFilter(rowId: Double, columnId: Double, options: String): Unit = js.native
  def setCellFilter(rowId: Double, columnId: Double, options: js.Array[_]): Unit = js.native
  def setCellValue(row: Double, column: js.Any, value: String): Unit = js.native
  def setColumnWidth(id: String, width: Double): Unit = js.native
  def setColumnWidth(id: Double, width: Double): Unit = js.native
  def setFormat(rowId: Double, columnId: Double, format: String): Unit = js.native
  def setPlaceholder(placeholder: js.Any): Unit = js.native
  def setRangeStyle(rangeStr: String, style: js.Any): Unit = js.native
  def setRangeValue(range: String): Unit = js.native
  def setRowHeight(id: String, height: Double): Unit = js.native
  def setRowHeight(id: Double, height: Double): Unit = js.native
  def setStyle(row: Double, column: Double, style: js.Any): Unit = js.native
  def showSheet(name: String): Unit = js.native
  def sortRange(): Unit = js.native
  def sortRange(range: String): Unit = js.native
  def sortRange(range: String, dir: String): Unit = js.native
  def splitCell(row: Double, column: Double): Unit = js.native
  def ui(view: js.Any): baseview = js.native
  def unblockEvent(): Unit = js.native
  def undo(id: String): Unit = js.native
}

