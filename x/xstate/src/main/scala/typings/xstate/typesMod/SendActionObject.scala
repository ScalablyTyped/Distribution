package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionObject[TContext, TEvent /* <: EventObject */] extends SendAction[TContext, TEvent] {
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.undefined
  @JSName("event")
  var event_SendActionObject: TEvent
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (Actor[_, AnyEventObject])] = js.undefined
}

object SendActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    event: TEvent,
    id: String | Double,
    `type`: String,
    delay: Int | Double = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null,
    to: String | Double | (Actor[_, AnyEventObject]) = null
  ): SendActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent]]
  }
}

