package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSNumericValue extends CSSStyleValue {
  
  def add(values: CSSNumberish*): CSSNumericValue = js.native
  
  def div(values: CSSNumberish*): CSSNumericValue = js.native
  
  def equals(values: CSSNumberish*): Boolean = js.native
  
  def max(values: CSSNumberish*): CSSNumericValue = js.native
  
  def min(values: CSSNumberish*): CSSNumericValue = js.native
  
  def mul(values: CSSNumberish*): CSSNumericValue = js.native
  
  def sub(values: CSSNumberish*): CSSNumericValue = js.native
  
  def to(unit: String): CSSUnitValue = js.native
  
  def toSum(units: String*): CSSMathSum = js.native
  
  def `type`(): CSSNumericType = js.native
}
object CSSNumericValue {
  
  @scala.inline
  def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals: /* repeated */ CSSNumberish => Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: () => CSSNumericType
  ): CSSNumericValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSNumericValue]
  }
  
  @scala.inline
  implicit class CSSNumericValueOps[Self <: CSSNumericValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiv(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("div", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: /* repeated */ CSSNumberish => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMul(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("mul", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSub(value: /* repeated */ CSSNumberish => CSSNumericValue): Self = this.set("sub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: String => CSSUnitValue): Self = this.set("to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToSum(value: /* repeated */ String => CSSMathSum): Self = this.set("toSum", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: () => CSSNumericType): Self = this.set("type", js.Any.fromFunction0(value))
  }
}
