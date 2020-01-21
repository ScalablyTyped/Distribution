package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileWatcher extends js.Object {
  def close(): Unit
}

object FileWatcher {
  @scala.inline
  def apply(close: () => Unit): FileWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[FileWatcher]
  }
}

