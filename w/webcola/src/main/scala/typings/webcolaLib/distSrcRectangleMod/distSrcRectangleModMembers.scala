package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rectangle", JSImport.Namespace)
@js.native
object distSrcRectangleModMembers extends js.Object {
  def computeGroupBounds(g: ProjectionGroup): Rectangle = js.native
  def generateXConstraints(rs: js.Array[Rectangle], vars: js.Array[webcolaLib.distSrcVpscMod.Variable]): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateXGroupConstraints(root: ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYConstraints(rs: js.Array[Rectangle], vars: js.Array[webcolaLib.distSrcVpscMod.Variable]): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYGroupConstraints(root: ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def makeEdgeBetween(source: Rectangle, target: Rectangle, ah: scala.Double): webcolaLib.Anon_ArrowStart = js.native
  def makeEdgeTo(s: webcolaLib.Anon_Y, target: Rectangle, ah: scala.Double): webcolaLib.distSrcGeomMod.Point = js.native
  def removeOverlaps(rs: js.Array[Rectangle]): scala.Unit = js.native
}

