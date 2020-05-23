package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragControl extends js.Object {
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  var left: Double = js.native
  var top: Double = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): HTMLElement = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement, event: Event): Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  def addDrag(node: String, ctrl: js.Any): Unit = js.native
  def addDrag(node: Double, ctrl: js.Any): Unit = js.native
  def addDrag(node: HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrop(node: String, ctrl: js.Any): Unit = js.native
  def addDrop(node: String, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any): Unit = js.native
  def addDrop(node: Double, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: js.Any): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: js.Any, master_mode: Boolean): Unit = js.native
  def createDrag(event: Event): Unit = js.native
  def destroyDrag(): Unit = js.native
  def getContext(): js.Any = js.native
  def getMaster(target: js.Any): js.Any = js.native
  def getNode(): HTMLElement = js.native
  def sendSignal(signal: String): Unit = js.native
}

