package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSNumericValue")
@js.native
class CSSNumericValue () extends CSSStyleValue {
  def add(values: CSSNumberish*): CSSNumericValue = js.native
  def div(values: CSSNumberish*): CSSNumericValue = js.native
  def equals(values: CSSNumberish*): scala.Boolean = js.native
  def max(values: CSSNumberish*): CSSNumericValue = js.native
  def min(values: CSSNumberish*): CSSNumericValue = js.native
  def mul(values: CSSNumberish*): CSSNumericValue = js.native
  def sub(values: CSSNumberish*): CSSNumericValue = js.native
  def to(unit: java.lang.String): CSSUnitValue = js.native
  def toSum(units: java.lang.String*): CSSMathSum = js.native
  def `type`(): CSSNumericType = js.native
}

/* static members */
@JSGlobal("CSSNumericValue")
@js.native
object CSSNumericValue extends js.Object {
  def parse(cssText: java.lang.String): w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib.CSSNumericValue = js.native
}

