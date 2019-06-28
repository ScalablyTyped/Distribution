package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragItem extends js.Object {
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  @JSName("$drag")
  def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
  @JSName("$dragHTML")
  def $dragHTML(args: js.Any*): js.Any = js.native
  @JSName("$dragIn")
  def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
  @JSName("$dragMark")
  def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
  @JSName("$dragOut")
  def $dragOut(
    source: stdLib.HTMLElement,
    old_target: stdLib.HTMLElement,
    new_target: stdLib.HTMLElement,
    ev: stdLib.Event
  ): scala.Unit = js.native
  @JSName("$drop")
  def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  @JSName("$dropHTML")
  def $dropHTML(args: js.Any*): js.Any = js.native
}

