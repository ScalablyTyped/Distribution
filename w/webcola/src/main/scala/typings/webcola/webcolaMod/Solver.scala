package typings.webcola.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Solver")
@js.native
class Solver protected ()
  extends typings.webcola.distSrcVpscMod.Solver {
  def this(
    vs: js.Array[typings.webcola.distSrcVpscMod.Variable],
    cs: js.Array[typings.webcola.distSrcVpscMod.Constraint]
  ) = this()
}

/* static members */
@JSImport("webcola", "Solver")
@js.native
object Solver extends js.Object {
  var LAGRANGIAN_TOLERANCE: Double = js.native
  var ZERO_UPPERBOUND: Double = js.native
}

