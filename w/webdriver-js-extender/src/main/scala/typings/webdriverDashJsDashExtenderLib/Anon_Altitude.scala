package typings
package webdriverDashJsDashExtenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: scala.Double, latitude: scala.Double, longitude: scala.Double): Anon_Altitude = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("altitude")(altitude)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[Anon_Altitude]
  }
}

