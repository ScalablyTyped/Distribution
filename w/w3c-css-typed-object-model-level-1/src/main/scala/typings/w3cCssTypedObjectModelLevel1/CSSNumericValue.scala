package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSNumericValue")
@js.native
class CSSNumericValue () extends CSSStyleValue {
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

/* static members */
@JSGlobal("CSSNumericValue")
@js.native
object CSSNumericValue extends js.Object {
  def parse(cssText: String): CSSNumericValue = js.native
}

