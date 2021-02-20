package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.ForwardGeocodeResponse
import typings.titanium.HeadingResponse
import typings.titanium.LocationAccuracyAuthorizationResponse
import typings.titanium.LocationAuthorizationResponse
import typings.titanium.LocationResults
import typings.titanium.ReverseGeocodeResponse
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.GeolocationAuthorizationEvent
import typings.titanium.Titanium.GeolocationCalibrationEvent
import typings.titanium.Titanium.GeolocationHeadingEvent
import typings.titanium.Titanium.GeolocationLocationEvent
import typings.titanium.Titanium.GeolocationLocationupdatepausedEvent
import typings.titanium.Titanium.GeolocationLocationupdateresumedEvent
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.titaniumStrings.authorization
import typings.titanium.titaniumStrings.calibration
import typings.titanium.titaniumStrings.heading
import typings.titanium.titaniumStrings.location
import typings.titanium.titaniumStrings.locationupdatepaused
import typings.titanium.titaniumStrings.locationupdateresumed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
  */
@JSGlobal("Titanium.Geolocation")
@js.native
class Geolocation ()
  extends typings.titanium.Titanium.Proxy
/**
  * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
  */
object Geolocation {
  
  @JSGlobal("Titanium.Geolocation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The user authorized the app to access location data with full accuracy.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_AUTHORIZATION_FULL")
  @js.native
  val ACCURACY_AUTHORIZATION_FULL: Double = js.native
  
  /**
    * The user authorized the app to access location data with reduced accuracy.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_AUTHORIZATION_REDUCED")
  @js.native
  val ACCURACY_AUTHORIZATION_REDUCED: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request the best
    * accuracy available.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_BEST")
  @js.native
  val ACCURACY_BEST: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request highest possible
    * accuracy and combine it with additional sensor data.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_BEST_FOR_NAVIGATION")
  @js.native
  val ACCURACY_BEST_FOR_NAVIGATION: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request more
    * accurate location updates with higher battery usage.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_HIGH")
  @js.native
  val ACCURACY_HIGH: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest 100 meters.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_HUNDRED_METERS")
  @js.native
  val ACCURACY_HUNDRED_METERS: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest kilometer.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_KILOMETER")
  @js.native
  val ACCURACY_KILOMETER: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request less
    * accurate location updates with lower battery usage.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_LOW")
  @js.native
  val ACCURACY_LOW: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest 10 meters.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_NEAREST_TEN_METERS")
  @js.native
  val ACCURACY_NEAREST_TEN_METERS: Double = js.native
  
  /**
    * The level of accuracy used when an app isn’t authorized for full accuracy location data.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_REDUCED")
  @js.native
  val ACCURACY_REDUCED: Double = js.native
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest three kilometers.
    */
  @JSGlobal("Titanium.Geolocation.ACCURACY_THREE_KILOMETERS")
  @js.native
  val ACCURACY_THREE_KILOMETERS: Double = js.native
  
  /**
    * The location data is used for tracking location changes to the automobile specifically during vehicular navigation.
    */
  @JSGlobal("Titanium.Geolocation.ACTIVITYTYPE_AUTOMOTIVE_NAVIGATION")
  @js.native
  val ACTIVITYTYPE_AUTOMOTIVE_NAVIGATION: String = js.native
  
  /**
    * The location data is used for tracking any pedestrian-related activity.
    */
  @JSGlobal("Titanium.Geolocation.ACTIVITYTYPE_FITNESS")
  @js.native
  val ACTIVITYTYPE_FITNESS: String = js.native
  
  /**
    * The location data is being used for an unknown activity.
    */
  @JSGlobal("Titanium.Geolocation.ACTIVITYTYPE_OTHER")
  @js.native
  val ACTIVITYTYPE_OTHER: String = js.native
  
