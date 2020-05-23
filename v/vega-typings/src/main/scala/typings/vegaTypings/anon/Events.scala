package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]
  var force: js.UndefOr[Boolean] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener],
    force: js.UndefOr[Boolean] = js.undefined
  ): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
}

