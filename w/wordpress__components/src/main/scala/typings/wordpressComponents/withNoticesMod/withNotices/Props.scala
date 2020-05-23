package typings.wordpressComponents.withNoticesMod.withNotices

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.CreateErrorNotice
import typings.wordpressComponents.listMod.NoticeList.Notice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var noticeList: js.Array[Notice]
  var noticeOperations: CreateErrorNotice
  var noticeUI: ReactNode
}

object Props {
  @scala.inline
  def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice, noticeUI: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any])
    if (noticeUI != null) __obj.updateDynamic("noticeUI")(noticeUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

