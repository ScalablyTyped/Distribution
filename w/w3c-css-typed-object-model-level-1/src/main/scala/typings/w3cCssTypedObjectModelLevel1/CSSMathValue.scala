package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSMathValue extends CSSNumericValue {
  val operator: CSSMathOperator = js.native
}

object CSSMathValue {
  @scala.inline
  def apply(
    add: /* repeated */ CSSNumberish => CSSNumericValue,
    div: /* repeated */ CSSNumberish => CSSNumericValue,
    equals: /* repeated */ CSSNumberish => Boolean,
    max: /* repeated */ CSSNumberish => CSSNumericValue,
    min: /* repeated */ CSSNumberish => CSSNumericValue,
    mul: /* repeated */ CSSNumberish => CSSNumericValue,
    operator: CSSMathOperator,
    sub: /* repeated */ CSSNumberish => CSSNumericValue,
    to: String => CSSUnitValue,
    toSum: /* repeated */ String => CSSMathSum,
    `type`: () => CSSNumericType
  ): CSSMathValue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), operator = operator.asInstanceOf[js.Any], sub = js.Any.fromFunction1(sub), to = js.Any.fromFunction1(to), toSum = js.Any.fromFunction1(toSum))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[CSSMathValue]
  }
  @scala.inline
  implicit class CSSMathValueOps[Self <: CSSMathValue] (val x: Self) extends AnyVal {
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
    def setOperator(value: CSSMathOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
  }
  
}

