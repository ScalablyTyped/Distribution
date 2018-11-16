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
  
  val none: none with java.lang.String = js.native
  val silentMode: silentMode with java.lang.String = js.native
  val useCorporateNetwork: useCorporateNetwork with java.lang.String = js.native
  val useHttpPost: useHttpPost with java.lang.String = js.native
  val useTitle: useTitle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions with java.lang.String
  ] = js.native
}

