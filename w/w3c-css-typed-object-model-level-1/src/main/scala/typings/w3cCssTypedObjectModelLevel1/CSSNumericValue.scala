package typings.w3cCssTypedObjectModelLevel1

import typings.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSNumericValue
  extends StObject
     with CSSStyleValue {
  
  def add(values: CSSNumberish*): CSSNumericValue
  
  def div(values: CSSNumberish*): CSSNumericValue
  
  def equals(value: CSSNumberish*): Boolean
  
  def max(values: CSSNumberish*): CSSNumericValue
  
  def min(values: CSSNumberish*): CSSNumericValue
  
  def mul(values: CSSNumberish*): CSSNumericValue
  
  def sub(values: CSSNumberish*): CSSNumericValue
  
  def to(unit: String): CSSUnitValue
  
  def toSum(units: String*): CSSMathSum
  
  def `type`(): CSSNumericType
}
object CSSNumericValue {
  
  inline def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals_ : /* repeated */ CSSNumberish => Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: () => CSSNumericType
  ): CSSNumericValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSNumericValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSNumericValue] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setDiv(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* repeated */ CSSNumberish => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setMax(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMul(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setSub(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTo(value: String => CSSUnitValue): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToSum(value: /* repeated */ String => CSSMathSum): Self = StObject.set(x, "toSum", js.Any.fromFunction1(value))
    
    inline def setType(value: () => CSSNumericType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
