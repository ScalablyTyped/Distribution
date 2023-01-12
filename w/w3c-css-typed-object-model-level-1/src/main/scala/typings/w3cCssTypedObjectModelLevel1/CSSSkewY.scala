package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSSkewY
  extends StObject
     with CSSTransformComponent {
  
  var ay: CSSNumericValue
}
object CSSSkewY {
  
  inline def apply(ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewY = {
    val __obj = js.Dynamic.literal(ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSSkewY] (val x: Self) extends AnyVal {
    
    inline def setAy(value: CSSNumericValue): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
  }
}
