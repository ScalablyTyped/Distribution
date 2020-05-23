package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationObject extends js.Object {
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.undefined
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.undefined
}

object LocationObject {
  @scala.inline
  def apply(latitude: js.UndefOr[Double] = js.undefined, longitude: js.UndefOr[Double] = js.undefined): LocationObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationObject]
  }
}

