package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 微信运动
trait StepInfo extends js.Object {
  /** 微信运动步数 */
  var step: Double
  /** 时间戳，表示数据对应的时间 */
  var timestamp: Double
}

object StepInfo {
  @scala.inline
  def apply(step: Double, timestamp: Double): StepInfo = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInfo]
  }
}

