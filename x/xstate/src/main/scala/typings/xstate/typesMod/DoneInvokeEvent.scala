package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneInvokeEvent[TData] extends EventObject {
  var data: TData
}

object DoneInvokeEvent {
  @scala.inline
  def apply[TData](data: TData, `type`: String): DoneInvokeEvent[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneInvokeEvent[TData]]
  }
}

