package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressLatitude extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var latitude: Double
  var longitude: Double
  var name: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object Anon_AddressLatitude {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    address: String = null,
    name: String = null,
    scale: Int | Double = null
  ): Anon_AddressLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
    if (address != null) __obj.updateDynamic("address")(address)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddressLatitude]
  }
}

