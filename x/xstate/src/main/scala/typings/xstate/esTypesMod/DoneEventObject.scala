package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneEventObject extends EventObject {
  var data: js.UndefOr[js.Any] = js.undefined
}

object DoneEventObject {
  @scala.inline
  def apply(`type`: String, data: js.Any = null, id: String | Double = null): DoneEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneEventObject]
  }
}

