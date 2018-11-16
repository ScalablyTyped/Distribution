package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a web provider token response. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse")
@js.native
class WebProviderTokenResponse protected () extends js.Object {
  /**
                           * Creates a new instance of the WebProviderTokenResponse class.
                           * @param webTokenResponse The web token response from the client.
                           */
  def this(webTokenResponse: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenResponse) = this()
  /** Gets the response from the provider to the client. */
  var clientResponse: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebTokenResponse = js.native
}

