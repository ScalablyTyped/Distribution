package typings.winrtUwp.Windows.Security.Authentication.Web.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a web account provider trigger. */
@js.native
trait WebAccountProviderTriggerDetails extends js.Object {
  
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
  implicit class WebAccountProviderTriggerDetailsOps[Self <: WebAccountProviderTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: IWebAccountProviderOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
}
