package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferWatchError extends js.Object {
  /** The error object. */
  var error: nodeLib.Error
  /**
    *  Call this function to indicate you have handled the error.
    *  The error will not be thrown if this function is called.
    */
  def handle(): scala.Unit
}

object BufferWatchError {
  @scala.inline
  def apply(error: nodeLib.Error, handle: js.Function0[scala.Unit]): BufferWatchError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("handle")(handle)
    __obj.asInstanceOf[BufferWatchError]
  }
}

