package typings.w3cCssTypedObjectModelLevel1.global

import typings.w3cCssTypedObjectModelLevel1.CSSNumberish
import typings.w3cCssTypedObjectModelLevel1.CSSNumericType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSNumericValue")
@js.native
class CSSNumericValue ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSNumericValue {
  /* CompleteClass */
  override def add(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def div(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def equals(values: CSSNumberish*): Boolean = js.native
  /* CompleteClass */
  override def max(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def min(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def mul(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def sub(values: CSSNumberish*): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def to(unit: String): typings.w3cCssTypedObjectModelLevel1.CSSUnitValue = js.native
  /* CompleteClass */
  override def toSum(units: String*): typings.w3cCssTypedObjectModelLevel1.CSSMathSum = js.native
  /* CompleteClass */
  override def `type`(): CSSNumericType = js.native
}

/* static members */
@JSGlobal("CSSNumericValue")
@js.native
object CSSNumericValue extends js.Object {
  def parse(cssText: String): typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
}

