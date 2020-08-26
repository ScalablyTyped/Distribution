package typings.winrtUwp.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of the authentication operation. */
@js.native
trait WebAuthenticationResult extends js.Object {
  /** Contains the protocol data when the operation successfully completes. */
  var responseData: String = js.native
  /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
  var responseErrorDetail: Double = js.native
  /** Contains the status of the asynchronous operation when it completes. */
  var responseStatus: WebAuthenticationStatus = js.native
}

object WebAuthenticationResult {
  @scala.inline
  def apply(responseData: String, responseErrorDetail: Double, responseStatus: WebAuthenticationStatus): WebAuthenticationResult = {
    val __obj = js.Dynamic.literal(responseData = responseData.asInstanceOf[js.Any], responseErrorDetail = responseErrorDetail.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthenticationResult]
  }
  @scala.inline
  implicit class WebAuthenticationResultOps[Self <: WebAuthenticationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponseData(value: String): Self = this.set("responseData", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseErrorDetail(value: Double): Self = this.set("responseErrorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseStatus(value: WebAuthenticationStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
  }
  
}

