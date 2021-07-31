package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a system event that triggers a background task to run. */
trait SystemTrigger extends StObject {
  
  /** Gets whether a system event trigger will be used only once. */
  var oneShot: Boolean
  
  /** Gets the system event type of a system event trigger. */
  var triggerType: SystemTriggerType
}
object SystemTrigger {
  
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): SystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTrigger]
  }
  
  @scala.inline
  implicit class SystemTriggerMutableBuilder[Self <: SystemTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: SystemTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
