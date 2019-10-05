package typings.titanium.Titanium.App

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.App")
@js.native
object ^ extends js.Object {
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * Prevents network activity indicator from being displayed.
  		 */
  var disableNetworkActivityIndicator: Boolean = js.native
  /**
  		 * Shows the application's splash screen on app resume.
  		 */
  var forceSplashAsSnapshot: Boolean = js.native
  /**
  		 * Determines whether the screen is locked when the device is idle.
  		 */
  var idleTimerDisabled: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Determines whether proximity detection is enabled.
  		 */
  var proximityDetection: Boolean = js.native
  /**
  		 * Indicates whether or not the user interaction shoud be tracked.
  		 */
  var trackUserInteraction: Boolean = js.native
}

