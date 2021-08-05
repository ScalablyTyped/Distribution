package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sign out account operation made by a web account provider. */
trait WebAccountProviderSignOutAccountOperation extends StObject {
  
  /** Gets the app callback Uri. */
  var applicationCallbackUri: Uri
  
  /** Gets the client Id. */
  var clientId: String
  
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind
  
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit
  
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit
  
  /** Gets the web account to sign out. */
  var webAccount: WebAccount
}
object WebAccountProviderSignOutAccountOperation {
  
  inline def apply(
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
  
  extension [Self <: WebAccountProviderSignOutAccountOperation](x: Self) {
    
    inline def setApplicationCallbackUri(value: Uri): Self = StObject.set(x, "applicationCallbackUri", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
    
    inline def setReportError(value: WebProviderError => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
    
    inline def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
  }
}
