package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddressLatitude extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var name: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object AnonAddressLatitude {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    address: String = null,
    name: String = null,
    scale: Int | Double = null
  ): AnonAddressLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddressLatitude]
  }
}

