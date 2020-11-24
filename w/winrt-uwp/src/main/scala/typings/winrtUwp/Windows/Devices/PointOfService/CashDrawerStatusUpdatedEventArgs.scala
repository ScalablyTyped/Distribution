package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the StatusUpdated event. */
@js.native
trait CashDrawerStatusUpdatedEventArgs extends js.Object {
  
  /** Gets the data associated with the StatusUpdated event. */
  var status: CashDrawerStatus = js.native
}
object CashDrawerStatusUpdatedEventArgs {
  
  @scala.inline
  def apply(status: CashDrawerStatus): CashDrawerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatusUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class CashDrawerStatusUpdatedEventArgsOps[Self <: CashDrawerStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: CashDrawerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
