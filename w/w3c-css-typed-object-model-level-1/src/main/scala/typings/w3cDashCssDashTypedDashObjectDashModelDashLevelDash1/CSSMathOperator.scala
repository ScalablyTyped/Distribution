package typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CSSMathOperator extends js.Object

@JSGlobal("CSSMathOperator")
@js.native
object CSSMathOperator extends js.Object {
  @js.native
  sealed trait clamp extends CSSMathOperator
  
  @js.native
  sealed trait invert extends CSSMathOperator
  
  @js.native
  sealed trait max extends CSSMathOperator
  
  @js.native
  sealed trait min extends CSSMathOperator
  
  @js.native
  sealed trait negate extends CSSMathOperator
  
  @js.native
  sealed trait product extends CSSMathOperator
  
  @js.native
  sealed trait sum extends CSSMathOperator
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CSSMathOperator with Double] = js.native
  /* 6 */ @js.native
  object clamp extends TopLevel[clamp with Double]
  
  /* 3 */ @js.native
  object invert extends TopLevel[invert with Double]
  
  /* 5 */ @js.native
  object max extends TopLevel[max with Double]
  
  /* 4 */ @js.native
  object min extends TopLevel[min with Double]
  
  /* 2 */ @js.native
  object negate extends TopLevel[negate with Double]
  
  /* 1 */ @js.native
  object product extends TopLevel[product with Double]
  
  /* 0 */ @js.native
  object sum extends TopLevel[sum with Double]
  
}

