package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAuthenticationOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object silentMode extends TopLevel[silentMode with Double]
  
  /* 4 */ @js.native
  object useCorporateNetwork extends TopLevel[useCorporateNetwork with Double]
  
  /* 3 */ @js.native
  object useHttpPost extends TopLevel[useHttpPost with Double]
  
  /* 2 */ @js.native
  object useTitle extends TopLevel[useTitle with Double]
  
}

