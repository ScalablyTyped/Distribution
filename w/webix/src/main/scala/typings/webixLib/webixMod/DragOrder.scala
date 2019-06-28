package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragOrder extends js.Object {
  @JSName("$dragDestroy")
  var $dragDestroy: scala.Unit = js.native
  @JSName("$dragMark")
  var $dragMark: scala.Boolean = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  @JSName("$drag")
  def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
  @JSName("$dragIn")
  def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
  @JSName("$dragOut")
  def $dragOut(source: stdLib.HTMLElement, target: stdLib.HTMLElement, drop: stdLib.HTMLElement): scala.Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
}

