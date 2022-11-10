package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.dashboard")
@js.native
open class dashboard ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event): HTMLElement = js.native
  
  @JSName("$dragDestroy")
  def $dragDestroy(target: HTMLElement, html: HTMLElement, e: Event): Unit = js.native
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_dashboard: WebixCallback = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: dashboardEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: dashboardEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  
  @JSName("config")
  var config_dashboard: dashboardConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def moveView(id: String, view: obj): Unit = js.native
  def moveView(id: Double, view: obj): Unit = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: obj): Unit = js.native
  def restore(state: obj, factory: WebixCallback): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(serializer: WebixCallback): js.Array[Any] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
