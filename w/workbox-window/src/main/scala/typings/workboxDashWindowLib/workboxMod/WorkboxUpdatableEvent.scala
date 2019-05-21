package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxUpdatableEvent extends WorkboxExtendableEvent {
  /**
    * True if a service worker was already
    * controlling when this `Workbox` instance called `register()`.
    */
  val isUpdate: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkboxUpdatableEvent {
  @scala.inline
  def apply(
    originalEvent: stdLib.Event,
    sw: stdLib.ServiceWorker,
    target: Workbox,
    `type`: java.lang.String,
    isUpdate: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkboxUpdatableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(isUpdate)) __obj.updateDynamic("isUpdate")(isUpdate)
    __obj.asInstanceOf[WorkboxUpdatableEvent]
  }
}

