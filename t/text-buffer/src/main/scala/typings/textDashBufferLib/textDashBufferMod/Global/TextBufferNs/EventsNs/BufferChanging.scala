package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChanging extends js.Object {
  /** Range of the old text. */
  var oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
}

object BufferChanging {
  @scala.inline
  def apply(oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range): BufferChanging = {
    val __obj = js.Dynamic.literal(oldRange = oldRange)
  
    __obj.asInstanceOf[BufferChanging]
  }
}

