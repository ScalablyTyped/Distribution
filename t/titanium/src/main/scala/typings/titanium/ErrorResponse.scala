package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties used in any event or callback which needs to report a success or failure.
  */
@js.native
trait ErrorResponse extends StObject {
  
  /**
    * Error code. Returns 0 if `success` is `true`.
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the operation succeeded.
    */
  var success: js.UndefOr[Boolean] = js.native
}
object ErrorResponse {
  
  @scala.inline
  def apply(): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorResponse]
  }
  
  @scala.inline
  implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
