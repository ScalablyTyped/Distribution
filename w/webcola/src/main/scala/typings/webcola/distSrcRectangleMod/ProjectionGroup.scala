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
    val __obj = js.Dynamic.literal(bounds = bounds, groups = groups, leaves = leaves, maxVar = maxVar, minVar = minVar, padding = padding, stiffness = stiffness)
  
    __obj.asInstanceOf[ProjectionGroup]
  }
}

