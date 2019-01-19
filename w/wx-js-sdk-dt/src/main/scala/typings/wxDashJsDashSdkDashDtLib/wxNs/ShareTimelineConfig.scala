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

