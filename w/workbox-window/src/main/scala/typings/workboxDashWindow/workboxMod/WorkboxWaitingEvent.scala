package typings.workboxDashWindow.workboxMod

import typings.std.Event
import typings.std.ServiceWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxWaitingEvent extends WorkboxUpdatableEvent {
  /**
    * True if a service worker with
    * a matching `scriptURL` was already waiting when this `Workbox`
    * instance called `register()`.
    */
  val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
}

object WorkboxWaitingEvent {
  @scala.inline
  def apply(
    originalEvent: Event,
    sw: ServiceWorker,
    target: Workbox,
    `type`: String,
    isUpdate: js.UndefOr[Boolean] = js.undefined,
    wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
  ): WorkboxWaitingEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(isUpdate)) __obj.updateDynamic("isUpdate")(isUpdate)
    if (!js.isUndefined(wasWaitingBeforeRegister)) __obj.updateDynamic("wasWaitingBeforeRegister")(wasWaitingBeforeRegister)
    __obj.asInstanceOf[WorkboxWaitingEvent]
  }
}

