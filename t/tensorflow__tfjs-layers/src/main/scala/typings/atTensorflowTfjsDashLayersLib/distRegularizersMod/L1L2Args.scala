package typings
package atTensorflowTfjsDashLayersLib.distRegularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1L2Args extends js.Object {
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: js.UndefOr[scala.Double] = js.undefined
  /** L2 regularization rate. Defaults to 0.01. */
  var l2: js.UndefOr[scala.Double] = js.undefined
}

object L1L2Args {
  @scala.inline
  def apply(l1: scala.Int | scala.Double = null, l2: scala.Int | scala.Double = null): L1L2Args = {
    val __obj = js.Dynamic.literal()
    if (l1 != null) __obj.updateDynamic("l1")(l1.asInstanceOf[js.Any])
    if (l2 != null) __obj.updateDynamic("l2")(l2.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1L2Args]
  }
}

