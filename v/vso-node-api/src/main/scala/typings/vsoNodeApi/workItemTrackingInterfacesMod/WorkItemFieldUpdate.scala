package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemFieldUpdate extends StObject {
  
  /**
    * The new value of the field.
    */
  var newValue: js.Any
  
  /**
    * The old value of the field.
    */
  var oldValue: js.Any
}
object WorkItemFieldUpdate {
  
  inline def apply(newValue: js.Any, oldValue: js.Any): WorkItemFieldUpdate = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldUpdate]
  }
  
  extension [Self <: WorkItemFieldUpdate](x: Self) {
    
    inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