  /**
    * The location data is used for tracking movements of other types of vehicular
    * navigation that are not automobile related.
    */
  @JSGlobal("Titanium.Geolocation.ACTIVITYTYPE_OTHER_NAVIGATION")
  @js.native
  val ACTIVITYTYPE_OTHER_NAVIGATION: String = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to start location services at any time. This authorization
    * includes the use of all location services, including monitoring regions and significant location changes.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_ALWAYS")
  @js.native
  val AUTHORIZATION_ALWAYS: Double = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to use location services.
    * @deprecated Use [Titanium.Geolocation.AUTHORIZATION_ALWAYS](Titanium.Geolocation.AUTHORIZATION_ALWAYS) as advised by Apple.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_AUTHORIZED")
  @js.native
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is not authorized to use location services, *or*
    * location services are disabled.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_DENIED")
  @js.native
  val AUTHORIZATION_DENIED: Double = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is not authorized to use location servies *and*
    * the user cannot change this application's status.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_RESTRICTED")
  @js.native
  val AUTHORIZATION_RESTRICTED: Double = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the authorization state is unknown.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_UNKNOWN")
  @js.native
  val AUTHORIZATION_UNKNOWN: Double = js.native
  
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to start most location services only while running in the foreground.
    */
  @JSGlobal("Titanium.Geolocation.AUTHORIZATION_WHEN_IN_USE")
  @js.native
  val AUTHORIZATION_WHEN_IN_USE: Double = js.native
  
  /**
    * Module for Android-specific geolocation functionality.
    */
  @JSGlobal("Titanium.Geolocation.Android")
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  /**
    * Module for Android-specific geolocation functionality.
    */
  object Android {
    
    @JSGlobal("Titanium.Geolocation.Android")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Represents a source of location information, such as GPS.
      */
    @JSGlobal("Titanium.Geolocation.Android.LocationProvider")
    @js.native
    class LocationProvider ()
      extends typings.titanium.Titanium.Geolocation.Android.LocationProvider
    
    /**
      * A location rule to filter the results returned by location providers.
      */
    @JSGlobal("Titanium.Geolocation.Android.LocationRule")
    @js.native
    class LocationRule ()
      extends typings.titanium.Titanium.Geolocation.Android.LocationRule
    
    /**
      * Specifies the GPS location provider.
      */
    @JSGlobal("Titanium.Geolocation.Android.PROVIDER_GPS")
    @js.native
    val PROVIDER_GPS: String = js.native
    
    /**
      * Specifies the network location provider.
      */
    @JSGlobal("Titanium.Geolocation.Android.PROVIDER_NETWORK")
    @js.native
    val PROVIDER_NETWORK: String = js.native
    
    /**
      * Specifies the passive location provider.
      */
    @JSGlobal("Titanium.Geolocation.Android.PROVIDER_PASSIVE")
    @js.native
    val PROVIDER_PASSIVE: String = js.native
    
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.addEventListener")
    @js.native
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Adds and enables the specified location provider, possibly replacing an existing one.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.addLocationProvider")
    @js.native
    def addLocationProvider(provider: typings.titanium.Titanium.Geolocation.Android.LocationProvider): Unit = js.native
    
