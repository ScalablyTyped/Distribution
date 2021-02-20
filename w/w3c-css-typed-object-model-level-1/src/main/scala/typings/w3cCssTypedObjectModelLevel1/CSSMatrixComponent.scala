package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSMatrixComponent extends CSSTransformComponent {
  
  var matrix: DOMMatrix = js.native
}
object CSSMatrixComponent {
  
  @scala.inline
  def apply(is2D: Boolean, matrix: DOMMatrix, toMatrix: () => DOMMatrix): CSSMatrixComponent = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSMatrixComponent]
  }
  
  @scala.inline
  implicit class CSSMatrixComponentMutableBuilder[Self <: CSSMatrixComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatrix(value: DOMMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
