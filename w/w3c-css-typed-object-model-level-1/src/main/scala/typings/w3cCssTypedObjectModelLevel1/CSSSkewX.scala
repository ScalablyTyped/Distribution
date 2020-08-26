package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSSkewX extends CSSTransformComponent {
  var ax: CSSNumericValue = js.native
}

object CSSSkewX {
  @scala.inline
  def apply(ax: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewX]
  }
  @scala.inline
  implicit class CSSSkewXOps[Self <: CSSSkewX] (val x: Self) extends AnyVal {
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
    def setAx(value: CSSNumericValue): Self = this.set("ax", value.asInstanceOf[js.Any])
  }
  
}

