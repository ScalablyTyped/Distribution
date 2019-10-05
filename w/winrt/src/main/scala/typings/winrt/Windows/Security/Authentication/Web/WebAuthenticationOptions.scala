package typings.winrt.Windows.Security.Authentication.Web

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
  
  /* 0 */ val none: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.none with Double = js.native
  /* 1 */ val silentMode: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode with Double = js.native
  /* 4 */ val useCorporateNetwork: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
  /* 3 */ val useHttpPost: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost with Double = js.native
  /* 2 */ val useTitle: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationOptions with Double] = js.native
}

