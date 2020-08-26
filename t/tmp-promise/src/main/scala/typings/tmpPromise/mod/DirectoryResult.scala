package typings.tmpPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryResult extends js.Object {
  var path: String = js.native
  def cleanup(): Unit = js.native
}

object DirectoryResult {
  @scala.inline
  def apply(cleanup: () => Unit, path: String): DirectoryResult = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryResult]
  }
  @scala.inline
  implicit class DirectoryResultOps[Self <: DirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCleanup(value: () => Unit): Self = this.set("cleanup", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

