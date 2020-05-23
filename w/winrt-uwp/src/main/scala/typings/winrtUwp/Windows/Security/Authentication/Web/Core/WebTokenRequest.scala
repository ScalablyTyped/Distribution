package typings.winrtUwp.Windows.Security.Authentication.Web.Core

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request to an online identity provider for an authentication token. */
trait WebTokenRequest extends js.Object {
  var appProperties: js.Any
   /* unmapped type */ /** Gets the Id of the client making the request. */
  var clientId: String
  /** Gets the prompt type of the request. */
  var promptType: WebTokenRequestPromptType
  /** Gets the properties of the request. */
  var properties: IMap[String, String]
  /** Gets the scope of the request. */
  var scope: String
  /** Gets the web account provider for the request. */
  var webAccountProvider: WebAccountProvider
}

object WebTokenRequest {
  @scala.inline
  def apply(
    appProperties: js.Any,
    clientId: String,
    promptType: WebTokenRequestPromptType,
    properties: IMap[String, String],
    scope: String,
    webAccountProvider: WebAccountProvider
  ): WebTokenRequest = {
    val __obj = js.Dynamic.literal(appProperties = appProperties.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], promptType = promptType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTokenRequest]
  }
}

