package typings.winrt.Windows.Devices

import typings.std.Date
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geolocation {
  
  @js.native
  sealed trait PositionAccuracy extends StObject
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @js.native
    sealed trait default extends PositionAccuracy
    
    @js.native
    sealed trait high extends PositionAccuracy
  }
  
  @js.native
  sealed trait PositionStatus extends StObject
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @js.native
    sealed trait disabled extends PositionStatus
    
    @js.native
    sealed trait initializing extends PositionStatus
    
    @js.native
    sealed trait noData extends PositionStatus
    
    @js.native
    sealed trait notAvailable extends PositionStatus
    
    @js.native
    sealed trait notInitialized extends PositionStatus
    
    @js.native
    sealed trait ready extends PositionStatus
  }
  
  @js.native
  trait CivicAddress extends ICivicAddress
  object CivicAddress {
    
    @scala.inline
    def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): CivicAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CivicAddress]
    }
  }
  
  @js.native
  trait Geocoordinate extends IGeocoordinate
  object Geocoordinate {
    
    @scala.inline
    def apply(
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
  trait Geolocator extends IGeolocator
  
  @js.native
  trait Geoposition extends IGeoposition
  object Geoposition {
    
    @scala.inline
    def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): Geoposition = {
      val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geoposition]
    }
  }
  
  @js.native
  trait ICivicAddress extends StObject {
    
    var city: String = js.native
    
    var country: String = js.native
    
    var postalCode: String = js.native
    
    var state: String = js.native
    
    var timestamp: Date = js.native
  }
  object ICivicAddress {
    
    @scala.inline
    def apply(city: String, country: String, postalCode: String, state: String, timestamp: Date): ICivicAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICivicAddress]
    }
    
    @scala.inline
    implicit class ICivicAddressMutableBuilder[Self <: ICivicAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGeocoordinate extends StObject {
    
    var accuracy: Double = js.native
    
    var altitude: Double = js.native
    
    var altitudeAccuracy: Double = js.native
    
    var heading: Double = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var speed: Double = js.native
    
    var timestamp: Date = js.native
  }
  object IGeocoordinate {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IGeocoordinateMutableBuilder[Self <: IGeocoordinate] (val x: Self) extends AnyVal {
      
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
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait IGeoposition extends StObject {
    
    var civicAddress: CivicAddress = js.native
    
    var coordinate: Geocoordinate = js.native
  }
  object IGeoposition {
    
    @scala.inline
    def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): IGeoposition = {
      val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeoposition]
    }
    
    @scala.inline
    implicit class IGeopositionMutableBuilder[Self <: IGeoposition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCivicAddress(value: CivicAddress): Self = StObject.set(x, "civicAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinate(value: Geocoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPositionChangedEventArgs extends StObject {
    
    var position: Geoposition = js.native
  }
  object IPositionChangedEventArgs {
    
    @scala.inline
    def apply(position: Geoposition): IPositionChangedEventArgs = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionChangedEventArgs]
    }
    
    @scala.inline
    implicit class IPositionChangedEventArgsMutableBuilder[Self <: IPositionChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Geoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IStatusChangedEventArgs extends StObject {
    
    var status: PositionStatus = js.native
  }
  object IStatusChangedEventArgs {
    
    @scala.inline
    def apply(status: PositionStatus): IStatusChangedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStatusChangedEventArgs]
    }
    
    @scala.inline
    implicit class IStatusChangedEventArgsMutableBuilder[Self <: IStatusChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: PositionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PositionChangedEventArgs extends IPositionChangedEventArgs
  object PositionChangedEventArgs {
    
    @scala.inline
    def apply(position: Geoposition): PositionChangedEventArgs = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionChangedEventArgs]
    }
  }
  
  @js.native
  trait StatusChangedEventArgs extends IStatusChangedEventArgs
  object StatusChangedEventArgs {
    
    @scala.inline
    def apply(status: PositionStatus): StatusChangedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusChangedEventArgs]
    }
  }
}
