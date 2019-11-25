package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofStatusBar extends js.Object {
  /**
  				 * Fade animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_FADE: Double
  /**
  				 * No animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_NONE: Double
  /**
  				 * Slide animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_SLIDE: Double
  /**
  				 * Default status bar style.
  				 */
  val DEFAULT: Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GRAY: Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GREY: Double
  /**
  				 * Status bar style to use with dark backgrounds.
  				 */
  val LIGHT_CONTENT: Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofStatusBar {
  @scala.inline
  def apply(
    ANIMATION_STYLE_FADE: Double,
    ANIMATION_STYLE_NONE: Double,
    ANIMATION_STYLE_SLIDE: Double,
    DEFAULT: Double,
    GRAY: Double,
    GREY: Double,
    LIGHT_CONTENT: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofStatusBar = {
    val __obj = js.Dynamic.literal(ANIMATION_STYLE_FADE = ANIMATION_STYLE_FADE.asInstanceOf[js.Any], ANIMATION_STYLE_NONE = ANIMATION_STYLE_NONE.asInstanceOf[js.Any], ANIMATION_STYLE_SLIDE = ANIMATION_STYLE_SLIDE.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], GRAY = GRAY.asInstanceOf[js.Any], GREY = GREY.asInstanceOf[js.Any], LIGHT_CONTENT = LIGHT_CONTENT.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofStatusBar]
  }
}

