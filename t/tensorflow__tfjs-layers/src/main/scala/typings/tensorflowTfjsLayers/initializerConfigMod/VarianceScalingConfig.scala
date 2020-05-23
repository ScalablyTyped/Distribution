package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VarianceScalingConfig extends js.Object {
  var distribution: js.UndefOr[DistributionSerialization] = js.undefined
  var mode: js.UndefOr[FanModeSerialization] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
}

object VarianceScalingConfig {
  @scala.inline
  def apply(
    distribution: DistributionSerialization = null,
    mode: FanModeSerialization = null,
    scale: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined
  ): VarianceScalingConfig = {
    val __obj = js.Dynamic.literal()
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarianceScalingConfig]
  }
}

