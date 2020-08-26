package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileResult extends js.Object {
  var fd: Double = js.native
  var name: String = js.native
  def removeCallback(): Unit = js.native
}

object FileResult {
  @scala.inline
  def apply(fd: Double, name: String, removeCallback: () => Unit): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[FileResult]
  }
  @scala.inline
  implicit class FileResultOps[Self <: FileResult] (val x: Self) extends AnyVal {
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
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCallback(value: () => Unit): Self = this.set("removeCallback", js.Any.fromFunction0(value))
  }
  
}

