package typings.webcola.distSrcRectangleMod

import typings.webcola.distSrcVpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionGroup extends js.Object {
  var bounds: Rectangle
  var groups: js.Array[ProjectionGroup]
  var leaves: js.Array[Leaf]
  var maxVar: Variable
  var minVar: Variable
  var padding: Double
  var stiffness: Double
}

object ProjectionGroup {
  @scala.inline
  def apply(
    bounds: Rectangle,
    groups: js.Array[ProjectionGroup],
    leaves: js.Array[Leaf],
    maxVar: Variable,
    minVar: Variable,
    padding: Double,
    stiffness: Double
  ): ProjectionGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], maxVar = maxVar.asInstanceOf[js.Any], minVar = minVar.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectionGroup]
  }
}

