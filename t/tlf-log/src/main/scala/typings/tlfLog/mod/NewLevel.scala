package typings.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewLevel extends js.Object {
  var afterLog: js.UndefOr[js.Function0[Unit]] = js.native
}

object NewLevel {
  @scala.inline
  def apply(): NewLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLevel]
  }
  @scala.inline
  implicit class NewLevelOps[Self <: NewLevel] (val x: Self) extends AnyVal {
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
    def setAfterLog(value: () => Unit): Self = this.set("afterLog", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterLog: Self = this.set("afterLog", js.undefined)
  }
  
}

