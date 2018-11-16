package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a manage account operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation")
@js.native
abstract class WebAccountProviderManageAccountOperation () extends js.Object {
  /** Gets the kind of web provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web account to manage. */
  var webAccount: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccount = js.native
  /** Informs the activating application that the operation completed successfully. */
  def reportCompleted(): scala.Unit = js.native
}

