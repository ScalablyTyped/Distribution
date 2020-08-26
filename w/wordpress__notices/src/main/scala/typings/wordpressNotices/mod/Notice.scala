package typings.wordpressNotices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notice extends js.Object {
  var actions: js.Array[Action] = js.native
  var content: String = js.native
  var id: String = js.native
  var isDismissible: Boolean = js.native
  var status: Status = js.native
}

object Notice {
  @scala.inline
  def apply(actions: js.Array[Action], content: String, id: String, isDismissible: Boolean, status: Status): Notice = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDismissible = isDismissible.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notice]
  }
  @scala.inline
  implicit class NoticeOps[Self <: Notice] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDismissible(value: Boolean): Self = this.set("isDismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

