package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemFieldUpdate extends StObject {
  
  /**
    * The new value of the field.
    */
  var newValue: Any
  
  /**
    * The old value of the field.
    */
  var oldValue: Any
}
object WorkItemFieldUpdate {
  
  inline def apply(newValue: Any, oldValue: Any): WorkItemFieldUpdate = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemFieldUpdate] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
