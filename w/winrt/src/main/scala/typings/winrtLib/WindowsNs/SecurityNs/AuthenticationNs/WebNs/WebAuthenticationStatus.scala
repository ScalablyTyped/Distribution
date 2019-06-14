package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationStatus extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
@js.native
object WebAuthenticationStatus extends js.Object {
  @js.native
  sealed trait errorHttp
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  @js.native
  sealed trait success
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  @js.native
  sealed trait userCancel
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus
  
  /* 2 */ val errorHttp: errorHttp with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 1 */ val userCancel: userCancel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus with scala.Double
  ] = js.native
}

