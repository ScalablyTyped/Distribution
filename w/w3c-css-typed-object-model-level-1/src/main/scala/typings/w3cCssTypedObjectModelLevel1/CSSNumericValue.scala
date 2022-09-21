package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSNumericValue
  extends StObject
     with CSSStyleValue {
  
  def add(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def div(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def equals(values: CSSNumberOrNumeric*): Boolean
  
  def max(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def min(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def mul(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def sub(values: CSSNumberOrNumeric*): CSSNumericValue
  
  def to(unit: String): CSSUnitValue
  
  def toSum(units: String*): CSSMathSum
  
  def `type`(): CSSNumericType
}
object CSSNumericValue {
  
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
    `type`: () => CSSNumericType
  ): CSSNumericValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSNumericValue]
  }
  
  extension [Self <: CSSNumericValue](x: Self) {
    
    inline def setAdd(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDiv(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* repeated */ CSSNumberOrNumeric => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setMax(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMul(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setSub(value: /* repeated */ CSSNumberOrNumeric => CSSNumericValue): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTo(value: String => CSSUnitValue): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToSum(value: /* repeated */ String => CSSMathSum): Self = StObject.set(x, "toSum", js.Any.fromFunction1(value))
    
    inline def setType(value: () => CSSNumericType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
