package typings.yjs.anon

import typings.yjs.yjsStrings.add
import typings.yjs.yjsStrings.delete
import typings.yjs.yjsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: add | update | delete
  
  var newValue: Any
  
  var oldValue: Any
}
object Action {
  
  inline def apply(action: add | update | delete, newValue: Any, oldValue: Any): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: add | update | delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
