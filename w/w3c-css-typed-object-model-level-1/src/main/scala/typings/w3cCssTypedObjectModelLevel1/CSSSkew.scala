package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSSkew
  extends StObject
     with CSSTransformComponent {
  
  var ax: CSSNumericValue
  
  var ay: CSSNumericValue
}
object CSSSkew {
  
  @scala.inline
  def apply(ax: CSSNumericValue, ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkew = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkew]
  }
  
  @scala.inline
  implicit class CSSSkewMutableBuilder[Self <: CSSSkew] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAx(value: CSSNumericValue): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAy(value: CSSNumericValue): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
  }
}
