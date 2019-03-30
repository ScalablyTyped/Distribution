package typings
package utmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Easting extends js.Object {
  var easting: scala.Double
  var northing: scala.Double
  var zoneLetter: java.lang.String
  var zoneNum: scala.Double
}

object Anon_Easting {
  @scala.inline
  def apply(easting: scala.Double, northing: scala.Double, zoneLetter: java.lang.String, zoneNum: scala.Double): Anon_Easting = {
    val __obj = js.Dynamic.literal(easting = easting, northing = northing, zoneLetter = zoneLetter, zoneNum = zoneNum)
  
    __obj.asInstanceOf[Anon_Easting]
  }
}

