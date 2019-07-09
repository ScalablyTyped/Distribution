package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatInitializerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityConfig extends js.Object {
  var gain: js.UndefOr[scala.Double] = js.undefined
}

object IdentityConfig {
  @scala.inline
  def apply(gain: scala.Int | scala.Double = null): IdentityConfig = {
    val __obj = js.Dynamic.literal()
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityConfig]
  }
}

