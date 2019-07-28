package typings.workboxDashWindow.workboxMod

import typings.std.Event
import typings.std.ServiceWorker
import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxExtendableEvent extends WorkboxEvent {
  /**
    * The service worker instance.
    */
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

