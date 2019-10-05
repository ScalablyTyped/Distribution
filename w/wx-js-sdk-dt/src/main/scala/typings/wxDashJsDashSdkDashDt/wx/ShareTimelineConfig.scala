package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号 JS 安全域名一致
    */
  var link: String
  /**
    * 分享标题
    */
  var title: String
}

object ShareTimelineConfig {
  @scala.inline
  def apply(
    link: String,
    title: String,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    imgUrl: String = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null,
    trigger: () => Unit = null
  ): ShareTimelineConfig = {
    val __obj = js.Dynamic.literal(link = link, title = title)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[ShareTimelineConfig]
  }
}

