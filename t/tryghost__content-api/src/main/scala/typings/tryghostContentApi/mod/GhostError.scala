package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.ErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostError extends StObject {
  
  var errors: js.Array[ErrorType] = js.native
}
object GhostError {
  
  @scala.inline
  def apply(errors: js.Array[ErrorType]): GhostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostError]
  }
  
  @scala.inline
  implicit class GhostErrorMutableBuilder[Self <: GhostError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ErrorType]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ErrorType*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
