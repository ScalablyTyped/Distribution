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
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
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
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    imageUrl: java.lang.String = null,
    link: java.lang.String = null,
    success: js.Function0[scala.Unit] = null,
    title: java.lang.String = null,
    trigger: js.Function0[scala.Unit] = null
  ): ShareToTimelineConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (link != null) __obj.updateDynamic("link")(link)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ShareToTimelineConfig]
  }
}

