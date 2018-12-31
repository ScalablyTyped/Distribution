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

