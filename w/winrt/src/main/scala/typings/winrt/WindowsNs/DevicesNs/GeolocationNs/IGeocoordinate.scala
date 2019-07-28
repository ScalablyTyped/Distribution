package typings.winrt.WindowsNs.DevicesNs.GeolocationNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeocoordinate extends js.Object {
  var accuracy: Double
  var altitude: Double
  var altitudeAccuracy: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
  var timestamp: Date
}

object IGeocoordinate {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    speed: Double,
    timestamp: Date
  ): IGeocoordinate = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, altitudeAccuracy = altitudeAccuracy, heading = heading, latitude = latitude, longitude = longitude, speed = speed, timestamp = timestamp)
  
    __obj.asInstanceOf[IGeocoordinate]
  }
}

