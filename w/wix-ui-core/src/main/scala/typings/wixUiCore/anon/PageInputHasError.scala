package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInputHasError extends StObject {
  
  var pageInputHasError: Boolean
  
  var pageInputValue: String
}
object PageInputHasError {
  
  inline def apply(pageInputHasError: Boolean, pageInputValue: String): PageInputHasError = {
    val __obj = js.Dynamic.literal(pageInputHasError = pageInputHasError.asInstanceOf[js.Any], pageInputValue = pageInputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputHasError]
  }
  
  extension [Self <: PageInputHasError](x: Self) {
    
    inline def setPageInputHasError(value: Boolean): Self = StObject.set(x, "pageInputHasError", value.asInstanceOf[js.Any])
    
    inline def setPageInputValue(value: String): Self = StObject.set(x, "pageInputValue", value.asInstanceOf[js.Any])
  }
}
