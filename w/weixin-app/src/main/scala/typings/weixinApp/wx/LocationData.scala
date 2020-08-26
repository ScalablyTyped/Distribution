package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 位置API列表
// 位置-----获取位置
@js.native
trait LocationData extends js.Object {
  /** 位置的精确度 */
  var accuracy: Double = js.native
  /** 高度，单位 m */
  var altitude: Double = js.native
  /** 水平精度，单位 m */
  var horizontalAccuracy: Double = js.native
  /** 纬度，浮点数，范围为-90~90，负数表示南纬 */
  var latitude: Double = js.native
  /** 经度，浮点数，范围为-180~180，负数表示西经 */
  var longitude: Double = js.native
  /** 速度，浮点数，单位m/s */
  var speed: Double = js.native
  /** 垂直精度，单位 m（Android 无法获取，返回 0） */
  var verticalAccuracy: Double = js.native
}

object LocationData {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    horizontalAccuracy: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    verticalAccuracy: Double
  ): LocationData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], verticalAccuracy = verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
  @scala.inline
  implicit class LocationDataOps[Self <: LocationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = this.set("horizontalAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = this.set("verticalAccuracy", value.asInstanceOf[js.Any])
  }
  
}

