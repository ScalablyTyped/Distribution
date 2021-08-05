package typings.utm

import typings.utm.anon.Easting
import typings.utm.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromLatLon(latitude: Double, longitude: Double): Easting = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLon")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Easting]
  inline def fromLatLon(latitude: Double, longitude: Double, forceZoneNum: Double): Easting = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLatLon")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], forceZoneNum.asInstanceOf[js.Any])).asInstanceOf[Easting]
  
  inline def toLatLon(easting: Double, northing: Double, zoneNum: Double, zoneLetter: String): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("toLatLon")(easting.asInstanceOf[js.Any], northing.asInstanceOf[js.Any], zoneNum.asInstanceOf[js.Any], zoneLetter.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  inline def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: String,
    northern: Unit,
    strict: Boolean
  ): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("toLatLon")(easting.asInstanceOf[js.Any], northing.asInstanceOf[js.Any], zoneNum.asInstanceOf[js.Any], zoneLetter.asInstanceOf[js.Any], northern.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  inline def toLatLon(easting: Double, northing: Double, zoneNum: Double, zoneLetter: Unit, northern: Boolean): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("toLatLon")(easting.asInstanceOf[js.Any], northing.asInstanceOf[js.Any], zoneNum.asInstanceOf[js.Any], zoneLetter.asInstanceOf[js.Any], northern.asInstanceOf[js.Any])).asInstanceOf[Latitude]
  inline def toLatLon(
    easting: Double,
    northing: Double,
    zoneNum: Double,
    zoneLetter: Unit,
    northern: Boolean,
    strict: Boolean
  ): Latitude = (^.asInstanceOf[js.Dynamic].applyDynamic("toLatLon")(easting.asInstanceOf[js.Any], northing.asInstanceOf[js.Any], zoneNum.asInstanceOf[js.Any], zoneLetter.asInstanceOf[js.Any], northern.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Latitude]
}
