package typings.webix.webix.ui

import typings.std.Event
import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait calendar
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: calendarEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: calendarEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_calendar: calendarConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getSelectedDate(): obj = js.native
  
  def getValue(): obj = js.native
  def getValue(format: String): obj = js.native
  
  def getVisibleDate(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def locate(e: Event): String | Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def moveSelection(direction: String): Unit = js.native
  
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
  
  def refresh(): Unit = js.native
  
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  
  def selectDate(date: String): Unit = js.native
  def selectDate(date: String, mode: Boolean): Unit = js.native
  def selectDate(date: String, mode: Boolean, multiple: Boolean): Unit = js.native
  def selectDate(date: String, mode: Unit, multiple: Boolean): Unit = js.native
  def selectDate(date: js.Date): Unit = js.native
  def selectDate(date: js.Date, mode: Boolean): Unit = js.native
  def selectDate(date: js.Date, mode: Boolean, multiple: Boolean): Unit = js.native
  def selectDate(date: js.Date, mode: Unit, multiple: Boolean): Unit = js.native
  
  def setValue(date: String): Unit = js.native
  def setValue(date: String, config: Any): Unit = js.native
  def setValue(date: js.Date): Unit = js.native
  def setValue(date: js.Date, config: Any): Unit = js.native
  
  def showCalendar(date: String): Unit = js.native
  def showCalendar(date: js.Date): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
