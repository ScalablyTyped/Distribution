package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationSuccess extends js.Object {
  /**
    * 位置的精确度
    */
  var accuracy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 高度，单位 m
    */
  var altitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: js.UndefOr[scala.Double] = js.undefined
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 速度，浮点数，单位m/s
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: js.UndefOr[scala.Double] = js.undefined
}

object GetLocationSuccess {
  @scala.inline
  def apply(
    accuracy: java.lang.String = null,
    altitude: scala.Int | scala.Double = null,
    horizontalAccuracy: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    verticalAccuracy: scala.Int | scala.Double = null
  ): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (horizontalAccuracy != null) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (verticalAccuracy != null) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationSuccess]
  }
}

