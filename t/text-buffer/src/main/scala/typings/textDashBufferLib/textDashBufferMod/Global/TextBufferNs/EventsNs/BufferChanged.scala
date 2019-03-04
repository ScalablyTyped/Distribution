package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChanged extends js.Object {
  /** Range of the new text. */
  var newRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
  /** String containing the text that was inserted. */
  var newText: java.lang.String
  /** Range of the old text. */
  var oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
  /** String containing the text that was replaced. */
  var oldText: java.lang.String
}

object BufferChanged {
  @scala.inline
  def apply(
    newRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range,
    newText: java.lang.String,
    oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range,
    oldText: java.lang.String
  ): BufferChanged = {
    val __obj = js.Dynamic.literal(newRange = newRange, newText = newText, oldRange = oldRange, oldText = oldText)
  
    __obj.asInstanceOf[BufferChanged]
  }
}

