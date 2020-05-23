package typings.webdriverJsExtender.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  var altitude: Double
  var latitude: Double
  var longitude: Double
}

object Altitude {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

