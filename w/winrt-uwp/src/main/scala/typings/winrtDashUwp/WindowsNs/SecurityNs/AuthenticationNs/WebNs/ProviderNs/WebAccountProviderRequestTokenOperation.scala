package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request token operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation")
@js.native
abstract class WebAccountProviderRequestTokenOperation () extends js.Object {
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: Date = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse] = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): Unit = js.native
}

