package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInputHasError extends StObject {
  
  var pageInputHasError: Boolean
  
  var pageInputValue: String
}
object PageInputHasError {
  
  @scala.inline
  def apply(pageInputHasError: Boolean, pageInputValue: String): PageInputHasError = {
    val __obj = js.Dynamic.literal(pageInputHasError = pageInputHasError.asInstanceOf[js.Any], pageInputValue = pageInputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputHasError]
  }
  
  @scala.inline
  implicit class PageInputHasErrorMutableBuilder[Self <: PageInputHasError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageInputHasError(value: Boolean): Self = StObject.set(x, "pageInputHasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInputValue(value: String): Self = StObject.set(x, "pageInputValue", value.asInstanceOf[js.Any])
  }
}
