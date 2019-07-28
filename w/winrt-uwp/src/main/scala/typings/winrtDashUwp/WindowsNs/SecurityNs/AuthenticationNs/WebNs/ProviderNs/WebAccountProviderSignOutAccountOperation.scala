package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError
import typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sign out account operation made by a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation")
@js.native
abstract class WebAccountProviderSignOutAccountOperation () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  /** Gets the client Id. */
  var clientId: String = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to sign out. */
  var webAccount: WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
}

