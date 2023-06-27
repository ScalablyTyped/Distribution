package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Fraction")
@js.native
open class Fraction protected ()
  extends typings.vexflow.mod.Flow.Fraction {
  def this(numerator: Double, denominator: Double) = this()
}
object Fraction {
  
  @JSImport("vextab", "Vex.Flow.Fraction")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def GCD(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def LCM(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("LCM")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def LCMM(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("LCMM")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
