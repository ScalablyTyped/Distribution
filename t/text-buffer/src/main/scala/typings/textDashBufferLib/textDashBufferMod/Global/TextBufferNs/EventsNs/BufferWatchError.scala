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

