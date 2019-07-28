package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /**
    * iBeacon 设备的距离
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * iBeacon 设备的主 id
    */
  var major: js.UndefOr[String] = js.undefined
  /**
    * iBeacon 设备的次 id
    */
  var minor: js.UndefOr[String] = js.undefined
  /**
    * 表示设备距离的枚举值
    */
  var proximity: js.UndefOr[Double] = js.undefined
  /**
    * 表示设备的信号强度
    */
  var rssi: js.UndefOr[Double] = js.undefined
  /**
    * iBeacon 设备广播的 uuid
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    major: String = null,
    minor: String = null,
    proximity: Int | Double = null,
    rssi: Int | Double = null,
    uuid: String = null
  ): Beacon = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major)
    if (minor != null) __obj.updateDynamic("minor")(minor)
    if (proximity != null) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (rssi != null) __obj.updateDynamic("rssi")(rssi.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Beacon]
  }
}

