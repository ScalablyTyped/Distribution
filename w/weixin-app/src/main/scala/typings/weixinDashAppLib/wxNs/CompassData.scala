package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----罗盘
trait CompassData extends js.Object {
  /** 面对的方向度数 */
  var direction: scala.Double
}

object CompassData {
  @scala.inline
  def apply(direction: scala.Double): CompassData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[CompassData]
  }
}

