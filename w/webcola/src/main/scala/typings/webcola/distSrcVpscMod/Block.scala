package typings.webcola.distSrcVpscMod

import typings.webcola.Anon_Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Block")
@js.native
class Block protected () extends js.Object {
  def this(v: Variable) = this()
  var addVariable: js.Any = js.native
  var blockInd: Double = js.native
  var compute_lm: js.Any = js.native
  var findMinLMBetween: js.Any = js.native
  var findPath: js.Any = js.native
  var populateSplitBlock: js.Any = js.native
  var posn: Double = js.native
  var ps: PositionStats = js.native
  var vars: js.Array[Variable] = js.native
  def cost(): Double = js.native
  def findMinLM(): Constraint = js.native
  def isActiveDirectedPathBetween(u: Variable, v: Variable): Boolean = js.native
  def mergeAcross(b: Block, c: Constraint, dist: Double): Unit = js.native
  def splitBetween(vl: Variable, vr: Variable): Anon_Constraint = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_]): Unit = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable): Unit = js.native
  def traverse(visit: js.Function1[/* c */ Constraint, _], acc: js.Array[_], v: Variable, prev: Variable): Unit = js.native
  def updateWeightedPosition(): Unit = js.native
}

/* static members */
@JSImport("webcola/dist/src/vpsc", "Block")
@js.native
object Block extends js.Object {
  var createSplitBlock: js.Any = js.native
  def split(c: Constraint): js.Array[Block] = js.native
}

