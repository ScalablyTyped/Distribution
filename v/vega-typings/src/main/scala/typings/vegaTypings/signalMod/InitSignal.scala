package typings.vegaTypings.signalMod

import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.exprMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitSignal
  extends BaseSignal
     with Signal {
  var bind: js.UndefOr[Binding] = js.native
  var init: Expr = js.native
  var value: js.UndefOr[SignalValue] = js.native
}

object InitSignal {
  @scala.inline
  def apply(init: Expr, name: String): InitSignal = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSignal]
  }
  @scala.inline
  implicit class InitSignalOps[Self <: InitSignal] (val x: Self) extends AnyVal {
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
    def setInit(value: Expr): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setBind(value: Binding): Self = this.set("bind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setValue(value: SignalValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

