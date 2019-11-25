package typings.webdriverDashJsDashExtender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: Double
  var latitude: Double
  var longitude: Double
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Altitude]
  }
}

