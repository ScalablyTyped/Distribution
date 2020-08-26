package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体
//  地图
@js.native
trait LocationBaseOptions extends js.Object {
  //  纬度，浮点数，范围为-90~90，负数表示南纬
  var latitude: Double = js.native
  //  经度，浮点数，范围为-180~180，负数表示西经
  var longitude: Double = js.native
}

object LocationBaseOptions {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LocationBaseOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBaseOptions]
  }
  @scala.inline
  implicit class LocationBaseOptionsOps[Self <: LocationBaseOptions] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
  }
  
}

