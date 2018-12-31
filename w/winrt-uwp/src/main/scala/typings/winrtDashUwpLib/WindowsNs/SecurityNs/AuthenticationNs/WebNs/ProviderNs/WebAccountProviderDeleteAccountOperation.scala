package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

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
  var webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): scala.Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs.WebProviderError): scala.Unit = js.native
}

