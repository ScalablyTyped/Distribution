package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a web account provider trigger. */
trait WebAccountProviderTriggerDetails extends StObject {
  
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation
}
object WebAccountProviderTriggerDetails {
  
  inline def apply(operation: IWebAccountProviderOperation): WebAccountProviderTriggerDetails = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderTriggerDetails]
  }
  
  extension [Self <: WebAccountProviderTriggerDetails](x: Self) {
    
    inline def setOperation(value: IWebAccountProviderOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
