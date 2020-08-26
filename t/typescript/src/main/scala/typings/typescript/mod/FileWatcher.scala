package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileWatcher extends js.Object {
  def close(): Unit = js.native
}

object FileWatcher {
  @scala.inline
  def apply(close: () => Unit): FileWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[FileWatcher]
  }
  @scala.inline
  implicit class FileWatcherOps[Self <: FileWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
  }
  
}

