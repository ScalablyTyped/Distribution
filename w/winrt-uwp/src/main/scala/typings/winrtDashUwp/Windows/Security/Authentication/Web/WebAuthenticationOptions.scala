package typings.winrtDashUwp.Windows.Security.Authentication.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAuthenticationOptions extends js.Object

/** Contains the options available to the asynchronous operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
@js.native
object WebAuthenticationOptions extends js.Object {
  /** No options are requested. */
  @js.native
  sealed trait none extends WebAuthenticationOptions
  
  /** Tells the web authentication broker to not render any UI. This option will throw an exception if used with AuthenticateAndContinue ; AuthenticateSilentlyAsync , which includes this option implicitly, should be used instead. */
  @js.native
  sealed trait silentMode extends WebAuthenticationOptions
  
  /** Tells the web authentication broker to render the webpage in an app container that supports privateNetworkClientServer, enterpriseAuthentication, and sharedUserCertificate capabilities. Note the application that uses this flag must have these capabilities as well. */
  @js.native
  sealed trait useCorporateNetwork extends WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the body of the HTTP POST in the ResponseData property. For use with single sign-on (SSO) only. */
  @js.native
  sealed trait useHttpPost extends WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the window title string of the webpage in the ResponseData property. */
  @js.native
  sealed trait useTitle extends WebAuthenticationOptions
  
  /* 0 */ val none: typings.winrtDashUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.none with Double = js.native
  /* 1 */ val silentMode: typings.winrtDashUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode with Double = js.native
  /* 4 */ val useCorporateNetwork: typings.winrtDashUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
  /* 3 */ val useHttpPost: typings.winrtDashUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost with Double = js.native
  /* 2 */ val useTitle: typings.winrtDashUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationOptions with Double] = js.native
}

