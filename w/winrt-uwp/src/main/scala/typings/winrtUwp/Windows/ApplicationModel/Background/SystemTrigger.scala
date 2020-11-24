package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a system event that triggers a background task to run. */
@js.native
trait SystemTrigger extends js.Object {
  
  /** Gets whether a system event trigger will be used only once. */
  var oneShot: Boolean = js.native
  
  /** Gets the system event type of a system event trigger. */
  var triggerType: SystemTriggerType = js.native
}
object SystemTrigger {
  
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): SystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTrigger]
  }
  
  @scala.inline
  implicit class SystemTriggerOps[Self <: SystemTrigger] (val x: Self) extends AnyVal {
    
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
    def setOneShot(value: Boolean): Self = this.set("oneShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: SystemTriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
}
