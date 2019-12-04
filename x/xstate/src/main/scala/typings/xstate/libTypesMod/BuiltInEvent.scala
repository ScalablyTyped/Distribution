package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.ErrorExecution
import typings.xstate.libTypesMod.ActionTypes.Init
import typings.xstate.libTypesMod.ActionTypes.NullEvent
import typings.xstate.libTypesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.xstate.Anon_TypeNullEvent
  - typings.xstate.Anon_TypeInit
  - typings.xstate.libTypesMod.RaisedEvent[TEvent]
  - typings.xstate.libTypesMod.ErrorExecutionEvent
*/
trait BuiltInEvent[TEvent /* <: EventObject */] extends js.Object

object BuiltInEvent {
  @scala.inline
  def Anon_TypeNullEvent[TEvent /* <: EventObject */](`type`: NullEvent): BuiltInEvent[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEvent[TEvent]]
  }
  @scala.inline
  def Anon_TypeInit[TEvent /* <: EventObject */](`type`: Init): BuiltInEvent[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEvent[TEvent]]
  }
  @scala.inline
  def RaisedEvent[TEvent /* <: EventObject */](event: TEvent, `type`: Raise): BuiltInEvent[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEvent[TEvent]]
  }
  @scala.inline
  def ErrorExecutionEvent[TEvent /* <: EventObject */](data: js.Any, src: String, `type`: ErrorExecution, id: String | Double = null): BuiltInEvent[TEvent] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltInEvent[TEvent]]
  }
}

