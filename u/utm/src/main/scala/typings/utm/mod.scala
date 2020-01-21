package typings.utm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromLatLon(latitude: Double, longitude: Double): AnonEasting = js.native
  def fromLatLon(latitude: Double, longitude: Double, forceZoneNum: Double): AnonEasting = js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: js.UndefOr[scala.Nothing],
    northern: Boolean
  ): AnonLatitude = js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: js.UndefOr[scala.Nothing],
    northern: Boolean,
    strict: Boolean
  ): AnonLatitude = js.native
  def toLatLon(easting: Double, northing: Double, zoneNum: Double, zoneLetter: String): AnonLatitude = js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: String,
    northern: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): AnonLatitude = js.native
}

