package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.DataStore
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait timeline
  extends StObject
     with baseview {
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def add(obj: js.Any): String | Double = js.native
  def add(obj: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: timelineEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: timelineEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  @JSName("config")
  var config_timeline: timelineConfig = js.native
  
  def count(): Double = js.native
  
  def customize(obj: js.Any): Unit = js.native
  
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
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getScrollState(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
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
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[js.Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def serialize(): js.Array[js.Any] = js.native
  def serialize(all: Boolean): js.Array[js.Any] = js.native
  
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var `type`: StringDictionary[js.Any] = js.native
  
  var types: StringDictionary[js.Any] = js.native
  
  def unblockEvent(): Unit = js.native
  
  def updateItem(id: String, data: js.Any): Unit = js.native
  def updateItem(id: Double, data: js.Any): Unit = js.native
  
  var waitData: js.Promise[js.Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[js.Any] = js.native
}
