package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAPIError extends StObject {
  
  /**
    * 16-bit error code.
    * Possible values are defined in [DOMException](http://www.w3.org/TR/dom/#domexception).
    */
  val code: Double
  
  /**
    * An error message that describes the details of the error encountered.
    *
    * This attribute is not intended to be used directly in the user interfaces
    * as it is mainly intended to be useful for developers rather than end users.
    */
  val message: String
  
  /**
    * An error type. The name attribute must return the value it had been initialized with.
    *
    *  This attribute can have one of the following values:
    * - UnknownError  An unknown error has occurred
    * - InvalidValuesError  The content of an object does not contain valid values
    * - IOError  An error occurred in communication with the underlying implementation and so the requested method cannot be completed
    * - ServiceNotAvailableError  The requested service is not available
    * - VerificationError  An error occurred in authentication and so the requested method cannot be completed
    *  For other possible values of this attribute, see the values defined in [DOM error names](http://www.w3.org/TR/dom/#error-names-0)
    */
  val name: String
}
object WebAPIError {
  
  @scala.inline
  def apply(code: Double, message: String, name: String): WebAPIError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAPIError]
  }
  
  @scala.inline
  implicit class WebAPIErrorMutableBuilder[Self <: WebAPIError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
