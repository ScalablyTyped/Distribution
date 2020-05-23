package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomUniformConfig extends js.Object {
  var maxval: js.UndefOr[Double] = js.undefined
  var minval: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
}

object RandomUniformConfig {
  @scala.inline
  def apply(
    maxval: js.UndefOr[Double] = js.undefined,
    minval: js.UndefOr[Double] = js.undefined,
    seed: js.UndefOr[Double] = js.undefined
  ): RandomUniformConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxval)) __obj.updateDynamic("maxval")(maxval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minval)) __obj.updateDynamic("minval")(minval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomUniformConfig]
  }
}

