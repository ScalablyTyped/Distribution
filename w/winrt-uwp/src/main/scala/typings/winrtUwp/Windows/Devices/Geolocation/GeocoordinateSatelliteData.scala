package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
trait GeocoordinateSatelliteData extends StObject {
  
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  var horizontalDilutionOfPrecision: Double
  
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  var positionDilutionOfPrecision: Double
  
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  var verticalDilutionOfPrecision: Double
}
object GeocoordinateSatelliteData {
  
  inline def apply(
    horizontalDilutionOfPrecision: Double,
    positionDilutionOfPrecision: Double,
    verticalDilutionOfPrecision: Double
  ): GeocoordinateSatelliteData = {
    val __obj = js.Dynamic.literal(horizontalDilutionOfPrecision = horizontalDilutionOfPrecision.asInstanceOf[js.Any], positionDilutionOfPrecision = positionDilutionOfPrecision.asInstanceOf[js.Any], verticalDilutionOfPrecision = verticalDilutionOfPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoordinateSatelliteData]
  }
  
  extension [Self <: GeocoordinateSatelliteData](x: Self) {
    
    inline def setHorizontalDilutionOfPrecision(value: Double): Self = StObject.set(x, "horizontalDilutionOfPrecision", value.asInstanceOf[js.Any])
    
    inline def setPositionDilutionOfPrecision(value: Double): Self = StObject.set(x, "positionDilutionOfPrecision", value.asInstanceOf[js.Any])
    
    inline def setVerticalDilutionOfPrecision(value: Double): Self = StObject.set(x, "verticalDilutionOfPrecision", value.asInstanceOf[js.Any])
  }
}
