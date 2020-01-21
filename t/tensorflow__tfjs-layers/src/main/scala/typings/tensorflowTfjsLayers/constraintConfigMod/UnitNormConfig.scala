package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
}

object UnitNormConfig {
  @scala.inline
  def apply(axis: Int | Double = null): UnitNormConfig = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitNormConfig]
  }
}

