package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the response from a web account provider to a web token request. */
trait WebTokenResponse extends js.Object {
  /** Gets the properties of the response */
  var properties: IMap[String, String]
  /** Gets the error returned by the provider, if any. */
  var providerError: WebProviderError
  /** Gets the authentication token. */
  var token: String
  /** Gets the web account for the request. */
  var webAccount: WebAccount
}

object WebTokenResponse {
  @scala.inline
  def apply(
    properties: IMap[String, String],
    providerError: WebProviderError,
    token: String,
    webAccount: WebAccount
  ): WebTokenResponse = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], providerError = providerError.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenResponse]
  }
}

