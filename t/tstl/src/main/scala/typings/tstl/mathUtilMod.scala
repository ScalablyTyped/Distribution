package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/numeric/MathUtil", JSImport.Namespace)
@js.native
object mathUtilMod extends js.Object {
  
  @js.native
  object MathUtil extends js.Object {
    
    def factorial(k: Double): Double = js.native
    
    def integral(formula: js.Function1[/* x */ Double, Double], first: Double, last: Double): Double = js.native
    def integral(formula: js.Function1[/* x */ Double, Double], first: Double, last: Double, segment_count: Double): Double = js.native
    
    def sigma(formula: js.Function1[/* k */ Double, Double], first: Double, last: Double): Double = js.native
  }
}
