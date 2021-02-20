package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the callback when a request finishes successfully or erroneously.
  */
@js.native
trait CalendarPermissionResponse extends StObject {
  
  /**
    * Error code, if any returned.
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the request succeeded.
    */
  var success: js.UndefOr[Boolean] = js.native
}
object CalendarPermissionResponse {
  
  @scala.inline
  def apply(): CalendarPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPermissionResponse]
  }
  
  @scala.inline
  implicit class CalendarPermissionResponseMutableBuilder[Self <: CalendarPermissionResponse] (val x: Self) extends AnyVal {
    
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
