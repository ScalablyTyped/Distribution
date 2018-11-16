package typings
package titaniumLib.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the system button styles that can be used for the button `style` property.
			 */
@JSGlobal("Titanium.UI.iPhone.SystemButtonStyle")
@js.native
object SystemButtonStyleNs extends js.Object {
  /**
  				 * Used with [ButtonBar](Titanium.UI.ButtonBar) or [TabbedBar](Titanium.UI.iOS.TabbedBar) only,
  				 * to use the more condensed style used in nav bars and tool bars.
  				 */
  val BAR: scala.Double = js.native
  /**
  				 * A simple button style with a border.
  				 */
  val BORDERED: scala.Double = js.native
  /**
  				 * The style for a **Done** button--for example, a button that completes some task and returns
  				 * to the previous view.
  				 */
  val DONE: scala.Double = js.native
  /**
  				 * Specifies a borderless button, the default style for toolbars, button bars, and tabbed bars.
  				 */
  val PLAIN: scala.Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButtonStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButtonStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButtonStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

