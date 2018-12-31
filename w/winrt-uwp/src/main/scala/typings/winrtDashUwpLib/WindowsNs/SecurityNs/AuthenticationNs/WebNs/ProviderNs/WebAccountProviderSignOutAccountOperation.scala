package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sign out account operation made by a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation")
@js.native
abstract class WebAccountProviderSignOutAccountOperation () extends js.Object {
  /** Gets the app callback Uri. */
  var applicationCallbackUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the client Id. */
  var clientId: java.lang.String = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to sign out. */
  var webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): scala.Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError): scala.Unit = js.native
}

