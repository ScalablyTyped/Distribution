package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSTransformComponent extends js.Object {
  var is2D: Boolean = js.native
  def toMatrix(): DOMMatrix = js.native
}

object CSSTransformComponent {
  @scala.inline
  def apply(is2D: Boolean, toMatrix: () => DOMMatrix): CSSTransformComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSTransformComponent]
  }
  @scala.inline
  implicit class CSSTransformComponentOps[Self <: CSSTransformComponent] (val x: Self) extends AnyVal {
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
    def setIs2D(value: Boolean): Self = this.set("is2D", value.asInstanceOf[js.Any])
    @scala.inline
    def setToMatrix(value: () => DOMMatrix): Self = this.set("toMatrix", js.Any.fromFunction0(value))
  }
  
}

