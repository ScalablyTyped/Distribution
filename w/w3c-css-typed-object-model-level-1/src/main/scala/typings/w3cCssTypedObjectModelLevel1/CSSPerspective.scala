package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Note that skew(x,y) is *not* the same as skewX(x) skewY(y),
  thus the separate interfaces for all three. */
trait CSSPerspective
  extends StObject
     with CSSTransformComponent {
  
  var length: CSSNumericValue
}
object CSSPerspective {
  
  inline def apply(is2D: Boolean, length: CSSNumericValue, toMatrix: () => DOMMatrix): CSSPerspective = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSPerspective]
  }
  
  extension [Self <: CSSPerspective](x: Self) {
    
    inline def setLength(value: CSSNumericValue): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
