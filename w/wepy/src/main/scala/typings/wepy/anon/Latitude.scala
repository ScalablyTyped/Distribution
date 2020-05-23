package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Latitude extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var name: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object Latitude {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    address: String = null,
    name: String = null,
    scale: js.UndefOr[Double] = js.undefined
  ): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latitude]
  }
}

