package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Web.Http.HttpStatusCode
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a request that is sent to the Windows Store. */
trait StoreSendRequestResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  /** Gets the HTTP status code for the request. */
  var httpStatusCode: HttpStatusCode
  /** Gets the response data for the request. */
  var response: String
}

object StoreSendRequestResult {
  @scala.inline
  def apply(extendedError: WinRTError, httpStatusCode: HttpStatusCode, response: String): StoreSendRequestResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSendRequestResult]
  }
}

