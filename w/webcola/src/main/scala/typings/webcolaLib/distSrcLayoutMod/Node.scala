package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends InputNode {
  @JSName("x")
  var x_Node: scala.Double
  @JSName("y")
  var y_Node: scala.Double
}

object Node {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    fixed: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Node = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

