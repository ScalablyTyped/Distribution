package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSaved extends js.Object {
  /** The path to which the buffer was saved. */
  var path: java.lang.String
}

object FileSaved {
  @scala.inline
  def apply(path: java.lang.String): FileSaved = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[FileSaved]
  }
}

