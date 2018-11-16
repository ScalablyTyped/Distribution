package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs

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
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  /** Tells the web authentication broker to not render any UI. This option will throw an exception if used with AuthenticateAndContinue ; AuthenticateSilentlyAsync , which includes this option implicitly, should be used instead. */
  @js.native
  sealed trait silentMode
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  /** Tells the web authentication broker to render the webpage in an app container that supports privateNetworkClientServer, enterpriseAuthentication, and sharedUserCertificate capabilities. Note the application that uses this flag must have these capabilities as well. */
  @js.native
  sealed trait useCorporateNetwork
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the body of the HTTP POST in the ResponseData property. For use with single sign-on (SSO) only. */
  @js.native
  sealed trait useHttpPost
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the window title string of the webpage in the ResponseData property. */
  @js.native
  sealed trait useTitle
    extends winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions
  
  val none: none with java.lang.String = js.native
  val silentMode: silentMode with java.lang.String = js.native
  val useCorporateNetwork: useCorporateNetwork with java.lang.String = js.native
  val useHttpPost: useHttpPost with java.lang.String = js.native
  val useTitle: useTitle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.WebAuthenticationOptions with java.lang.String
  ] = js.native
}

