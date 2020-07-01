package typings.w3cCssTypedObjectModelLevel1.global

import typings.std.DOMMatrix
import typings.std.DOMMatrixReadOnly
import typings.w3cCssTypedObjectModelLevel1.CSSMatrixComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSSMatrixComponent")
@js.native
class CSSMatrixComponent protected ()
  extends typings.w3cCssTypedObjectModelLevel1.CSSMatrixComponent {
  def this(matrix: DOMMatrixReadOnly) = this()
  def this(matrix: DOMMatrixReadOnly, options: CSSMatrixComponentOptions) = this()
  /* CompleteClass */
  override var is2D: Boolean = js.native
  /* CompleteClass */
  override var matrix: DOMMatrix = js.native
  /* CompleteClass */
  override def toMatrix(): DOMMatrix = js.native
}

