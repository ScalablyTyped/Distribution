package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecOnDashEventsMod.EventListener
import typings.vegaDashTypings.typesSpecOnDashEventsMod.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: Events | js.Array[EventListener]
  var force: js.UndefOr[Boolean] = js.undefined
}

object Anon_Events {
  @scala.inline
  def apply(events: Events | js.Array[EventListener], force: js.UndefOr[Boolean] = js.undefined): Anon_Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Events]
  }
}

