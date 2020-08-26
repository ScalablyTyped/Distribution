package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionUniform extends Distribution {
  var function: uniform = js.native
  var max: js.UndefOr[Double | SignalRef] = js.native
  var min: js.UndefOr[Double | SignalRef] = js.native
}

object DistributionUniform {
  @scala.inline
  def apply(function: uniform): DistributionUniform = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionUniform]
  }
  @scala.inline
  implicit class DistributionUniformOps[Self <: DistributionUniform] (val x: Self) extends AnyVal {
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
    def setFunction(value: uniform): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double | SignalRef): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double | SignalRef): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

