package typings.webix.webixMod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.dashboard")
@js.native
class dashboard ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  @JSName("$skin")
  var $skin_Original_dashboard: WebixCallback = js.native
  @JSName("config")
  var config_dashboard: dashboardConfig = js.native
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event): HTMLElement = js.native
  @JSName("$dragDestroy")
  def $dragDestroy(target: HTMLElement, html: HTMLElement, e: Event): Unit = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event): Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  def attachEvent(`type`: dashboardEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: dashboardEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def clearAll(): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def index(obj: js.Any): Double = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def moveView(id: String, view: js.Any): Unit = js.native
  def moveView(id: Double, view: js.Any): Unit = js.native
  def reconstruct(): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def restore(state: js.Any): Unit = js.native
  def restore(state: js.Any, factory: WebixCallback): Unit = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(serializer: WebixCallback): js.Array[_] = js.native
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
}

