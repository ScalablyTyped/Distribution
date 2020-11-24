package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a manage account operation. */
@js.native
trait WebAccountProviderManageAccountOperation extends js.Object {
  
  /** Gets the kind of web provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  
  /** Informs the activating application that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  
  /** Gets the web account to manage. */
  var webAccount: WebAccount = js.native
}
object WebAccountProviderManageAccountOperation {
  
  @scala.inline
  def apply(kind: WebAccountProviderOperationKind, reportCompleted: () => Unit, webAccount: WebAccount): WebAccountProviderManageAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderManageAccountOperation]
  }
  
  @scala.inline
  implicit class WebAccountProviderManageAccountOperationOps[Self <: WebAccountProviderManageAccountOperation] (val x: Self) extends AnyVal {
    
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
    def setWebAccount(value: WebAccount): Self = this.set("webAccount", value.asInstanceOf[js.Any])
  }
}
