package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoTooltip extends js.Object {
  @JSName("$tooltipOut")
  var $tooltipOut: Unit = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
}

@JSImport("webix", "AutoTooltip")
@js.native
object AutoTooltip extends TopLevel[AutoTooltip]

