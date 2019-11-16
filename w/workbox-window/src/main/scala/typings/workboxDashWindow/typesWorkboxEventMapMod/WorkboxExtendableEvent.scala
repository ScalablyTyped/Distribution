package typings.workboxDashWindow.typesWorkboxEventMapMod

import typings.std.Event
import typings.std.ServiceWorker
import typings.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import typings.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxExtendableEvent extends WorkboxEvent {
  val sw: ServiceWorker
}

object WorkboxExtendableEvent {
  @scala.inline
  def apply(originalEvent: Event, sw: ServiceWorker, target: Workbox, `type`: String): WorkboxExtendableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxExtendableEvent]
  }
}

