package typings
package webcolaLib.webcolaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Solver")
@js.native
class Solver protected ()
  extends webcolaLib.distSrcVpscMod.Solver {
  def this(vs: js.Array[webcolaLib.distSrcVpscMod.Variable], cs: js.Array[webcolaLib.distSrcVpscMod.Constraint]) = this()
}

@JSImport("webcola", "Solver")
@js.native
object Solver extends js.Object {
  var LAGRANGIAN_TOLERANCE: scala.Double = js.native
  var ZERO_UPPERBOUND: scala.Double = js.native
}

