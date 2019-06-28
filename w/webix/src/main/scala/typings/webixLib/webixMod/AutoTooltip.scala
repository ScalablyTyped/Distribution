package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoTooltip extends js.Object {
  @JSName("$tooltipOut")
  var $tooltipOut: scala.Unit
  @JSName("$tooltipIn")
  def $tooltipIn(node: stdLib.HTMLElement): stdLib.HTMLElement
  @JSName("$tooltipMove")
  def $tooltipMove(t: stdLib.HTMLElement, e: stdLib.Event, text: java.lang.String): scala.Unit
}

object AutoTooltip {
  @scala.inline
  def apply(
    $tooltipIn: stdLib.HTMLElement => stdLib.HTMLElement,
    $tooltipMove: (stdLib.HTMLElement, stdLib.Event, java.lang.String) => scala.Unit,
    $tooltipOut: scala.Unit
  ): AutoTooltip = {
    val __obj = js.Dynamic.literal($tooltipIn = js.Any.fromFunction1($tooltipIn), $tooltipMove = js.Any.fromFunction3($tooltipMove), $tooltipOut = $tooltipOut)
  
    __obj.asInstanceOf[AutoTooltip]
  }
}

