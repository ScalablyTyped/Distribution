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

