package typings.titanium.TitaniumNs.UINs.iOSNs

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
  val ANIMATION_STYLE_FADE: Double = js.native
  /**
  				 * No animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_NONE: Double = js.native
  /**
  				 * Slide animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_SLIDE: Double = js.native
  /**
  				 * Default status bar style.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * Gray-colored status bar style.
  				 */
  val GRAY: Double = js.native
  /**
  				 * Gray-colored status bar style.
  				 */
  val GREY: Double = js.native
  /**
  				 * Status bar style to use with dark backgrounds.
  				 */
  val LIGHT_CONTENT: Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

