package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

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
  sealed trait errorHttp
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  /** The operation succeeded, and the response data is available. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  /** The operation was canceled by the user. */
  @js.native
  sealed trait userCancel
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  val errorHttp: errorHttp with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val userCancel: userCancel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus with java.lang.String
  ] = js.native
}

