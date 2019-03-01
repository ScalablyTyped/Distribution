package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectArea extends js.Object {
  /** 节点的下边界坐标 */
  var bottom: scala.Double
  /** 节点的高度 */
  var height: scala.Double
  /** 节点的左边界坐标 */
  var left: scala.Double
  /** 节点的右边界坐标 */
  var right: scala.Double
  /** 节点的上边界坐标 */
  var top: scala.Double
  /** 节点的宽度 */
  var width: scala.Double
}

object RectArea {
  @scala.inline
  def apply(
    bottom: scala.Double,
    height: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    width: scala.Double
  ): RectArea = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[RectArea]
  }
}

