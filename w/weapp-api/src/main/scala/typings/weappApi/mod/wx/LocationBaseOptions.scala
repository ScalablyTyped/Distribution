package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体
//  地图
trait LocationBaseOptions extends js.Object {
  //  纬度，浮点数，范围为-90~90，负数表示南纬
  var latitude: Double
  //  经度，浮点数，范围为-180~180，负数表示西经
  var longitude: Double
}

object LocationBaseOptions {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LocationBaseOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBaseOptions]
  }
}

