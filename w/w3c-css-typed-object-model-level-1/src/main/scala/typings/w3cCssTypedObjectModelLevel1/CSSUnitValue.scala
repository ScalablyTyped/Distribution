package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSUnitValue extends CSSNumericValue {
  val unit: String
  var value: Double
}

object CSSUnitValue {
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
    `type`: () => CSSNumericType,
    unit: String,
    value: Double
  ): CSSUnitValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSUnitValue]
  }
}

