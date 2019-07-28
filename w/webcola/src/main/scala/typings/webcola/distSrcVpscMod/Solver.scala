package typings.webcola.distSrcVpscMod

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
  var mostViolated: js.Any = js.native
  var vs: js.Array[Variable] = js.native
  def cost(): Double = js.native
  def satisfy(): Unit = js.native
  def setDesiredPositions(ps: js.Array[Double]): Unit = js.native
  def setStartingPositions(ps: js.Array[Double]): Unit = js.native
  def solve(): Double = js.native
}

/* static members */
@JSImport("webcola/dist/src/vpsc", "Solver")
@js.native
object Solver extends js.Object {
  var LAGRANGIAN_TOLERANCE: Double = js.native
  var ZERO_UPPERBOUND: Double = js.native
}

