package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionGroup extends js.Object {
  var bounds: Rectangle
  var groups: js.Array[ProjectionGroup]
  var leaves: js.Array[Leaf]
  var maxVar: webcolaLib.distSrcVpscMod.Variable
  var minVar: webcolaLib.distSrcVpscMod.Variable
  var padding: scala.Double
  var stiffness: scala.Double
}

object ProjectionGroup {
  @scala.inline
  def apply(
    bounds: Rectangle,
    groups: js.Array[ProjectionGroup],
    leaves: js.Array[Leaf],
    maxVar: webcolaLib.distSrcVpscMod.Variable,
    minVar: webcolaLib.distSrcVpscMod.Variable,
    padding: scala.Double,
    stiffness: scala.Double
  ): ProjectionGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds, groups = groups, leaves = leaves, maxVar = maxVar, minVar = minVar, padding = padding, stiffness = stiffness)
  
    __obj.asInstanceOf[ProjectionGroup]
  }
}

