package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxExtendableEvent
  extends workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent {
  /**
    * The service worker instance.
    */
  val sw: stdLib.ServiceWorker
}

object WorkboxExtendableEvent {
  @scala.inline
  def apply(originalEvent: stdLib.Event, sw: stdLib.ServiceWorker, target: Workbox, `type`: java.lang.String): WorkboxExtendableEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, sw = sw, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxExtendableEvent]
  }
}

