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
  
  val errorHttp: errorHttp with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val userCancel: userCancel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus with java.lang.String
  ] = js.native
}

