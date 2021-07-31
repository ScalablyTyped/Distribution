package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAuthenticationOptions extends StObject
/** Contains the options available to the asynchronous operation. */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
@js.native
object WebAuthenticationOptions extends StObject {
  
  /** No options are requested. */
  @js.native
  sealed trait none
    extends StObject
       with WebAuthenticationOptions
  
  /** Tells the web authentication broker to not render any UI. This option will throw an exception if used with AuthenticateAndContinue ; AuthenticateSilentlyAsync , which includes this option implicitly, should be used instead. */
  @js.native
  sealed trait silentMode
    extends StObject
       with WebAuthenticationOptions
  
  /** Tells the web authentication broker to render the webpage in an app container that supports privateNetworkClientServer, enterpriseAuthentication, and sharedUserCertificate capabilities. Note the application that uses this flag must have these capabilities as well. */
  @js.native
  sealed trait useCorporateNetwork
    extends StObject
       with WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the body of the HTTP POST in the ResponseData property. For use with single sign-on (SSO) only. */
  @js.native
  sealed trait useHttpPost
    extends StObject
       with WebAuthenticationOptions
  
  /** Tells the web authentication broker to return the window title string of the webpage in the ResponseData property. */
  @js.native
  sealed trait useTitle
    extends StObject
       with WebAuthenticationOptions
}
