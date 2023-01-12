package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMatrixComponentOptions extends StObject {
  
  var is2D: Boolean
}
object CSSMatrixComponentOptions {
  
  inline def apply(is2D: Boolean): CSSMatrixComponentOptions = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMatrixComponentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMatrixComponentOptions] (val x: Self) extends AnyVal {
    
    inline def setIs2D(value: Boolean): Self = StObject.set(x, "is2D", value.asInstanceOf[js.Any])
  }
}
