package typings.textBuffer.mod.global.TextBuffer.Events

import typings.textBuffer.mod.global.TextBuffer.Range
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
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChanging]
  }
}

