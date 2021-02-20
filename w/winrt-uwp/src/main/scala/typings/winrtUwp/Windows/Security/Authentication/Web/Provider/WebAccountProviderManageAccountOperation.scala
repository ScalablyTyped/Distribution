package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a manage account operation. */
@js.native
trait WebAccountProviderManageAccountOperation extends StObject {
  
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
  implicit class WebAccountProviderManageAccountOperationMutableBuilder[Self <: WebAccountProviderManageAccountOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
