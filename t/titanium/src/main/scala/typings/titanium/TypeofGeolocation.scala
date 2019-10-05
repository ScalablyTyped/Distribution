package typings.titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofGeolocation extends js.Object {
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
  		 * Module for Android-specific geolocation functionality.
  		 */
  val Android: TypeofAndroidAddEventListenerAddLocationProvider = js.native
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
  var locationServicesAuthorization: Double = js.native
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Resolves an address to a location.
  		 */
  def forwardGeocoder(address: String, callback: js.Function1[/* param0 */ ForwardGeocodeResponse, _]): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.accuracy> property.
  		 */
  def getAccuracy(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.activityType> property.
  		 */
  def getActivityType(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
  		 */
  def getAllowsBackgroundLocationUpdates(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Retrieves the current compass heading.
  		 */
  def getCurrentHeading(callback: js.Function1[/* param0 */ HeadingResponse, _]): Unit = js.native
  /**
  		 * Retrieves the last known location from the device.
  		 */
  def getCurrentPosition(callback: js.Function1[/* param0 */ LocationResults, _]): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.distanceFilter> property.
  		 */
  def getDistanceFilter(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.frequency> property.
  		 */
  def getFrequency(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.hasCompass> property.
  		 */
  def getHasCompass(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.headingFilter> property.
  		 */
  def getHeadingFilter(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.lastGeolocation> property.
  		 */
  def getLastGeolocation(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
  		 */
  def getLocationServicesAuthorization(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.locationServicesEnabled> property.
  		 */
  def getLocationServicesEnabled(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
  		 */
  def getPauseLocationUpdateAutomatically(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.preferredProvider> property.
  		 */
  def getPreferredProvider(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
  		 */
  def getShowBackgroundLocationIndicator(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.showCalibration> property.
  		 */
  def getShowCalibration(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
  		 */
  def getTrackSignificantLocationChange(): Boolean = js.native
  /**
  		 * Returns `true` if the app has location access.
  		 */
  def hasLocationPermissions(authorizationType: Double): Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Requests for location access.
  		 */
  def requestLocationPermissions(authorizationType: Double, callback: js.Function1[/* param0 */ LocationAuthorizationResponse, _]): Unit = js.native
  /**
  		 * Tries to resolve a location to an address.
  		 */
  def reverseGeocoder(
    latitude: Double,
    longitude: Double,
    callback: js.Function1[/* param0 */ ReverseGeocodeResponse, _]
  ): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.accuracy> property.
  		 */
  def setAccuracy(accuracy: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.activityType> property.
  		 */
  def setActivityType(activityType: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
  		 */
  def setAllowsBackgroundLocationUpdates(allowsBackgroundLocationUpdates: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.distanceFilter> property.
  		 */
  def setDistanceFilter(distanceFilter: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.frequency> property.
  		 */
  def setFrequency(frequency: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.headingFilter> property.
  		 */
  def setHeadingFilter(headingFilter: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
  		 */
  def setLocationServicesAuthorization(locationServicesAuthorization: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
  		 */
  def setPauseLocationUpdateAutomatically(pauseLocationUpdateAutomatically: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.preferredProvider> property.
  		 */
  def setPreferredProvider(preferredProvider: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
  		 */
  def setShowBackgroundLocationIndicator(showBackgroundLocationIndicator: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.showCalibration> property.
  		 */
  def setShowCalibration(showCalibration: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
  		 */
  def setTrackSignificantLocationChange(trackSignificantLocationChange: Boolean): Unit = js.native
}

