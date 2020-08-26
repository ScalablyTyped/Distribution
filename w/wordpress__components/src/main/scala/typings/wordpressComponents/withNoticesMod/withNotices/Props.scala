package typings.wordpressComponents.withNoticesMod.withNotices

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.CreateErrorNotice
import typings.wordpressComponents.listMod.NoticeList.Notice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var noticeList: js.Array[Notice] = js.native
  var noticeOperations: CreateErrorNotice = js.native
  var noticeUI: ReactNode = js.native
}

object Props {
  @scala.inline
  def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice): Props = {
    val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setNoticeListVarargs(value: Notice*): Self = this.set("noticeList", js.Array(value :_*))
    @scala.inline
    def setNoticeList(value: js.Array[Notice]): Self = this.set("noticeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoticeOperations(value: CreateErrorNotice): Self = this.set("noticeOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoticeUI(value: ReactNode): Self = this.set("noticeUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoticeUI: Self = this.set("noticeUI", js.undefined)
  }
  
}

