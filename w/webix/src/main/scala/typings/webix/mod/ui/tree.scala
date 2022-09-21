package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.DataStore
import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.tree")
@js.native
open class tree ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String = js.native
  
  @JSName("$dragHTML")
  def $dragHTML(args: Any*): Any = js.native
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback = js.native
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  
  @JSName("$dragMark")
  def $dragMark(context: Any, ev: Event): Boolean = js.native
  
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
  
  @JSName("$fixEditor")
  def $fixEditor(args: Any*): Any = js.native
  @JSName("$fixEditor")
  var $fixEditor_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_tree: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def add(obj: Any): String = js.native
  def add(obj: Any, index: Double): String = js.native
  def add(obj: Any, index: Double, parentId: String): String = js.native
  def add(obj: Any, index: Unit, parentId: String): String = js.native
  
  def addCss(id: String, css: String): Unit = js.native
  def addCss(id: String, css: String, silent: Boolean): Unit = js.native
  def addCss(id: Double, css: String): Unit = js.native
  def addCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def attachEvent(`type`: treeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: treeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def checkAll(): Unit = js.native
  def checkAll(id: String): Unit = js.native
  def checkAll(id: Double): Unit = js.native
  
  def checkItem(id: String): Unit = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearCss(css: String): Unit = js.native
  def clearCss(css: String, silent: Boolean): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  
  def closeAll(): Unit = js.native
  
  @JSName("config")
  var config_tree: treeConfig = js.native
  
  def copy(sid: String, tindex: Double): Double = js.native
  def copy(sid: String, tindex: Double, tobj: Unit, details: Any): Double = js.native
  def copy(sid: String, tindex: Double, tobj: typings.webix.webix.ui.baseview): Double = js.native
  def copy(sid: String, tindex: Double, tobj: typings.webix.webix.ui.baseview, details: Any): Double = js.native
  def copy(sid: Double, tindex: Double): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: Unit, details: Any): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: typings.webix.webix.ui.baseview): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: typings.webix.webix.ui.baseview, details: Any): Double = js.native
  
  def count(): Double = js.native
  
  def customize(obj: Any): Unit = js.native
  
  var data: DataStore = js.native
  
  def detachEvent(id: String): Unit = js.native
  
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
  
  def find(criterion: WebixCallback): Any = js.native
  def find(criterion: WebixCallback, first: Boolean): Any = js.native
  
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  
  def getChecked(): js.Array[Any] = js.native
  
  def getFirstChildId(id: String): String = js.native
  def getFirstChildId(id: Double): String = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): Any = js.native
  def getItem(id: Double): Any = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def getLastId(): Double | String = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getNextSiblingId(id: String): String | Double = js.native
  def getNextSiblingId(id: Double): String | Double = js.native
  
  def getOpenItems(): js.Array[Any] = js.native
  
  def getParentId(id: String): String | Double = js.native
  def getParentId(id: Double): String | Double = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getPrevSiblingId(id: String): String | Double = js.native
  def getPrevSiblingId(id: Double): String | Double = js.native
  
  def getScrollState(): Any = js.native
  
  def getSelectedId(as_array: Boolean): String | js.Array[Any] = js.native
  
  def getSelectedItem(as_array: Boolean): Any = js.native
  
  def getState(): Any = js.native
  
  def group(config: Any): Unit = js.native
  def group(config: Any, target: String): Unit = js.native
  def group(config: Any, target: Double): Unit = js.native
  
  def hasCss(id: String, css: String): Boolean = js.native
  def hasCss(id: Double, css: String): Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  
  def isBranchOpen(id: String): Boolean = js.native
  def isBranchOpen(id: Double): Boolean = js.native
  
  def isChecked(id: String): Boolean = js.native
  def isChecked(id: Double): Boolean = js.native
  
  def isSelected(id: String): Boolean = js.native
  def isSelected(id: Double): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[Any] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[Any] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[Any] = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Any, details: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: Any): String = js.native
  
  def moveSelection(direction: String): Unit = js.native
  
  def on_click(args: Any*): Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  var on_context: StringDictionary[Any] = js.native
  
  def on_dblclick(args: Any*): Any = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  
  def on_mouse_move(args: Any*): Any = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  
  def open(id: String): Unit = js.native
  def open(id: String, show: Boolean): Unit = js.native
  def open(id: Double): Unit = js.native
  def open(id: Double, show: Boolean): Unit = js.native
  
  def openAll(): Unit = js.native
  
  def parse(data: Any, `type`: String): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeCss(id: String, css: String): Unit = js.native
  def removeCss(id: String, css: String, silent: Boolean): Unit = js.native
  def removeCss(id: Double, css: String): Unit = js.native
  def removeCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def select(id: String, preserve: Boolean): Unit = js.native
  def select(id: js.Array[Any], preserve: Boolean): Unit = js.native
  
  def selectAll(): Unit = js.native
  def selectAll(from: String): Unit = js.native
  def selectAll(from: String, to: String): Unit = js.native
  def selectAll(from: Unit, to: String): Unit = js.native
  
  def serialize(rootId: String, all: Boolean): js.Array[Any] = js.native
  def serialize(rootId: Double, all: Boolean): js.Array[Any] = js.native
  
  def setState(state: Any): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var `type`: StringDictionary[Any] = js.native
  
  var types: StringDictionary[Any] = js.native
  
  def unblockEvent(): Unit = js.native
  
  def uncheckAll(): Unit = js.native
  def uncheckAll(id: String): Unit = js.native
  def uncheckAll(id: Double): Unit = js.native
  
  def uncheckItem(id: String): Unit = js.native
  
  def ungroup(mode: Boolean): Unit = js.native
  
  def unselect(): Unit = js.native
  def unselect(id: String): Unit = js.native
  
  def unselectAll(): Unit = js.native
  
  def updateItem(id: String, data: Any): Unit = js.native
  def updateItem(id: Double, data: Any): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  
  var waitData: js.Promise[Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[Any] = js.native
}
