package typings.titanium.Titanium.Platform

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Platform")
@js.native
object ^ extends js.Object {
  /**
  		 * Determines whether battery monitoring is enabled.
  		 */
  var batteryMonitoring: Boolean = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * An alphanumeric string unique to each device, used only for serving advertisements.
  		 */
  var identifierForAdvertising: String = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
}

