package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSMatrixComponent extends CSSTransformComponent {
  var matrix: DOMMatrix = js.native
}

object CSSMatrixComponent {
  @scala.inline
  def apply(is2D: Boolean, matrix: DOMMatrix, toMatrix: () => DOMMatrix): CSSMatrixComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSMatrixComponent]
  }
  @scala.inline
  implicit class CSSMatrixComponentOps[Self <: CSSMatrixComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatrix(value: DOMMatrix): Self = this.set("matrix", value.asInstanceOf[js.Any])
  }
  
}

