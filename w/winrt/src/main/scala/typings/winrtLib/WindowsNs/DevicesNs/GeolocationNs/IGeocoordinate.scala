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
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, altitudeAccuracy = altitudeAccuracy, heading = heading, latitude = latitude, longitude = longitude, speed = speed, timestamp = timestamp)
  
    __obj.asInstanceOf[IGeocoordinate]
  }
}

