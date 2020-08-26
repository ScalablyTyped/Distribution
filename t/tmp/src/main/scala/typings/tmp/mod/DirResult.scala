package typings.tmp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirResult extends js.Object {
  var name: String = js.native
  def removeCallback(): Unit = js.native
}

object DirResult {
  @scala.inline
  def apply(name: String, removeCallback: () => Unit): DirResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], removeCallback = js.Any.fromFunction0(removeCallback))
    __obj.asInstanceOf[DirResult]
  }
  @scala.inline
  implicit class DirResultOps[Self <: DirResult] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveCallback(value: () => Unit): Self = this.set("removeCallback", js.Any.fromFunction0(value))
  }
  
}

