package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --电量
trait BatteryInfo extends js.Object {
  /**
    * 是否正在充电
    */
  var isCharging: scala.Boolean
  /**
    * 设备电量，范围 1 - 100
    */
  var level: java.lang.String
}

object BatteryInfo {
  @scala.inline
  def apply(isCharging: scala.Boolean, level: java.lang.String): BatteryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCharging")(isCharging)
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[BatteryInfo]
  }
}

