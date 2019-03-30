package typings
package utmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utm", JSImport.Namespace)
@js.native
object utmMod extends js.Object {
  def fromLatLon(latitude: scala.Double, longitude: scala.Double): utmLib.Anon_Easting = js.native
  def fromLatLon(latitude: scala.Double, longitude: scala.Double, forceZoneNum: scala.Double): utmLib.Anon_Easting = js.native
  def toLatLon(
    easting: scala.Double,
    northing: scala.Double,
    zoneNum: scala.Double,
    zoneLetter: java.lang.String,
    northern: scala.Boolean
  ): utmLib.Anon_Latitude = js.native
  def toLatLon(
    easting: scala.Double,
    northing: scala.Double,
    zoneNum: scala.Double,
    zoneLetter: java.lang.String,
    northern: scala.Boolean,
    strict: scala.Boolean
  ): utmLib.Anon_Latitude = js.native
}

