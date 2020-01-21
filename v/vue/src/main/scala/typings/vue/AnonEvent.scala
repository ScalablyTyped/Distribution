package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
}

object AnonEvent {
  @scala.inline
  def apply(event: String = null, prop: String = null): AnonEvent = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

