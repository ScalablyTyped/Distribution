package typings.winrtUwp.global.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of the authentication operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
@js.native
abstract class WebAuthenticationResult ()
  extends typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult {
  /** Contains the protocol data when the operation successfully completes. */
  /* CompleteClass */
  override var responseData: String = js.native
  /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
  /* CompleteClass */
  override var responseErrorDetail: Double = js.native
  /** Contains the status of the asynchronous operation when it completes. */
  /* CompleteClass */
  override var responseStatus: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus = js.native
}

