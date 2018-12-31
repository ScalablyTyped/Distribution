package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTabBarItemOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径, icon 大小限制为40kb
  		 * 建议尺寸为 81px * 81px
  		 * 当 postion 为 top 时，此参数无效，不支持网络图片
  		 */
  var iconPath: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar 的哪一项，从左边算起 */
  var index: scala.Double
  /**
  		 * 选中时的图片路径
  		 * icon 大小限制为40kb，建议尺寸为 81px * 81px
  		 * 当 postion 为 top
  		 */
  var selectedIconPath: js.UndefOr[java.lang.String] = js.undefined
  /** tab 上按钮文字 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

