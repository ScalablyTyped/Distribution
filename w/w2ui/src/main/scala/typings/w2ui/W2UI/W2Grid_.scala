package typings.w2ui.W2UI

import typings.std.HTMLElement
import typings.w2ui.W2UI.W2Grid.Columns
import typings.w2ui.W2UI.W2Grid.Ranges
import typings.w2ui.W2UI.W2Grid.Records
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Grid_
  extends W2Common
     with W2OnClickable {
  var autoLoad: Boolean = js.native
  var buttons: js.Object = js.native
  var columnGroups: js.Array[js.Object] = js.native
  var columns: js.Array[js.Object] = js.native
  var fixedBody: Boolean = js.native
  var header: String = js.native
  var keyboard: Boolean = js.native
  var last: js.Object = js.native
  var limit: Double = js.native
  var markSearch: Boolean = js.native
  var menu: js.Array[js.Object] = js.native
  var method: String = js.native
  var msgAJAXerror: String = js.native
  var msgDelete: String = js.native
  var msgNotJSON: String = js.native
  var msgRefresh: String = js.native
  var multiSearch: Boolean = js.native
  var multiSelect: Boolean = js.native
  var multiSort: Boolean = js.native
  var offset: Double = js.native
  var parser: js.Function = js.native
  var postData: js.Object = js.native
  var ranges: js.Array[js.Object] = js.native
  var recid: String = js.native
  var recordHeight: Double = js.native
  var records: js.Array[js.Object] = js.native
  var reorderColumns: Boolean = js.native
  var reorderRows: Boolean = js.native
  var routeData: String = js.native
  var searchData: js.Array[js.Object] = js.native
  var searches: js.Array[js.Object] = js.native
  var selectType: String = js.native
  var show: js.Object = js.native
  var sortData: js.Array[js.Object] = js.native
  var summary: js.Array[js.Object] = js.native
  var toolbar: js.Object = js.native
  var total: Double = js.native
  var url: String = js.native
  def add(record: js.Array[Records]): Double = js.native
  def add(record: Records): Double = js.native
  def addColumn(before: String, column: js.Array[Columns]): Double = js.native
  def addColumn(before: String, column: Columns): Double = js.native
  def addColumn(before: Double, column: js.Array[Columns]): Double = js.native
  def addColumn(before: Double, column: Columns): Double = js.native
  def addColumn(column: js.Array[Columns]): Double = js.native
  def addColumn(column: Columns): Double = js.native
  def addRange(range: js.Array[Ranges]): Double = js.native
  def addRange(range: Ranges): Double = js.native
  def addSearch(before: String, search: js.Array[js.Object]): Double = js.native
  def addSearch(before: String, search: js.Object): Double = js.native
  def addSearch(before: Double, search: js.Array[js.Object]): Double = js.native
  def addSearch(before: Double, search: js.Object): Double = js.native
  def addSearch(search: js.Array[js.Object]): Double = js.native
  def addSearch(search: js.Object): Double = js.native
  def clear(): Unit = js.native
  def clear(noRefresh: Boolean): Unit = js.native
  def click(recid: String): Unit = js.native
  def click(recid: String, event: js.Object): Unit = js.native
  def collapse(recid: String): Boolean = js.native
  def columnClick(field: String): Boolean = js.native
  def columnClick(field: String, event: js.Object): Boolean = js.native
  def columnOnOff(el: HTMLElement, event: js.Object, field: String, value: Double): Unit = js.native
  def contextMenu(recid: String): Unit = js.native
  def contextMenu(recid: String, event: js.Object): Unit = js.native
  def copy(): String = js.native
  def dblClick(recid: String): Unit = js.native
  def dblClick(recid: String, event: js.Object): Unit = js.native
  def delete(force: Boolean): Unit = js.native
  def editField(recid: String, column: Double): Unit = js.native
  def editField(recid: String, column: Double, value: js.UndefOr[scala.Nothing], event: js.Object): Unit = js.native
  def editField(recid: String, column: Double, value: String): Unit = js.native
  def editField(recid: String, column: Double, value: String, event: js.Object): Unit = js.native
  def error(msg: String): Unit = js.native
  def expand(recid: String): Boolean = js.native
  def find(`match`: js.Object): js.Array[Double | js.Object] = js.native
  def find(`match`: js.Object, returnIndex: Boolean): js.Array[Double | js.Object] = js.native
  def get(recid: String): js.Object | Double | Unit = js.native
  def get(recid: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def getCellHTML(index: Double, columnIndex: Double): String = js.native
  def getCellHTML(index: Double, columnIndex: Double, summary: Boolean): String = js.native
  def getCellValue(index: Double, columnIndex: Double): String = js.native
  def getCellValue(index: Double, columnIndex: Double, summary: Boolean): String = js.native
  def getChanges(): js.Array[js.Object] = js.native
  def getColumn(field: String): js.Object | Double | Unit = js.native
  def getColumn(field: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def getColumnsHTML(): String = js.native
  def getFooterHTML(): String = js.native
  def getRangeData(range: js.Object): js.Array[js.Array[js.Object]] = js.native
  def getRangeData(range: js.Object, extra: Boolean): js.Array[js.Array[js.Object]] = js.native
  def getRecordHTML(index: Double, lineNumber: Double): String = js.native
  def getRecordHTML(index: Double, lineNumber: Double, summary: Boolean): String = js.native
  def getRecordsHTML(): String = js.native
  def getSearch(field: String): js.Object | Double | Unit = js.native
  def getSearch(field: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def getSearchData(field: String): js.Object | Unit = js.native
  def getSearchesHTML(): String = js.native
  def getSelection(): js.Array[js.Object] = js.native
   // the doc is weird here
  def getSummaryHTML(): String = js.native
  def hideColumn(fields: String*): Double = js.native
  def hideSearch(fields: String*): Double = js.native
  def initAllField(field: String): Unit = js.native
  def initAllField(field: String, value: String): Unit = js.native
  def initColumnOnOff(): Unit = js.native
  //initOperator(el, searchInd): void; // this is used internally
  def initResize(): Unit = js.native
  def initSearches(): Unit = js.native
  def initToolbar(): Unit = js.native
  def keydown(event: js.Object): Unit = js.native
  def load(url: String): Unit = js.native
  def load(url: String, callback: js.Function): Unit = js.native
  def localSearch(): Double = js.native
  def localSearch(silent: Boolean): Double = js.native
  def localSort(): Double = js.native
  def localSort(silent: Boolean): Double = js.native
  def lock(message: String): Unit = js.native
  def lock(message: String, showSpinner: Boolean): Unit = js.native
  def menuClick(recid: String, index: Double, event: js.Object): Unit = js.native
  def mergeChanges(): Unit = js.native
  def nextCell(colInd: Double, editable: Boolean): Double | Unit = js.native
  def nextRow(index: Double): Double | Unit = js.native
  def parseField(obj: js.Object, field: String): js.Any = js.native
  def paste(text: String): Unit = js.native
  def prevCell(colInd: Double, editable: Boolean): Double | Unit = js.native
  def prevRow(index: Double): Double | Unit = js.native
  def refreshCell(recid: String, field: String): Unit = js.native
  def refreshRanges(): Double = js.native
  def refreshRow(recid: String): Unit = js.native
  def reload(): Unit = js.native
  def reload(callback: js.Function): Unit = js.native
  def remove(recids: String*): Double = js.native
  def removeColumn(fields: String*): Double = js.native
  def removeRange(rangeNames: String*): Double = js.native
  def removeSearch(fields: String*): Double = js.native
  def request(cmd: String): Unit = js.native
  def request(
    cmd: String,
    params: js.UndefOr[scala.Nothing],
    url: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  def request(cmd: String, params: js.UndefOr[scala.Nothing], url: String): Unit = js.native
  def request(cmd: String, params: js.UndefOr[scala.Nothing], url: String, callback: js.Function): Unit = js.native
  def request(cmd: String, params: js.Object): Unit = js.native
  def request(cmd: String, params: js.Object, url: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def request(cmd: String, params: js.Object, url: String): Unit = js.native
  def request(cmd: String, params: js.Object, url: String, callback: js.Function): Unit = js.native
  def requestComplete(status: String, cmd: String): Unit = js.native
  def requestComplete(status: String, cmd: String, callback: js.Function): Unit = js.native
  def reset(): Unit = js.native
  def reset(noRefresh: Boolean): Unit = js.native
  def resizeBoxes(): Unit = js.native
  def resizeRecords(): Unit = js.native
  def save(): Unit = js.native
  def scroll(event: js.Object): Unit = js.native
  def scrollIntoView(ind: Double): Unit = js.native
  def search(field: String, value: String): Unit = js.native
  def search(searches: js.Array[js.Object]): Unit = js.native
  def search(searches: js.Array[js.Object], logic: String): Unit = js.native
  def searchClose(): Unit = js.native
  def searchOpen(): Unit = js.native
  def searchReset(): Unit = js.native
  def searchReset(noRefresh: Boolean): Unit = js.native
  def searchShowFields(): Unit = js.native
  def select(recids: String*): Double = js.native
  def selectAll(): Unit = js.native
  def selectNone(): Unit = js.native
  def set(recid: String, record: js.Object): Boolean = js.native
  def set(recid: String, record: js.Object, noRefresh: Boolean): Boolean = js.native
  def set(record: js.Object): Boolean = js.native
  def set(record: js.Object, noRefresh: Boolean): Boolean = js.native
  def showColumn(fields: String*): Double = js.native
  def showSearch(fields: String*): Double = js.native
  def skip(offset: Double): Double = js.native
  def sort(): Unit = js.native
  def sort(field: String): Unit = js.native
  def sort(field: String, direction: js.UndefOr[scala.Nothing], multiField: Boolean): Unit = js.native
  def sort(field: String, direction: String): Unit = js.native
  def sort(field: String, direction: String, multiField: Boolean): Unit = js.native
  def stateReset(): Unit = js.native
  def stateRestore(): js.Object | Unit = js.native
  def stateRestore(stateObj: js.Object): js.Object | Unit = js.native
  def stateSave(): js.Object | Unit = js.native
  def stateSave(returnOnly: Boolean): js.Object | Unit = js.native
  def status(): Unit = js.native
  def status(msg: String): Unit = js.native
  def toggle(recid: String): Unit = js.native
  def toggleColumn(fields: String*): Double = js.native
  def toggleSearch(fields: String*): Double = js.native
  def toolbarAdd(): Unit = js.native
  def toolbarDelete(): Unit = js.native
  def toolbarDelete(force: Boolean): Unit = js.native
  def unlock(): Unit = js.native
  def unselect(recids: String*): Double = js.native
}

