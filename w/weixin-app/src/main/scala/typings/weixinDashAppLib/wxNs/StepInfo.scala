package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 微信运动
trait StepInfo extends js.Object {
  /** 微信运动步数 */
  var step: scala.Double
  /** 时间戳，表示数据对应的时间 */
  var timestamp: scala.Double
}

object StepInfo {
  @scala.inline
  def apply(step: scala.Double, timestamp: scala.Double): StepInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[StepInfo]
  }
}

