package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressLatitude extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var name: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AddressLatitude {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    address: java.lang.String = null,
    name: java.lang.String = null,
    scale: scala.Int | scala.Double = null
  ): Anon_AddressLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
    if (address != null) __obj.updateDynamic("address")(address)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddressLatitude]
  }
}

