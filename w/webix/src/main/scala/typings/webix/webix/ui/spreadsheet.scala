package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait spreadsheet
  extends StObject
     with baseview {
  
  @JSName("$$")
  var DollarDollar: Any = js.native
  
  def addImage(rowId: Double, columnId: Double, url: String): Unit = js.native
  
  def addSheet(content: Any): Unit = js.native
  
  def addSparkline(rowId: Double, columnId: Double, config: Any): Unit = js.native
  
  def addStyle(styleProps: Any, baseStyle: Any): Unit = js.native
  
  def alert(config: Any): js.Promise[Any] = js.native
  
  def attachEvent(`type`: spreadsheetEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: spreadsheetEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def changeDecimals(row: Double, column: Double, change: Double): Unit = js.native
  
  def clearRange(rangeStr: String, `type`: Any): Unit = js.native
  
  def clearSheet(): Unit = js.native
  
  def combineCells(): Unit = js.native
  def combineCells(range: Any): Unit = js.native
  
  var comments: Any = js.native
  
  def compactStyles(): Unit = js.native
  
  @JSName("config")
  var config_spreadsheet: spreadsheetConfig = js.native
  
  def confirm(config: Any): js.Promise[Any] = js.native
  
  def deleteColumn(columnId: js.Array[Any]): Unit = js.native
  def deleteColumn(columnId: Double): Unit = js.native
  
  def deleteRow(rowId: js.Array[Any]): Unit = js.native
  def deleteRow(rowId: Double): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def eachSelectedCell(handler: WebixCallback): Unit = js.native
  
  def editSheet(name: String): Unit = js.native
  
  def filterSpreadSheet(): Unit = js.native
  
  def freezeColumns(columns: Double): Unit = js.native
  
  def freezeRows(rows: Double): Unit = js.native
  
  def getActiveSheet(): String = js.native
  
  def getCellEditor(row: Double, column: Double): Any = js.native
  
  def getCellFilter(row: Double, column: Double): Any = js.native
  
  def getCellValue(row: Double, column: Double): String = js.native
  
  def getColumn(id: String): Any = js.native
  
  def getRow(id: String): Any = js.native
  
  def getSelectedId(asArray: Boolean): Any = js.native
  
  def getSelectedRange(): String = js.native
  
  def getSheetData(sheet_name: String): Unit = js.native
  
  def getStyle(row: Double, column: Double): Any = js.native
  
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
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def lockCell(row: Any, column: Any, state: Boolean): Unit = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def parse(data: Any, `type`: String): Unit = js.native
  
  def recalculate(): Unit = js.native
  
  def redo(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def registerMathMethod(name: String, handler: WebixCallback): Unit = js.native
  
  def removeFilters(): Unit = js.native
  
  def removeSheet(name: String): Unit = js.native
  
  def renameSheet(name: String, newName: String): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetUndo(): Unit = js.native
  
  def saveCell(row: Double, column: Double): Unit = js.native
  
  def serialize(): Any = js.native
  def serialize(options: Any): Any = js.native
  
  def setCellEditor(rowId: Double, columnId: Double, editorObject: Any): Unit = js.native
  
  def setCellFilter(rowId: Double, columnId: Double, filterObject: Any): Unit = js.native
  
  def setCellValue(row: Double, column: Any, value: String): Unit = js.native
  
  def setColumnWidth(id: String, width: String): Unit = js.native
  def setColumnWidth(id: String, width: Double): Unit = js.native
  def setColumnWidth(id: js.Array[Any], width: String): Unit = js.native
  def setColumnWidth(id: js.Array[Any], width: Double): Unit = js.native
  def setColumnWidth(id: Double, width: String): Unit = js.native
  def setColumnWidth(id: Double, width: Double): Unit = js.native
  
  def setFormat(rowId: Double, columnId: Double, format: String): Unit = js.native
  
  def setPlaceholder(placeholder: Any): Unit = js.native
  
  def setRangeStyle(rangeStr: String, style: Any): Unit = js.native
  
  def setRangeValue(range: String, value: Any): Unit = js.native
  
  def setRowHeight(id: String, height: String): Unit = js.native
  def setRowHeight(id: String, height: Double): Unit = js.native
  def setRowHeight(id: js.Array[Any], height: String): Unit = js.native
  def setRowHeight(id: js.Array[Any], height: Double): Unit = js.native
  def setRowHeight(id: Double, height: String): Unit = js.native
  def setRowHeight(id: Double, height: Double): Unit = js.native
  
  def setStyle(row: Double, column: Double, style: Any): Unit = js.native
  
  def showSheet(name: String): Unit = js.native
  
  def sortRange(): Unit = js.native
  def sortRange(range: String): Unit = js.native
  def sortRange(range: String, dir: String): Unit = js.native
  def sortRange(range: Unit, dir: String): Unit = js.native
  
  def splitCell(row: Double, column: Double): Unit = js.native
  
  def ui(view: Any): baseview = js.native
  
  def unblockEvent(): Unit = js.native
  
  def undo(id: String): Unit = js.native
  
  var views: Any = js.native
}
