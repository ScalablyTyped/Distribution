package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationStatus extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
@js.native
object WebAuthenticationStatus extends js.Object {
  @js.native
  sealed trait errorHttp extends WebAuthenticationStatus
  
  @js.native
  sealed trait success extends WebAuthenticationStatus
  
  @js.native
  sealed trait userCancel extends WebAuthenticationStatus
  
  /* 2 */ val errorHttp: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus.errorHttp with Double = js.native
  /* 0 */ val success: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus.success with Double = js.native
  /* 1 */ val userCancel: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationStatus.userCancel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationStatus with Double] = js.native
}

