package typings.textDashBuffer.textDashBufferMod.Global.TextBufferNs.EventsNs

import typings.textDashBuffer.textDashBufferMod.Global.TextBufferNs.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChanged extends js.Object {
  /** Range of the new text. */
  var newRange: Range
  /** String containing the text that was inserted. */
  var newText: String
  /** Range of the old text. */
  var oldRange: Range
  /** String containing the text that was replaced. */
  var oldText: String
}

object BufferChanged {
  @scala.inline
  def apply(newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChanged = {
    val __obj = js.Dynamic.literal(newRange = newRange, newText = newText, oldRange = oldRange, oldText = oldText)
  
    __obj.asInstanceOf[BufferChanged]
  }
}

