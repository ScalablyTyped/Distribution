package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.density
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DensityTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var distribution: js.UndefOr[Distribution | SignalRef] = js.native
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var maxsteps: js.UndefOr[Double | SignalRef] = js.native
  var method: js.UndefOr[DensityMethod | SignalRef] = js.native
  var minsteps: js.UndefOr[Double | SignalRef] = js.native
  var steps: js.UndefOr[Double | SignalRef] = js.native
  var `type`: density = js.native
}

object DensityTransform {
  @scala.inline
  def apply(`type`: density): DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensityTransform]
  }
  @scala.inline
  implicit class DensityTransformOps[Self <: DensityTransform] (val x: Self) extends AnyVal {
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
    def setType(value: density): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setDistribution(value: Distribution | SignalRef): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setMaxsteps(value: Double | SignalRef): Self = this.set("maxsteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxsteps: Self = this.set("maxsteps", js.undefined)
    @scala.inline
    def setMethod(value: DensityMethod | SignalRef): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMinsteps(value: Double | SignalRef): Self = this.set("minsteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinsteps: Self = this.set("minsteps", js.undefined)
    @scala.inline
    def setSteps(value: Double | SignalRef): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

