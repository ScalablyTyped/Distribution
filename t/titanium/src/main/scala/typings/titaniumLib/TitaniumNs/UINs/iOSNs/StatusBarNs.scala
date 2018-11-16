package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the status bar style.
			 */
@JSGlobal("Titanium.UI.iOS.StatusBar")
@js.native
object StatusBarNs extends js.Object {
  /**
  				 * Fade animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_FADE: scala.Double = js.native
  /**
  				 * No animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_NONE: scala.Double = js.native
  /**
  				 * Slide animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_SLIDE: scala.Double = js.native
  /**
  				 * Default status bar style.
  				 */
  val DEFAULT: scala.Double = js.native
  /**
  				 * Gray-colored status bar style.
  				 */
  val GRAY: scala.Double = js.native
  /**
  				 * Gray-colored status bar style.
  				 */
  val GREY: scala.Double = js.native
  /**
  				 * Status bar style to use with dark backgrounds.
  				 */
  val LIGHT_CONTENT: scala.Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

