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
    val __obj = js.Dynamic.literal(easting = easting, northing = northing, zoneLetter = zoneLetter, zoneNum = zoneNum)
  
    __obj.asInstanceOf[Anon_Easting]
  }
}

