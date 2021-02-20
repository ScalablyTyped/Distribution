package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Note that skew(x,y) is *not* the same as skewX(x) skewY(y),
  thus the separate interfaces for all three. */
@js.native
trait CSSPerspective extends CSSTransformComponent {
  
  var length: CSSNumericValue = js.native
}
object CSSPerspective {
  
  @scala.inline
  def apply(is2D: Boolean, length: CSSNumericValue, toMatrix: () => DOMMatrix): CSSPerspective = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSPerspective]
  }
  
  @scala.inline
  implicit class CSSPerspectiveMutableBuilder[Self <: CSSPerspective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: CSSNumericValue): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
