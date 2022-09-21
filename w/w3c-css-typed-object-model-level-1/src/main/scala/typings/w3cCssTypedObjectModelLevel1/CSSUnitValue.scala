package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSUnitValue
  extends StObject
     with CSSNumericValue {
  
  val unit: String
  
  var value: Double
}
object CSSUnitValue {
  
  inline def apply(
    add: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    div: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberOrNumeric => Boolean,
    max: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    min: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    mul: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    sub: /* repeated */ CSSNumberOrNumeric => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: () => CSSNumericType,
    unit: String,
    value: Double
  ): CSSUnitValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSUnitValue]
  }
  
  extension [Self <: CSSUnitValue](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
