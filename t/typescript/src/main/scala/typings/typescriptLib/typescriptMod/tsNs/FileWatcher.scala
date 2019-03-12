package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileWatcher extends js.Object {
  def close(): scala.Unit
}

object FileWatcher {
  @scala.inline
  def apply(close: () => scala.Unit): FileWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[FileWatcher]
  }
}

