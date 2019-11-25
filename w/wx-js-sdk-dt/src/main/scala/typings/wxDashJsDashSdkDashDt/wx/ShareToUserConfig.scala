package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * “分享给朋友”及“分享到QQ”按钮的分享内容
  */
trait ShareToUserConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享描述
    */
  var desc: js.UndefOr[String] = js.undefined
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_ShareToUserConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShareToUserConfig {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    desc: String = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    imgUrl: String = null,
    link: String = null,
    success: () => Unit = null,
    title: String = null,
    trigger: () => Unit = null
  ): ShareToUserConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(js.Any.fromFunction0(trigger))
    __obj.asInstanceOf[ShareToUserConfig]
  }
}

