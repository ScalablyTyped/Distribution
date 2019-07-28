package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the response from a web account provider to a web token request. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenResponse")
@js.native
/** Initializes a new instance of the WebTokenResponse class. */
class WebTokenResponse () extends js.Object {
  /**
    * Initializes a new instance of the WebTokenResponse class with one input.
    * @param token The token.
    */
  def this(token: String) = this()
  /**
    * Initializes a new instance of the WebTokenResponse class with two inputs.
    * @param token The token.
    * @param webAccount The WebAccount .
    */
  def this(token: String, webAccount: WebAccount) = this()
  /**
    * Initializes a new instance of the WebTokenResponse class with three inputs.
    * @param token The token.
    * @param webAccount The WebAccount .
    * @param error The web provider error.
    */
  def this(token: String, webAccount: WebAccount, error: WebProviderError) = this()
  /** Gets the properties of the response */
  var properties: IMap[String, String] = js.native
  /** Gets the error returned by the provider, if any. */
  var providerError: WebProviderError = js.native
  /** Gets the authentication token. */
  var token: String = js.native
  /** Gets the web account for the request. */
  var webAccount: WebAccount = js.native
}

