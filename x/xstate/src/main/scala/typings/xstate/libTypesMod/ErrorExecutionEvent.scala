package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.ErrorExecution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorExecutionEvent extends EventObject {
  var data: js.Any
  var src: String
  @JSName("type")
  var type_ErrorExecutionEvent: ErrorExecution
}

object ErrorExecutionEvent {
  @scala.inline
  def apply(data: js.Any, src: String, `type`: ErrorExecution): ErrorExecutionEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorExecutionEvent]
  }
}

