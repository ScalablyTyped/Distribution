package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
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
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (fixedWeight != null) __obj.updateDynamic("fixedWeight")(fixedWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
}

