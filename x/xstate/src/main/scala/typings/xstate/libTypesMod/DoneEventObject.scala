package typings.xstate.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneEventObject extends EventObject {
  var data: js.UndefOr[js.Any] = js.undefined
}

object DoneEventObject {
  @scala.inline
  def apply(toString: () => String, `type`: String, data: js.Any = null, id: String | Double = null): DoneEventObject = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneEventObject]
  }
}

