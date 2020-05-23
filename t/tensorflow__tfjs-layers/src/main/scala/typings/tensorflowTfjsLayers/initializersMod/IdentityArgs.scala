package typings.tensorflowTfjsLayers.initializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityArgs extends js.Object {
  /**
    * Multiplicative factor to apply to the identity matrix.
    */
  var gain: js.UndefOr[Double] = js.undefined
}

object IdentityArgs {
  @scala.inline
  def apply(gain: js.UndefOr[Double] = js.undefined): IdentityArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gain)) __obj.updateDynamic("gain")(gain.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityArgs]
  }
}

