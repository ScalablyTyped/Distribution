package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an add account operation. */
trait WebAccountProviderAddAccountOperation extends js.Object {
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
}

object WebAccountProviderAddAccountOperation {
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind, reportCompleted: () => Unit): WebAccountProviderAddAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted))
    __obj.asInstanceOf[WebAccountProviderAddAccountOperation]
  }
}

