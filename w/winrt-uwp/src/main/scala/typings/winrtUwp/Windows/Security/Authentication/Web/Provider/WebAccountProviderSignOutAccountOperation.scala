package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sign out account operation made by a web account provider. */
trait WebAccountProviderSignOutAccountOperation extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  /** Gets the client Id. */
  var clientId: String
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  /** Gets the web account to sign out. */
  var webAccount: WebAccount
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
}

object WebAccountProviderSignOutAccountOperation {
  @scala.inline
  def apply(
    applicationCallbackUri: Uri,
    clientId: String,
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    webAccount: WebAccount
  ): WebAccountProviderSignOutAccountOperation = {
    val __obj = js.Dynamic.literal(applicationCallbackUri = applicationCallbackUri.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderSignOutAccountOperation]
  }
}

