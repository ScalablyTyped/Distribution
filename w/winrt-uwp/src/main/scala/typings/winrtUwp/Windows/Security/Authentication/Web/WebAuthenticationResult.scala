package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the result of the authentication operation. */
trait WebAuthenticationResult extends StObject {
  
  /** Contains the protocol data when the operation successfully completes. */
  var responseData: String
  
  /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
  var responseErrorDetail: Double
  
  /** Contains the status of the asynchronous operation when it completes. */
  var responseStatus: WebAuthenticationStatus
}
object WebAuthenticationResult {
  
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): WebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationResult]
  }
  
  @scala.inline
  implicit class WebAuthenticationResultMutableBuilder[Self <: WebAuthenticationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseData(value: String): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseErrorDetail(value: Double): Self = StObject.set(x, "responseErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatus(value: WebAuthenticationStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
  }
}
