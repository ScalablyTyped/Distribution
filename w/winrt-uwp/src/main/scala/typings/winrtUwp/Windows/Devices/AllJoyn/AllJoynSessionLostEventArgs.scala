package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies the reason for a lost session. */
@js.native
trait AllJoynSessionLostEventArgs extends js.Object {
  
  /** Retrieves a value that indicates the reason for a lost session. */
  var reason: AllJoynSessionLostReason = js.native
}
object AllJoynSessionLostEventArgs {
  
  @scala.inline
  def apply(reason: AllJoynSessionLostReason): AllJoynSessionLostEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionLostEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynSessionLostEventArgsOps[Self <: AllJoynSessionLostEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReason(value: AllJoynSessionLostReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
