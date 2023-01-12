package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSSkewX
  extends StObject
     with CSSTransformComponent {
  
  var ax: CSSNumericValue
}
object CSSSkewX {
  
  inline def apply(ax: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewX = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSSkewX] (val x: Self) extends AnyVal {
    
    inline def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
  }
}
