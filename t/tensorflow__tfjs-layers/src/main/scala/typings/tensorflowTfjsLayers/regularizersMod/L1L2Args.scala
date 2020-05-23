package typings.tensorflowTfjsLayers.regularizersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1L2Args extends js.Object {
  /** L1 regularization rate. Defaults to 0.01. */
  var l1: js.UndefOr[Double] = js.undefined
  /** L2 regularization rate. Defaults to 0.01. */
  var l2: js.UndefOr[Double] = js.undefined
}

object L1L2Args {
  @scala.inline
  def apply(l1: js.UndefOr[Double] = js.undefined, l2: js.UndefOr[Double] = js.undefined): L1L2Args = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(l1)) __obj.updateDynamic("l1")(l1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(l2)) __obj.updateDynamic("l2")(l2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1L2Args]
  }
}

