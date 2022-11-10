package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pager
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: pagerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: pagerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clone(config: obj): obj = js.native
  
  @JSName("config")
  var config_pager: pagerConfig = js.native
  
  def customize(obj: obj): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
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
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def render(): Unit = js.native
  def render(id: String): Unit = js.native
  def render(id: String, data: Unit, `type`: String): Unit = js.native
  def render(id: String, data: obj): Unit = js.native
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double): Unit = js.native
  def render(id: Double, data: Unit, `type`: String): Unit = js.native
  def render(id: Double, data: obj): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  def render(id: Unit, data: Unit, `type`: String): Unit = js.native
  def render(id: Unit, data: obj): Unit = js.native
  def render(id: Unit, data: obj, `type`: String): Unit = js.native
  
  def select(page: Double): Unit = js.native
  
  def sync(source: obj): Unit = js.native
  def sync(source: obj, filter: Unit, silent: Boolean): Unit = js.native
  def sync(source: obj, filter: WebixCallback): Unit = js.native
  def sync(source: obj, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var `type`: obj = js.native
  
  def unblockEvent(): Unit = js.native
}
