package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceTransform extends _Transforms {
  var alpha: js.UndefOr[Double | SignalRef] = js.native
  var alphaMin: js.UndefOr[Double | SignalRef] = js.native
  var alphaTarget: js.UndefOr[Double | SignalRef] = js.native
  var forces: js.UndefOr[(js.Array[Force | SignalRef]) | SignalRef] = js.native
  var iterations: js.UndefOr[Double | SignalRef] = js.native
  var restart: js.UndefOr[Boolean | SignalRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var static: js.UndefOr[Boolean | SignalRef] = js.native
  var `type`: force = js.native
  var velocityDecay: js.UndefOr[Double | SignalRef] = js.native
}

object ForceTransform {
  @scala.inline
  def apply(`type`: force): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTransform]
  }
  @scala.inline
  implicit class ForceTransformOps[Self <: ForceTransform] (val x: Self) extends AnyVal {
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
    def setType(value: force): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: Double | SignalRef): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setAlphaMin(value: Double | SignalRef): Self = this.set("alphaMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaMin: Self = this.set("alphaMin", js.undefined)
    @scala.inline
    def setAlphaTarget(value: Double | SignalRef): Self = this.set("alphaTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaTarget: Self = this.set("alphaTarget", js.undefined)
    @scala.inline
    def setForcesVarargs(value: (Force | SignalRef)*): Self = this.set("forces", js.Array(value :_*))
    @scala.inline
    def setForces(value: (js.Array[Force | SignalRef]) | SignalRef): Self = this.set("forces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForces: Self = this.set("forces", js.undefined)
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setRestart(value: Boolean | SignalRef): Self = this.set("restart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    @scala.inline
    def setSignal(value: SignalName): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setStatic(value: Boolean | SignalRef): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setVelocityDecay(value: Double | SignalRef): Self = this.set("velocityDecay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityDecay: Self = this.set("velocityDecay", js.undefined)
  }
  
}

