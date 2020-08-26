package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdedReLULayerArgs extends LayerArgs {
  /**
    * Float >= 0. Threshold location of activation.
    */
  var theta: js.UndefOr[Double] = js.native
}

object ThresholdedReLULayerArgs {
  @scala.inline
  def apply(): ThresholdedReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdedReLULayerArgs]
  }
  @scala.inline
  implicit class ThresholdedReLULayerArgsOps[Self <: ThresholdedReLULayerArgs] (val x: Self) extends AnyVal {
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
    def setTheta(value: Double): Self = this.set("theta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheta: Self = this.set("theta", js.undefined)
  }
  
}

