package typings.w3cCssTypedObjectModelLevel1

import typings.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMathValue
  extends StObject
     with CSSNumericValue {
  
  val operator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSMathOperator */ Any
}
object CSSMathValue {
  
  inline def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberish => Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    operator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSMathOperator */ Any,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: () => CSSNumericType
  ): CSSMathValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), operator = operator.asInstanceOf[js.Any], sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSMathValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMathValue] (val x: Self) extends AnyVal {
    
    inline def setOperator(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSMathOperator */ Any
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
