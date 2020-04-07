package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoTooltip extends js.Object {
  @JSName("$tooltipOut")
  var $tooltipOut: Unit
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event_, text: String): Unit
}

@JSGlobal("webix.AutoTooltip")
@js.native
object AutoTooltip extends TopLevel[AutoTooltip]

