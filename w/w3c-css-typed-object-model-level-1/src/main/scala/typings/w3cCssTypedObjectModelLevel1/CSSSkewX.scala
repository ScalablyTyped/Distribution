package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSSkewX extends CSSTransformComponent {
  var ax: CSSNumericValue
}

object CSSSkewX {
  @scala.inline
  def apply(ax: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewX]
  }
}

