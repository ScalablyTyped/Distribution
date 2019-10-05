package typings.titanium.Titanium

import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium")
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
  	 * User-agent string used by Titanium.
  	 */
  var userAgent: String = js.native
}

