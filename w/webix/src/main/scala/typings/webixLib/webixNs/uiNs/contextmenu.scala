package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.contextmenu")
@js.native
class contextmenu () extends baseview {
  @JSName("$customPrint")
  var $customPrint_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$dragHTML")
  var $dragHTML_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_contextmenu: contextmenuConfig = js.native
  var data: webixLib.webixNs.DataStore = js.native
  @JSName("on_click")
  var on_click_Original: webixLib.webixNs.WebixCallback = js.native
  var on_context: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: webixLib.webixNs.WebixCallback = js.native
  var `type`: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var types: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var waitData: js.Promise[_] = js.native
  @JSName("$customPrint")
  def $customPrint(args: js.Any*): js.Any = js.native
  @JSName("$drag")
  def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
  @JSName("$dragHTML")
  def $dragHTML(args: js.Any*): js.Any = js.native
  @JSName("$dragIn")
  def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
  @JSName("$dragMark")
  def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
  @JSName("$dragOut")
  def $dragOut(
    source: stdLib.HTMLElement,
    old_target: stdLib.HTMLElement,
    new_target: stdLib.HTMLElement,
    ev: stdLib.Event
  ): scala.Unit = js.native
  @JSName("$drop")
  def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  def add(obj: js.Any): java.lang.String | scala.Double = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
  def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
  def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def attachEvent(`type`: contextmenuEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: contextmenuEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def attachTo(view: js.Any): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def clearCss(css: java.lang.String): scala.Unit = js.native
  def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def clearValidation(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def count(): scala.Double = js.native
  def customize(obj: js.Any): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def disableItem(id: java.lang.String): scala.Unit = js.native
  def disableItem(id: scala.Double): scala.Unit = js.native
  def enableItem(id: java.lang.String): scala.Unit = js.native
  def enableItem(id: scala.Double): scala.Unit = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate): scala.Unit = js.native
  def filter(text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(
    text: webixLib.webixNs.WebixCallback | webixLib.webixNs.WebixTemplate,
    value: java.lang.String,
    preserve: scala.Boolean
  ): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: webixLib.webixNs.WebixCallback): js.Any = js.native
  def find(criterion: webixLib.webixNs.WebixCallback, first: scala.Boolean): js.Any = js.native
  def getBody(): js.Any = js.native
  def getContext(): js.Any = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getHead(): js.Any = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
  def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getMenu(id: java.lang.String): js.Any = js.native
  def getMenu(id: scala.Double): js.Any = js.native
  def getMenuItem(id: java.lang.String): js.Any = js.native
  def getMenuItem(id: scala.Double): js.Any = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPage(): scala.Double = js.native
  def getPager(): js.Any = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getScrollState(): js.Any = js.native
  def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
  def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
  def getSubMenu(id: java.lang.String): js.Any = js.native
  def getSubMenu(id: scala.Double): js.Any = js.native
  def getTopMenu(): js.Any = js.native
  def getVisibleCount(): scala.Double = js.native
  def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
  def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def hideItem(id: java.lang.String): scala.Unit = js.native
  def hideItem(id: scala.Double): scala.Unit = js.native
  def isSelected(id: java.lang.String): scala.Boolean = js.native
  def isSelected(id: scala.Double): scala.Boolean = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): js.Promise[_] = js.native
  def loadNext(
    count: scala.Double,
    start: scala.Double,
    callback: webixLib.webixNs.WebixCallback,
    url: java.lang.String,
    now: scala.Boolean
  ): scala.Unit = js.native
  def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
  def moveBottom(id: java.lang.String): scala.Unit = js.native
  def moveBottom(id: scala.Double): scala.Unit = js.native
  def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
  def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
  def moveSelection(direction: java.lang.String): scala.Unit = js.native
  def moveTop(id: java.lang.String): scala.Unit = js.native
  def moveTop(id: scala.Double): scala.Unit = js.native
  def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
  def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
  def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
  def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
  def selectAll(): scala.Unit = js.native
  def selectAll(from: java.lang.String): scala.Unit = js.native
  def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def setContext(context: js.Any): scala.Unit = js.native
  def setPage(page: scala.Double): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def show(node: stdLib.HTMLElement): scala.Unit = js.native
  def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
  def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
  def showItem(id: java.lang.String): scala.Unit = js.native
  def showItem(id: scala.Double): scala.Unit = js.native
  def sizeToContent(): scala.Unit = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def unselect(): scala.Unit = js.native
  def unselect(id: java.lang.String): scala.Unit = js.native
  def unselectAll(): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
  def validate(id: java.lang.String): scala.Boolean = js.native
}

