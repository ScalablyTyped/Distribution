package typings.wegameDashApi.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --电量
trait BatteryInfo extends js.Object {
  /**
    * 是否正在充电
    */
  var isCharging: Boolean
  /**
    * 设备电量，范围 1 - 100
    */
  var level: String
}

object BatteryInfo {
  @scala.inline
  def apply(isCharging: Boolean, level: String): BatteryInfo = {
    val __obj = js.Dynamic.literal(isCharging = isCharging, level = level)
  
    __obj.asInstanceOf[BatteryInfo]
  }
}

