package typings.webcola.distSrcRectangleMod

import typings.webcola.Anon_ArrowStart
import typings.webcola.Anon_X
import typings.webcola.distSrcGeomMod.Point
import typings.webcola.distSrcVpscMod.Constraint
import typings.webcola.distSrcVpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/rectangle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeGroupBounds(g: ProjectionGroup): Rectangle = js.native
  def generateXConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = js.native
  def generateXGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = js.native
  def generateYConstraints(rs: js.Array[Rectangle], vars: js.Array[Variable]): js.Array[Constraint] = js.native
  def generateYGroupConstraints(root: ProjectionGroup): js.Array[Constraint] = js.native
  def makeEdgeBetween(source: Rectangle, target: Rectangle, ah: Double): Anon_ArrowStart = js.native
  def makeEdgeTo(s: Anon_X, target: Rectangle, ah: Double): Point = js.native
  def removeOverlaps(rs: js.Array[Rectangle]): Unit = js.native
}

