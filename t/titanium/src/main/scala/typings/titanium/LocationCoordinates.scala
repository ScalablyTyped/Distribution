package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding the data for a location update.
  */
@js.native
trait LocationCoordinates extends StObject {
  
  /**
    * Accuracy of the location update, in meters.
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * Altitude of the location update, in meters.
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * Vertical accuracy of the location update, in meters.
    */
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  
  /**
    * The floor of the building on which the user is located.
    */
  var floor: js.UndefOr[LocationCoordinatesFloor] = js.native
  
  /**
    * Compass heading, in degrees. May be unknown if device is not moving. On
    * iOS, a negative value indicates that the heading data is not valid.
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * Latitude of the location update, in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  
  /**
    * Longitude of the location update, in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * Current speed in meters/second. On iOS, a negative value indicates that the
    * heading data is not valid or the accuracy is configured incorrectly.
    * Note: Due to the Apple Geolocation API, set the <Titanium.Geolocation.accuracy>
    * property to <Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION> in order to properly
    * measure speed changes and prevent the app from returning negative values.
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * Timestamp for this location update, in milliseconds.
    */
  var timestamp: js.UndefOr[Double] = js.native
}
object LocationCoordinates {
  
  @scala.inline
  def apply(): LocationCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationCoordinates]
  }
  
  @scala.inline
  implicit class LocationCoordinatesMutableBuilder[Self <: LocationCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setFloor(value: LocationCoordinatesFloor): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
