package typings.xstate.esTypesMod

import typings.xstate.esTypesMod.ActionTypes.ErrorExecution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorExecutionEvent
  extends EventObject
     with BuiltInEvent[js.Any] {
  var data: js.Any
  var src: String
  @JSName("type")
  var type_ErrorExecutionEvent: ErrorExecution
}

object ErrorExecutionEvent {
  @scala.inline
  def apply(data: js.Any, src: String, `type`: ErrorExecution, id: String | Double = null): ErrorExecutionEvent = {
    val __obj = js.Dynamic.literal(data = data, src = src)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorExecutionEvent]
  }
}

