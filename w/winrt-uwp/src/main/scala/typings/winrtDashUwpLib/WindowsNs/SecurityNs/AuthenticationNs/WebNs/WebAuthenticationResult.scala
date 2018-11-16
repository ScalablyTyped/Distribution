package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of the authentication operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
@js.native
abstract class WebAuthenticationResult () extends js.Object {
  /** Contains the protocol data when the operation successfully completes. */
  var responseData: java.lang.String = js.native
  /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
  var responseErrorDetail: scala.Double = js.native
  /** Contains the status of the asynchronous operation when it completes. */
  var responseStatus: WebAuthenticationStatus = js.native
}

