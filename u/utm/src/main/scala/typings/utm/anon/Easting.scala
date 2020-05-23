package typings.utm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easting extends js.Object {
  var easting: Double
  var northing: Double
  var zoneLetter: String
  var zoneNum: Double
}

object Easting {
  @scala.inline
  def apply(easting: Double, northing: Double, zoneLetter: String, zoneNum: Double): Easting = {
    val __obj = js.Dynamic.literal(easting = easting.asInstanceOf[js.Any], northing = northing.asInstanceOf[js.Any], zoneLetter = zoneLetter.asInstanceOf[js.Any], zoneNum = zoneNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easting]
  }
}

