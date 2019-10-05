package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaiseEvent[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var event: Event[TEvent]
}

object RaiseEvent {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: Event[TEvent],
    `type`: String,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): RaiseEvent[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[RaiseEvent[TContext, TEvent]]
  }
}

