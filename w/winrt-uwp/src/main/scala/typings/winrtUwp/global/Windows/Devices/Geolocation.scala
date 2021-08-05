package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason
import typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState
import typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates
import typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus
import typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType
import typings.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import typings.winrtUwp.Windows.Devices.Geolocation.PositionSource
import typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for getting the current location or tracking the device's location over time. Location information may come from estimating a position from beacons like Wi-Fi access points and cell towers, from the device's IP address, or it may come from other sources such as a GNSS or GPS device. The Windows.Devices.Geolocation API provides the most appropriate geolocation data from all available sources. */
object Geolocation {
  
  /** Indicates the altitude reference system to be used in defining a geographic shape. */
  @JSGlobal("Windows.Devices.Geolocation.AltitudeReferenceSystem")
  @js.native
  object AltitudeReferenceSystem extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem & Double] = js.native
    
    /* 2 */ val ellipsoid: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.ellipsoid & Double = js.native
    
    /* 3 */ val geoid: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.geoid & Double = js.native
    
    /* 4 */ val surface: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.surface & Double = js.native
    
    /* 1 */ val terrain: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.terrain & Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem.unspecified & Double = js.native
  }
  
  /** Unsupported API. */
  @JSGlobal("Windows.Devices.Geolocation.CivicAddress")
  @js.native
  abstract class CivicAddress ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.CivicAddress {
    
    /** Unsupported API. */
    /* CompleteClass */
    var city: String = js.native
    
    /** Unsupported API. */
    /* CompleteClass */
    var country: String = js.native
    
    /** Unsupported API. */
    /* CompleteClass */
    var postalCode: String = js.native
    
    /** Unsupported API. */
    /* CompleteClass */
    var state: String = js.native
    
    /** Unsupported API. */
    /* CompleteClass */
    var timestamp: Date = js.native
  }
  
  /** Represents a rectangle that defines a geographic area. */
  @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
  @js.native
  class GeoboundingBox protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox {
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
    
    /** Gets the altitude reference system used by the GeoboundingBox . */
    /* CompleteClass */
    var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
    
    /** Gets the center of the GeoboundingBox . */
    /* CompleteClass */
    var center: BasicGeoposition = js.native
    
    /** Gets the type of geographic shape represented by the GeoboundingBox . */
    /* CompleteClass */
    var geoshapeType: GeoshapeType = js.native
    
    /** Gets the altitude of the highest corner of the GeoboundingBox . */
    /* CompleteClass */
    var maxAltitude: Double = js.native
    
    /** Gets the altitude of the lowest corner of the GeoboundingBox . */
    /* CompleteClass */
    var minAltitude: Double = js.native
    
    /** Gets the northwest corner of the GeoboundingBox . */
    /* CompleteClass */
    var northwestCorner: BasicGeoposition = js.native
    
    /** Gets the southeast corner of the GeoboundingBox . */
    /* CompleteClass */
    var southeastCorner: BasicGeoposition = js.native
    
    /** Gets the spatial reference ID (SRID) used by the GeoboundingBox . */
    /* CompleteClass */
    var spatialReferenceId: Double = js.native
  }
  object GeoboundingBox {
    
    @JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions.
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    inline def tryCompute(positions: IIterable[BasicGeoposition]): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCompute")(positions.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox]
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system.
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    inline def tryCompute(positions: IIterable[BasicGeoposition], altitudeRefSystem: AltitudeReferenceSystem): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCompute")(positions.asInstanceOf[js.Any], altitudeRefSystem.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox]
    /**
      * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system and spatial reference ID (SRID).
      * @param positions A collection of geographic positions to include inside the GeoboundingBox .
      * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
      * @param spatialReferenceId The spatial reference ID (SRID) to use for the GeoboundingBox . For more info, see the SpatialReferenceId property.
      * @return The calculated rectangle that contains the specified set of geographic positions.
      */
    /* static member */
    inline def tryCompute(
      positions: IIterable[BasicGeoposition],
      altitudeRefSystem: AltitudeReferenceSystem,
      spatialReferenceId: Double
    ): typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCompute")(positions.asInstanceOf[js.Any], altitudeRefSystem.asInstanceOf[js.Any], spatialReferenceId.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Geolocation.GeoboundingBox]
  }
  
  /** Describes a geographic circle with a center point and a radius. */
  @JSGlobal("Windows.Devices.Geolocation.Geocircle")
  @js.native
  class Geocircle protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geocircle {
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
    
    /** The altitude reference system of the geographic circle. */
    /* CompleteClass */
    var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
    
    /** The center point of a geographic circle. */
    /* CompleteClass */
    var center: BasicGeoposition = js.native
    
    /** The type of geographic shape. */
    /* CompleteClass */
    var geoshapeType: GeoshapeType = js.native
    
    /** The radius of a geographic circle in meters. */
    /* CompleteClass */
    var radius: Double = js.native
    
    /** The spatial reference identifier for the geographic circle, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
    /* CompleteClass */
    var spatialReferenceId: Double = js.native
  }
  
  /** Contains the information for identifying a geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
  @js.native
  abstract class Geocoordinate ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geocoordinate {
    
    /** The accuracy of the location in meters. */
    /* CompleteClass */
    var accuracy: Double = js.native
    
    /** The altitude of the location, in meters. */
    /* CompleteClass */
    var altitude: Double = js.native
    
    /** The accuracy of the altitude, in meters. */
    /* CompleteClass */
    var altitudeAccuracy: Double = js.native
    
    /** The current heading in degrees relative to true north. */
    /* CompleteClass */
    var heading: Double = js.native
    
    /** The latitude in degrees. */
    /* CompleteClass */
    var latitude: Double = js.native
    
    /** The longitude in degrees. */
    /* CompleteClass */
    var longitude: Double = js.native
    
    /** The location of the Geocoordinate. */
    /* CompleteClass */
    var point: typings.winrtUwp.Windows.Devices.Geolocation.Geopoint = js.native
    
    /** Gets the source used to obtain a Geocoordinate. */
    /* CompleteClass */
    var positionSource: PositionSource = js.native
    
    /** Gets the time at which the associated Geocoordinate position was calculated. */
    /* CompleteClass */
    var positionSourceTimestamp: Date = js.native
    
    /** Gets information about the satellites used to obtain a Geocoordinate. */
    /* CompleteClass */
    var satelliteData: typings.winrtUwp.Windows.Devices.Geolocation.GeocoordinateSatelliteData = js.native
    
    /** The speed in meters per second. */
    /* CompleteClass */
    var speed: Double = js.native
    
    /** The system time at which the location was determined. */
    /* CompleteClass */
    var timestamp: Date = js.native
  }
  
  /** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
  @JSGlobal("Windows.Devices.Geolocation.GeocoordinateSatelliteData")
  @js.native
  abstract class GeocoordinateSatelliteData ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.GeocoordinateSatelliteData {
    
    /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
    /* CompleteClass */
    var horizontalDilutionOfPrecision: Double = js.native
    
    /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
    /* CompleteClass */
    var positionDilutionOfPrecision: Double = js.native
    
    /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
    /* CompleteClass */
    var verticalDilutionOfPrecision: Double = js.native
  }
  
  /** A geofence is a virtual area around a geographical point. The geofencing APIs enable applications to provide geographically contextual experiences in a timely manner without the need for the app to be continuously running and consuming device resources. Geofencing enables scenarios like popping up a reminder for a user when they are leaving work or home or displaying coupons when the user gets within range of a store. */
  object Geofencing {
    
    /** Contains the information to define a geofence, an area of interest, to monitor. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.Geofence")
    @js.native
    class Geofence protected ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.Geofence {
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
      
      /** Gets the time window, beginning after the StartTime , during which the Geofence is monitored. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** The minimum time that a position has to be inside or outside of the Geofence in order for the notification to be triggered. */
      /* CompleteClass */
      var dwellTime: Double = js.native
      
      /** The shape of the geofence region. */
      /* CompleteClass */
      var geoshape: IGeoshape = js.native
      
      /** The id of the Geofence . */
      /* CompleteClass */
      var id: String = js.native
      
      /** Indicates the states that the Geofence is being monitored for. */
      /* CompleteClass */
      var monitoredStates: MonitoredGeofenceStates = js.native
      
      /** Indicates whether the Geofence should be triggered once or multiple times. */
      /* CompleteClass */
      var singleUse: Boolean = js.native
      
      /** The time to start monitoring the Geofence . */
      /* CompleteClass */
      var startTime: Date = js.native
    }
    
    /** Contains the information about the monitored Geofence objects. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
    @js.native
    abstract class GeofenceMonitor ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor
    object GeofenceMonitor {
      
      @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the GeofenceMonitor object which contains all of an app's Geofence information. */
      /* static member */
      @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor.current")
      @js.native
      def current: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor = js.native
      inline def current_=(x: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
    }
    
    /** Indicates the current state of a GeofenceMonitor . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus")
    @js.native
    object GeofenceMonitorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus & Double
          ] = js.native
      
      /* 3 */ val disabled: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.disabled & Double = js.native
      
      /* 1 */ val initializing: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.initializing & Double = js.native
      
      /* 2 */ val noData: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.noData & Double = js.native
      
      /* 5 */ val notAvailable: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notAvailable & Double = js.native
      
      /* 4 */ val notInitialized: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.notInitialized & Double = js.native
      
      /* 0 */ val ready: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus.ready & Double = js.native
    }
    
    /** Indicates the reason a Geofence was removed. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason")
    @js.native
    object GeofenceRemovalReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason & Double
          ] = js.native
      
      /* 1 */ val expired: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.expired & Double = js.native
      
      /* 0 */ val used: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceRemovalReason.used & Double = js.native
    }
    
    /** Indicates the current state of a Geofence . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceState")
    @js.native
    object GeofenceState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState & Double] = js.native
      
      /* 1 */ val entered: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.entered & Double = js.native
      
      /* 2 */ val exited: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.exited & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.none & Double = js.native
      
      /* 3 */ val removed: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceState.removed & Double = js.native
    }
    
    /** Contains the information about the state changes for a Geofence . */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport")
    @js.native
    abstract class GeofenceStateChangeReport ()
      extends StObject
         with typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.GeofenceStateChangeReport {
      
      /** The Geofence object whose state has changed. */
      /* CompleteClass */
      var geofence: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.Geofence = js.native
      
      /** The position of the Geofence object whose state has changed. */
      /* CompleteClass */
      var geoposition: typings.winrtUwp.Windows.Devices.Geolocation.Geoposition = js.native
      
      /** The new state of the Geofence object whose state has changed. */
      /* CompleteClass */
      var newState: GeofenceState = js.native
      
      /** Indicates the reason a Geofence was removed. */
      /* CompleteClass */
      var removalReason: GeofenceRemovalReason = js.native
    }
    
    /** Indicates the state or states of the Geofences that are currently being monitored by the system. */
    @JSGlobal("Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates")
    @js.native
    object MonitoredGeofenceStates extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates & Double
          ] = js.native
      
      /* 1 */ val entered: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.entered & Double = js.native
      
      /* 2 */ val exited: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.exited & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.none & Double = js.native
      
      /* 3 */ val removed: typings.winrtUwp.Windows.Devices.Geolocation.Geofencing.MonitoredGeofenceStates.removed & Double = js.native
    }
  }
  
  /** Indicates if your app has permission to access location data. */
  @JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
  @js.native
  object GeolocationAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus & Double] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed & Double = js.native
    
    /* 2 */ val denied: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied & Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified & Double = js.native
  }
  
  /** Provides access to the current geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.Geolocator")
  @js.native
  /** Initializes a new Geolocator object. */
  class Geolocator ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geolocator
  object Geolocator {
    
    @JSGlobal("Windows.Devices.Geolocation.Geolocator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Starts an asynchronous operation to retrieve the location history of the device.
      * @param startTime Represents the beginning of the time span for which positions are to be returned.
      * @return Positions (of type Geoposition ) that were collected during the specified time span.
      */
    /* static member */
    inline def getGeopositionHistoryAsync(startTime: Date): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeopositionHistoryAsync")(startTime.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    /**
      * Starts an asynchronous operation to retrieve the location history of the device.
      * @param startTime Represents the beginning of the time span for which positions are to be returned.
      * @param duration Represents the length of time after startTime for which positions are to be returned.
      * @return Positions (of type Geoposition ) that were collected during the specified time span.
      */
    /* static member */
    inline def getGeopositionHistoryAsync(startTime: Date, duration: Double): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGeopositionHistoryAsync")(startTime.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Requests permission to access location data.
      * @return A GeolocationAccessStatus that indicates if permission to location data has been granted.
      */
    /* static member */
    inline def requestAccessAsync(): IPromiseWithIAsyncOperation[GeolocationAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[GeolocationAccessStatus]]
  }
  
  /** Represents an ordered series of geographic points. */
  @JSGlobal("Windows.Devices.Geolocation.Geopath")
  @js.native
  class Geopath protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geopath {
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
    
    /** Gets the altitude reference system used by the Geopath . */
    /* CompleteClass */
    var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
    
    /** Gets the type of geographic shape represented by the Geopath . */
    /* CompleteClass */
    var geoshapeType: GeoshapeType = js.native
    
    /** Gets the collection of geographic points that define the Geopath . */
    /* CompleteClass */
    var positions: IVectorView[BasicGeoposition] = js.native
    
    /** Gets the spatial reference ID (SRID) used by the Geopath . */
    /* CompleteClass */
    var spatialReferenceId: Double = js.native
  }
  
  /** Describes a geographic point. */
  @JSGlobal("Windows.Devices.Geolocation.Geopoint")
  @js.native
  class Geopoint protected ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geopoint {
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
    
    /** The altitude reference system of the geographic point. */
    /* CompleteClass */
    var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
    
    /** The type of geographic shape. */
    /* CompleteClass */
    var geoshapeType: GeoshapeType = js.native
    
    /** The position of a geographic point. */
    /* CompleteClass */
    var position: BasicGeoposition = js.native
    
    /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
    /* CompleteClass */
    var spatialReferenceId: Double = js.native
  }
  
  /** Represents a location that may contain latitude and longitude data or venue data. */
  @JSGlobal("Windows.Devices.Geolocation.Geoposition")
  @js.native
  abstract class Geoposition ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.Geoposition {
    
    /** Unsupported API. */
    /* CompleteClass */
    var civicAddress: typings.winrtUwp.Windows.Devices.Geolocation.CivicAddress = js.native
    
    /** The latitude and longitude associated with a geographic location. */
    /* CompleteClass */
    var coordinate: typings.winrtUwp.Windows.Devices.Geolocation.Geocoordinate = js.native
    
    /** Represents the venue associated with a geographic location. */
    /* CompleteClass */
    var venueData: typings.winrtUwp.Windows.Devices.Geolocation.VenueData = js.native
  }
  
  /** Indicates the shape of a geographic region. */
  @JSGlobal("Windows.Devices.Geolocation.GeoshapeType")
  @js.native
  object GeoshapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType & Double] = js.native
    
    /* 3 */ val geoboundingBox: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geoboundingBox & Double = js.native
    
    /* 1 */ val geocircle: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geocircle & Double = js.native
    
    /* 2 */ val geopath: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geopath & Double = js.native
    
    /* 0 */ val geopoint: typings.winrtUwp.Windows.Devices.Geolocation.GeoshapeType.geopoint & Double = js.native
  }
  
  /** Indicates the requested accuracy level for the location data that the application uses. */
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy & Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy.default & Double = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Devices.Geolocation.PositionAccuracy.high & Double = js.native
  }
  
  /** Provides data for the PositionChanged event. */
  @JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
  @js.native
  abstract class PositionChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.PositionChangedEventArgs {
    
    /** The location data associated with the PositionChanged event. */
    /* CompleteClass */
    var position: typings.winrtUwp.Windows.Devices.Geolocation.Geoposition = js.native
  }
  
  /** Indicates the source used to obtain a Geocoordinate . */
  @JSGlobal("Windows.Devices.Geolocation.PositionSource")
  @js.native
  object PositionSource extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionSource & Double] = js.native
    
    /* 0 */ val cellular: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.cellular & Double = js.native
    
    /* 3 */ val ipAddress: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.ipAddress & Double = js.native
    
    /* 1 */ val satellite: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.satellite & Double = js.native
    
    /* 4 */ val unknown: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.unknown & Double = js.native
    
    /* 2 */ val wiFi: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.wiFi & Double = js.native
  }
  
  /** Indicates the ability of the Geolocator object to provide location data. */
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus & Double] = js.native
    
    /* 3 */ val disabled: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.disabled & Double = js.native
    
    /* 1 */ val initializing: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.initializing & Double = js.native
    
    /* 2 */ val noData: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.noData & Double = js.native
    
    /* 5 */ val notAvailable: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.notAvailable & Double = js.native
    
    /* 4 */ val notInitialized: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.notInitialized & Double = js.native
    
    /* 0 */ val ready: typings.winrtUwp.Windows.Devices.Geolocation.PositionStatus.ready & Double = js.native
  }
  
  /** Provides information for the StatusChanged event. */
  @JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
  @js.native
  abstract class StatusChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.StatusChangedEventArgs {
    
    /** The updated status of the Geolocator object. */
    /* CompleteClass */
    var status: PositionStatus = js.native
  }
  
  /** Represents the venue associated with a geographic location. */
  @JSGlobal("Windows.Devices.Geolocation.VenueData")
  @js.native
  abstract class VenueData ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Geolocation.VenueData {
    
    /** Gets the identifier (ID) of the venue. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the identifier (ID) of the building level. */
    /* CompleteClass */
    var level: String = js.native
  }
}
