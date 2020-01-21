package typings.textBuffer.mod._Global_.TextBuffer.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSaved extends js.Object {
  /** The path to which the buffer was saved. */
  var path: String
}

object FileSaved {
  @scala.inline
  def apply(path: String): FileSaved = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSaved]
  }
}

