package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempted property change on a frame source. */
@js.native
trait PerceptionFrameSourcePropertyChangeResult extends js.Object {
  
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  var newValue: js.Any = js.native
  
  /** Gets the value of the property after the change request has been processed. */
  var status: PerceptionFrameSourcePropertyChangeStatus = js.native
}
object PerceptionFrameSourcePropertyChangeResult {
  
  @scala.inline
  def apply(newValue: js.Any, status: PerceptionFrameSourcePropertyChangeStatus): PerceptionFrameSourcePropertyChangeResult = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertyChangeResult]
  }
  
  @scala.inline
  implicit class PerceptionFrameSourcePropertyChangeResultOps[Self <: PerceptionFrameSourcePropertyChangeResult] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PerceptionFrameSourcePropertyChangeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
