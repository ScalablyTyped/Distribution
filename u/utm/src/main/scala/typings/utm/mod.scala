package typings.utm

import typings.utm.anon.Easting
import typings.utm.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utm", "fromLatLon")
  @js.native
  def fromLatLon(latitude: Double, longitude: Double): Easting = js.native
  @JSImport("utm", "fromLatLon")
  @js.native
  def fromLatLon(latitude: Double, longitude: Double, forceZoneNum: Double): Easting = js.native
  
  @JSImport("utm", "toLatLon")
  @js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: js.UndefOr[scala.Nothing],
    northern: Boolean
  ): Latitude = js.native
  @JSImport("utm", "toLatLon")
  @js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: js.UndefOr[scala.Nothing],
    northern: Boolean,
    strict: Boolean
  ): Latitude = js.native
  @JSImport("utm", "toLatLon")
  @js.native
  def toLatLon(easting: Double, northing: Double, zoneNum: Double, zoneLetter: String): Latitude = js.native
  @JSImport("utm", "toLatLon")
  @js.native
  def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: String,
    northern: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Latitude = js.native
}
