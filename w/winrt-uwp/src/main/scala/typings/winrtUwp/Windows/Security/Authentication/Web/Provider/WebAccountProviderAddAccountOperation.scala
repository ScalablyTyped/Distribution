package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an add account operation. */
trait WebAccountProviderAddAccountOperation extends StObject {
  
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
  
  @scala.inline
  implicit class WebAccountProviderAddAccountOperationMutableBuilder[Self <: WebAccountProviderAddAccountOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: WebAccountProviderOperationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
  }
}
