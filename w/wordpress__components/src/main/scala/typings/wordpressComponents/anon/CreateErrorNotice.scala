package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateErrorNotice extends js.Object {
  def createErrorNotice(message: String): Unit
  def createNotice(notice: PartialNoticePickNoticeco): Unit
  def removeAllNotices(): Unit
  def removeNotice(noticeId: String): Unit
}

object CreateErrorNotice {
  @scala.inline
  def apply(
    createErrorNotice: String => Unit,
    createNotice: PartialNoticePickNoticeco => Unit,
    removeAllNotices: () => Unit,
    removeNotice: String => Unit
  ): CreateErrorNotice = {
    val __obj = js.Dynamic.literal(createErrorNotice = js.Any.fromFunction1(createErrorNotice), createNotice = js.Any.fromFunction1(createNotice), removeAllNotices = js.Any.fromFunction0(removeAllNotices), removeNotice = js.Any.fromFunction1(removeNotice))
    __obj.asInstanceOf[CreateErrorNotice]
  }
}

