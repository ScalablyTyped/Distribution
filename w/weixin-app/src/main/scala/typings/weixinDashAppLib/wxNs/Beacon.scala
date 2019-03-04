package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /** iBeacon 设备的距离 */
  var accuracy: scala.Double
  /** iBeacon 设备的主 id */
  var major: java.lang.String
  /** iBeacon 设备的次 id */
  var minor: java.lang.String
  /** 表示设备距离的枚举值 */
  var proximity: scala.Double
  /** 表示设备的信号强度 */
  var rssi: scala.Double
  /** iBeacon 设备广播的 uuid */
  var uuid: java.lang.String
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    major: java.lang.String,
    minor: java.lang.String,
    proximity: scala.Double,
    rssi: scala.Double,
    uuid: java.lang.String
  ): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, major = major, minor = minor, proximity = proximity, rssi = rssi, uuid = uuid)
  
    __obj.asInstanceOf[Beacon]
  }
}

