package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Note that skew(x,y) is *not* the same as skewX(x) skewY(y),
  thus the separate interfaces for all three. */
@JSGlobal("CSSPerspective")
@js.native
class CSSPerspective protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSPerspective {
  def this(length: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue) = this()
  /* CompleteClass */
  override var is2D: Boolean = js.native
  /* CompleteClass */
  override var length: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override def toMatrix(): DOMMatrix = js.native
}

