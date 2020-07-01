package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSTranslate")
@js.native
class CSSTranslate protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSTranslate {
  def this(
    x: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue,
    y: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue
  ) = this()
  def this(
    x: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue,
    y: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue,
    z: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue
  ) = this()
  /* CompleteClass */
  override var is2D: Boolean = js.native
  /* CompleteClass */
  override var x: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override var y: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override var z: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def toMatrix(): DOMMatrix = js.native
}

