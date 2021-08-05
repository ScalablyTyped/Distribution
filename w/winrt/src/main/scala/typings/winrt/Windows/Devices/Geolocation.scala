package typings.winrt.Windows.Devices

import typings.std.Date
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geolocation {
  
  @js.native
  sealed trait PositionAccuracy extends StObject
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @js.native
    sealed trait default
      extends StObject
         with PositionAccuracy
    
    @js.native
    sealed trait high
      extends StObject
         with PositionAccuracy
  }
  
  @js.native
  sealed trait PositionStatus extends StObject
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @js.native
    sealed trait disabled
      extends StObject
         with PositionStatus
    
    @js.native
    sealed trait initializing
      extends StObject
         with PositionStatus
    
    @js.native
    sealed trait noData
      extends StObject
         with PositionStatus
    
    @js.native
    sealed trait notAvailable
      extends StObject
         with PositionStatus
    
    @js.native
    sealed trait notInitialized
      extends StObject
         with PositionStatus
    
    @js.native
    sealed trait ready
      extends StObject
         with PositionStatus
  }
  
  trait CivicAddress
    extends StObject
       with ICivicAddress
  object CivicAddress {
    
    inline def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): CivicAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CivicAddress]
    }
  }
  
  trait Geocoordinate
    extends StObject
       with IGeocoordinate
  object Geocoordinate {
    
    inline def apply(
      accuracy: Double,
      altitude: Double,
      altitudeAccuracy: Double,
      heading: Double,
      latitude: Double,
      longitude: Double,
      speed: Double,
      timestamp: Date
    ): Geocoordinate = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geocoordinate]
    }
  }
  
  @js.native
  trait Geolocator
    extends StObject
       with IGeolocator
  
  trait Geoposition
    extends StObject
       with IGeoposition
  object Geoposition {
    
    inline def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): Geoposition = {
      val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geoposition]
    }
  }
  
  trait ICivicAddress extends StObject {
    
    var city: String
    
    var country: String
    
    var postalCode: String
    
    var state: String
    
    var timestamp: Date
  }
  object ICivicAddress {
    
    inline def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): ICivicAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICivicAddress]
    }
    
    extension [Self <: ICivicAddress](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGeocoordinate extends StObject {
    
    var accuracy: Double
    
    var altitude: Double
    
    var altitudeAccuracy: Double
    
    var heading: Double
    
    var latitude: Double
    
    var longitude: Double
    
    var speed: Double
    
    var timestamp: Date
  }
  object IGeocoordinate {
    
    inline def apply(
      accuracy: Double,
      altitude: Double,
      altitudeAccuracy: Double,
      heading: Double,
      latitude: Double,
      longitude: Double,
      speed: Double,
      timestamp: Date
    ): IGeocoordinate = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocoordinate]
    }
    
    extension [Self <: IGeocoordinate](x: Self) {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
      
      inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGeolocator extends StObject {
    
    var desiredAccuracy: PositionAccuracy = js.native
    
    def getGeopositionAsync(): IAsyncOperation[Geoposition] = js.native
    def getGeopositionAsync(maximumAge: Double, timeout: Double): IAsyncOperation[Geoposition] = js.native
    
    var locationStatus: PositionStatus = js.native
    
    var movementThreshold: Double = js.native
    
    var onpositionchanged: js.Any = js.native
    
    var onstatuschanged: js.Any = js.native
    
    var reportInterval: Double = js.native
  }
  
  trait IGeoposition extends StObject {
    
    var civicAddress: CivicAddress
    
    var coordinate: Geocoordinate
  }
  object IGeoposition {
    
    inline def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): IGeoposition = {
      val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeoposition]
    }
    
    extension [Self <: IGeoposition](x: Self) {
      
      inline def setCivicAddress(value: CivicAddress): Self = StObject.set(x, "civicAddress", value.asInstanceOf[js.Any])
      
      inline def setCoordinate(value: Geocoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPositionChangedEventArgs extends StObject {
    
    var position: Geoposition
  }
  object IPositionChangedEventArgs {
    
    inline def apply(position: Geoposition): IPositionChangedEventArgs = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionChangedEventArgs]
    }
    
    extension [Self <: IPositionChangedEventArgs](x: Self) {
      
      inline def setPosition(value: Geoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStatusChangedEventArgs extends StObject {
    
    var status: PositionStatus
  }
  object IStatusChangedEventArgs {
    
    inline def apply(status: PositionStatus): IStatusChangedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStatusChangedEventArgs]
    }
    
    extension [Self <: IStatusChangedEventArgs](x: Self) {
      
      inline def setStatus(value: PositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionChangedEventArgs
    extends StObject
       with IPositionChangedEventArgs
  object PositionChangedEventArgs {
    
    inline def apply(position: Geoposition): PositionChangedEventArgs = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionChangedEventArgs]
    }
  }
  
  trait StatusChangedEventArgs
    extends StObject
       with IStatusChangedEventArgs
  object StatusChangedEventArgs {
    
    inline def apply(status: PositionStatus): StatusChangedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusChangedEventArgs]
    }
  }
}
