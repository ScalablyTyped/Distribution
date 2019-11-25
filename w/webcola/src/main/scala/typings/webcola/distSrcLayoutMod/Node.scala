package typings.webcola.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends InputNode {
  @JSName("x")
  var x_Node: Double
  @JSName("y")
  var y_Node: Double
}

object Node {
  @scala.inline
  def apply(
    x: Double,
    y: Double,
    fixed: Int | Double = null,
    height: Int | Double = null,
    index: Int | Double = null,
    width: Int | Double = null
  ): Node = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

