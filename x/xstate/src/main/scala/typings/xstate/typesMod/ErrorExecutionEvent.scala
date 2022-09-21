package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.ErrorExecution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorExecutionEvent
  extends StObject
     with EventObject {
  
  var data: Any
  
  var src: String
  
  @JSName("type")
  var type_ErrorExecutionEvent: ErrorExecution
}
object ErrorExecutionEvent {
  
  inline def apply(data: Any, src: String, `type`: ErrorExecution): ErrorExecutionEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorExecutionEvent]
  }
  
  extension [Self <: ErrorExecutionEvent](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: ErrorExecution): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
