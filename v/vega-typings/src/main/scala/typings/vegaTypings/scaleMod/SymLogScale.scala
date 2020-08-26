package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.symlog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymLogScale
  extends NumericScale
     with Scale {
  var constant: js.UndefOr[Double | SignalRef] = js.native
  @JSName("type")
  var type_SymLogScale: symlog = js.native
}

object SymLogScale {
  @scala.inline
  def apply(name: String, `type`: symlog): SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymLogScale]
  }
  @scala.inline
  implicit class SymLogScaleOps[Self <: SymLogScale] (val x: Self) extends AnyVal {
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
    def setType(value: symlog): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstant(value: Double | SignalRef): Self = this.set("constant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstant: Self = this.set("constant", js.undefined)
  }
  
}

