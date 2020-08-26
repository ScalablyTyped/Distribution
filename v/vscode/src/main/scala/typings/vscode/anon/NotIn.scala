package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotIn extends js.Object {
  var close: String = js.native
  var notIn: js.UndefOr[js.Array[String]] = js.native
  var open: String = js.native
}

object NotIn {
  @scala.inline
  def apply(close: String, open: String): NotIn = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotIn]
  }
  @scala.inline
  implicit class NotInOps[Self <: NotIn] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotInVarargs(value: String*): Self = this.set("notIn", js.Array(value :_*))
    @scala.inline
    def setNotIn(value: js.Array[String]): Self = this.set("notIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotIn: Self = this.set("notIn", js.undefined)
  }
  
}

