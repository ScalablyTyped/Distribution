package typings.utm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Easting extends js.Object {
  var easting: Double
  var northing: Double
  var zoneLetter: String
  var zoneNum: Double
}

object Anon_Easting {
  @scala.inline
  def apply(easting: Double, northing: Double, zoneLetter: String, zoneNum: Double): Anon_Easting = {
    val __obj = js.Dynamic.literal(easting = easting.asInstanceOf[js.Any], northing = northing.asInstanceOf[js.Any], zoneLetter = zoneLetter.asInstanceOf[js.Any], zoneNum = zoneNum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Easting]
  }
}

