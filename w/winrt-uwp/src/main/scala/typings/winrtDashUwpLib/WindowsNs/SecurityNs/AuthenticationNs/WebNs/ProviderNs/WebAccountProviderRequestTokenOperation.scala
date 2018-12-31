package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request token operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation")
@js.native
abstract class WebAccountProviderRequestTokenOperation () extends js.Object {
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: stdLib.Date = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  /** Gets the web provider token responses. */
  var providerResponses: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[WebProviderTokenResponse] = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): scala.Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError): scala.Unit = js.native
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): scala.Unit = js.native
}

