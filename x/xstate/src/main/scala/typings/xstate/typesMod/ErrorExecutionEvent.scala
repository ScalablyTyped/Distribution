package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.ErrorExecution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorExecutionEvent extends EventObject {
  
  var data: js.Any = js.native
  
  var src: String = js.native
  
  @JSName("type")
  var type_ErrorExecutionEvent: ErrorExecution = js.native
}
object ErrorExecutionEvent {
  
  @scala.inline
  def apply(data: js.Any, src: String, `type`: ErrorExecution): ErrorExecutionEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorExecutionEvent]
  }
  
  @scala.inline
  implicit class ErrorExecutionEventMutableBuilder[Self <: ErrorExecutionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ErrorExecution): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
