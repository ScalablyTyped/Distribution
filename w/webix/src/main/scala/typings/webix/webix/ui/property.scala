package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.property")
@js.native
class property () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_property: propertyConfig = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  var on_edit: StringDictionary[js.Any] = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  var on_render: StringDictionary[js.Any] = js.native
  var `type`: StringDictionary[js.Any] = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  def attachEvent(`type`: propertyEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: propertyEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clear(): Unit = js.native
  def customize(obj: js.Any): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def edit(id: js.Any): Unit = js.native
  def editCancel(): Unit = js.native
  def editNext(): Unit = js.native
  def editStop(): Unit = js.native
  def focusEditor(id: js.Any): Unit = js.native
  def getEditState(): js.Any = js.native
  def getEditor(): js.Any = js.native
  def getEditor(id: String): js.Any = js.native
  def getEditorValue(): String = js.native
  def getItem(id: String): js.Any = js.native
  def getItemNode(id: String): HTMLElement = js.native
  def getItemNode(id: Double): HTMLElement = js.native
  def getScrollState(): js.Any = js.native
  def getValues(): StringDictionary[js.Any] = js.native
  def hasEvent(name: String): Boolean = js.native
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def locate(e: Event): String | Double = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  def registerType(name: String, data: js.Any): Unit = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def setValues(values: js.Any): Unit = js.native
  def setValues(values: js.Any, update: Boolean): Unit = js.native
  def showItem(id: String): Unit = js.native
  def showItem(id: Double): Unit = js.native
  def sync(source: js.Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
  def updateItem(): Unit = js.native
  def validateEditor(): Boolean = js.native
  def validateEditor(id: String): Boolean = js.native
  def validateEditor(id: Double): Boolean = js.native
}

