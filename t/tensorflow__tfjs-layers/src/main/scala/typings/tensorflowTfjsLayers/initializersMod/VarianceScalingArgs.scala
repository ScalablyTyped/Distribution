package typings.tensorflowTfjsLayers.initializersMod

import typings.tensorflowTfjsLayers.initializerConfigMod.Distribution
import typings.tensorflowTfjsLayers.initializerConfigMod.FanMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VarianceScalingArgs extends js.Object {
  /** Probabilistic distribution of the values. */
  var distribution: js.UndefOr[Distribution] = js.native
  /** Fanning mode for inputs and outputs. */
  var mode: js.UndefOr[FanMode] = js.native
  /** Scaling factor (positive float). */
  var scale: js.UndefOr[Double] = js.native
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.native
}

object VarianceScalingArgs {
  @scala.inline
  def apply(): VarianceScalingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VarianceScalingArgs]
  }
  @scala.inline
  implicit class VarianceScalingArgsOps[Self <: VarianceScalingArgs] (val x: Self) extends AnyVal {
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
    def setDistribution(value: Distribution): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setMode(value: FanMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

