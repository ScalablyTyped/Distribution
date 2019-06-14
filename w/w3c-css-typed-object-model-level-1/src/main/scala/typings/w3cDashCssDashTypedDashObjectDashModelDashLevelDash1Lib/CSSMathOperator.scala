package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CSSMathOperator extends js.Object

@JSGlobal("CSSMathOperator")
@js.native
object CSSMathOperator extends js.Object {
  @js.native
  sealed trait clamp
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait invert
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait max
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait min
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait negate
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait product
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  @js.native
  sealed trait sum
    extends w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator
  
  /* 6 */ val clamp: clamp with scala.Double = js.native
  /* 3 */ val invert: invert with scala.Double = js.native
  /* 5 */ val max: max with scala.Double = js.native
  /* 4 */ val min: min with scala.Double = js.native
  /* 2 */ val negate: negate with scala.Double = js.native
  /* 1 */ val product: product with scala.Double = js.native
  /* 0 */ val sum: sum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSMathOperator with scala.Double
  ] = js.native
}

