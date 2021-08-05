package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransformComponent extends StObject {
  
  var is2D: Boolean
  
  def toMatrix(): DOMMatrix
}
object CSSTransformComponent {
  
  inline def apply(is2D: Boolean, toMatrix: () => DOMMatrix): CSSTransformComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSTransformComponent]
  }
  
  extension [Self <: CSSTransformComponent](x: Self) {
    
    inline def setIs2D(value: Boolean): Self = StObject.set(x, "is2D", value.asInstanceOf[js.Any])
    
    inline def setToMatrix(value: () => DOMMatrix): Self = StObject.set(x, "toMatrix", js.Any.fromFunction0(value))
  }
}
