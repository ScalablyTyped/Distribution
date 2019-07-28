package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationOptions extends js.Object

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
@js.native
object WebAuthenticationOptions extends js.Object {
  @js.native
  sealed trait none extends WebAuthenticationOptions
  
  @js.native
  sealed trait silentMode extends WebAuthenticationOptions
  
  @js.native
  sealed trait useCorporateNetwork extends WebAuthenticationOptions
  
  @js.native
  sealed trait useHttpPost extends WebAuthenticationOptions
  
  @js.native
  sealed trait useTitle extends WebAuthenticationOptions
  
  /* 0 */ val none: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions.none with Double = js.native
  /* 1 */ val silentMode: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions.silentMode with Double = js.native
  /* 4 */ val useCorporateNetwork: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
  /* 3 */ val useHttpPost: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions.useHttpPost with Double = js.native
  /* 2 */ val useTitle: typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions.useTitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationOptions with Double] = js.native
}

