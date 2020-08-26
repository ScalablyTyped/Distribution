package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialDropout1DLayerConfig extends LayerConfig {
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double = js.native
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.native
}

object SpatialDropout1DLayerConfig {
  @scala.inline
  def apply(rate: Double): SpatialDropout1DLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialDropout1DLayerConfig]
  }
  @scala.inline
  implicit class SpatialDropout1DLayerConfigOps[Self <: SpatialDropout1DLayerConfig] (val x: Self) extends AnyVal {
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
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

