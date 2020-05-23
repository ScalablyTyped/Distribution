package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a manage account operation. */
trait WebAccountProviderManageAccountOperation extends js.Object {
  /** Gets the kind of web provider operation. */
  var kind: WebAccountProviderOperationKind
  /** Gets the web account to manage. */
  var webAccount: WebAccount
  /** Informs the activating application that the operation completed successfully. */
  def reportCompleted(): Unit
}

object WebAccountProviderManageAccountOperation {
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind, reportCompleted: () => Unit, webAccount: WebAccount): WebAccountProviderManageAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderManageAccountOperation]
  }
}

