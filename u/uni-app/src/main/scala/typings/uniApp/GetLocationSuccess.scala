package typings.uniApp

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
    altitude: js.UndefOr[Double] = js.undefined,
    horizontalAccuracy: js.UndefOr[Double] = js.undefined,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    verticalAccuracy: js.UndefOr[Double] = js.undefined
  ): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAccuracy)) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAccuracy)) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocationSuccess]
  }
}

