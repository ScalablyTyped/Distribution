package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events

import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Structures.TextChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStoppedChanging extends js.Object {
  var changes: js.Array[TextChange]
}

object BufferStoppedChanging {
  @scala.inline
  def apply(changes: js.Array[TextChange]): BufferStoppedChanging = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BufferStoppedChanging]
  }
}

