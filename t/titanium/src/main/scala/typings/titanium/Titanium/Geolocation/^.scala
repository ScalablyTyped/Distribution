package typings.titanium.Titanium.Geolocation

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation")
@js.native
object ^ extends js.Object {
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
  		 * Minimum heading change (in degrees) before a `heading` event is fired.
  		 */
  var headingFilter: Double = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Returns an authorization constant indicating if the application has access to location services.
  		 */
  var locationServicesAuthorization: Double = js.native
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
}

