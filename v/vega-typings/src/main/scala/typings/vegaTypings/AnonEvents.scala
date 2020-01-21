package typings.vegaTypings

import typings.vegaTypings.onEventsMod.EventListener
import typings.vegaTypings.onEventsMod.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: Events | js.Array[EventListener]
  var force: js.UndefOr[Boolean] = js.undefined
}

object AnonEvents {
  @scala.inline
  def apply(events: Events | js.Array[EventListener], force: js.UndefOr[Boolean] = js.undefined): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvents]
  }
}

