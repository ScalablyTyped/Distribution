package typings.winrtDashUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtDashUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtDashUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delete account operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation")
@js.native
abstract class WebAccountProviderDeleteAccountOperation () extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to delete. */
  var webAccount: WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

