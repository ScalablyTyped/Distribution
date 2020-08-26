package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var flashDelay: js.UndefOr[Double] = js.native
  var flashStyle: js.UndefOr[CTerminal] = js.native
  var style: js.UndefOr[CTerminal] = js.native
}

object Delay {
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setFlashDelay(value: Double): Self = this.set("flashDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashDelay: Self = this.set("flashDelay", js.undefined)
    @scala.inline
    def setFlashStyle(value: CTerminal): Self = this.set("flashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashStyle: Self = this.set("flashStyle", js.undefined)
    @scala.inline
    def setStyle(value: CTerminal): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

