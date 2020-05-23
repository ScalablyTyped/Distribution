package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web provider token response. */
trait WebProviderTokenResponse extends js.Object {
  /** Gets the response from the provider to the client. */
  var clientResponse: WebTokenResponse
}

object WebProviderTokenResponse {
  @scala.inline
  def apply(clientResponse: WebTokenResponse): WebProviderTokenResponse = {
    val __obj = js.Dynamic.literal(clientResponse = clientResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebProviderTokenResponse]
  }
}

