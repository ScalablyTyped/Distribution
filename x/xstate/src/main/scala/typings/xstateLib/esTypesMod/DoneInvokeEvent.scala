package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneInvokeEvent[TData] extends EventObject {
  var data: TData
}

object DoneInvokeEvent {
  @scala.inline
  def apply[TData](data: TData, `type`: java.lang.String, id: java.lang.String | scala.Double = null): DoneInvokeEvent[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneInvokeEvent[TData]]
  }
}

