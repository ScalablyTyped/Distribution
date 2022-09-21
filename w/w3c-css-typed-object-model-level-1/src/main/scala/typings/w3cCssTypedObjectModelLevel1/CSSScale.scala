package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSScale
  extends StObject
     with CSSTransformComponent {
  
  var x: CSSNumberOrNumeric
  
  var y: CSSNumberOrNumeric
  
  var z: CSSNumberOrNumeric
}
object CSSScale {
  
  inline def apply(
    is2D: Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumberOrNumeric,
    y: CSSNumberOrNumeric,
    z: CSSNumberOrNumeric
  ): CSSScale = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSScale]
  }
  
  extension [Self <: CSSScale](x: Self) {
    
    inline def setX(value: CSSNumberOrNumeric): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumberOrNumeric): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumberOrNumeric): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
