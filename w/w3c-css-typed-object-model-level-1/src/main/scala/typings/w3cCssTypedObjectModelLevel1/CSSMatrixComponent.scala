package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSMatrixComponent extends CSSTransformComponent {
  var matrix: DOMMatrix
}

object CSSMatrixComponent {
  @scala.inline
  def apply(is2D: Boolean, matrix: DOMMatrix, toMatrix: () => DOMMatrix): CSSMatrixComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSMatrixComponent]
  }
}

