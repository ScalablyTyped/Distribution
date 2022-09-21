package typings.vsoNodeApi.anon

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var value: js.Array[WorkItemTypeColor]
}
object Key {
  
  inline def apply(key: String, value: js.Array[WorkItemTypeColor]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[WorkItemTypeColor]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: WorkItemTypeColor*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
