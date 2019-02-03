package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Block")
@js.native
class Block protected () extends js.Object {
  def this(v: Variable) = this()
  var blockInd: scala.Double = js.native
  var posn: scala.Double = js.native
  var ps: PositionStats = js.native
  var vars: js.Array[Variable] = js.native
  /* private */ def addVariable(v: js.Any): js.Any = js.native
  /* private */ def compute_lm(v: js.Any, u: js.Any, postAction: js.Any): js.Any = js.native
  def cost(): scala.Double = js.native
  def findMinLM(): Constraint = js.native
  /* private */ def findMinLMBetween(lv: js.Any, rv: js.Any): js.Any = js.native
  /* private */ def findPath(v: js.Any, prev: js.Any, to: js.Any, visit: js.Any): js.Any = js.native
  def isActiveDirectedPathBetween(u: Variable, v: Variable): scala.Boolean = js.native
  def mergeAcross(b: Block, c: Constraint, dist: scala.Double): scala.Unit = js.native
  /* private */ def populateSplitBlock(v: js.Any, prev: js.Any): js.Any = js.native
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
  /* private */ def createSplitBlock(startVar: js.Any): js.Any = js.native
  def split(c: webcolaLib.distSrcVpscMod.Constraint): js.Array[webcolaLib.distSrcVpscMod.Block] = js.native
}

