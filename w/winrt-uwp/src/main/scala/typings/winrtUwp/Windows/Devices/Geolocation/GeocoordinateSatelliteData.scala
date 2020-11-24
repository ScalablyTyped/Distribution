package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
@js.native
trait GeocoordinateSatelliteData extends js.Object {
  
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  var horizontalDilutionOfPrecision: Double = js.native
  
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  var positionDilutionOfPrecision: Double = js.native
  
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  var verticalDilutionOfPrecision: Double = js.native
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
  
  @scala.inline
  implicit class GeocoordinateSatelliteDataOps[Self <: GeocoordinateSatelliteData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHorizontalDilutionOfPrecision(value: Double): Self = this.set("horizontalDilutionOfPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionDilutionOfPrecision(value: Double): Self = this.set("positionDilutionOfPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalDilutionOfPrecision(value: Double): Self = this.set("verticalDilutionOfPrecision", value.asInstanceOf[js.Any])
  }
}
