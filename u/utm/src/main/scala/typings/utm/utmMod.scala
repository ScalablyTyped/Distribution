package typings.utm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utm", JSImport.Namespace)
@js.native
object utmMod extends js.Object {
  def fromLatLon(latitude: Double, longitude: Double): Anon_Easting = js.native
  def fromLatLon(latitude: Double, longitude: Double, forceZoneNum: Double): Anon_Easting = js.native
  def toLatLon(easting: Double, northing: Double, zoneNum: Double, zoneLetter: String, northern: Boolean): Anon_Latitude = js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: String,
    northern: Boolean,
    strict: Boolean
  ): Anon_Latitude = js.native
}

