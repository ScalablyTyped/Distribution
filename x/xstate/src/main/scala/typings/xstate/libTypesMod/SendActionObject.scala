package typings.xstate.libTypesMod

import typings.xstate.libActorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionObject[TContext, TEvent /* <: EventObject */] extends SendAction[TContext, TEvent] {
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double | String] = js.undefined
  @JSName("event")
  var event_SendActionObject: TEvent
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (Actor[_, EventObject])] = js.undefined
}

object SendActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: TEvent,
    id: String | Double,
    `type`: String,
    delay: Double | String = null,
    exec: ActionFunction[TContext, TEvent] = null,
    to: String | Double | (Actor[_, EventObject]) = null
  ): SendActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionObject[TContext, TEvent]]
  }
}

