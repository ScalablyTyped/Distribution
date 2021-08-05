package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a manage account operation. */
trait WebAccountProviderManageAccountOperation extends StObject {
  
  /** Gets the kind of web provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating application that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /** Gets the web account to manage. */
  var webAccount: WebAccount
}
object WebAccountProviderManageAccountOperation {
  
  inline def apply(kind: WebAccountProviderOperationKind, reportCompleted: () => Unit, webAccount: WebAccount): WebAccountProviderManageAccountOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], reportCompleted = js.Any.fromFunction0(reportCompleted), webAccount = webAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderManageAccountOperation]
  }
  
  extension [Self <: WebAccountProviderManageAccountOperation](x: Self) {
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
    
    inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
