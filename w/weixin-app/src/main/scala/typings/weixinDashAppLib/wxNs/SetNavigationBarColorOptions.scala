package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetNavigationBarColorOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 动画效果
  		 */
  var animation: js.UndefOr[weixinDashAppLib.Anon_Duratio] = js.undefined
  /**
  		 * 背景颜色值，有效值为十六进制颜色
  		 */
  var backgroundColor: java.lang.String
  /**
  		 * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
  		 */
  var frontColor: weixinDashAppLib.weixinDashAppLibStrings.`#ffffff` | weixinDashAppLib.weixinDashAppLibStrings.`#000000`
}

