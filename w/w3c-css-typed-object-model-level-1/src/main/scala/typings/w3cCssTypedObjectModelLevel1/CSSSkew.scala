package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSSkew extends CSSTransformComponent {
  var ax: CSSNumericValue
  var ay: CSSNumericValue
}

object CSSSkew {
  @scala.inline
  def apply(ax: CSSNumericValue, ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkew = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkew]
  }
}

