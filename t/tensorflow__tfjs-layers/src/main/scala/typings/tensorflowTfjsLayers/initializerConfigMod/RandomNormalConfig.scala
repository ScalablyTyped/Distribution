package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomNormalConfig extends js.Object {
  var mean: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
  var stddev: js.UndefOr[Double] = js.undefined
}

object RandomNormalConfig {
  @scala.inline
  def apply(
    mean: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined,
    stddev: js.UndefOr[Double] = js.undefined
  ): RandomNormalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mean)) __obj.updateDynamic("mean")(mean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stddev)) __obj.updateDynamic("stddev")(stddev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomNormalConfig]
  }
}

