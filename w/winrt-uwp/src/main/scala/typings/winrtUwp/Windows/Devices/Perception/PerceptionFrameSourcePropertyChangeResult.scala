package typings.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempted property change on a frame source. */
trait PerceptionFrameSourcePropertyChangeResult extends StObject {
  
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  var newValue: js.Any
  
  /** Gets the value of the property after the change request has been processed. */
  var status: PerceptionFrameSourcePropertyChangeStatus
}
object PerceptionFrameSourcePropertyChangeResult {
  
  inline def apply(newValue: js.Any, status: PerceptionFrameSourcePropertyChangeStatus): PerceptionFrameSourcePropertyChangeResult = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertyChangeResult]
  }
  
  extension [Self <: PerceptionFrameSourcePropertyChangeResult](x: Self) {
    
    inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PerceptionFrameSourcePropertyChangeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
