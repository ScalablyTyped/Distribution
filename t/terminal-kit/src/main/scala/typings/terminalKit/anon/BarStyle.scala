package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.native
  var innerSize: js.UndefOr[Double] = js.native
}

object BarStyle {
  @scala.inline
  def apply(): BarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarStyle]
  }
  @scala.inline
  implicit class BarStyleOps[Self <: BarStyle] (val x: Self) extends AnyVal {
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
    def setBarStyle(value: CTerminal): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    @scala.inline
    def setInnerSize(value: Double): Self = this.set("innerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerSize: Self = this.set("innerSize", js.undefined)
  }
  
}

