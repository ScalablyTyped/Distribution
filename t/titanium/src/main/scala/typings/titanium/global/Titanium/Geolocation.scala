package typings.titanium.global.Titanium

import typings.titanium.Dictionary
import typings.titanium.ForwardGeocodeResponse
import typings.titanium.HeadingResponse
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* static members */
@JSGlobal("Titanium.Geolocation")
@js.native
object Geolocation extends js.Object {
  /**
    * Module for Android-specific geolocation functionality.
    */
  @js.native
  class Android ()
    extends typings.titanium.Titanium.Proxy
  
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request the best
    * accuracy available.
    */
  val ACCURACY_BEST: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request highest possible
    * accuracy and combine it with additional sensor data.
    */
  val ACCURACY_BEST_FOR_NAVIGATION: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request more
    * accurate location updates with higher battery usage.
    */
  val ACCURACY_HIGH: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest 100 meters.
    */
  val ACCURACY_HUNDRED_METERS: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest kilometer.
    */
  val ACCURACY_KILOMETER: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request less
    * accurate location updates with lower battery usage.
    */
  val ACCURACY_LOW: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest 10 meters.
    */
  val ACCURACY_NEAREST_TEN_METERS: Double = js.native
  /**
    * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
    * updates accurate to the nearest three kilometers.
    */
  val ACCURACY_THREE_KILOMETERS: Double = js.native
  /**
    * The location data is used for tracking location changes to the automobile specifically during vehicular navigation.
    */
  val ACTIVITYTYPE_AUTOMOTIVE_NAVIGATION: String = js.native
  /**
    * The location data is used for tracking any pedestrian-related activity.
    */
  val ACTIVITYTYPE_FITNESS: String = js.native
  /**
    * The location data is being used for an unknown activity.
    */
  val ACTIVITYTYPE_OTHER: String = js.native
  /**
    * The location data is used for tracking movements of other types of vehicular
    * navigation that are not automobile related.
    */
  val ACTIVITYTYPE_OTHER_NAVIGATION: String = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to start location services at any time. This authorization
    * includes the use of all location services, including monitoring regions and significant location changes.
    */
  val AUTHORIZATION_ALWAYS: Double = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to use location services.
    * @deprecated Use [Titanium.Geolocation.AUTHORIZATION_ALWAYS](Titanium.Geolocation.AUTHORIZATION_ALWAYS) as advised by Apple.
    */
  val AUTHORIZATION_AUTHORIZED: Double = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is not authorized to use location services, *or*
    * location services are disabled.
    */
  val AUTHORIZATION_DENIED: Double = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is not authorized to use location servies *and*
    * the user cannot change this application's status.
    */
  val AUTHORIZATION_RESTRICTED: Double = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the authorization state is unknown.
    */
  val AUTHORIZATION_UNKNOWN: Double = js.native
  /**
    * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
    * indicating that the application is authorized to start most location services only while running in the foreground.
    */
  val AUTHORIZATION_WHEN_IN_USE: Double = js.native
  /**
    * Error code indicating that the user denied access to the location service.
    */
  val ERROR_DENIED: Double = js.native
  /**
    * Error code indicating that the heading could not be determined.
    */
  val ERROR_HEADING_FAILURE: Double = js.native
  /**
    * Error code indicating that the user's location could not be determined.
    */
  val ERROR_LOCATION_UNKNOWN: Double = js.native
  /**
    * Error code indicating that the network was unavailable.
    */
  val ERROR_NETWORK: Double = js.native
  /**
    * Error code indicating that region monitoring is delayed.
    */
  val ERROR_REGION_MONITORING_DELAYED: Double = js.native
  /**
    * Error code indicating that region monitoring is denied.
    */
  val ERROR_REGION_MONITORING_DENIED: Double = js.native
  /**
    * Error code indicating a region monitoring failure.
    */
  val ERROR_REGION_MONITORING_FAILURE: Double = js.native
  /**
    * Specifies the requested accuracy for location updates.
    */
  var accuracy: Double = js.native
  /**
    * The type of user activity to be associated with the location updates.
    */
  var activityType: Double = js.native
  /**
    * Determines if the app can do background location updates.
    */
  var allowsBackgroundLocationUpdates: Boolean = js.native
  /**
    * The name of the API that this proxy corresponds to.
    */
  val apiName: String = js.native
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  var bubbleParent: Boolean = js.native
  /**
    * The minimum change of position (in meters) before a 'location' event is fired.
    */
  var distanceFilter: Double = js.native
  /**
    * Requested frequency for location updates, in milliseconds.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  var frequency: Double = js.native
  /**
    * Indicates whether the current device supports a compass.
    */
  val hasCompass: Boolean = js.native
  /**
    * Minimum heading change (in degrees) before a `heading` event is fired.
    */
  var headingFilter: Double = js.native
  /**
    * JSON representation of the last geolocation received.
    */
  val lastGeolocation: String = js.native
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
    * Returns an authorization constant indicating if the application has access to location services.
    */
  val locationServicesAuthorization: Double = js.native
  /**
    * Indicates if the user has enabled or disabled location services for the device (not the application).
    */
  val locationServicesEnabled: Boolean = js.native
  /**
    * Indicates whether the location updates may be paused.
    */
  var pauseLocationUpdateAutomatically: Boolean = js.native
  /**
    * Determines the preferred location provider.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  var preferredProvider: String = js.native
  /**
    * Specifies that an indicator be shown when the app makes use of continuous
    * background location updates.
    */
  var showBackgroundLocationIndicator: Boolean = js.native
  /**
    * Determines whether the compass calibration UI is shown if needed.
    */
  var showCalibration: Boolean = js.native
  /**
    * Indicates if the location changes should be updated only when a significant change
    * in location occurs.
    */
  var trackSignificantLocationChange: Boolean = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_authorization(
    name: authorization,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationAuthorizationEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_calibration(
    name: calibration,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationCalibrationEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_heading(
    name: heading,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationHeadingEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_location(
    name: location,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_locationupdatepaused(
    name: locationupdatepaused,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationupdatepausedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_locationupdateresumed(
    name: locationupdateresumed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationupdateresumedEvent, Unit]
  ): Unit = js.native
  /**
    * Applies the properties to the proxy.
    */
  def applyProperties(props: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_authorization(name: authorization): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_authorization(name: authorization, event: GeolocationAuthorizationEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_calibration(name: calibration): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_calibration(name: calibration, event: GeolocationCalibrationEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_heading(name: heading): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_heading(name: heading, event: GeolocationHeadingEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_location(name: location): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_location(name: location, event: GeolocationLocationEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_locationupdatepaused(name: locationupdatepaused): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_locationupdatepaused(name: locationupdatepaused, event: GeolocationLocationupdatepausedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_locationupdateresumed(name: locationupdateresumed): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_locationupdateresumed(name: locationupdateresumed, event: GeolocationLocationupdateresumedEvent): Unit = js.native
  /**
    * Resolves an address to a location.
    */
  def forwardGeocoder(address: String, callback: js.Function1[/* param0 */ ForwardGeocodeResponse, Unit]): Unit = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.accuracy> property.
    * @deprecated Access <Titanium.Geolocation.accuracy> instead.
    */
  def getAccuracy(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.activityType> property.
    * @deprecated Access <Titanium.Geolocation.activityType> instead.
    */
  def getActivityType(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
    * @deprecated Access <Titanium.Geolocation.allowsBackgroundLocationUpdates> instead.
    */
  def getAllowsBackgroundLocationUpdates(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.apiName> property.
    * @deprecated Access <Titanium.Geolocation.apiName> instead.
    */
  def getApiName(): String = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.bubbleParent> property.
    * @deprecated Access <Titanium.Geolocation.bubbleParent> instead.
    */
  def getBubbleParent(): Boolean = js.native
  /**
    * Retrieves the current compass heading.
    */
  def getCurrentHeading(callback: js.Function1[/* param0 */ HeadingResponse, Unit]): Unit = js.native
  /**
    * Retrieves the last known location from the device.
    */
  def getCurrentPosition(callback: js.Function1[/* param0 */ LocationResults, Unit]): Unit = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.distanceFilter> property.
    * @deprecated Access <Titanium.Geolocation.distanceFilter> instead.
    */
  def getDistanceFilter(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.frequency> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  def getFrequency(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.hasCompass> property.
    * @deprecated Access <Titanium.Geolocation.hasCompass> instead.
    */
  def getHasCompass(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.headingFilter> property.
    * @deprecated Access <Titanium.Geolocation.headingFilter> instead.
    */
  def getHeadingFilter(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.lastGeolocation> property.
    * @deprecated Access <Titanium.Geolocation.lastGeolocation> instead.
    */
  def getLastGeolocation(): String = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.lifecycleContainer> property.
    * @deprecated Access <Titanium.Geolocation.lifecycleContainer> instead.
    */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
    * @deprecated Access <Titanium.Geolocation.locationServicesAuthorization> instead.
    */
  def getLocationServicesAuthorization(): Double = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.locationServicesEnabled> property.
    * @deprecated Access <Titanium.Geolocation.locationServicesEnabled> instead.
    */
  def getLocationServicesEnabled(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
    * @deprecated Access <Titanium.Geolocation.pauseLocationUpdateAutomatically> instead.
    */
  def getPauseLocationUpdateAutomatically(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.preferredProvider> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  def getPreferredProvider(): String = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
    * @deprecated Access <Titanium.Geolocation.showBackgroundLocationIndicator> instead.
    */
  def getShowBackgroundLocationIndicator(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.showCalibration> property.
    * @deprecated Access <Titanium.Geolocation.showCalibration> instead.
    */
  def getShowCalibration(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
    * @deprecated Access <Titanium.Geolocation.trackSignificantLocationChange> instead.
    */
  def getTrackSignificantLocationChange(): Boolean = js.native
  /**
    * Returns `true` if the app has location access.
    */
  def hasLocationPermissions(authorizationType: Double): Boolean = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_authorization(
    name: authorization,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationAuthorizationEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_calibration(
    name: calibration,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationCalibrationEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_heading(
    name: heading,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationHeadingEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_location(
    name: location,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationupdatepaused(
    name: locationupdatepaused,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationupdatepausedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_locationupdateresumed(
    name: locationupdateresumed,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ GeolocationLocationupdateresumedEvent, Unit]
  ): Unit = js.native
  /**
    * Requests for location access.
    */
  def requestLocationPermissions(
    authorizationType: Double,
    callback: js.Function1[/* param0 */ LocationAuthorizationResponse, Unit]
  ): Unit = js.native
  /**
    * Tries to resolve a location to an address.
    */
  def reverseGeocoder(
    latitude: Double,
    longitude: Double,
    callback: js.Function1[/* param0 */ ReverseGeocodeResponse, Unit]
  ): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.accuracy> property.
    * @deprecated Set the value using <Titanium.Geolocation.accuracy> instead.
    */
  def setAccuracy(accuracy: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.activityType> property.
    * @deprecated Set the value using <Titanium.Geolocation.activityType> instead.
    */
  def setActivityType(activityType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
    * @deprecated Set the value using <Titanium.Geolocation.allowsBackgroundLocationUpdates> instead.
    */
  def setAllowsBackgroundLocationUpdates(allowsBackgroundLocationUpdates: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Geolocation.bubbleParent> instead.
    */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.distanceFilter> property.
    * @deprecated Set the value using <Titanium.Geolocation.distanceFilter> instead.
    */
  def setDistanceFilter(distanceFilter: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.frequency> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  def setFrequency(frequency: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.headingFilter> property.
    * @deprecated Set the value using <Titanium.Geolocation.headingFilter> instead.
    */
  def setHeadingFilter(headingFilter: Double): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Geolocation.lifecycleContainer> instead.
    */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
    * @deprecated Set the value using <Titanium.Geolocation.pauseLocationUpdateAutomatically> instead.
    */
  def setPauseLocationUpdateAutomatically(pauseLocationUpdateAutomatically: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.preferredProvider> property.
    * @deprecated Android legacy mode operation is deprecated. For new development, use
    * either simple mode or manual mode. See "Configurating Location Updates on Android"
    * in the main description of this class for more information.
    *
    */
  def setPreferredProvider(preferredProvider: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
    * @deprecated Set the value using <Titanium.Geolocation.showBackgroundLocationIndicator> instead.
    */
  def setShowBackgroundLocationIndicator(showBackgroundLocationIndicator: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.showCalibration> property.
    * @deprecated Set the value using <Titanium.Geolocation.showCalibration> instead.
    */
  def setShowCalibration(showCalibration: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
    * @deprecated Set the value using <Titanium.Geolocation.trackSignificantLocationChange> instead.
    */
  def setTrackSignificantLocationChange(trackSignificantLocationChange: Boolean): Unit = js.native
  /**
    * Module for Android-specific geolocation functionality.
    */
  /* static members */
  @js.native
  object Android extends js.Object {
    /**
      * Represents a source of location information, such as GPS.
      */
    @js.native
    class LocationProvider ()
      extends typings.titanium.Titanium.Geolocation.Android.LocationProvider
    
    /**
      * A location rule to filter the results returned by location providers.
      */
    @js.native
    class LocationRule ()
      extends typings.titanium.Titanium.Geolocation.Android.LocationRule
    
    /**
      * Specifies the GPS location provider.
      */
    val PROVIDER_GPS: String = js.native
    /**
      * Specifies the network location provider.
      */
    val PROVIDER_NETWORK: String = js.native
    /**
      * Specifies the passive location provider.
      */
    val PROVIDER_PASSIVE: String = js.native
    /**
      * The name of the API that this proxy corresponds to.
      */
    val apiName: String = js.native
    /**
      * Indicates if the proxy will bubble an event to its parent.
      */
    var bubbleParent: Boolean = js.native
    /**
      * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
      */
    var lifecycleContainer: Window | TabGroup = js.native
    /**
      * Set to `true` to enable manual configuration of location updates through this module.
      */
    var manualMode: Boolean = js.native
    /**
      * Adds the specified callback as an event listener for the named event.
      */
    def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Adds and enables the specified location provider, possibly replacing an existing one.
      */
    def addLocationProvider(provider: typings.titanium.Titanium.Geolocation.Android.LocationProvider): Unit = js.native
    /**
      * Adds and enables the specified location rule.
      */
    def addLocationRule(rule: typings.titanium.Titanium.Geolocation.Android.LocationRule): Unit = js.native
    /**
      * Applies the properties to the proxy.
      */
    def applyProperties(props: js.Any): Unit = js.native
    /**
      * Creates and returns an instance of <Titanium.Geolocation.Android.LocationProvider>.
      */
    def createLocationProvider(): typings.titanium.Titanium.Geolocation.Android.LocationProvider = js.native
    def createLocationProvider(parameters: Dictionary[typings.titanium.Titanium.Geolocation.Android.LocationProvider]): typings.titanium.Titanium.Geolocation.Android.LocationProvider = js.native
    /**
      * Creates and returns an instance of <Titanium.Geolocation.Android.LocationRule>.
      */
    def createLocationRule(): typings.titanium.Titanium.Geolocation.Android.LocationRule = js.native
    def createLocationRule(parameters: Dictionary[typings.titanium.Titanium.Geolocation.Android.LocationRule]): typings.titanium.Titanium.Geolocation.Android.LocationRule = js.native
    /**
      * Fires a synthesized event to any registered listeners.
      */
    def fireEvent(name: String): Unit = js.native
    def fireEvent(name: String, event: js.Any): Unit = js.native
    /**
      * Gets the value of the <Titanium.Geolocation.Android.apiName> property.
      * @deprecated Access <Titanium.Geolocation.Android.apiName> instead.
      */
    def getApiName(): String = js.native
    /**
      * Gets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
      * @deprecated Access <Titanium.Geolocation.Android.bubbleParent> instead.
      */
    def getBubbleParent(): Boolean = js.native
    /**
      * Gets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
      * @deprecated Access <Titanium.Geolocation.Android.lifecycleContainer> instead.
      */
    def getLifecycleContainer(): Window | TabGroup = js.native
    /**
      * Gets the value of the <Titanium.Geolocation.Android.manualMode> property.
      * @deprecated Access <Titanium.Geolocation.Android.manualMode> instead.
      */
    def getManualMode(): Boolean = js.native
    /**
      * Removes the specified callback as an event listener for the named event.
      */
    def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
    /**
      * Disables and removes the specified location provider.
      */
    def removeLocationProvider(provider: typings.titanium.Titanium.Geolocation.Android.LocationProvider): Unit = js.native
    /**
      * Disables and removes the specified location rule.
      */
    def removeLocationRule(rule: typings.titanium.Titanium.Geolocation.Android.LocationRule): Unit = js.native
    /**
      * Sets the value of the <Titanium.Geolocation.Android.bubbleParent> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.bubbleParent> instead.
      */
    def setBubbleParent(bubbleParent: Boolean): Unit = js.native
    def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
    /**
      * Sets the value of the <Titanium.Geolocation.Android.lifecycleContainer> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.lifecycleContainer> instead.
      */
    def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
    /**
      * Sets the value of the <Titanium.Geolocation.Android.manualMode> property.
      * @deprecated Set the value using <Titanium.Geolocation.Android.manualMode> instead.
      */
    def setManualMode(manualMode: Boolean): Unit = js.native
  }
  
}

