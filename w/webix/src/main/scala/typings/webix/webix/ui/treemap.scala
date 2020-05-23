package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.DataStore
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait treemap extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_treemap: treemapConfig = js.native
  var data: DataStore = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  var `type`: StringDictionary[js.Any] = js.native
  var types: StringDictionary[js.Any] = js.native
  var waitData: js.Promise[_] = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  def addCss(id: String, css: String): Unit = js.native
  def addCss(id: String, css: String, silent: Boolean): Unit = js.native
  def addCss(id: Double, css: String): Unit = js.native
  def addCss(id: Double, css: String, silent: Boolean): Unit = js.native
  def attachEvent(`type`: treemapEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: treemapEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  def clearCss(css: String): Unit = js.native
  def clearCss(css: String, silent: Boolean): Unit = js.native
  def clearValidation(): Unit = js.native
  def close(id: String): Unit = js.native
  def close(id: Double): Unit = js.native
  def closeAll(): Unit = js.native
  def count(): Double = js.native
  def customize(obj: js.Any): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  def filter(text: WebixCallback | WebixTemplate): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixCallback | WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  def getBranchIndex(id: String): Double = js.native
  def getBranchIndex(id: String, parent: String): Double = js.native
  def getBranchIndex(id: String, parent: Double): Double = js.native
  def getBranchIndex(id: Double): Double = js.native
  def getBranchIndex(id: Double, parent: String): Double = js.native
  def getBranchIndex(id: Double, parent: Double): Double = js.native
  def getFirstChildId(id: String): String = js.native
  def getFirstChildId(id: Double): String = js.native
  def getFirstId(): Double | String = js.native
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
  def getSelectedId(as_array: Boolean): String | js.Array[_] = js.native
  def getSelectedItem(as_array: Boolean): js.Any = js.native
  def getState(): js.Any = js.native
  def group(config: js.Any): Unit = js.native
  def group(config: js.Any, target: String): Unit = js.native
  def group(config: js.Any, target: Double): Unit = js.native
  def hasCss(id: String, css: String): Boolean = js.native
  def hasCss(id: Double, css: String): Boolean = js.native
  def hasEvent(name: String): Boolean = js.native
  def isBranch(id: String): Boolean = js.native
  def isBranch(id: Double): Boolean = js.native
  def isBranchOpen(id: String): Boolean = js.native
  def isBranchOpen(id: Double): Boolean = js.native
  def isSelected(id: String): Boolean = js.native
  def isSelected(id: Double): Boolean = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def loadBranch(id: String, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadBranch(id: Double, callback: WebixCallback, url: String): js.Promise[_] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[_] = js.native
  def locate(e: Event): String | Double = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def moveSelection(direction: String): Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def open(id: String): Unit = js.native
  def open(id: String, show: Boolean): Unit = js.native
  def open(id: Double): Unit = js.native
  def open(id: Double, show: Boolean): Unit = js.native
  def openAll(): Unit = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[_]): Unit = js.native
  def remove(id: Double): Unit = js.native
  def removeCss(id: String, css: String): Unit = js.native
  def removeCss(id: String, css: String, silent: Boolean): Unit = js.native
  def removeCss(id: Double, css: String): Unit = js.native
  def removeCss(id: Double, css: String, silent: Boolean): Unit = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def select(id: String, preserve: Boolean): Unit = js.native
  def select(id: js.Array[_], preserve: Boolean): Unit = js.native
  def selectAll(): Unit = js.native
  def selectAll(from: String): Unit = js.native
  def selectAll(from: String, to: String): Unit = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(all: Boolean): js.Array[_] = js.native
  def setPage(page: Double): Unit = js.native
  def setState(state: js.Any): Unit = js.native
  def showBranch(branchId: String): Unit = js.native
  def showBranch(branchId: Double): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
  def ungroup(mode: Boolean): Unit = js.native
  def unselect(): Unit = js.native
  def unselect(id: String): Unit = js.native
  def unselectAll(): Unit = js.native
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
  def waitSave(handler: WebixCallback): js.Promise[_] = js.native
}

