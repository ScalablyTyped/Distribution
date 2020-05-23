package typings.winrtUwp.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of the authentication operation. */
trait WebAuthenticationResult extends js.Object {
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
}

