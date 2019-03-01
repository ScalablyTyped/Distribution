package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocoordinate extends js.Object {
  var accuracy: scala.Double
  var altitude: scala.Double
  var altitudeAccuracy: scala.Double
  var heading: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
  var speed: scala.Double
  var timestamp: stdLib.Date
}

object IGeocoordinate {
  @scala.inline
  def apply(
    accuracy: scala.Double,
    altitude: scala.Double,
    altitudeAccuracy: scala.Double,
    heading: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    speed: scala.Double,
    timestamp: stdLib.Date
  ): IGeocoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("altitudeAccuracy")(altitudeAccuracy)
    __obj.updateDynamic("heading")(heading)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IGeocoordinate]
  }
}

