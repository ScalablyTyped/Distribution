package typings
package vegaDashLiteLib.buildSrcCompileAxisComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisIndex extends js.Object {
  var x: js.UndefOr[vegaDashLiteLib.buildSrcAxisMod.Axis] = js.undefined
  var y: js.UndefOr[vegaDashLiteLib.buildSrcAxisMod.Axis] = js.undefined
}

object AxisIndex {
  @scala.inline
  def apply(x: vegaDashLiteLib.buildSrcAxisMod.Axis = null, y: vegaDashLiteLib.buildSrcAxisMod.Axis = null): AxisIndex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[AxisIndex]
  }
}

