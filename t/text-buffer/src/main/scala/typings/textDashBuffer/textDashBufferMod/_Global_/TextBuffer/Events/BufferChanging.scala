package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events

import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferChanging extends js.Object {
  /** Range of the old text. */
  var oldRange: Range
}

object BufferChanging {
  @scala.inline
  def apply(oldRange: Range): BufferChanging = {
    val __obj = js.Dynamic.literal(oldRange = oldRange)
  
    __obj.asInstanceOf[BufferChanging]
  }
}

