package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatedNormalConfig extends js.Object {
  var mean: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
  var stddev: js.UndefOr[Double] = js.undefined
}

object TruncatedNormalConfig {
  @scala.inline
  def apply(
    mean: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined,
    stddev: js.UndefOr[Double] = js.undefined
  ): TruncatedNormalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mean)) __obj.updateDynamic("mean")(mean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stddev)) __obj.updateDynamic("stddev")(stddev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatedNormalConfig]
  }
}

