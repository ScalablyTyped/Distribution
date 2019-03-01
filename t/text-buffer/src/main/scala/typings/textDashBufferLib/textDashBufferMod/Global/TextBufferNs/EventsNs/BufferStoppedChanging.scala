package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStoppedChanging extends js.Object {
  var changes: js.Array[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.TextChange]
}

object BufferStoppedChanging {
  @scala.inline
  def apply(changes: js.Array[textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.TextChange]): BufferStoppedChanging = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.asInstanceOf[BufferStoppedChanging]
  }
}

