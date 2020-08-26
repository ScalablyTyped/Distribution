package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphNode extends Leaf {
  var fixed: Boolean = js.native
  var fixedWeight: js.UndefOr[Double] = js.native
  var height: Double = js.native
  var px: Double = js.native
  var py: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
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
    y: Double
  ): GraphNode = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
  @scala.inline
  implicit class GraphNodeOps[Self <: GraphNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPx(value: Double): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def setPy(value: Double): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedWeight(value: Double): Self = this.set("fixedWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedWeight: Self = this.set("fixedWeight", js.undefined)
  }
  
}

