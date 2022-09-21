package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSRotate
  extends StObject
     with CSSTransformComponent {
  
  var angle: CSSNumericValue
  
  var x: CSSNumberOrNumeric
  
  var y: CSSNumberOrNumeric
  
  var z: CSSNumberOrNumeric
}
object CSSRotate {
  
  inline def apply(
    angle: CSSNumericValue,
    is2D: Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumberOrNumeric,
    y: CSSNumberOrNumeric,
    z: CSSNumberOrNumeric
  ): CSSRotate = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRotate]
  }
  
  extension [Self <: CSSRotate](x: Self) {
    
    inline def setAngle(value: CSSNumericValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setX(value: CSSNumberOrNumeric): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: CSSNumberOrNumeric): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: CSSNumberOrNumeric): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
