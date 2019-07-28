package typings.vegaDashLite.buildSrcCompileAxisComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisComponentIndex extends js.Object {
  var x: js.UndefOr[js.Array[AxisComponent]] = js.undefined
  var y: js.UndefOr[js.Array[AxisComponent]] = js.undefined
}

object AxisComponentIndex {
  @scala.inline
  def apply(x: js.Array[AxisComponent] = null, y: js.Array[AxisComponent] = null): AxisComponentIndex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[AxisComponentIndex]
  }
}

