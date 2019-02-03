package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains core methods for obtaining tokens from web account providers. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager")
@js.native
abstract class WebAuthenticationCoreManager () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager")
@js.native
object WebAuthenticationCoreManager extends js.Object {
  /**
    * Finds a web account asynchronously.
    * @param provider The web account provider for the web account.
    * @param webAccountId The Id of the web account.
    * @return When this method completes successfully, it returns the found web account.
    */
  def findAccountAsync(
    provider: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider,
    webAccountId: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount] = js.native
  /**
    * Finds a web account provider asynchronously with one input.
    * @param webAccountProviderId The Id of the web account provider to find.
    * @return When this method completes successfully, it returns the found web account provider.
    */
  def findAccountProviderAsync(webAccountProviderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider] = js.native
  /**
    * Finds a web account provider asynchronously with two inputs.
    * @param webAccountProviderId The Id of the web account provider to find.
    * @param authority The authority of the web account provider to find.
    * @return When this method completes successfully, it returns the found web account provider.
    */
  def findAccountProviderAsync(webAccountProviderId: java.lang.String, authority: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider] = js.native
  /**
    * Finds a web account provider asynchronously with three inputs.
    * @param webAccountProviderId The Id of the web account provider to find.
    * @param authority The authority of the web account provider to find.
    * @param user The user associated with the web account provider to find.
    * @return When this method completes successfully, it returns the found web account provider.
    */
  def findAccountProviderAsync(
    webAccountProviderId: java.lang.String,
    authority: java.lang.String,
    user: winrtDashUwpLib.WindowsNs.SystemNs.User
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountProvider] = js.native
  /**
    * Attempts to get a token without showing any UI using one input. The user will never be prompted to enter their credentials.
    * @param request The web token request.
    * @return When this method completes successfully, it returns the result of the web token request.
    */
  def getTokenSilentlyAsync(request: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequest): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestResult
  ] = js.native
  /**
    * Attempts to get a token without showing any UI using two inputs. The user will never be prompted to enter their credentials.
    * @param request The web token request.
    * @param webAccount The web account.
    * @return When this method completes successfully, it returns the result of the web token request.
    */
  def getTokenSilentlyAsync(
    request: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequest,
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestResult
  ] = js.native
  /**
    * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
    * @param request The web token request.
    * @return When this method completes successfully, it returns the results of the web token request.
    */
  def requestTokenAsync(request: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequest): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestResult
  ] = js.native
  /**
    * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
    * @param request The web token request.
    * @param webAccount The web account for the request.
    * @return When this method completes successfully, it returns the results of the web token request.
    */
  def requestTokenAsync(
    request: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequest,
    webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenRequestResult
  ] = js.native
}

