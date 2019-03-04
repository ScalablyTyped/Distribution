package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号 JS 安全域名一致
    */
  var link: java.lang.String
  /**
    * 分享标题
    */
  var title: java.lang.String
}

object ShareTimelineConfig {
  @scala.inline
  def apply(
    link: java.lang.String,
    title: java.lang.String,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    imgUrl: java.lang.String = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    trigger: js.Function0[scala.Unit] = null
  ): ShareTimelineConfig = {
    val __obj = js.Dynamic.literal(link = link, title = title)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (success != null) __obj.updateDynamic("success")(success)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ShareTimelineConfig]
  }
}

