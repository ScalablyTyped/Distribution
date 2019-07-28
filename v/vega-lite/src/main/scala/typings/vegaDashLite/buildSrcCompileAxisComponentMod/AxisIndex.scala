package typings.vegaDashLite.buildSrcCompileAxisComponentMod

import typings.vegaDashLite.buildSrcAxisMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisIndex extends js.Object {
  var x: js.UndefOr[Axis] = js.undefined
  var y: js.UndefOr[Axis] = js.undefined
}

object AxisIndex {
  @scala.inline
  def apply(x: Axis = null, y: Axis = null): AxisIndex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[AxisIndex]
  }
}

