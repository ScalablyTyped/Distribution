package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /** iBeacon 设备的距离 */
  var accuracy: Double
  /** iBeacon 设备的主 id */
  var major: String
  /** iBeacon 设备的次 id */
  var minor: String
  /** 表示设备距离的枚举值 */
  var proximity: Double
  /** 表示设备的信号强度 */
  var rssi: Double
  /** iBeacon 设备广播的 uuid */
  var uuid: String
}

object Beacon {
  @scala.inline
  def apply(accuracy: Double, major: String, minor: String, proximity: Double, rssi: Double, uuid: String): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacon]
  }
}

