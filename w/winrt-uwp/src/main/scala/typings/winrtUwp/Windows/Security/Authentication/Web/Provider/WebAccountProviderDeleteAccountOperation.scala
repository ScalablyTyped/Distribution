package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a delete account operation. */
@js.native
trait WebAccountProviderDeleteAccountOperation extends js.Object {
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

object WebAccountProviderDeleteAccountOperation {
  @scala.inline
  def apply(
    kind: WebAccountProviderOperationKind,
    reportCompleted: () => Unit,
    reportError: WebProviderError => Unit,
    webAccount: WebAccount
  ): WebAccountProviderDeleteAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderDeleteAccountOperation]
  }
  @scala.inline
  implicit class WebAccountProviderDeleteAccountOperationOps[Self <: WebAccountProviderDeleteAccountOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = this.set("reportCompleted", js.Any.fromFunction0(value))
    @scala.inline
    def setReportError(value: WebProviderError => Unit): Self = this.set("reportError", js.Any.fromFunction1(value))
    @scala.inline
    def setWebAccount(value: WebAccount): Self = this.set("webAccount", value.asInstanceOf[js.Any])
  }
  
}

