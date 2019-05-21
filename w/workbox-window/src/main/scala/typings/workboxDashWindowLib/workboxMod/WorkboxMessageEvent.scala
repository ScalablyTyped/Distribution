package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxMessageEvent
  extends workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent {
  /**
    * The `data` property from the original `message` event.
    */
  val data: js.Any
}

object WorkboxMessageEvent {
  @scala.inline
  def apply(data: js.Any, originalEvent: stdLib.Event, target: Workbox, `type`: java.lang.String): WorkboxMessageEvent = {
    val __obj = js.Dynamic.literal(data = data, originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkboxMessageEvent]
  }
}

