package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Block")
@js.native
class Block protected () extends js.Object {
  def this(v: Variable) = this()
  var addVariable: js.Any = js.native
  var blockInd: scala.Double = js.native
  var compute_lm: js.Any = js.native
  var findMinLMBetween: js.Any = js.native
  var findPath: js.Any = js.native
  var populateSplitBlock: js.Any = js.native
  var posn: scala.Double = js.native
  var ps: PositionStats = js.native
  var vars: js.Array[Variable] = js.native
  def cost(): scala.Double = js.native
  def findMinLM(): Constraint = js.native
  def isActiveDirectedPathBetween(u: Variable, v: Variable): scala.Boolean = js.native
  def mergeAcross(b: Block, c: Constraint, dist: scala.Double): scala.Unit = js.native
  def splitBetween(vl: Variable, vr: Variable): webcolaLib.Anon_Constraint = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_]): scala.Unit = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable): scala.Unit = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable, prev: Variable): scala.Unit = js.native
  def updateWeightedPosition(): scala.Unit = js.native
}

/* static members */
@JSImport("webcola/dist/src/vpsc", "Block")
@js.native
object Block extends js.Object {
  var createSplitBlock: js.Any = js.native
  def split(c: webcolaLib.distSrcVpscMod.Constraint): js.Array[webcolaLib.distSrcVpscMod.Block] = js.native
}

