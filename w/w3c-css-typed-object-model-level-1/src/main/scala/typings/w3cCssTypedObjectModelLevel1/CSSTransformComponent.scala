package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSTransformComponent extends js.Object {
  var is2D: Boolean
  def toMatrix(): DOMMatrix
}

object CSSTransformComponent {
  @scala.inline
  def apply(is2D: Boolean, toMatrix: () => DOMMatrix): CSSTransformComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSTransformComponent]
  }
}

