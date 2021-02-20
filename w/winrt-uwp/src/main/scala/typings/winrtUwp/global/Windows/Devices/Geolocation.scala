package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates
import typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus
import typings.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for getting the current location or tracking the device's location over time. Location information may come from estimating a position from beacons like Wi-Fi access points and cell towers, from the device's IP address, or it may come from other sources such as a GNSS or GPS device. The Windows.Devices.Geolocation API provides the most appropriate geolocation data from all available sources. */
object Geolocation {
  
  /** Indicates the altitude reference system to be used in defining a geographic shape. */
  @JSGlobal("Windows.Devices.Geolocation.AltitudeReferenceSystem")
  @js.native
  object AltitudeReferenceSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem with Double] = js.native
    
    /* 2 */ val ellipsoid: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.ellipsoid with Double = js.native
    
    /* 3 */ val geoid: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.geoid with Double = js.native
    
    /* 4 */ val surface: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.surface with Double = js.native
    
    /* 1 */ val terrain: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.terrain with Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.unspecified with Double = js.native
  }
  
  /** Unsupported API. */
  @JSGlobal("Windows.Devices.Geolocation.CivicAddress")
  @js.native
  abstract class CivicAddress ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.CivicAddress
  
  /** Represents a rectangle that defines a geographic area. */
  @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
  @js.native
  class GeoboundingBox protected ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox {
    /**
      * Initializes a new instance of the GeoboundingBox class that has the specified corners.
      * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
      * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
      */
    def this(northwestCorner: BasicGeoposition, southeastCorner: BasicGeoposition) = this()
    /**
      * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system.
      * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
      * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
      * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      */
    def this(
      northwestCorner: BasicGeoposition,
      southeastCorner: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem
    ) = this()
    /**
      * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system and spatial reference ID (SRID).
      * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
      * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
      * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      * @param spatialReferenceId The spatial reference ID (SRID) to use for the new GeoboundingBox . For more info, see the SpatialReferenceId property.
      */
    def this(
      northwestCorner: BasicGeoposition,
      southeastCorner: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ) = this()
  }
  object GeoboundingBox {
    
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions.
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox.tryCompute")
    @js.native
    def tryCompute(positions: IIterable[BasicGeoposition]): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system.
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox.tryCompute")
    @js.native
    def tryCompute(positions: IIterable[BasicGeoposition], altitudeRefSystem: AltitudeReferenceSystem): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system and spatial reference ID (SRID).
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      * @param spatialReferenceId The spatial reference ID (SRID) to use for the GeoboundingBox . For more info, see the SpatialReferenceId property.
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox.tryCompute")
    @js.native
    def tryCompute(
      positions: IIterable[BasicGeoposition],
      altitudeRefSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = js.native
  }
  
  /** Describes a geographic circle with a center point and a radius. */
  @JSGlobal("Windows.Devices.Geolocation.Geocircle")
  @js.native
  class Geocircle protected ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geocircle {
    /**
      * Create a geographic circle object for the given position and radius.
      * @param position The geographic position of the new circle.
      * @param radius The radius of the new circle, in meters.
      */
    def this(position: BasicGeoposition, radius: Double) = this()
    /**
      * Create a geographic circle object for the given position, radius and altitude reference system.
      * @param position The geographic position of the new circle.
      * @param radius The radius of the new circle, in meters.
      * @param altitudeReferenceSystem The altitude reference system of the new circle.
      */
    def this(position: BasicGeoposition, radius: Double, altitudeReferenceSystem: AltitudeReferenceSystem) = this()
    /**
      * Create a geographic circle object for the given position, radius, altitude reference system, and spatial reference id.
      * @param position The geographic position of the new circle.
      * @param radius The radius of the new circle, in meters.
      * @param altitudeReferenceSystem The altitude reference system of the new circle.
      * @param spatialReferenceId The spatial reference Id of the new circle.
      */
    def this(
      position: BasicGeoposition,
      radius: Double,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ) = this()
  }
  
  /** Contains the information for identifying a geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
  @js.native
  abstract class Geocoordinate ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geocoordinate
  
  /** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
  @JSGlobal("Windows.Devices.Geolocation.GeocoordinateSatelliteData")
  @js.native
  abstract class GeocoordinateSatelliteData ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.GeocoordinateSatelliteData
  
  /** A geofence is a virtual area around a geographical point. The geofencing APIs enable applications to provide geographically contextual experiences in a timely manner without the need for the app to be continuously running and consuming device resources. Geofencing enables scenarios like popping up a reminder for a user when they are leaving work or home or displaying coupons when the user gets within range of a store. */
  object Geofencing {
    
    /** Contains the information to define a geofence, an area of interest, to monitor. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.Geofence")
    @js.native
    class Geofence protected ()
      extends typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.Geofence {
      /**
        * Initializes a new Geofence object given the id and the shape of the geofence.
        * @param id The Id of the geofence.
        * @param geoshape The area that defines the geofence to monitor.
        */
      def this(id: String, geoshape: IGeoshape) = this()
      /**
        * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, and the singleUse flag.
        * @param id The Id of the geofence.
        * @param geoshape The area that defines the geofence to monitor.
        * @param monitoredStates The states to monitor the geofence for.
        * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
        */
      def this(id: String, geoshape: IGeoshape, monitoredStates: MonitoredGeofenceStates, singleUse: Boolean) = this()
      /**
        * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, and the dwellTime for the geofence.
        * @param id The Id of the geofence.
        * @param geoshape The area that defines the geofence to monitor.
        * @param monitoredStates The states to monitor the geofence for.
        * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
        * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
        */
      def this(
        id: String,
        geoshape: IGeoshape,
        monitoredStates: MonitoredGeofenceStates,
        singleUse: Boolean,
        dwellTime: Double
      ) = this()
      /**
        * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, the dwellTime for the geofence, the time to start monitoring the geofence, and the duration of the geofence.
        * @param id The Id of the geofence.
        * @param geoshape The area that defines the geofence to monitor.
        * @param monitoredStates The states to monitor the geofence for.
        * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
        * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
        * @param startTime The time to start monitoring the geofence.
        * @param duration The duration of time to monitor the geofence for. The duration begins at the startTime.
        */
      def this(
        id: String,
        geoshape: IGeoshape,
        monitoredStates: MonitoredGeofenceStates,
        singleUse: Boolean,
        dwellTime: Double,
        startTime: Date,
        duration: Double
      ) = this()
    }
    
    /** Contains the information about the monitored Geofence objects. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
    @js.native
    abstract class GeofenceMonitor ()
      extends typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor
    object GeofenceMonitor {
      
      @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the GeofenceMonitor object which contains all of an app's Geofence information. */
      /* static member */
      @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor.current")
      @js.native
      def current: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor = js.native
      @scala.inline
      def current_=(x: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    }
    
    /** Indicates the current state of a GeofenceMonitor . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus")
    @js.native
    object GeofenceMonitorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus with Double
          ] = js.native
      
      /* 3 */ val disabled: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.disabled with Double = js.native
      
      /* 1 */ val initializing: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.initializing with Double = js.native
      
      /* 2 */ val noData: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.noData with Double = js.native
      
      /* 5 */ val notAvailable: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notAvailable with Double = js.native
      
      /* 4 */ val notInitialized: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notInitialized with Double = js.native
      
      /* 0 */ val ready: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.ready with Double = js.native
    }
    
    /** Indicates the reason a Geofence was removed. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason")
    @js.native
    object GeofenceRemovalReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason with Double
          ] = js.native
      
      /* 1 */ val expired: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.expired with Double = js.native
      
      /* 0 */ val used: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.used with Double = js.native
    }
    
    /** Indicates the current state of a Geofence . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceState")
    @js.native
    object GeofenceState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState with Double
          ] = js.native
      
      /* 1 */ val entered: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.entered with Double = js.native
      
      /* 2 */ val exited: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.exited with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.none with Double = js.native
      
      /* 3 */ val removed: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.removed with Double = js.native
    }
    
    /** Contains the information about the state changes for a Geofence . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport")
    @js.native
    abstract class GeofenceStateChangeReport ()
      extends typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport
    
    /** Indicates the state or states of the Geofences that are currently being monitored by the system. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
    @js.native
    object MonitoredGeofenceStates extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates with Double
          ] = js.native
      
      /* 1 */ val entered: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.entered with Double = js.native
      
      /* 2 */ val exited: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.exited with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.none with Double = js.native
      
      /* 3 */ val removed: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.removed with Double = js.native
    }
  }
  
  /** Indicates if your app has permission to access location data. */
  @JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
  @js.native
  object GeolocationAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus with Double] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed with Double = js.native
    
    /* 2 */ val denied: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied with Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified with Double = js.native
  }
  
  /** Provides access to the current geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.Geolocator")
  @js.native
  /** Initializes a new Geolocator object. */
  class Geolocator ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geolocator
  object Geolocator {
    
    /**
      * Starts an asynchronous operation to retrieve the location history of the device.
      * @param startTime Represents the beginning of the time span for which positions are to be returned.
      * @return Positions (of type Geoposition ) that were collected during the specified time span.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.Geolocator.getGeopositionHistoryAsync")
    @js.native
    def getGeopositionHistoryAsync(startTime: Date): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Starts an asynchronous operation to retrieve the location history of the device.
      * @param startTime Represents the beginning of the time span for which positions are to be returned.
      * @param duration Represents the length of time after startTime for which positions are to be returned.
      * @return Positions (of type Geoposition ) that were collected during the specified time span.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.Geolocator.getGeopositionHistoryAsync")
    @js.native
    def getGeopositionHistoryAsync(startTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Requests permission to access location data.
      * @return A GeolocationAccessStatus that indicates if permission to location data has been granted.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Geolocation.Geolocator.requestAccessAsync")
    @js.native
    def requestAccessAsync(): IPromiseWithIAsyncOperation[GeolocationAccessStatus] = js.native
  }
  
  /** Represents an ordered series of geographic points. */
  @JSGlobal("Windows.Devices.Geolocation.Geopath")
  @js.native
  class Geopath protected ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geopath {
    /**
      * Initializes a new instance of the Geopath class with the specified collection of positions.
      * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
      */
    def this(positions: IIterable[BasicGeoposition]) = this()
    /**
      * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system.
      * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
      * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
      */
    def this(positions: IIterable[BasicGeoposition], altitudeReferenceSystem: AltitudeReferenceSystem) = this()
    /**
      * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system and spatial reference ID (SRID).
      * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
      * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
      * @param spatialReferenceId The spatial reference ID (SRID) to use to create the new Geopath . For more info, see the SpatialReferenceId property.
      */
    def this(
      positions: IIterable[BasicGeoposition],
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ) = this()
  }
  
  /** Describes a geographic point. */
  @JSGlobal("Windows.Devices.Geolocation.Geopoint")
  @js.native
  class Geopoint protected ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geopoint {
    /**
      * Create a geographic point object for the given position.
      * @param position Create a geographic point object for the given position.
      */
    def this(position: BasicGeoposition) = this()
    /**
      * Create a geographic point object for the given position and altitude reference system.
      * @param position Create a geographic point object for the given position.
      * @param altitudeReferenceSystem The altitude reference system of the new point.
      */
    def this(position: BasicGeoposition, altitudeReferenceSystem: AltitudeReferenceSystem) = this()
    /**
      * Create a geographic point object for the given position, altitude reference system, and spatial reference Id.
      * @param position Create a geographic point object for the given position.
      * @param altitudeReferenceSystem The altitude reference system of the new point.
      * @param spatialReferenceId The spatial reference Id of the new point.
      */
    def this(
      position: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ) = this()
  }
  
  /** Represents a location that may contain latitude and longitude data or venue data. */
  @JSGlobal("Windows.Devices.Geolocation.Geoposition")
  @js.native
  abstract class Geoposition ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.Geoposition
  
  /** Indicates the shape of a geographic region. */
  @JSGlobal("Windows.Devices.Geolocation.GeoshapeType")
  @js.native
  object GeoshapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType with Double] = js.native
    
    /* 3 */ val geoboundingBox: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geoboundingBox with Double = js.native
    
    /* 1 */ val geocircle: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geocircle with Double = js.native
    
    /* 2 */ val geopath: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geopath with Double = js.native
    
    /* 0 */ val geopoint: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geopoint with Double = js.native
  }
  
  /** Indicates the requested accuracy level for the location data that the application uses. */
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy.default with Double = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy.high with Double = js.native
  }
  
  /** Provides data for the PositionChanged event. */
  @JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
  @js.native
  abstract class PositionChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.PositionChangedEventArgs
  
  /** Indicates the source used to obtain a Geocoordinate . */
  @JSGlobal("Windows.Devices.Geolocation.PositionSource")
  @js.native
  object PositionSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionSource with Double] = js.native
    
    /* 0 */ val cellular: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.cellular with Double = js.native
    
    /* 3 */ val ipAddress: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.ipAddress with Double = js.native
    
    /* 1 */ val satellite: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.satellite with Double = js.native
    
    /* 4 */ val unknown: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.unknown with Double = js.native
    
    /* 2 */ val wiFi: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.wiFi with Double = js.native
  }
  
  /** Indicates the ability of the Geolocator object to provide location data. */
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus with Double] = js.native
    
    /* 3 */ val disabled: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.disabled with Double = js.native
    
    /* 1 */ val initializing: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.initializing with Double = js.native
    
    /* 2 */ val noData: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.noData with Double = js.native
    
    /* 5 */ val notAvailable: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.notAvailable with Double = js.native
    
    /* 4 */ val notInitialized: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.notInitialized with Double = js.native
    
    /* 0 */ val ready: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.ready with Double = js.native
  }
  
  /** Provides information for the StatusChanged event. */
  @JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
  @js.native
  abstract class StatusChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.StatusChangedEventArgs
  
  /** Represents the venue associated with a geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.VenueData")
  @js.native
  abstract class VenueData ()
    extends typings.winrtUwp.Windows.Devices.Geolocation.VenueData
}
