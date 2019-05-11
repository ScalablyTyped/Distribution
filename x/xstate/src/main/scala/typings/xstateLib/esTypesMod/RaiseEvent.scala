package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaiseEvent[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var event: Event[TEvent]
}

object RaiseEvent {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent], `type`: java.lang.String, exec: ActionFunction[TContext, TEvent] = null): RaiseEvent[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[RaiseEvent[TContext, TEvent]]
  }
}

