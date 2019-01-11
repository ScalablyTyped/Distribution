package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rectangle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeGroupBounds(g: webcolaLib.distSrcRectangleMod.ProjectionGroup): webcolaLib.distSrcRectangleMod.Rectangle = js.native
  def generateXConstraints(
    rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle],
    vars: js.Array[webcolaLib.distSrcVpscMod.Variable]
  ): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateXGroupConstraints(root: webcolaLib.distSrcRectangleMod.ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYConstraints(
    rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle],
    vars: js.Array[webcolaLib.distSrcVpscMod.Variable]
  ): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def generateYGroupConstraints(root: webcolaLib.distSrcRectangleMod.ProjectionGroup): js.Array[webcolaLib.distSrcVpscMod.Constraint] = js.native
  def makeEdgeBetween(
    source: webcolaLib.distSrcRectangleMod.Rectangle,
    target: webcolaLib.distSrcRectangleMod.Rectangle,
    ah: scala.Double
  ): webcolaLib.Anon_ArrowStart = js.native
  def makeEdgeTo(s: webcolaLib.Anon_X, target: webcolaLib.distSrcRectangleMod.Rectangle, ah: scala.Double): webcolaLib.distSrcGeomMod.Point = js.native
  def removeOverlaps(rs: js.Array[webcolaLib.distSrcRectangleMod.Rectangle]): scala.Unit = js.native
}

