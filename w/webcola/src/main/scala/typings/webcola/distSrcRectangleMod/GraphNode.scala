package typings.webcola.distSrcRectangleMod

import typings.webcola.distSrcVpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphNode extends Leaf {
  var fixed: Boolean
  var fixedWeight: js.UndefOr[Double] = js.undefined
  var height: Double
  var px: Double
  var py: Double
  var width: Double
  var x: Double
  var y: Double
}

object GraphNode {
  @scala.inline
  def apply(
    bounds: Rectangle,
    fixed: Boolean,
    height: Double,
    px: Double,
    py: Double,
    variable: Variable,
    width: Double,
    x: Double,
    y: Double,
    fixedWeight: Int | Double = null
  ): GraphNode = {
    val __obj = js.Dynamic.literal(bounds = bounds, fixed = fixed, height = height, px = px, py = py, variable = variable, width = width, x = x, y = y)
    if (fixedWeight != null) __obj.updateDynamic("fixedWeight")(fixedWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
}

