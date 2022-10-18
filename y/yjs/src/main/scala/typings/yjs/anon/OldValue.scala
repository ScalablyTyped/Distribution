package typings.yjs.anon

import typings.yjs.yjsStrings.add
import typings.yjs.yjsStrings.delete
import typings.yjs.yjsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  var action: add | update | delete
  
  var oldValue: Any
}
object OldValue {
  
  inline def apply(action: add | update | delete, oldValue: Any): OldValue = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
  
  extension [Self <: OldValue](x: Self) {
    
    inline def setAction(value: add | update | delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
