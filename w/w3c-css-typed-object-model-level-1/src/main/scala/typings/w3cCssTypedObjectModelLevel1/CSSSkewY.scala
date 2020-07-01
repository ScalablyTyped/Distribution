package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSSkewY extends CSSTransformComponent {
  var ay: CSSNumericValue
}

object CSSSkewY {
  @scala.inline
  def apply(ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewY = {
    val __obj = js.Dynamic.literal(ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewY]
  }
}

