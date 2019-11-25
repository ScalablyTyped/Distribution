package typings.xstate.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneInvokeEvent[TData] extends EventObject {
  var data: TData
}

object DoneInvokeEvent {
  @scala.inline
  def apply[TData](data: TData, `type`: String, id: String | Double = null): DoneInvokeEvent[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneInvokeEvent[TData]]
  }
}

