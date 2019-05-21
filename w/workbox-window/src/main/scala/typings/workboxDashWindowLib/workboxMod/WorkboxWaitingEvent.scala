package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxWaitingEvent extends WorkboxUpdatableEvent {
  /**
    * True if a service worker with
    * a matching `scriptURL` was already waiting when this `Workbox`
    * instance called `register()`.
    */
  val wasWaitingBeforeRegister: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkboxWaitingEvent {
  @scala.inline
  def apply(
    originalEvent: stdLib.Event,
    sw: stdLib.ServiceWorker,
    target: Workbox,
    `type`: java.lang.String,
    isUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    wasWaitingBeforeRegister: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkboxWaitingEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(isUpdate)) __obj.updateDynamic("isUpdate")(isUpdate)
    if (!js.isUndefined(wasWaitingBeforeRegister)) __obj.updateDynamic("wasWaitingBeforeRegister")(wasWaitingBeforeRegister)
    __obj.asInstanceOf[WorkboxWaitingEvent]
  }
}

