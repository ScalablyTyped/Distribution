package typings.webcola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Solver")
@js.native
class Solver protected ()
  extends typings.webcola.vpscMod.Solver {
  def this(vs: js.Array[typings.webcola.vpscMod.Variable], cs: js.Array[typings.webcola.vpscMod.Constraint]) = this()
}
/* static members */
object Solver {
  
  @JSImport("webcola", "Solver")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola", "Solver.LAGRANGIAN_TOLERANCE")
  @js.native
  def LAGRANGIAN_TOLERANCE: Double = js.native
  @scala.inline
  def LAGRANGIAN_TOLERANCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAGRANGIAN_TOLERANCE")(x.asInstanceOf[js.Any])
  
  @JSImport("webcola", "Solver.ZERO_UPPERBOUND")
  @js.native
  def ZERO_UPPERBOUND: Double = js.native
  @scala.inline
  def ZERO_UPPERBOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO_UPPERBOUND")(x.asInstanceOf[js.Any])
}
