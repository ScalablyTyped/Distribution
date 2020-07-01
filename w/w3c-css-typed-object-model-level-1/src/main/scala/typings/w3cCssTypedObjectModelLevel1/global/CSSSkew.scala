package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSSkew")
@js.native
class CSSSkew protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSSkew {
  def this(
    ax: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue,
    ay: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue
  ) = this()
  /* CompleteClass */
  override var ax: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override var ay: typings.w3cCssTypedObjectModelLevel1.CSSNumericValue = js.native
  /* CompleteClass */
  override var is2D: Boolean = js.native
  /* CompleteClass */
  override def toMatrix(): DOMMatrix = js.native
}

