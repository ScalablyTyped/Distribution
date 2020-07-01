package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSNumericValue extends CSSStyleValue {
  def add(values: CSSNumberish*): CSSNumericValue
  def div(values: CSSNumberish*): CSSNumericValue
  def equals(values: CSSNumberish*): Boolean
  def max(values: CSSNumberish*): CSSNumericValue
  def min(values: CSSNumberish*): CSSNumericValue
  def mul(values: CSSNumberish*): CSSNumericValue
  def sub(values: CSSNumberish*): CSSNumericValue
  def to(unit: String): CSSUnitValue
  def toSum(units: String*): CSSMathSum
  def `type`(): CSSNumericType
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
}

