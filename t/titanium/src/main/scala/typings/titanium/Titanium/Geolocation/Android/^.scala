package typings.titanium.Titanium.Geolocation.Android

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Geolocation.Android")
@js.native
object ^ extends js.Object {
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
}

