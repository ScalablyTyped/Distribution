package typings.vsoNodeApi.anon

import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeColorAndIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var key: String
  
  var value: js.Array[WorkItemTypeColorAndIcon]
}
object Value {
  
  inline def apply(key: String, value: js.Array[WorkItemTypeColorAndIcon]): Value = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[WorkItemTypeColorAndIcon]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: WorkItemTypeColorAndIcon*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