    /**
      * Adds and enables the specified location rule.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.addLocationRule")
    @js.native
    def addLocationRule(rule: typings.titanium.Titanium.Geolocation.Android.LocationRule): Unit = js.native
    
    /**
      * The name of the API that this proxy corresponds to.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.apiName")
    @js.native
    val apiName: String = js.native
    
    /**
      * Applies the properties to the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.applyProperties")
    @js.native
    def applyProperties(props: js.Any): Unit = js.native
    
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.bubbleParent")
    @js.native
    def bubbleParent: Boolean = js.native
    @scala.inline
    def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
    
    /**
      * Creates and returns an instance of <Titanium.Geolocation.Android.LocationProvider>.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.createLocationProvider")
    @js.native
    def createLocationProvider(): typings.titanium.Titanium.Geolocation.Android.LocationProvider = js.native
    @JSGlobal("Titanium.Geolocation.Android.createLocationProvider")
    @js.native
    def createLocationProvider(parameters: Dictionary[typings.titanium.Titanium.Geolocation.Android.LocationProvider]): typings.titanium.Titanium.Geolocation.Android.LocationProvider = js.native
    
    /**
      * Creates and returns an instance of <Titanium.Geolocation.Android.LocationRule>.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.createLocationRule")
    @js.native
    def createLocationRule(): typings.titanium.Titanium.Geolocation.Android.LocationRule = js.native
    @JSGlobal("Titanium.Geolocation.Android.createLocationRule")
    @js.native
    def createLocationRule(parameters: Dictionary[typings.titanium.Titanium.Geolocation.Android.LocationRule]): typings.titanium.Titanium.Geolocation.Android.LocationRule = js.native
    
    /**
      * Fires a synthesized event to any registered listeners.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.fireEvent")
    @js.native
    def fireEvent(name: String): Unit = js.native
    @JSGlobal("Titanium.Geolocation.Android.fireEvent")
    @js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.Geolocation.Android.apiName> property.
      * @deprecated Access <Titanium.Geolocation.Android.apiName> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.getApiName")
    @js.native
    def getApiName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
      * @deprecated Access <Titanium.Geolocation.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.getBubbleParent")
    @js.native
    def getBubbleParent(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.Geolocation.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.getLifecycleContainer")
    @js.native
    def getLifecycleContainer(): Window | TabGroup = js.native
    
    /**
      * Gets the value of the <Titanium.Geolocation.Android.manualMode> property.
      * @deprecated Access <Titanium.Geolocation.Android.manualMode> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.getManualMode")
    @js.native
    def getManualMode(): Boolean = js.native
    
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.lifecycleContainer")
    @js.native
    def lifecycleContainer: Window | TabGroup = js.native
    @scala.inline
    def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
    
    /**
      * Set to `true` to enable manual configuration of location updates through this module.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.manualMode")
    @js.native
    def manualMode: Boolean = js.native
    @scala.inline
    def manualMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manualMode")(x.asInstanceOf[js.Any])
    
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.removeEventListener")
    @js.native
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    
    /**
      * Disables and removes the specified location provider.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.removeLocationProvider")
    @js.native
    def removeLocationProvider(provider: typings.titanium.Titanium.Geolocation.Android.LocationProvider): Unit = js.native
    
    /**
      * Disables and removes the specified location rule.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.removeLocationRule")
    @js.native
    def removeLocationRule(rule: typings.titanium.Titanium.Geolocation.Android.LocationRule): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.bubbleParent> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.setBubbleParent")
    @js.native
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    
    @JSGlobal("Titanium.Geolocation.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.lifecycleContainer> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.setLifecycleContainer")
    @js.native
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.Geolocation.Android.manualMode> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.manualMode> instead.
      */
    /* static member */
    @JSGlobal("Titanium.Geolocation.Android.setManualMode")
    @js.native
    def setManualMode(manualMode: Boolean): Unit = js.native
  }
  
  /**
    * Error code indicating that the user denied access to the location service.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_DENIED")
  @js.native
  val ERROR_DENIED: Double = js.native
  
  /**
    * Error code indicating that the heading could not be determined.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_HEADING_FAILURE")
  @js.native
  val ERROR_HEADING_FAILURE: Double = js.native
  
  /**
    * Error code indicating that the user's location could not be determined.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_LOCATION_UNKNOWN")
  @js.native
  val ERROR_LOCATION_UNKNOWN: Double = js.native
  
  /**
    * Error code indicating that the network was unavailable.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_NETWORK")
  @js.native
  val ERROR_NETWORK: Double = js.native
  
  /**
    * Error code indicating that region monitoring is delayed.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_REGION_MONITORING_DELAYED")
  @js.native
  val ERROR_REGION_MONITORING_DELAYED: Double = js.native
  
  /**
    * Error code indicating that region monitoring is denied.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_REGION_MONITORING_DENIED")
  @js.native
  val ERROR_REGION_MONITORING_DENIED: Double = js.native
  
  /**
    * Error code indicating a region monitoring failure.
    */
  @JSGlobal("Titanium.Geolocation.ERROR_REGION_MONITORING_FAILURE")
  @js.native
  val ERROR_REGION_MONITORING_FAILURE: Double = js.native
  
