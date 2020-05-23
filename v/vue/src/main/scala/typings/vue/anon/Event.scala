package typings.vue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(event: String = null, prop: String = null): Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

