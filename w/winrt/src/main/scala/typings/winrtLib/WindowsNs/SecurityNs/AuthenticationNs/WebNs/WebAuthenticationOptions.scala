package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationOptions extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
@js.native
object WebAuthenticationOptions extends js.Object {
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  @js.native
  sealed trait silentMode
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  @js.native
  sealed trait useCorporateNetwork
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  @js.native
  sealed trait useHttpPost
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  @js.native
  sealed trait useTitle
    extends winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val silentMode: silentMode with scala.Double = js.native
  /* 4 */ val useCorporateNetwork: useCorporateNetwork with scala.Double = js.native
  /* 3 */ val useHttpPost: useHttpPost with scala.Double = js.native
  /* 2 */ val useTitle: useTitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions with scala.Double
  ] = js.native
}

