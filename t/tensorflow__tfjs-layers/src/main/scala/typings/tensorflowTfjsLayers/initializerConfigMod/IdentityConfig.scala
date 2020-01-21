package typings.tensorflowTfjsLayers.initializerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityConfig extends js.Object {
  var gain: js.UndefOr[Double] = js.undefined
}

object IdentityConfig {
  @scala.inline
  def apply(gain: Int | Double = null): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityConfig]
  }
}

