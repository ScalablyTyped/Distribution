package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
}

object UnitNormConfig {
  @scala.inline
  def apply(axis: js.UndefOr[Double] = js.undefined): UnitNormConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitNormConfig]
  }
}

