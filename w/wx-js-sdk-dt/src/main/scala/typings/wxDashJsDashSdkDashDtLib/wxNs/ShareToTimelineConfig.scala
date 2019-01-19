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

