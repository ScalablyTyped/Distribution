package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.portlet")
@js.native
class portlet ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String = js.native
  
  @JSName("$skin")
  var $skin_Original_portlet: WebixCallback = js.native
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: portletEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: portletEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_portlet: portletConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: js.Any): Double = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def markDropArea(target: String, mode: String): Unit = js.native
  
  def movePortlet(target: String, mode: String): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: js.Any, factory: WebixCallback): Unit = js.native
  
  def serialize(): js.Any = js.native
  def serialize(serializer: WebixCallback): js.Any = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
