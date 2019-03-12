package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 消息分享对象
  * @deprecated
  */
trait SharedAppMessage extends ShareTimelineConfig {
  /**
    * 如果 type 是 music 或 video，则要提供数据链接，默认为空
    */
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享描述
    */
  var desc: java.lang.String
  /**
    * 分享类型, music、video 或 link，不填默认为 link
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SharedAppMessage {
  @scala.inline
  def apply(
    desc: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    dataUrl: java.lang.String = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    imgUrl: java.lang.String = null,
    success: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    trigger: () => scala.Unit = null,
    `type`: java.lang.String = null
  ): SharedAppMessage = {
    val __obj = js.Dynamic.literal(desc = desc, link = link, title = title)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SharedAppMessage]
  }
}

