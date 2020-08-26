package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Web.Http.HttpStatusCode
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that is sent to the Windows Store. */
@js.native
trait StoreSendRequestResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets the HTTP status code for the request. */
  var httpStatusCode: HttpStatusCode = js.native
  /** Gets the response data for the request. */
  var response: String = js.native
}

object StoreSendRequestResult {
  @scala.inline
  def apply(extendedError: WinRTError, httpStatusCode: HttpStatusCode, response: String): StoreSendRequestResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSendRequestResult]
  }
  @scala.inline
  implicit class StoreSendRequestResultOps[Self <: StoreSendRequestResult] (val x: Self) extends AnyVal {
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
    def setExtendedError(value: WinRTError): Self = this.set("extendedError", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpStatusCode(value: HttpStatusCode): Self = this.set("httpStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

