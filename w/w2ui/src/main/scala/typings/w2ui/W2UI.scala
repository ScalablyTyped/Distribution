package typings.w2ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.w2ui.W2UI.W2Grid.Columns
import typings.w2ui.W2UI.W2Grid.Ranges
import typings.w2ui.W2UI.W2Grid.Records
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object W2UI {
  
  @js.native
  trait W2Common extends StObject {
    
    var box: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    var handlers: js.Array[js.Function] = js.native
    
    var name: String = js.native
    
    def off(`type`: String): Unit = js.native
    def off(`type`: String, handler: js.Function): Unit = js.native
    def off(`type`: js.Object): Unit = js.native
    def off(`type`: js.Object, handler: js.Function): Unit = js.native
    
    def on(`type`: String): Unit = js.native
    def on(`type`: String, handler: js.Function): Unit = js.native
    def on(`type`: js.Object): Unit = js.native
    def on(`type`: js.Object, handler: js.Function): Unit = js.native
    
    def refresh(): Double = js.native
    def refresh(id: String): Double = js.native
    
    def render(): Double = js.native
    def render(box: js.Object): Double = js.native
    
    def resize(): Double = js.native
    
    var style: String = js.native
    
    def trigger(eventData: js.Object): js.Object = js.native
  }
  
  trait W2Event extends StObject {
    
    def onComplete(): Unit
    
    var target: String
  }
  object W2Event {
    
    inline def apply(onComplete: () => Unit, target: String): W2Event = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[W2Event]
    }
    
    extension [Self <: W2Event](x: Self) {
      
      inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type W2EventHandler = (js.Function1[/* e */ W2Event, Unit]) | (js.Function2[/* id */ String, /* e */ W2Event, Unit])
  
  @js.native
  trait W2Form
    extends StObject
       with W2Common
       with W2Object {
    
    def action(action: String): Unit = js.native
    def action(action: String, event: js.Object): Unit = js.native
    
    var actions: js.Object = js.native
    
    def clear(): Unit = js.native
    
    def error(msg: String): Unit = js.native
    
    var fields: js.Array[js.Object] = js.native
    
    var focus: Double = js.native
    
    var formHTML: String = js.native
    
    var formURL: String = js.native
    
    def generateHTML(): String = js.native
    
    def get(): js.Object | Double | Unit = js.native
    def get(field: String): js.Object | Double | Unit = js.native
    def get(field: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
    
    def getChanges(): js.Object = js.native
    
    def goto(page: Double): Unit = js.native
    
    var header: String = js.native
    
    var isGenerated: Boolean = js.native
    
    var last: js.Object = js.native
    
    def lock(message: String): Unit = js.native
    def lock(message: String, showSpinner: Boolean): Unit = js.native
    
    var msgAJAXerror: String = js.native
    
    var msgNotJSON: String = js.native
    
    var msgRefresh: String = js.native
    
    var msgSaving: String = js.native
    
    var original: js.Object = js.native
    
    var page: Double = js.native
    
    var postData: js.Object = js.native
    
    var recid: Double = js.native
    
    var record: js.Object = js.native
    
    def reload(): Unit = js.native
    def reload(callback: js.Function): Unit = js.native
    
    def request(): Unit = js.native
    def request(postData: js.Object): Unit = js.native
    def request(postData: js.Object, callback: js.Function): Unit = js.native
    def request(postData: Unit, callback: js.Function): Unit = js.native
    
    var routeData: String = js.native
    
    def save(): Unit = js.native
    def save(postData: js.Object): Unit = js.native
    def save(postData: js.Object, callback: js.Function): Unit = js.native
    def save(postData: Unit, callback: js.Function): Unit = js.native
    
    def set(field: String, obj: js.Object): Boolean = js.native
    
    def submit(): Unit = js.native
    def submit(postData: js.Object): Unit = js.native
    def submit(postData: js.Object, callback: js.Function): Unit = js.native
    def submit(postData: Unit, callback: js.Function): Unit = js.native
    
    var tabs: js.Object = js.native
    
    var toolbar: js.Object = js.native
    
    def unlock(): Unit = js.native
    
    var url: String = js.native
    
    def validate(): js.Array[js.Object] = js.native
    def validate(showErrors: Boolean): js.Array[js.Object] = js.native
  }
  
  @js.native
  trait W2Grid
    extends StObject
       with W2Common
       with W2OnClickable
       with W2Object {
    
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
    
    var autoLoad: Boolean = js.native
    
    var buttons: js.Object = js.native
    
    def clear(): Unit = js.native
    def clear(noRefresh: Boolean): Unit = js.native
    
    def click(recid: String): Unit = js.native
    def click(recid: String, event: js.Object): Unit = js.native
    
    def collapse(recid: String): Boolean = js.native
    
    def columnClick(field: String): Boolean = js.native
    def columnClick(field: String, event: js.Object): Boolean = js.native
    
    var columnGroups: js.Array[js.Object] = js.native
    
    def columnOnOff(el: HTMLElement, event: js.Object, field: String, value: Double): Unit = js.native
    
    var columns: js.Array[js.Object] = js.native
    
    def contextMenu(recid: String): Unit = js.native
    def contextMenu(recid: String, event: js.Object): Unit = js.native
    
    def copy(): String = js.native
    
    def dblClick(recid: String): Unit = js.native
    def dblClick(recid: String, event: js.Object): Unit = js.native
    
    def delete(force: Boolean): Unit = js.native
    
    def editField(recid: String, column: Double): Unit = js.native
    def editField(recid: String, column: Double, value: String): Unit = js.native
    def editField(recid: String, column: Double, value: String, event: js.Object): Unit = js.native
    def editField(recid: String, column: Double, value: Unit, event: js.Object): Unit = js.native
    
    def error(msg: String): Unit = js.native
    
    def expand(recid: String): Boolean = js.native
    
    def find(`match`: js.Object): js.Array[Double | js.Object] = js.native
    def find(`match`: js.Object, returnIndex: Boolean): js.Array[Double | js.Object] = js.native
    
    var fixedBody: Boolean = js.native
    
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
    
    var header: String = js.native
    
    def hideColumn(fields: String*): Double = js.native
    
    def hideSearch(fields: String*): Double = js.native
    
    def initAllField(field: String): Unit = js.native
    def initAllField(field: String, value: String): Unit = js.native
    
    def initColumnOnOff(): Unit = js.native
    
    //initOperator(el, searchInd): void; // this is used internally
    def initResize(): Unit = js.native
    
    def initSearches(): Unit = js.native
    
    def initToolbar(): Unit = js.native
    
    var keyboard: Boolean = js.native
    
    def keydown(event: js.Object): Unit = js.native
    
    var last: js.Object = js.native
    
    var limit: Double = js.native
    
    def load(url: String): Unit = js.native
    def load(url: String, callback: js.Function): Unit = js.native
    
    def localSearch(): Double = js.native
    def localSearch(silent: Boolean): Double = js.native
    
    def localSort(): Double = js.native
    def localSort(silent: Boolean): Double = js.native
    
    def lock(message: String): Unit = js.native
    def lock(message: String, showSpinner: Boolean): Unit = js.native
    
    var markSearch: Boolean = js.native
    
    var menu: js.Array[js.Object] = js.native
    
    def menuClick(recid: String, index: Double, event: js.Object): Unit = js.native
    
    def mergeChanges(): Unit = js.native
    
    var method: String = js.native
    
    var msgAJAXerror: String = js.native
    
    var msgDelete: String = js.native
    
    var msgNotJSON: String = js.native
    
    var msgRefresh: String = js.native
    
    var multiSearch: Boolean = js.native
    
    var multiSelect: Boolean = js.native
    
    var multiSort: Boolean = js.native
    
    def nextCell(colInd: Double, editable: Boolean): Double | Unit = js.native
    
    def nextRow(index: Double): Double | Unit = js.native
    
    var offset: Double = js.native
    
    def parseField(obj: js.Object, field: String): Any = js.native
    
    var parser: js.Function = js.native
    
    def paste(text: String): Unit = js.native
    
    var postData: js.Object = js.native
    
    def prevCell(colInd: Double, editable: Boolean): Double | Unit = js.native
    
    def prevRow(index: Double): Double | Unit = js.native
    
    var ranges: js.Array[js.Object] = js.native
    
    var recid: String = js.native
    
    var recordHeight: Double = js.native
    
    var records: js.Array[js.Object] = js.native
    
    def refreshCell(recid: String, field: String): Unit = js.native
    
    def refreshRanges(): Double = js.native
    
    def refreshRow(recid: String): Unit = js.native
    
    def reload(): Unit = js.native
    def reload(callback: js.Function): Unit = js.native
    
    def remove(recids: String*): Double = js.native
    
    def removeColumn(fields: String*): Double = js.native
    
    def removeRange(rangeNames: String*): Double = js.native
    
    def removeSearch(fields: String*): Double = js.native
    
    var reorderColumns: Boolean = js.native
    
    var reorderRows: Boolean = js.native
    
    def request(cmd: String): Unit = js.native
    def request(cmd: String, params: js.Object): Unit = js.native
    def request(cmd: String, params: js.Object, url: String): Unit = js.native
    def request(cmd: String, params: js.Object, url: String, callback: js.Function): Unit = js.native
    def request(cmd: String, params: js.Object, url: Unit, callback: js.Function): Unit = js.native
    def request(cmd: String, params: Unit, url: String): Unit = js.native
    def request(cmd: String, params: Unit, url: String, callback: js.Function): Unit = js.native
    def request(cmd: String, params: Unit, url: Unit, callback: js.Function): Unit = js.native
    
    def requestComplete(status: String, cmd: String): Unit = js.native
    def requestComplete(status: String, cmd: String, callback: js.Function): Unit = js.native
    
    def reset(): Unit = js.native
    def reset(noRefresh: Boolean): Unit = js.native
    
    def resizeBoxes(): Unit = js.native
    
    def resizeRecords(): Unit = js.native
    
    var routeData: String = js.native
    
    def save(): Unit = js.native
    
    def scroll(event: js.Object): Unit = js.native
    
    def scrollIntoView(ind: Double): Unit = js.native
    
    def search(field: String, value: String): Unit = js.native
    def search(searches: js.Array[js.Object]): Unit = js.native
    def search(searches: js.Array[js.Object], logic: String): Unit = js.native
    
    def searchClose(): Unit = js.native
    
    var searchData: js.Array[js.Object] = js.native
    
    def searchOpen(): Unit = js.native
    
    def searchReset(): Unit = js.native
    def searchReset(noRefresh: Boolean): Unit = js.native
    
    def searchShowFields(): Unit = js.native
    
    var searches: js.Array[js.Object] = js.native
    
    def select(recids: String*): Double = js.native
    
    def selectAll(): Unit = js.native
    
    def selectNone(): Unit = js.native
    
    var selectType: String = js.native
    
    def set(recid: String, record: js.Object): Boolean = js.native
    def set(recid: String, record: js.Object, noRefresh: Boolean): Boolean = js.native
    def set(record: js.Object): Boolean = js.native
    def set(record: js.Object, noRefresh: Boolean): Boolean = js.native
    
    var show: js.Object = js.native
    
    def showColumn(fields: String*): Double = js.native
    
    def showSearch(fields: String*): Double = js.native
    
    def skip(offset: Double): Double = js.native
    
    def sort(): Unit = js.native
    def sort(field: String): Unit = js.native
    def sort(field: String, direction: String): Unit = js.native
    def sort(field: String, direction: String, multiField: Boolean): Unit = js.native
    def sort(field: String, direction: Unit, multiField: Boolean): Unit = js.native
    
    var sortData: js.Array[js.Object] = js.native
    
    def stateReset(): Unit = js.native
    
    def stateRestore(): js.Object | Unit = js.native
    def stateRestore(stateObj: js.Object): js.Object | Unit = js.native
    
    def stateSave(): js.Object | Unit = js.native
    def stateSave(returnOnly: Boolean): js.Object | Unit = js.native
    
    def status(): Unit = js.native
    def status(msg: String): Unit = js.native
    
    var summary: js.Array[js.Object] = js.native
    
    def toggle(recid: String): Unit = js.native
    
    def toggleColumn(fields: String*): Double = js.native
    
    def toggleSearch(fields: String*): Double = js.native
    
    var toolbar: js.Object = js.native
    
    def toolbarAdd(): Unit = js.native
    
    def toolbarDelete(): Unit = js.native
    def toolbarDelete(force: Boolean): Unit = js.native
    
    var total: Double = js.native
    
    def unlock(): Unit = js.native
    
    def unselect(recids: String*): Double = js.native
    
    var url: String = js.native
  }
  object W2Grid {
    
    trait Columns extends StObject
    
    trait Ranges extends StObject
    
    trait Records extends StObject
  }
  
  /* Primitives (first alphabetically, then by documentation order) */
  trait W2Item extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var img: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[W2Item]] = js.undefined
    
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object W2Item {
    
    inline def apply(): W2Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[W2Item]
    }
    
    extension [Self <: W2Item](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setItems(value: js.Array[W2Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: W2Item*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait W2Layout
    extends StObject
       with W2Common
       with W2Object {
    
    def content(`type`: String): js.Array[HTMLElement] | W2Object = js.native
    def content(`type`: String, content: js.Object): Unit = js.native
    def content(`type`: String, content: js.Object, transition: String): Unit = js.native
    def content(`type`: String, content: HTMLElement): Unit = js.native
    def content(`type`: String, content: HTMLElement, transition: String): Unit = js.native
    
    def el(`type`: String): HTMLElement = js.native
    
    def get(`type`: String): W2Panel = js.native
    
    def hide(`type`: String): Unit = js.native
    def hide(`type`: String, immediate: Boolean): Unit = js.native
    
    def hideTabs(`type`: String): Unit = js.native
    
    def hideToolbar(`type`: String): Unit = js.native
    
    def html(`type`: String): String = js.native
    def html(`type`: String, content: String): Unit = js.native
    def html(`type`: String, content: String, transition: String): Unit = js.native
    def html(`type`: String, content: js.Object): Unit = js.native
    def html(`type`: String, content: js.Object, transition: String): Unit = js.native
    def html(`type`: String, content: Unit, transition: String): Unit = js.native
    @JSName("html")
    def html_Unit(`type`: String): Unit = js.native
    
    def load(`type`: String, url: String): Unit = js.native
    def load(`type`: String, url: String, transition: String): Unit = js.native
    def load(`type`: String, url: String, transition: String, onLoad: js.Function): Unit = js.native
    def load(`type`: String, url: String, transition: Unit, onLoad: js.Function): Unit = js.native
    
    def lock(panel: String, message: String): Unit = js.native
    def lock(panel: String, message: String, showSpinner: Boolean): Unit = js.native
    
    var padding: Double = js.native
    
    var panels: js.Array[W2Panel] = js.native
    
    var resizer: Double = js.native
    
    def set(`type`: String, panel: js.Object): Unit = js.native
    
    def show(`type`: String): Unit = js.native
    def show(`type`: String, immediate: Boolean): Unit = js.native
    
    def showTabs(`type`: String): Unit = js.native
    
    def showToolbar(`type`: String): Unit = js.native
    
    def sizeTo(`type`: String, size: Double): Unit = js.native
    
    var tmp: js.Object = js.native
    
    def toggle(`type`: String): Unit = js.native
    def toggle(`type`: String, immediate: Boolean): Unit = js.native
    
    def toggleTabs(`type`: String): Unit = js.native
    
    def toggleToolbar(`type`: String): Unit = js.native
    
    def unlock(panel: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.w2ui.W2UI.W2Layout
    - typings.w2ui.W2UI.W2Grid
    - typings.w2ui.W2UI.W2Toolbar
    - typings.w2ui.W2UI.W2Sidebar
    - typings.w2ui.W2UI.W2Tabs
    - typings.w2ui.W2UI.W2Form
    - typings.w2ui.W2UI.W2Popup
  */
  trait W2Object extends StObject
  
  @js.native
  trait W2OnClickable extends StObject {
    
    def onClick(event: W2Event): Unit = js.native
    def onClick(id: String, data: W2Event): Unit = js.native
  }
  
  trait W2Panel extends StObject {
    
    var content: js.UndefOr[String | JQuery] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var tabs: js.UndefOr[W2Tabs] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object W2Panel {
    
    inline def apply(): W2Panel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[W2Panel]
    }
    
    extension [Self <: W2Panel](x: Self) {
      
      inline def setContent(value: String | JQuery): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabs(value: W2Tabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait W2Popup
    extends StObject
       with W2Common
       with W2Object {
    
    def clear(): Unit = js.native
    
    def close(): Unit = js.native
    
    var defaults: js.Object = js.native
    
    def get(): js.Object = js.native
    
    def keydown(event: js.Object): Unit = js.native
    
    def load(options: js.Object): Unit = js.native
    
    def lock(message: String): Unit = js.native
    def lock(message: String, showSpinner: Boolean): Unit = js.native
    
    def lockScreen(): Unit = js.native
    def lockScreen(options: js.Object): Unit = js.native
    
    def max(): Unit = js.native
    
    def message(msgOptions: js.Object): Unit = js.native
    
    def min(): Unit = js.native
    
    def open(options: js.Object): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resize(width: Double): Double = js.native
    def resize(width: Double, height: Double): Double = js.native
    def resize(width: Double, height: Double, callback: js.Function): Double = js.native
    def resize(width: Double, height: Unit, callback: js.Function): Double = js.native
    def resize(width: Unit, height: Double): Double = js.native
    def resize(width: Unit, height: Double, callback: js.Function): Double = js.native
    def resize(width: Unit, height: Unit, callback: js.Function): Double = js.native
    @JSName("resize")
    def resize_Unit(): Unit = js.native
    
    def set(options: js.Object): Unit = js.native
    
    var status: String = js.native
    
    def toggle(): Unit = js.native
    
    def unlock(): Unit = js.native
    
    def unlockScreen(): Unit = js.native
  }
  
  @js.native
  trait W2Sidebar
    extends StObject
       with W2Common
       with W2OnClickable
       with W2Object {
    
    def add(nodes: js.Array[js.Object]): js.Object = js.native
    def add(nodes: js.Object): js.Object = js.native
    def add(parent: String, nodes: js.Array[js.Object]): js.Object = js.native
    def add(parent: String, nodes: js.Object): js.Object = js.native
    
    var bottomHTML: String = js.native
    
    def click(id: String): Unit = js.native
    def click(id: String, event: js.Object): Unit = js.native
    
    def collapse(id: String): Unit = js.native
    
    def collapseAll(): Unit = js.native
    def collapseAll(parent: String): Unit = js.native
    
    def contextMenu(id: String): Unit = js.native
    def contextMenu(id: String, event: js.Object): Unit = js.native
    
    def dblClick(id: String): Unit = js.native
    def dblClick(id: String, event: js.Object): Unit = js.native
    
    def disable(ids: String*): Double = js.native
    
    def enable(ids: String*): Double = js.native
    
    def expand(id: String): Unit = js.native
    
    def expandAll(): Unit = js.native
    def expandAll(parent: String): Unit = js.native
    
    def expandParents(id: String): Unit = js.native
    
    def find(attrs: js.Object): js.Array[js.Object] = js.native
    def find(parent: String, attrs: js.Object): js.Array[js.Object] = js.native
    
    def get(): js.Object | Double | Unit = js.native
    def get(id: String): js.Object | Double | Unit = js.native
    def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
    def get(parent: String, id: String): js.Object | Double | Unit = js.native
    def get(parent: String, id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
    
    def hide(ids: String*): Double = js.native
    
    var icon: String = js.native
    
    var img: String = js.native
    
    def insert(before: String, nodes: js.Array[js.Object]): js.Object = js.native
    def insert(before: String, nodes: js.Object): js.Object = js.native
    def insert(before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
    def insert(before: js.Object, nodes: js.Object): js.Object = js.native
    def insert(parent: String, before: String, nodes: js.Array[js.Object]): js.Object = js.native
    def insert(parent: String, before: String, nodes: js.Object): js.Object = js.native
    def insert(parent: String, before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
    def insert(parent: String, before: js.Object, nodes: js.Object): js.Object = js.native
    
    var keyboard: Boolean = js.native
    
    def keydown(event: js.Object): Unit = js.native
    
    def lock(message: String): Unit = js.native
    def lock(message: String, showSpinner: Boolean): Unit = js.native
    
    var menu: js.Array[js.Object] = js.native
    
    def menuClick(id: String, index: Double): Unit = js.native
    def menuClick(id: String, index: Double, event: js.Object): Unit = js.native
    
    var nodes: js.Array[js.Object] = js.native
    
    var parent: W2Common = js.native
    
    def remove(ids: String*): Double = js.native
    
    var routeData: String = js.native
    
    def scrollIntoView(): Unit = js.native
    def scrollIntoView(id: String): Unit = js.native
    
    def select(id: String): Unit = js.native
    
    var selected: String = js.native
    
    def set(id: String, node: js.Object): Boolean = js.native
    def set(parent: String, id: String, node: js.Object): Boolean = js.native
    
    def show(ids: String*): Double = js.native
    
    var sidebar: js.Object = js.native
    
    def toggle(id: String): Unit = js.native
    
    var topHTML: String = js.native
    
    def unlock(): Unit = js.native
    
    def unselect(id: String): Boolean = js.native
  }
  
  trait W2Tab extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object W2Tab {
    
    inline def apply(): W2Tab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[W2Tab]
    }
    
    extension [Self <: W2Tab](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait W2Tabs
    extends StObject
       with W2Common
       with W2OnClickable
       with W2Object {
    
    var active: String = js.native
    
    def add(tabs: js.Array[js.Object]): Unit = js.native
    def add(tabs: js.Object): Unit = js.native
    
    def animateClose(id: String): Unit = js.native
    def animateClose(id: String, event: js.Array[js.Object]): Unit = js.native
    def animateClose(id: String, event: js.Object): Unit = js.native
    
    def animateInsert(before: String, tabs: js.Array[js.Object]): Unit = js.native
    def animateInsert(before: String, tabs: js.Object): Unit = js.native
    
    def click(id: String): Unit = js.native
    def click(id: String, event: js.Object): Unit = js.native
    
    def disable(ids: String*): Double = js.native
    
    def enable(ids: String*): Double = js.native
    
    def get(id: String): js.Object | Double | Unit = js.native
    def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
    
    def hide(ids: String*): Double = js.native
    
    def insert(before: String, tabs: js.Array[js.Object]): Unit = js.native
    def insert(before: String, tabs: js.Object): Unit = js.native
    
    def remove(ids: String*): Double = js.native
    
    var right: String = js.native
    
    var routeData: String = js.native
    
    def select(id: String): Boolean = js.native
    
    def set(id: String, tab: js.Object): Boolean = js.native
    
    def show(ids: String*): Double = js.native
    
    var tabs: js.Array[W2Tab] = js.native
  }
  
  @js.native
  trait W2Toolbar
    extends StObject
       with W2Common
       with W2OnClickable
       with W2Object {
    
    def add(items: js.Array[js.Object]): Unit = js.native
    def add(items: js.Object): Unit = js.native
    
    def check(ids: String*): Double = js.native
    
    def click(id: String): Unit = js.native
    def click(id: String, event: js.Object): Unit = js.native
    
    def disable(ids: String*): Double = js.native
    
    def enable(ids: String*): Double = js.native
    
    def get(id: String): js.Object | Double | Unit = js.native
    def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
    
    def getItemHTML(item: js.Object): String = js.native
    
    def hide(ids: String*): Double = js.native
    
    def insert(before: String, items: js.Array[js.Object]): Unit = js.native
    def insert(before: String, items: js.Object): Unit = js.native
    
    var items: js.Array[W2Item] = js.native
    
    def menuClick(id: String, menuIndex: Double): Unit = js.native
    def menuClick(id: String, menuIndex: Double, event: js.Object): Unit = js.native
    
    def remove(ids: String*): Double = js.native
    
    var right: String = js.native
    
    var routeData: String = js.native
    
    def set(id: String, item: js.Object): Boolean = js.native
    
    def show(ids: String*): Double = js.native
    
    def uncheck(ids: String*): Double = js.native
  }
  
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  StringDictionary[Any]
}
