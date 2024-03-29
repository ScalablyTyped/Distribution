package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSMatrixComponentOptions extends StObject {
  
  var is2D: js.UndefOr[Boolean] = js.undefined
}
object CSSMatrixComponentOptions {
  
  inline def apply(): CSSMatrixComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSMatrixComponentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSMatrixComponentOptions] (val x: Self) extends AnyVal {
    
    inline def setIs2D(value: Boolean): Self = StObject.set(x, "is2D", value.asInstanceOf[js.Any])
    
    inline def setIs2DUndefined: Self = StObject.set(x, "is2D", js.undefined)
  }
}
