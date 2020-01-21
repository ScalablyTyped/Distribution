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
  def apply(gain: Int | Double = null, seed: Int | Double = null): OrthogonalConfig = {
    val __obj = js.Dynamic.literal()
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthogonalConfig]
  }
}

