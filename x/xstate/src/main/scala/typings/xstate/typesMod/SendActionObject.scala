package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionObject[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */] extends SendAction[TContext, TEvent, TSentEvent] {
  var _event: typings.xstate.typesMod.SCXML.Event[TSentEvent]
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.undefined
  @JSName("event")
  var event_SendActionObject: TSentEvent
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (Actor[_, AnyEventObject])] = js.undefined
}

object SendActionObject {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent, /* <: typings.xstate.typesMod.EventObject */ TSentEvent](
    _event: typings.xstate.typesMod.SCXML.Event[TSentEvent],
    event: TSentEvent,
    id: String | Double,
    `type`: String,
    delay: js.UndefOr[Double] = js.undefined,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null,
    to: String | Double | (Actor[_, AnyEventObject]) = null
  ): SendActionObject[TContext, TEvent, TSentEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent, TSentEvent]]
  }
}

