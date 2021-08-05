package typings.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Fraction")
@js.native
class Fraction protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Fraction {
  def this(numerator: Double, denominator: Double) = this()
}
object Fraction {
  
  @JSGlobal("Vex.Flow.Fraction")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def GCD(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def LCM(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("LCM")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def LCMM(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("LCMM")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
