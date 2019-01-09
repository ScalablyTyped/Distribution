package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ACCURACYBEST extends js.Object {
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request the best
  		 * accuracy available.
  		 */
  val ACCURACY_BEST: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request highest possible
  		 * accuracy and combine it with additional sensor data.
  		 */
  val ACCURACY_BEST_FOR_NAVIGATION: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request more
  		 * accurate location updates with higher battery usage.
  		 */
  val ACCURACY_HIGH: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
  		 * updates accurate to the nearest 100 meters.
  		 */
  val ACCURACY_HUNDRED_METERS: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
  		 * updates accurate to the nearest kilometer.
  		 */
  val ACCURACY_KILOMETER: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request less
  		 * accurate location updates with lower battery usage.
  		 */
  val ACCURACY_LOW: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
  		 * updates accurate to the nearest 10 meters.
  		 */
  val ACCURACY_NEAREST_TEN_METERS: scala.Double = js.native
  /**
  		 * Use with [accuracy](Titanium.Geolocation.accuracy) to request location
  		 * updates accurate to the nearest three kilometers.
  		 */
  val ACCURACY_THREE_KILOMETERS: scala.Double = js.native
  /**
  		 * The location data is used for tracking location changes to the automobile specifically during vehicular navigation.
  		 */
  val ACTIVITYTYPE_AUTOMOTIVE_NAVIGATION: java.lang.String = js.native
  /**
  		 * The location data is used for tracking any pedestrian-related activity.
  		 */
  val ACTIVITYTYPE_FITNESS: java.lang.String = js.native
  /**
  		 * The location data is being used for an unknown activity.
  		 */
  val ACTIVITYTYPE_OTHER: java.lang.String = js.native
  /**
  		 * The location data is used for tracking movements of other types of vehicular
  		 * navigation that are not automobile related.
  		 */
  val ACTIVITYTYPE_OTHER_NAVIGATION: java.lang.String = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the application is authorized to start location services at any time. This authorization
  		 * includes the use of all location services, including monitoring regions and significant location changes.
  		 */
  val AUTHORIZATION_ALWAYS: scala.Double = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the application is authorized to use location services.
  		 */
  val AUTHORIZATION_AUTHORIZED: scala.Double = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the application is not authorized to use location services, *or*
  		 * location services are disabled.
  		 */
  val AUTHORIZATION_DENIED: scala.Double = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the application is not authorized to use location servies *and*
  		 * the user cannot change this application's status.
  		 */
  val AUTHORIZATION_RESTRICTED: scala.Double = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the authorization state is unknown.
  		 */
  val AUTHORIZATION_UNKNOWN: scala.Double = js.native
  /**
  		 * A [locationServicesAuthorization](Titanium.Geolocation.locationServicesAuthorization) value
  		 * indicating that the application is authorized to start most location services only while running in the foreground.
  		 */
  val AUTHORIZATION_WHEN_IN_USE: scala.Double = js.native
  /**
  		 * Module for Android-specific geolocation functionality.
  		 */
  val AndroidNs: Anon_AddEventListenerAddLocationProvider = js.native
  /**
  		 * Error code indicating that the user denied access to the location service.
  		 */
  val ERROR_DENIED: scala.Double = js.native
  /**
  		 * Error code indicating that the heading could not be determined.
  		 */
  val ERROR_HEADING_FAILURE: scala.Double = js.native
  /**
  		 * Error code indicating that the user's location could not be determined.
  		 */
  val ERROR_LOCATION_UNKNOWN: scala.Double = js.native
  /**
  		 * Error code indicating that the network was unavailable.
  		 */
  val ERROR_NETWORK: scala.Double = js.native
  /**
  		 * Error code indicating that region monitoring is delayed.
  		 */
  val ERROR_REGION_MONITORING_DELAYED: scala.Double = js.native
  /**
  		 * Error code indicating that region monitoring is denied.
  		 */
  val ERROR_REGION_MONITORING_DENIED: scala.Double = js.native
  /**
  		 * Error code indicating a region monitoring failure.
  		 */
  val ERROR_REGION_MONITORING_FAILURE: scala.Double = js.native
  /**
  		 * Specifies the GPS location provider.
  		 */
  val PROVIDER_GPS: java.lang.String = js.native
  /**
  		 * Specifies the network location provider.
  		 */
  val PROVIDER_NETWORK: java.lang.String = js.native
  /**
  		 * Specifies the passive location provider.
  		 */
  val PROVIDER_PASSIVE: java.lang.String = js.native
  /**
  		 * Specifies the requested accuracy for location updates.
  		 */
  var accuracy: scala.Double = js.native
  /**
  		 * The type of user activity to be associated with the location updates.
  		 */
  var activityType: scala.Double = js.native
  /**
  		 * Determines if the app can do background location updates.
  		 */
  var allowsBackgroundLocationUpdates: scala.Boolean = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The minimum change of position (in meters) before a 'location' event is fired.
  		 */
  var distanceFilter: scala.Double = js.native
  /**
  		 * Requested frequency for location updates, in milliseconds.
  		 */
  var frequency: scala.Double = js.native
  /**
  		 * Indicates whether the current device supports a compass.
  		 */
  val hasCompass: scala.Boolean = js.native
  /**
  		 * Minimum heading change (in degrees) before a `heading` event is fired.
  		 */
  var headingFilter: scala.Double = js.native
  /**
  		 * JSON representation of the last geolocation received.
  		 */
  val lastGeolocation: java.lang.String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to location services.
  		 */
  var locationServicesAuthorization: scala.Double = js.native
  /**
  		 * Indicates if the user has enabled or disabled location services for the device (not the application).
  		 */
  val locationServicesEnabled: scala.Boolean = js.native
  /**
  		 * Indicates whether the location updates may be paused.
  		 */
  var pauseLocationUpdateAutomatically: scala.Boolean = js.native
  /**
  		 * Determines the preferred location provider.
  		 */
  var preferredProvider: java.lang.String = js.native
  /**
  		 * Specifies that an indicator be shown when the app makes use of continuous
  		 * background location updates.
  		 */
  var showBackgroundLocationIndicator: scala.Boolean = js.native
  /**
  		 * Determines whether the compass calibration UI is shown if needed.
  		 */
  var showCalibration: scala.Boolean = js.native
  /**
  		 * Indicates if the location changes should be updated only when a significant change
  		 * in location occurs.
  		 */
  var trackSignificantLocationChange: scala.Boolean = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Resolves an address to a location.
  		 */
  def forwardGeocoder(address: java.lang.String, callback: js.Function1[/* param0 */ ForwardGeocodeResponse, _]): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.accuracy> property.
  		 */
  def getAccuracy(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.activityType> property.
  		 */
  def getActivityType(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
  		 */
  def getAllowsBackgroundLocationUpdates(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Retrieves the current compass heading.
  		 */
  def getCurrentHeading(callback: js.Function1[/* param0 */ HeadingResponse, _]): scala.Unit = js.native
  /**
  		 * Retrieves the last known location from the device.
  		 */
  def getCurrentPosition(callback: js.Function1[/* param0 */ LocationResults, _]): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.distanceFilter> property.
  		 */
  def getDistanceFilter(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.frequency> property.
  		 */
  def getFrequency(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.hasCompass> property.
  		 */
  def getHasCompass(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.headingFilter> property.
  		 */
  def getHeadingFilter(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.lastGeolocation> property.
  		 */
  def getLastGeolocation(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
  		 */
  def getLocationServicesAuthorization(): scala.Double = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.locationServicesEnabled> property.
  		 */
  def getLocationServicesEnabled(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
  		 */
  def getPauseLocationUpdateAutomatically(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.preferredProvider> property.
  		 */
  def getPreferredProvider(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
  		 */
  def getShowBackgroundLocationIndicator(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.showCalibration> property.
  		 */
  def getShowCalibration(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
  		 */
  def getTrackSignificantLocationChange(): scala.Boolean = js.native
  /**
  		 * Returns `true` if the app has location access.
  		 */
  def hasLocationPermissions(authorizationType: scala.Double): scala.Boolean = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Requests for location access.
  		 */
  def requestLocationPermissions(
    authorizationType: scala.Double,
    callback: js.Function1[/* param0 */ LocationAuthorizationResponse, _]
  ): scala.Unit = js.native
  /**
  		 * Tries to resolve a location to an address.
  		 */
  def reverseGeocoder(
    latitude: scala.Double,
    longitude: scala.Double,
    callback: js.Function1[/* param0 */ ReverseGeocodeResponse, _]
  ): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.accuracy> property.
  		 */
  def setAccuracy(accuracy: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.activityType> property.
  		 */
  def setActivityType(activityType: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.allowsBackgroundLocationUpdates> property.
  		 */
  def setAllowsBackgroundLocationUpdates(allowsBackgroundLocationUpdates: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.distanceFilter> property.
  		 */
  def setDistanceFilter(distanceFilter: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.frequency> property.
  		 */
  def setFrequency(frequency: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.headingFilter> property.
  		 */
  def setHeadingFilter(headingFilter: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.locationServicesAuthorization> property.
  		 */
  def setLocationServicesAuthorization(locationServicesAuthorization: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.pauseLocationUpdateAutomatically> property.
  		 */
  def setPauseLocationUpdateAutomatically(pauseLocationUpdateAutomatically: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.preferredProvider> property.
  		 */
  def setPreferredProvider(preferredProvider: java.lang.String): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.showBackgroundLocationIndicator> property.
  		 */
  def setShowBackgroundLocationIndicator(showBackgroundLocationIndicator: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.showCalibration> property.
  		 */
  def setShowCalibration(showCalibration: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Geolocation.trackSignificantLocationChange> property.
  		 */
  def setTrackSignificantLocationChange(trackSignificantLocationChange: scala.Boolean): scala.Unit = js.native
}

