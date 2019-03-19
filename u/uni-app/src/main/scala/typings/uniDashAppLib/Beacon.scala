package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /**
    * iBeacon 设备的距离
    */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
    * iBeacon 设备的主 id
    */
  var major: js.UndefOr[java.lang.String] = js.undefined
  /**
    * iBeacon 设备的次 id
    */
  var minor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 表示设备距离的枚举值
    */
  var proximity: js.UndefOr[scala.Double] = js.undefined
  /**
    * 表示设备的信号强度
    */
  var rssi: js.UndefOr[scala.Double] = js.undefined
  /**
    * iBeacon 设备广播的 uuid
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    major: java.lang.String = null,
    minor: java.lang.String = null,
    proximity: scala.Int | scala.Double = null,
    rssi: scala.Int | scala.Double = null,
    uuid: java.lang.String = null
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

