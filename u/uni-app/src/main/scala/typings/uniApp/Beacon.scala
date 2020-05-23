package typings.uniApp

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
    accuracy: js.UndefOr[Double] = js.undefined,
    major: String = null,
    minor: String = null,
    proximity: js.UndefOr[Double] = js.undefined,
    rssi: js.UndefOr[Double] = js.undefined,
    uuid: String = null
  ): Beacon = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (!js.isUndefined(proximity)) __obj.updateDynamic("proximity")(proximity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rssi)) __obj.updateDynamic("rssi")(rssi.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacon]
  }
}

