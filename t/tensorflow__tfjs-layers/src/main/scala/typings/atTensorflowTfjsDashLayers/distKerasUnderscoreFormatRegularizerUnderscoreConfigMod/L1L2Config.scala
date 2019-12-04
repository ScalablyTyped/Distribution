package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatRegularizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L1L2Config extends js.Object {
  var l1: js.UndefOr[Double] = js.undefined
  var l2: js.UndefOr[Double] = js.undefined
}

object L1L2Config {
  @scala.inline
  def apply(l1: Int | Double = null, l2: Int | Double = null): L1L2Config = {
    val __obj = js.Dynamic.literal()
    if (l1 != null) __obj.updateDynamic("l1")(l1.asInstanceOf[js.Any])
    if (l2 != null) __obj.updateDynamic("l2")(l2.asInstanceOf[js.Any])
    __obj.asInstanceOf[L1L2Config]
  }
}

