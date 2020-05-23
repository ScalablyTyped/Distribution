package typings.winrtUwp.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationStatus extends js.Object

/** Contains the status of the authentication operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
@js.native
object WebAuthenticationStatus extends js.Object {
  /** The operation failed because a specific HTTP error was returned, for example 404. */
  @js.native
  sealed trait errorHttp extends WebAuthenticationStatus
  
  /** The operation succeeded, and the response data is available. */
  @js.native
  sealed trait success extends WebAuthenticationStatus
  
  /** The operation was canceled by the user. */
  @js.native
  sealed trait userCancel extends WebAuthenticationStatus
  
}

