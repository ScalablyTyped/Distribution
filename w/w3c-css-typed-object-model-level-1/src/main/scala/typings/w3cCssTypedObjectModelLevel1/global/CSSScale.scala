package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import typings.w3cCssTypedObjectModelLevel1.CSSNumberish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSScale")
@js.native
class CSSScale protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSScale {
  def this(x: CSSNumberish, y: CSSNumberish) = this()
  def this(x: CSSNumberish, y: CSSNumberish, z: CSSNumberish) = this()
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

