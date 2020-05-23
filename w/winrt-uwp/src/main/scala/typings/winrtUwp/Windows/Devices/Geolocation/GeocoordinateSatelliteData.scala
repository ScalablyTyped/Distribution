package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
trait GeocoordinateSatelliteData extends js.Object {
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  var horizontalDilutionOfPrecision: Double
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  var positionDilutionOfPrecision: Double
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  var verticalDilutionOfPrecision: Double
}

object GeocoordinateSatelliteData {
  @scala.inline
  def apply(
    horizontalDilutionOfPrecision: Double,
    positionDilutionOfPrecision: Double,
    verticalDilutionOfPrecision: Double
  ): GeocoordinateSatelliteData = {
    val __obj = js.Dynamic.literal(horizontalDilutionOfPrecision = horizontalDilutionOfPrecision.asInstanceOf[js.Any], positionDilutionOfPrecision = positionDilutionOfPrecision.asInstanceOf[js.Any], verticalDilutionOfPrecision = verticalDilutionOfPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoordinateSatelliteData]
  }
}

