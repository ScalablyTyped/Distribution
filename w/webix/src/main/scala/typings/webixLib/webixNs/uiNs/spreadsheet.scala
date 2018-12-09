package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.spreadsheet")
@js.native
class spreadsheet () extends baseview {
  @JSName("$$")
  var $$: js.Any = js.native
  @JSName("config")
  var config_spreadsheet: spreadsheetConfig = js.native
  def addFilter(rowId: scala.Double, columnId: scala.Double): scala.Unit = js.native
  def addImage(rowId: scala.Double, columnId: scala.Double, url: java.lang.String): scala.Unit = js.native
  def addSheet(content: js.Any): scala.Unit = js.native
  def addSparkline(rowId: scala.Double, columnId: scala.Double, config: js.Any): scala.Unit = js.native
  def addStyle(styleProps: js.Any, baseStyle: js.Any): scala.Unit = js.native
  def alert(config: js.Any): stdLib.HTMLElement = js.native
  def attachEvent(`type`: spreadsheetEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: spreadsheetEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearRange(rangeStr: java.lang.String, `type`: js.Any): scala.Unit = js.native
  def clearSheet(): scala.Unit = js.native
  def combineCells(): scala.Unit = js.native
  def combineCells(range: js.Any): scala.Unit = js.native
  def compactStyles(): scala.Unit = js.native
  def confirm(config: js.Any): scala.Unit = js.native
  def deleteColumn(columnId: scala.Double): scala.Unit = js.native
  def deleteRow(rowId: scala.Double): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def eachSelectedCell(handler: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def editSheet(name: java.lang.String): scala.Unit = js.native
  def filterSpreadSheet(): scala.Unit = js.native
  def freezeColumns(columns: scala.Double): scala.Unit = js.native
  def freezeRows(rows: scala.Double): scala.Unit = js.native
  def getActiveSheet(): java.lang.String = js.native
  def getCellEditor(row: scala.Double, column: scala.Double): js.Any = js.native
  def getCellValue(row: scala.Double, column: scala.Double): java.lang.String = js.native
  def getColumn(id: java.lang.String): js.Any = js.native
  def getRow(id: java.lang.String): js.Any = js.native
  def getSelectedId(): js.Array[_] = js.native
  def getSelectedRange(): java.lang.String = js.native
  def getSheetData(sheet_name: java.lang.String): scala.Unit = js.native
  def getStyle(row: scala.Double, column: scala.Double): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def hideColumn(columnId: scala.Double, state: scala.Boolean): scala.Unit = js.native
  def hideGridlines(state: scala.Boolean): scala.Unit = js.native
  def hideHeaders(state: scala.Boolean): scala.Unit = js.native
  def hideRow(rowId: scala.Double, state: scala.Boolean): scala.Unit = js.native
  def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
  def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
  def insertColumn(columnId: scala.Double): scala.Unit = js.native
  def insertRow(rowId: scala.Double): scala.Unit = js.native
  def isCellLocked(rowId: scala.Double, columnId: scala.Double): scala.Boolean = js.native
  def isColumnVisible(columnId: scala.Double): scala.Boolean = js.native
  def isRowVisible(rowId: scala.Double): scala.Boolean = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): js.Promise[_] = js.native
  def lockCell(row: js.Any, column: js.Any, state: scala.Boolean): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def recalculate(): scala.Unit = js.native
  def redo(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def registerMathMethod(name: java.lang.String, handler: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def removeFilter(): scala.Unit = js.native
  def removeSheet(name: java.lang.String): scala.Unit = js.native
  def renameSheet(name: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resetUndo(): scala.Unit = js.native
  def saveCell(row: scala.Double, column: scala.Double): scala.Unit = js.native
  def serialize(): js.Any = js.native
  def serialize(options: js.Any): js.Any = js.native
  def setCellEditor(rowId: scala.Double, columnId: scala.Double, editorObject: js.Any): scala.Unit = js.native
  def setCellFilter(rowId: scala.Double, columnId: scala.Double, options: java.lang.String): scala.Unit = js.native
  def setCellFilter(rowId: scala.Double, columnId: scala.Double, options: js.Array[_]): scala.Unit = js.native
  def setCellValue(row: scala.Double, column: js.Any, value: java.lang.String): scala.Unit = js.native
  def setFormat(rowId: scala.Double, columnId: scala.Double, format: java.lang.String): scala.Unit = js.native
  def setPlaceholder(placeholder: js.Any): scala.Unit = js.native
  def setRangeStyle(rangeStr: java.lang.String, style: js.Any): scala.Unit = js.native
  def setRangeValue(range: java.lang.String): scala.Unit = js.native
  def setStyle(row: scala.Double, column: scala.Double, style: js.Any): scala.Unit = js.native
  def showSheet(name: java.lang.String): scala.Unit = js.native
  def sortRange(): scala.Unit = js.native
  def sortRange(range: java.lang.String): scala.Unit = js.native
  def sortRange(range: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def splitCell(row: scala.Double, column: scala.Double): scala.Unit = js.native
  def ui(view: js.Any): baseview = js.native
  def unblockEvent(): scala.Unit = js.native
  def undo(id: java.lang.String): scala.Unit = js.native
}