  /**
    * Specifies the requested accuracy for location updates.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.accuracy")
  @js.native
  def accuracy: Double = js.native
  @scala.inline
  def accuracy_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(x.asInstanceOf[js.Any])
  
  /**
    * The type of user activity to be associated with the location updates.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.activityType")
  @js.native
  def activityType: Double = js.native
  @scala.inline
  def activityType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activityType")(x.asInstanceOf[js.Any])
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_authorization(
    name: authorization,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationAuthorizationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_calibration(
    name: calibration,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationCalibrationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_heading(
    name: heading,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationHeadingEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_location(
    name: location,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_locationupdatepaused(
    name: locationupdatepaused,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationupdatepausedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.addEventListener")
  @js.native
  def addEventListener_locationupdateresumed(
    name: locationupdateresumed,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationupdateresumedEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Determines if the app can do background location updates.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.allowsBackgroundLocationUpdates")
  @js.native
  def allowsBackgroundLocationUpdates: Boolean = js.native
  @scala.inline
  def allowsBackgroundLocationUpdates_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowsBackgroundLocationUpdates")(x.asInstanceOf[js.Any])
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * The minimum change of position (in meters) before a 'location' event is fired.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.distanceFilter")
  @js.native
  def distanceFilter: Double = js.native
  @scala.inline
  def distanceFilter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distanceFilter")(x.asInstanceOf[js.Any])
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_authorization(name: authorization): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_authorization(name: authorization, event: GeolocationAuthorizationEvent): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_calibration(name: calibration): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_calibration(name: calibration, event: GeolocationCalibrationEvent): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_heading(name: heading): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_heading(name: heading, event: GeolocationHeadingEvent): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_location(name: location): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_location(name: location, event: GeolocationLocationEvent): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_locationupdatepaused(name: locationupdatepaused): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_locationupdatepaused(name: locationupdatepaused, event: GeolocationLocationupdatepausedEvent): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_locationupdateresumed(name: locationupdateresumed): Unit = js.native
  @JSGlobal("Titanium.Geolocation.fireEvent")
  @js.native
  def fireEvent_locationupdateresumed(name: locationupdateresumed, event: GeolocationLocationupdateresumedEvent): Unit = js.native
  
  /**
    * Resolves an address to a location.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.forwardGeocoder")
  @js.native
  def forwardGeocoder(address: String, callback: js.Function1[/* param0 */ ForwardGeocodeResponse, Unit]): Unit = js.native
  
  /**
    * Requested frequency for location updates, in milliseconds.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.frequency")
  @js.native
  def frequency: Double = js.native
  @scala.inline
  def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the value of the <Titanium.Geolocation.accuracy> property.
    * @deprecated Access <Titanium.Geolocation.accuracy> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getAccuracy")
  @js.native
  def getAccuracy(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.activityType> property.
    * @deprecated Access <Titanium.Geolocation.activityType> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getActivityType")
  @js.native
  def getActivityType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
    * @deprecated Access <Titanium.Geolocation.allowsBackgroundLocationUpdates> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getAllowsBackgroundLocationUpdates")
  @js.native
  def getAllowsBackgroundLocationUpdates(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.apiName> property.
    * @deprecated Access <Titanium.Geolocation.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.bubbleParent> property.
    * @deprecated Access <Titanium.Geolocation.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Retrieves the current compass heading.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getCurrentHeading")
  @js.native
  def getCurrentHeading(callback: js.Function1[/* param0 */ HeadingResponse, Unit]): Unit = js.native
  
  /**
    * Retrieves the last known location from the device.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getCurrentPosition")
  @js.native
  def getCurrentPosition(callback: js.Function1[/* param0 */ LocationResults, Unit]): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.distanceFilter> property.
    * @deprecated Access <Titanium.Geolocation.distanceFilter> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getDistanceFilter")
  @js.native
  def getDistanceFilter(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.frequency> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getFrequency")
  @js.native
  def getFrequency(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.hasCompass> property.
    * @deprecated Access <Titanium.Geolocation.hasCompass> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getHasCompass")
  @js.native
  def getHasCompass(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.headingFilter> property.
    * @deprecated Access <Titanium.Geolocation.headingFilter> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getHeadingFilter")
  @js.native
  def getHeadingFilter(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.lastGeolocation> property.
    * @deprecated Access <Titanium.Geolocation.lastGeolocation> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getLastGeolocation")
  @js.native
  def getLastGeolocation(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.lifecycleContainer> property.
    * @deprecated Access <Titanium.Geolocation.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.locationAccuracyAuthorization> property.
    * @deprecated Access <Titanium.Geolocation.locationAccuracyAuthorization> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getLocationAccuracyAuthorization")
  @js.native
  def getLocationAccuracyAuthorization(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
    * @deprecated Access <Titanium.Geolocation.locationServicesAuthorization> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getLocationServicesAuthorization")
  @js.native
  def getLocationServicesAuthorization(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.locationServicesEnabled> property.
    * @deprecated Access <Titanium.Geolocation.locationServicesEnabled> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getLocationServicesEnabled")
  @js.native
  def getLocationServicesEnabled(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
    * @deprecated Access <Titanium.Geolocation.pauseLocationUpdateAutomatically> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getPauseLocationUpdateAutomatically")
  @js.native
  def getPauseLocationUpdateAutomatically(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.preferredProvider> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getPreferredProvider")
  @js.native
  def getPreferredProvider(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
    * @deprecated Access <Titanium.Geolocation.showBackgroundLocationIndicator> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getShowBackgroundLocationIndicator")
  @js.native
  def getShowBackgroundLocationIndicator(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.showCalibration> property.
    * @deprecated Access <Titanium.Geolocation.showCalibration> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getShowCalibration")
  @js.native
  def getShowCalibration(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
    * @deprecated Access <Titanium.Geolocation.trackSignificantLocationChange> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.getTrackSignificantLocationChange")
  @js.native
  def getTrackSignificantLocationChange(): Boolean = js.native
  
  /**
    * Indicates whether the current device supports a compass.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.hasCompass")
  @js.native
  val hasCompass: Boolean = js.native
  
  /**
    * Returns `true` if the app has location access.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.hasLocationPermissions")
  @js.native
  def hasLocationPermissions(authorizationType: Double): Boolean = js.native
  
  /**
    * Minimum heading change (in degrees) before a `heading` event is fired.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.headingFilter")
  @js.native
  def headingFilter: Double = js.native
  @scala.inline
  def headingFilter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headingFilter")(x.asInstanceOf[js.Any])
  
  /**
    * JSON representation of the last geolocation received.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.lastGeolocation")
  @js.native
  val lastGeolocation: String = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * A value that indicates the level of location accuracy the app has permission to use.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.locationAccuracyAuthorization")
  @js.native
  val locationAccuracyAuthorization: Double = js.native
  
  /**
    * Returns an authorization constant indicating if the application has access to location services.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.locationServicesAuthorization")
  @js.native
  val locationServicesAuthorization: Double = js.native
  
  /**
    * Indicates if the user has enabled or disabled location services for the device (not the application).
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.locationServicesEnabled")
  @js.native
  val locationServicesEnabled: Boolean = js.native
  
  /**
    * Indicates whether the location updates may be paused.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.pauseLocationUpdateAutomatically")
  @js.native
  def pauseLocationUpdateAutomatically: Boolean = js.native
  @scala.inline
  def pauseLocationUpdateAutomatically_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pauseLocationUpdateAutomatically")(x.asInstanceOf[js.Any])
  
  /**
    * Determines the preferred location provider.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.preferredProvider")
  @js.native
  def preferredProvider: String = js.native
  @scala.inline
  def preferredProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preferredProvider")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_authorization(
    name: authorization,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationAuthorizationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_calibration(
    name: calibration,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationCalibrationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_heading(
    name: heading,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationHeadingEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_location(
    name: location,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_locationupdatepaused(
    name: locationupdatepaused,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationupdatepausedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSGlobal("Titanium.Geolocation.removeEventListener")
  @js.native
  def removeEventListener_locationupdateresumed(
    name: locationupdateresumed,
    callback: js.ThisFunction1[
      /* this */ typings.titanium.Titanium.Geolocation, 
      /* event */ GeolocationLocationupdateresumedEvent, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Requests for location access.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.requestLocationPermissions")
  @js.native
  def requestLocationPermissions(
    authorizationType: Double,
    callback: js.Function1[/* param0 */ LocationAuthorizationResponse, Unit]
  ): Unit = js.native
  
  /**
    * Requests the user's permission to temporarily use location services with full accuracy.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.requestTemporaryFullAccuracyAuthorization")
  @js.native
  def requestTemporaryFullAccuracyAuthorization(
    purposeKey: String,
    callback: js.Function1[/* param0 */ LocationAccuracyAuthorizationResponse, Unit]
  ): Unit = js.native
  
  /**
    * Tries to resolve a location to an address.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.reverseGeocoder")
  @js.native
  def reverseGeocoder(
    latitude: Double,
    longitude: Double,
    callback: js.Function1[/* param0 */ ReverseGeocodeResponse, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.accuracy> property.
    * @deprecated Set the value using <Titanium.Geolocation.accuracy> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setAccuracy")
  @js.native
  def setAccuracy(accuracy: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.activityType> property.
    * @deprecated Set the value using <Titanium.Geolocation.activityType> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setActivityType")
  @js.native
  def setActivityType(activityType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
    * @deprecated Set the value using <Titanium.Geolocation.allowsBackgroundLocationUpdates> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setAllowsBackgroundLocationUpdates")
  @js.native
  def setAllowsBackgroundLocationUpdates(allowsBackgroundLocationUpdates: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Geolocation.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.distanceFilter> property.
    * @deprecated Set the value using <Titanium.Geolocation.distanceFilter> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setDistanceFilter")
  @js.native
  def setDistanceFilter(distanceFilter: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.frequency> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setFrequency")
  @js.native
  def setFrequency(frequency: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.headingFilter> property.
    * @deprecated Set the value using <Titanium.Geolocation.headingFilter> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setHeadingFilter")
  @js.native
  def setHeadingFilter(headingFilter: Double): Unit = js.native
  
  @JSGlobal("Titanium.Geolocation.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Geolocation.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
    * @deprecated Set the value using <Titanium.Geolocation.pauseLocationUpdateAutomatically> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setPauseLocationUpdateAutomatically")
  @js.native
  def setPauseLocationUpdateAutomatically(pauseLocationUpdateAutomatically: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.preferredProvider> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setPreferredProvider")
  @js.native
  def setPreferredProvider(preferredProvider: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
    * @deprecated Set the value using <Titanium.Geolocation.showBackgroundLocationIndicator> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setShowBackgroundLocationIndicator")
  @js.native
  def setShowBackgroundLocationIndicator(showBackgroundLocationIndicator: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.showCalibration> property.
    * @deprecated Set the value using <Titanium.Geolocation.showCalibration> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setShowCalibration")
  @js.native
  def setShowCalibration(showCalibration: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
    * @deprecated Set the value using <Titanium.Geolocation.trackSignificantLocationChange> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.setTrackSignificantLocationChange")
  @js.native
  def setTrackSignificantLocationChange(trackSignificantLocationChange: Boolean): Unit = js.native
  
  /**
    * Specifies that an indicator be shown when the app makes use of continuous
    * background location updates.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.showBackgroundLocationIndicator")
  @js.native
  def showBackgroundLocationIndicator: Boolean = js.native
  @scala.inline
  def showBackgroundLocationIndicator_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showBackgroundLocationIndicator")(x.asInstanceOf[js.Any])
  
  /**
    * Determines whether the compass calibration UI is shown if needed.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.showCalibration")
  @js.native
  def showCalibration: Boolean = js.native
  @scala.inline
  def showCalibration_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCalibration")(x.asInstanceOf[js.Any])
  
  /**
    * Indicates if the location changes should be updated only when a significant change
    * in location occurs.
    */
  /* static member */
  @JSGlobal("Titanium.Geolocation.trackSignificantLocationChange")
  @js.native
  def trackSignificantLocationChange: Boolean = js.native
  @scala.inline
  def trackSignificantLocationChange_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trackSignificantLocationChange")(x.asInstanceOf[js.Any])
}
