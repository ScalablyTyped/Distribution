package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasError extends StObject {
  
  var hasError: Boolean
}
object HasError {
  
  inline def apply(hasError: Boolean): HasError = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasError]
  }
  
  extension [Self <: HasError](x: Self) {
    
    inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
  }
}
