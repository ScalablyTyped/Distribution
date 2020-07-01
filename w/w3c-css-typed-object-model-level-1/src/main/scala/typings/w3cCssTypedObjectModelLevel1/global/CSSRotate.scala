package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import typings.w3cCssTypedObjectModelLevel1.CSSNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSRotate")
@js.native
class CSSRotate protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSRotate {
  def this(angle: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue) = this()
  def this(
    x: CSSNumberish,
    y: CSSNumberish,
    z: CSSNumberish,
    angle: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue
  ) = this()
  /* CompleteClass */
  override var angle: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override var is2D: Boolean = js.native
  /* CompleteClass */
  override var x: CSSNumberish = js.native
  /* CompleteClass */
  override var y: CSSNumberish = js.native
  /* CompleteClass */
  override var z: CSSNumberish = js.native
  /* CompleteClass */
  override def toMatrix(): DOMMatrix = js.native
}

