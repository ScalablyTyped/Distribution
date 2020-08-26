package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocationSuccess extends js.Object {
  /**
    * 位置的精确度
    */
  var accuracy: js.UndefOr[String] = js.native
  /**
    * 地址信息
    */
  var address: js.UndefOr[js.Any] = js.native
  /**
    * 高度，单位 m
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * 水平精度，单位 m
    */
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * 速度，浮点数，单位m/s
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * 垂直精度，单位 m（Android 无法获取，返回 0）
    */
  var verticalAccuracy: js.UndefOr[Double] = js.native
}

object GetLocationSuccess {
  @scala.inline
  def apply(): GetLocationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationSuccess]
  }
  @scala.inline
  implicit class GetLocationSuccessOps[Self <: GetLocationSuccess] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: String): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setAddress(value: js.Any): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = this.set("horizontalAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAccuracy: Self = this.set("horizontalAccuracy", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = this.set("verticalAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAccuracy: Self = this.set("verticalAccuracy", js.undefined)
  }
  
}

