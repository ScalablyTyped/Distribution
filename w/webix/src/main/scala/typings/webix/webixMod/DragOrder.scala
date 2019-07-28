package typings.webix.webixMod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragOrder extends js.Object {
  @JSName("$dragDestroy")
  var $dragDestroy: Unit = js.native
  @JSName("$dragMark")
  var $dragMark: Boolean = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement): Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
}

