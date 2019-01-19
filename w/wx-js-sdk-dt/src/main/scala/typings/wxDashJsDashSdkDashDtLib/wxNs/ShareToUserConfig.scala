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

