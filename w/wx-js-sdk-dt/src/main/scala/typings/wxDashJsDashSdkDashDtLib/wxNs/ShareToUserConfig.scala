package typings
package wxDashJsDashSdkDashDtLib.wxNs

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
  var desc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  var success_ShareToUserConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 分享标题
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShareToUserConfig {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    desc: java.lang.String = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    imgUrl: java.lang.String = null,
    link: java.lang.String = null,
    success: js.Function0[scala.Unit] = null,
    title: java.lang.String = null,
    trigger: js.Function0[scala.Unit] = null
  ): ShareToUserConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl)
    if (link != null) __obj.updateDynamic("link")(link)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ShareToUserConfig]
  }
}

