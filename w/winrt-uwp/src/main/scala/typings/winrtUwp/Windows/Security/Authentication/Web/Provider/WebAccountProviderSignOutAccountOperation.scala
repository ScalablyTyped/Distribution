package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sign out account operation made by a web account provider. */
@js.native
trait WebAccountProviderSignOutAccountOperation extends js.Object {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri = js.native
  
  /** Gets the client Id. */
  var clientId: String = js.native
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  
  /** Gets the web account to sign out. */
  var webAccount: WebAccount = js.native
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
  
  @scala.inline
  implicit class WebAccountProviderSignOutAccountOperationOps[Self <: WebAccountProviderSignOutAccountOperation] (val x: Self) extends AnyVal {
    
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
    def setApplicationCallbackUri(value: Uri): Self = this.set("applicationCallbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
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
