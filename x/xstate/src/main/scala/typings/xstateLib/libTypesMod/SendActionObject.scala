package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionObject[TContext, TEvent /* <: EventObject */] extends SendAction[TContext, TEvent] {
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  @JSName("event")
  var event_SendActionObject: TEvent
}

object SendActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: TEvent,
    id: java.lang.String | scala.Double,
    `type`: java.lang.String,
    delay: scala.Double | java.lang.String = null,
    exec: ActionFunction[TContext, TEvent] = null,
    to: java.lang.String = null
  ): SendActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[SendActionObject[TContext, TEvent]]
  }
}

