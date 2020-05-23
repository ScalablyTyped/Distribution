package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrthogonalConfig extends js.Object {
  var gain: js.UndefOr[Double] = js.undefined
  var seed: js.UndefOr[Double] = js.undefined
}

object OrthogonalConfig {
  @scala.inline
  def apply(gain: js.UndefOr[Double] = js.undefined, seed: js.UndefOr[Double] = js.undefined): OrthogonalConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seed)) __obj.updateDynamic("seed")(seed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthogonalConfig]
  }
}

