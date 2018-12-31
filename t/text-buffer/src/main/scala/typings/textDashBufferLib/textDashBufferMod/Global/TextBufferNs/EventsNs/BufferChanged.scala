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

