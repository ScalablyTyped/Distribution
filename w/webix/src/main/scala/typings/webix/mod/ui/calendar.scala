package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.webix.mod.Date
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.calendar")
@js.native
open class calendar ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_calendar: WebixCallback = js.native
  
  def attachEvent(`type`: calendarEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: calendarEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_calendar: calendarConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getSelectedDate(): Any = js.native
  
  def getValue(): Any = js.native
  
  def getVisibleDate(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
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
  
  def refresh(): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def selectDate(date: String): Unit = js.native
  def selectDate(date: String, mode: Boolean): Unit = js.native
  def selectDate(date: String, mode: Boolean, multiple: Boolean): Unit = js.native
  def selectDate(date: String, mode: Unit, multiple: Boolean): Unit = js.native
  def selectDate(date: Date): Unit = js.native
  def selectDate(date: Date, mode: Boolean): Unit = js.native
  def selectDate(date: Date, mode: Boolean, multiple: Boolean): Unit = js.native
  def selectDate(date: Date, mode: Unit, multiple: Boolean): Unit = js.native
  
  def setValue(date: String): Unit = js.native
  def setValue(date: Date): Unit = js.native
  
  def showCalendar(date: String): Unit = js.native
  def showCalendar(date: Date): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
