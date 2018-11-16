package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the response from a web account provider to a web token request. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenResponse")
@js.native
class WebTokenResponse () extends js.Object {
  /**
                           * Initializes a new instance of the WebTokenResponse class with one input.
                           * @param token The token.
                           */
  def this(token: java.lang.String) = this()
  /**
                           * Initializes a new instance of the WebTokenResponse class with two inputs.
                           * @param token The token.
                           * @param webAccount The WebAccount .
                           */
  def this(token: java.lang.String, webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount) = this()
  /**
                           * Initializes a new instance of the WebTokenResponse class with three inputs.
                           * @param token The token.
                           * @param webAccount The WebAccount .
                           * @param error The web provider error.
                           */
  def this(token: java.lang.String, webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount, error: WebProviderError) = this()
  /** Gets the properties of the response */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
  /** Gets the error returned by the provider, if any. */
  var providerError: WebProviderError = js.native
  /** Gets the authentication token. */
  var token: java.lang.String = js.native
  /** Gets the web account for the request. */
  var webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount = js.native
}

