package typings.tensorflowTfjsLayers.regularizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1L2Config extends js.Object {
  var l1: js.UndefOr[Double] = js.undefined
  var l2: js.UndefOr[Double] = js.undefined
}

object L1L2Config {
  @scala.inline
  def apply(l1: js.UndefOr[Double] = js.undefined, l2: js.UndefOr[Double] = js.undefined): L1L2Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(l1)) __obj.updateDynamic("l1")(l1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(l2)) __obj.updateDynamic("l2")(l2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1L2Config]
  }
}

