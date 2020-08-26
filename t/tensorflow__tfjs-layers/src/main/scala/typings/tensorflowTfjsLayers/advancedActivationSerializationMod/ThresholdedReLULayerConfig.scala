package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdedReLULayerConfig extends LayerConfig {
  var theta: js.UndefOr[Double] = js.native
}

object ThresholdedReLULayerConfig {
  @scala.inline
  def apply(): ThresholdedReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdedReLULayerConfig]
  }
  @scala.inline
  implicit class ThresholdedReLULayerConfigOps[Self <: ThresholdedReLULayerConfig] (val x: Self) extends AnyVal {
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

