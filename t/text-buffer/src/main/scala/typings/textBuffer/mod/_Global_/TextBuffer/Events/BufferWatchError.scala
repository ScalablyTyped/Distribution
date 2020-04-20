package typings.textBuffer.mod._Global_.TextBuffer.Events

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferWatchError extends js.Object {
  /** The error object. */
  var error: Error
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): Unit
}

object BufferWatchError {
  @scala.inline
  def apply(error: Error, handle: () => Unit): BufferWatchError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], handle = js.Any.fromFunction0(handle))
    __obj.asInstanceOf[BufferWatchError]
  }
}

