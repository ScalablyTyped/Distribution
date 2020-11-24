package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.ErrorExecution
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
  implicit class ErrorExecutionEventOps[Self <: ErrorExecutionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ErrorExecution): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
