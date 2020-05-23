package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityConfig extends js.Object {
  var gain: js.UndefOr[Double] = js.undefined
}

object IdentityConfig {
  @scala.inline
  def apply(gain: js.UndefOr[Double] = js.undefined): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityConfig]
  }
}

