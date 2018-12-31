package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a get token silently operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation")
@js.native
abstract class WebAccountProviderGetTokenSilentOperation () extends js.Object {
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
  /** Informs the activating app that user interaction is required to continue the operation. */
  def reportUserInteractionRequired(): scala.Unit = js.native
  /**
    * Informs the activating app that an error has occurred and user interaction is required to continue the operation.
    * @param value The error that has occurred.
    */
  def reportUserInteractionRequired(value: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError): scala.Unit = js.native
}

