package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 界面API列表
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 提示的延迟时间，单位毫秒，默认：1500
  		 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 图标，只支持 "success", "loading", "none"
  		 */
  var icon: js.UndefOr[
    weixinDashAppLib.weixinDashAppLibStrings.success | weixinDashAppLib.weixinDashAppLibStrings.loading | weixinDashAppLib.weixinDashAppLibStrings.none
  ] = js.undefined
  /**
  		 * 自定义图标的本地路径，image 的优先级高于 icon
  		 */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: java.lang.String
}

