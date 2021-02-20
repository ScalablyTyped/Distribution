package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a web account provider trigger. */
@js.native
trait WebAccountProviderTriggerDetails extends StObject {
  
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
}
object WebAccountProviderTriggerDetails {
  
  @scala.inline
  def apply(operation: IWebAccountProviderOperation): WebAccountProviderTriggerDetails = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderTriggerDetails]
  }
  
  @scala.inline
  implicit class WebAccountProviderTriggerDetailsMutableBuilder[Self <: WebAccountProviderTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: IWebAccountProviderOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
