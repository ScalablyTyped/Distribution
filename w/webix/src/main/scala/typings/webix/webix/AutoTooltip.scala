package typings.webix.webix

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

object AutoTooltip {
  @scala.inline
  def apply(
    $tooltipIn: HTMLElement => HTMLElement,
    $tooltipMove: (HTMLElement, Event, String) => Unit,
    $tooltipOut: Unit
  ): AutoTooltip = {
    val __obj = js.Dynamic.literal($tooltipIn = js.Any.fromFunction1($tooltipIn), $tooltipMove = js.Any.fromFunction3($tooltipMove), $tooltipOut = $tooltipOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTooltip]
  }
  @scala.inline
  implicit class AutoTooltipOps[Self <: AutoTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$tooltipIn(value: HTMLElement => HTMLElement): Self = this.set("$tooltipIn", js.Any.fromFunction1(value))
    @scala.inline
    def set$tooltipMove(value: (HTMLElement, Event, String) => Unit): Self = this.set("$tooltipMove", js.Any.fromFunction3(value))
    @scala.inline
    def set$tooltipOut(value: Unit): Self = this.set("$tooltipOut", value.asInstanceOf[js.Any])
  }
  
}

