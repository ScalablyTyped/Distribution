package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPlatformEvent extends EventObject {
  var data: js.Any
}

object ErrorPlatformEvent {
  @scala.inline
  def apply(data: js.Any, `type`: String, id: String | Double = null): ErrorPlatformEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlatformEvent]
  }
}

