package typings.wordpressComponents.listMod.NoticeList

import typings.react.mod.ReactNode
import typings.wordpressComponents.noticeMod.Notice.Action
import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@wordpress/components.@wordpress/components/notice.default.Props, 'children' | 'onRemove'> */
@js.native
trait Notice extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.native
  var className: js.UndefOr[String] = js.native
  var content: ReactNode = js.native
  var id: String = js.native
  var isDismissible: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Status] = js.native
}

object Notice {
  @scala.inline
  def apply(id: String): Notice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setIsDismissible(value: Boolean): Self = this.set("isDismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDismissible: Self = this.set("isDismissible", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

