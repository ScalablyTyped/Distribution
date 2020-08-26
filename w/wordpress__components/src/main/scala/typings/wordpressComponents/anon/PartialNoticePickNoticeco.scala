package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressNotices.mod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/components.@wordpress/components/notice/list.default.Notice> & std.Pick<@wordpress/components.@wordpress/components/notice/list.default.Notice, 'content'> */
@js.native
trait PartialNoticePickNoticeco extends js.Object {
  var actions: js.UndefOr[js.Array[typings.wordpressComponents.noticeMod.Notice.Action]] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[ReactNode] with ReactNode = js.native
  var id: js.UndefOr[String] = js.native
  var isDismissible: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Status] = js.native
}

object PartialNoticePickNoticeco {
  @scala.inline
  def apply(): PartialNoticePickNoticeco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNoticePickNoticeco]
  }
  @scala.inline
  implicit class PartialNoticePickNoticecoOps[Self <: PartialNoticePickNoticeco] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: typings.wordpressComponents.noticeMod.Notice.Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[typings.wordpressComponents.noticeMod.Notice.Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: js.UndefOr[ReactNode] with ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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

