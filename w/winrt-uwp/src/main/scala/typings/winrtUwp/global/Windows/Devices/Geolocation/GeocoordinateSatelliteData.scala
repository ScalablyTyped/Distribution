package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
@JSGlobal("Windows.Devices.Geolocation.GeocoordinateSatelliteData")
@js.native
abstract class GeocoordinateSatelliteData ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.GeocoordinateSatelliteData {
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  /* CompleteClass */
  override var horizontalDilutionOfPrecision: Double = js.native
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  /* CompleteClass */
  override var positionDilutionOfPrecision: Double = js.native
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  /* CompleteClass */
  override var verticalDilutionOfPrecision: Double = js.native
}

