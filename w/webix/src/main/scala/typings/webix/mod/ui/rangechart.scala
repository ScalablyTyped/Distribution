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

@JSImport("webix", "ui.rangechart")
@js.native
class rangechart ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_rangechart: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  
  def addSeries(obj: js.Any): Unit = js.native
  
  def attachEvent(`type`: rangechartEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: rangechartEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearCanvas(): Unit = js.native
  
  var colormap: StringDictionary[js.Any] = js.native
  
  @JSName("config")
  var config_rangechart: rangechartConfig = js.native
  
  def count(): Double = js.native
  
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
  
  def find(criterion: WebixCallback): js.Any = js.native
  def find(criterion: WebixCallback, first: Boolean): js.Any = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getFrameData(): js.Array[js.Any] = js.native
  
  def getFrameRange(): js.Any = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): js.Any = js.native
  def getItem(id: Double): js.Any = js.native
  
  def getLastId(): Double | String = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def group(config: js.Any): Unit = js.native
  def group(config: js.Any, target: String): Unit = js.native
  def group(config: js.Any, target: Double): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hideSeries(index: Double): Unit = js.native
  
  def load(url: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String): js.Promise[js.Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[js.Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[js.Any] = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def on_click(args: js.Any*): js.Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  var on_context: StringDictionary[js.Any] = js.native
  
  def on_dblclick(args: js.Any*): js.Any = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  
  def on_mouse_move(args: js.Any*): js.Any = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  
  def parse(data: js.Any, `type`: String): Unit = js.native
  
  var presets: StringDictionary[js.Any] = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[js.Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeAllSeries(): Unit = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def serialize(): js.Array[js.Any] = js.native
  def serialize(all: Boolean): js.Array[js.Any] = js.native
  
  def setFrameRange(range: js.Any): Unit = js.native
  
  def showSeries(index: Double): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def ungroup(mode: Boolean): Unit = js.native
  
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  
  var waitData: js.Promise[js.Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[js.Any] = js.native
}
