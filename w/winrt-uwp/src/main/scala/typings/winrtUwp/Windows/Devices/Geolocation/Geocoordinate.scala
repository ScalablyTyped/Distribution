package typings.winrtUwp.Windows.Devices.Geolocation

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information for identifying a geographic location. */
@js.native
trait Geocoordinate extends StObject {
  
  /** The accuracy of the location in meters. */
  var accuracy: Double = js.native
  
  /** The altitude of the location, in meters. */
  var altitude: Double = js.native
  
  /** The accuracy of the altitude, in meters. */
  var altitudeAccuracy: Double = js.native
  
  /** The current heading in degrees relative to true north. */
  var heading: Double = js.native
  
  /** The latitude in degrees. */
  var latitude: Double = js.native
  
  /** The longitude in degrees. */
  var longitude: Double = js.native
  
  /** The location of the Geocoordinate. */
  var point: Geopoint = js.native
  
  /** Gets the source used to obtain a Geocoordinate. */
  var positionSource: PositionSource = js.native
  
  /** Gets the time at which the associated Geocoordinate position was calculated. */
  var positionSourceTimestamp: Date = js.native
  
  /** Gets information about the satellites used to obtain a Geocoordinate. */
  var satelliteData: GeocoordinateSatelliteData = js.native
  
  /** The speed in meters per second. */
  var speed: Double = js.native
  
  /** The system time at which the location was determined. */
  var timestamp: Date = js.native
}
object Geocoordinate {
  
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    point: Geopoint,
    positionSource: PositionSource,
    positionSourceTimestamp: Date,
    satelliteData: GeocoordinateSatelliteData,
    speed: Double,
    timestamp: Date
  ): Geocoordinate = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], positionSource = positionSource.asInstanceOf[js.Any], positionSourceTimestamp = positionSourceTimestamp.asInstanceOf[js.Any], satelliteData = satelliteData.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoordinate]
  }
  
  @scala.inline
  implicit class GeocoordinateMutableBuilder[Self <: Geocoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Geopoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionSource(value: PositionSource): Self = StObject.set(x, "positionSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionSourceTimestamp(value: Date): Self = StObject.set(x, "positionSourceTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteData(value: GeocoordinateSatelliteData): Self = StObject.set(x, "satelliteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
