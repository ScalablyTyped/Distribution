package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Note that skew(x,y) is *not* the same as skewX(x) skewY(y),
  thus the separate interfaces for all three. */
trait CSSPerspective extends CSSTransformComponent {
  var length: CSSNumericValue
}

object CSSPerspective {
  @scala.inline
  def apply(is2D: Boolean, length: CSSNumericValue, toMatrix: () => DOMMatrix): CSSPerspective = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSPerspective]
  }
}

