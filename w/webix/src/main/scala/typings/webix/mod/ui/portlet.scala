package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.portlet")
@js.native
open class portlet ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event, pointer: String): String = js.native
  
  @JSName("$skin")
  var $skin_Original_portlet: WebixCallback = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: portletEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: portletEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_portlet: portletConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def markDropArea(target: String, mode: String): Unit = js.native
  
  def movePortlet(target: String, mode: String): Unit = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: obj, factory: WebixCallback): Unit = js.native
  
  def serialize(): obj = js.native
  def serialize(serializer: WebixCallback): obj = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
