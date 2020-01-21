package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Solver")
@js.native
class Solver protected ()
  extends typings.webcola.vpscMod.Solver {
  def this(vs: js.Array[typings.webcola.vpscMod.Variable], cs: js.Array[typings.webcola.vpscMod.Constraint]) = this()
}

/* static members */
@JSImport("webcola", "Solver")
@js.native
object Solver extends js.Object {
  var LAGRANGIAN_TOLERANCE: Double = js.native
  var ZERO_UPPERBOUND: Double = js.native
}

