package typings.workboxWindow.workboxEventMapMod

import typings.std.Event_
import typings.std.ServiceWorker
import typings.workboxWindow.workboxMod.Workbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxWaitingEvent extends WorkboxUpdatableEvent {
  val wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
}

object WorkboxWaitingEvent {
  @scala.inline
  def apply(
    originalEvent: Event_,
    sw: ServiceWorker,
    target: Workbox,
    `type`: String,
    isUpdate: js.UndefOr[Boolean] = js.undefined,
    wasWaitingBeforeRegister: js.UndefOr[Boolean] = js.undefined
  ): WorkboxWaitingEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdate)) __obj.updateDynamic("isUpdate")(isUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(wasWaitingBeforeRegister)) __obj.updateDynamic("wasWaitingBeforeRegister")(wasWaitingBeforeRegister.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkboxWaitingEvent]
  }
}

