package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Solver")
@js.native
class Solver protected () extends js.Object {
  def this(vs: js.Array[Variable], cs: js.Array[Constraint]) = this()
  var bs: Blocks = js.native
  var cs: js.Array[Constraint] = js.native
  var inactive: js.Array[Constraint] = js.native
  var vs: js.Array[Variable] = js.native
  def cost(): scala.Double = js.native
  /* private */ def mostViolated(): js.Any = js.native
  def satisfy(): scala.Unit = js.native
  def setDesiredPositions(ps: js.Array[scala.Double]): scala.Unit = js.native
  def setStartingPositions(ps: js.Array[scala.Double]): scala.Unit = js.native
  def solve(): scala.Double = js.native
}

/* static members */
@JSImport("webcola/dist/src/vpsc", "Solver")
@js.native
object Solver extends js.Object {
  var LAGRANGIAN_TOLERANCE: scala.Double = js.native
  var ZERO_UPPERBOUND: scala.Double = js.native
}

