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

@JSImport("webix", "ui.contextmenu")
@js.native
open class contextmenu ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$customPrint")
  def $customPrint(args: Any*): Any = js.native
  @JSName("$customPrint")
  var $customPrint_Original: WebixCallback = js.native
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event, pointer: String): String = js.native
  
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event, pointer: String): HTMLElement = js.native
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any = js.native
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback = js.native
  
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
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
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
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_contextmenu: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def add(obj: obj): String | Double = js.native
  def add(obj: obj, index: Double): String | Double = js.native
  
  def addCss(id: String, css: String): Unit = js.native
  def addCss(id: String, css: String, silent: Boolean): Unit = js.native
  def addCss(id: Double, css: String): Unit = js.native
  def addCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def attachEvent(`type`: contextmenuEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: contextmenuEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachTo(view: obj): Unit = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearCss(css: String): Unit = js.native
  def clearCss(css: String, silent: Boolean): Unit = js.native
  
  def clearValidation(): Unit = js.native
  
  @JSName("config")
  var config_contextmenu: contextmenuConfig = js.native
  
  def copy(sid: String, tindex: Double): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: Unit, details: obj): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: obj): Unit = js.native
  def copy(sid: String, tindex: Double, tobj: obj, details: obj): Unit = js.native
  def copy(sid: Double, tindex: Double): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: Unit, details: obj): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: obj): Unit = js.native
  def copy(sid: Double, tindex: Double, tobj: obj, details: obj): Unit = js.native
  
  def count(): Double = js.native
  
  def customize(obj: obj): Unit = js.native
  
  var data: DataStore = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def disableItem(id: String): Unit = js.native
  def disableItem(id: Double): Unit = js.native
  
  def enableItem(id: String): Unit = js.native
  def enableItem(id: Double): Unit = js.native
  
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
  
  def getBody(): obj = js.native
  
  def getContext(): obj = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getHead(): obj = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): obj = js.native
  def getItem(id: Double): obj = js.native
  
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  
  def getLastId(): Double | String = js.native
  
  def getMenu(id: String): obj = js.native
  def getMenu(id: Double): obj = js.native
  
  def getMenuItem(id: String): obj = js.native
  def getMenuItem(id: Double): obj = js.native
  
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
  
  def getSelectedId(): Any = js.native
  def getSelectedId(as_array: Boolean): Any = js.native
  
  def getSelectedItem(): obj = js.native
  def getSelectedItem(as_array: Boolean): obj = js.native
  
  def getSubMenu(id: String): obj = js.native
  def getSubMenu(id: Double): obj = js.native
  
  def getTopMenu(): obj = js.native
  
  def getVisibleCount(): Double = js.native
  
  def hasCss(id: String, css: String): Boolean = js.native
  def hasCss(id: Double, css: String): Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hideMenuItem(id: String): Unit = js.native
  def hideMenuItem(id: Double): Unit = js.native
  
  def isItemEnabled(): Boolean = js.native
  
  def isSelected(id: String): Boolean = js.native
  def isSelected(id: Double): Boolean = js.native
  
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
  
  def locate(e: Event): String | Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj, details: obj): String = js.native
  
  def moveBottom(id: String): Unit = js.native
  def moveBottom(id: Double): Unit = js.native
  
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
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeCss(id: String, css: String): Unit = js.native
  def removeCss(id: String, css: String, silent: Boolean): Unit = js.native
  def removeCss(id: Double, css: String): Unit = js.native
  def removeCss(id: Double, css: String, silent: Boolean): Unit = js.native
  
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def select(id: String): Unit = js.native
  def select(id: String, preserve: Boolean): Unit = js.native
  def select(id: js.Array[Any]): Unit = js.native
  def select(id: js.Array[Any], preserve: Boolean): Unit = js.native
  
  def selectAll(): Unit = js.native
  def selectAll(from: String): Unit = js.native
  def selectAll(from: String, to: String): Unit = js.native
  def selectAll(from: Unit, to: String): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(all: Boolean): js.Array[Any] = js.native
  
  def setContext(context: obj): Unit = js.native
  
  def setPage(page: Double): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def show(node: Unit, position: Unit, point: String): Unit = js.native
  def show(node: Unit, position: obj): Unit = js.native
  def show(node: Unit, position: obj, point: String): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: Unit, point: String): Unit = js.native
  def show(node: HTMLElement, position: obj): Unit = js.native
  def show(node: HTMLElement, position: obj, point: String): Unit = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  def sizeToContent(): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: obj): Unit = js.native
  def sync(source: obj, filter: Unit, silent: Boolean): Unit = js.native
  def sync(source: obj, filter: WebixCallback): Unit = js.native
  def sync(source: obj, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var `type`: obj = js.native
  
  var types: obj = js.native
  
  def unblockEvent(): Unit = js.native
  
  def unselect(): Unit = js.native
  def unselect(id: String): Unit = js.native
  
  def unselectAll(): Unit = js.native
  
  def updateItem(id: String, data: obj): Unit = js.native
  def updateItem(id: Double, data: obj): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  
  var waitData: js.Promise[Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[Any] = js.native
}
