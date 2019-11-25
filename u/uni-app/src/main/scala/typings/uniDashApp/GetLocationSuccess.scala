package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLocationSuccess extends js.Object {
  /**
    * 位置的精确度
    */
  var accuracy: js.UndefOr[String] = js.undefined
  /**
    * 地址信息
    */
  var address: js.UndefOr[js.Any] = js.undefined
  /**
    * 高度，单位 m
    */
  var altitude: js.UndefOr[Double] = js.undefined
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.undefined
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * 速度，浮点数，单位m/s
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: js.UndefOr[Double] = js.undefined
}

object GetLocationSuccess {
  @scala.inline
  def apply(
    accuracy: String = null,
    address: js.Any = null,
    altitude: Int | Double = null,
    horizontalAccuracy: Int | Double = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    speed: Int | Double = null,
    verticalAccuracy: Int | Double = null
  ): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (horizontalAccuracy != null) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (verticalAccuracy != null) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationSuccess]
  }
}

