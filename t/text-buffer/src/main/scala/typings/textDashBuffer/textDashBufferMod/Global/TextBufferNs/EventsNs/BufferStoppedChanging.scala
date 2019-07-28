package typings.textDashBuffer.textDashBufferMod.Global.TextBufferNs.EventsNs

import typings.textDashBuffer.textDashBufferMod.Global.TextBufferNs.StructuresNs.TextChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStoppedChanging extends js.Object {
  var changes: js.Array[TextChange]
}

object BufferStoppedChanging {
  @scala.inline
  def apply(changes: js.Array[TextChange]): BufferStoppedChanging = {
    val __obj = js.Dynamic.literal(changes = changes)
  
    __obj.asInstanceOf[BufferStoppedChanging]
  }
}

