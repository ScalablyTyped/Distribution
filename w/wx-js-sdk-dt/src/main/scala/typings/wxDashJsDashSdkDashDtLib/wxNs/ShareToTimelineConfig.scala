package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * “分享到朋友圈”及“分享到QQ空间”按钮的分享内容
  */
trait ShareToTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  var success_ShareToTimelineConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 分享标题
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShareToTimelineConfig {
  @scala.inline
  def apply(
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    imgUrl: java.lang.String = null,
    link: java.lang.String = null,
    success: () => scala.Unit = null,
    title: java.lang.String = null,
    trigger: () => scala.Unit = null
  ): ShareToTimelineConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (link != null) __obj.updateDynamic("link")(link)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title)
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[ShareToTimelineConfig]
  }
}

