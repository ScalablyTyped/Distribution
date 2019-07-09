package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityArgs extends js.Object {
  /**
    * Multiplicative factor to apply to the identity matrix.
    */
  var gain: js.UndefOr[scala.Double] = js.undefined
}

object IdentityArgs {
  @scala.inline
  def apply(gain: scala.Int | scala.Double = null): IdentityArgs = {
    val __obj = js.Dynamic.literal()
    if (gain != null) __obj.updateDynamic("gain")(gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityArgs]
  }
}

