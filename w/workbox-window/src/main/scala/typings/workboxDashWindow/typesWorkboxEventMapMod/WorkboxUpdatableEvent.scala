package typings.workboxDashWindow.typesWorkboxEventMapMod

import typings.std.Event
import typings.std.ServiceWorker
import typings.workboxDashWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxUpdatableEvent extends WorkboxExtendableEvent {
  val isUpdate: js.UndefOr[Boolean] = js.undefined
}

object WorkboxUpdatableEvent {
  @scala.inline
  def apply(
    originalEvent: Event,
    sw: ServiceWorker,
    target: Workbox,
    `type`: String,
    isUpdate: js.UndefOr[Boolean] = js.undefined
  ): WorkboxUpdatableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(isUpdate)) __obj.updateDynamic("isUpdate")(isUpdate)
    __obj.asInstanceOf[WorkboxUpdatableEvent]
  }
}

