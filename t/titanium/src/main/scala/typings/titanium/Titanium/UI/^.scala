package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.UI")
@js.native
object ^ extends js.Object {
  /**
  		 * Sets the background color of the master view (when there are no windows or other top-level
  		 * controls displayed).
  		 */
  var backgroundColor: String = js.native
  /**
  		 * Local path or URL to an image file for setting a background for the master view (when there
  		 * are no windows or other top-level controls displayed).
  		 */
  var backgroundImage: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * The currently active tab, if a tab group is open.
  		 */
  var currentTab: Tab = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Updates the orientation of the current window to the specified orientation value.
  		 */
  var orientation: Double = js.native
  /**
  		 * Sets the global tint color of the application. It is inherited by the child views and can be
  		 * overwritten by them using the `tintColor` property.
  		 */
  var tintColor: String = js.native
}

