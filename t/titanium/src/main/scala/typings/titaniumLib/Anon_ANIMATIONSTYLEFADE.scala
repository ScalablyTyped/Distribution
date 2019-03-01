package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ANIMATIONSTYLEFADE extends js.Object {
  /**
  				 * Fade animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_FADE: scala.Double
  /**
  				 * No animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_NONE: scala.Double
  /**
  				 * Slide animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_SLIDE: scala.Double
  /**
  				 * Default status bar style.
  				 */
  val DEFAULT: scala.Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GRAY: scala.Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GREY: scala.Double
  /**
  				 * Status bar style to use with dark backgrounds.
  				 */
  val LIGHT_CONTENT: scala.Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_ANIMATIONSTYLEFADE {
  @scala.inline
  def apply(
    ANIMATION_STYLE_FADE: scala.Double,
    ANIMATION_STYLE_NONE: scala.Double,
    ANIMATION_STYLE_SLIDE: scala.Double,
    DEFAULT: scala.Double,
    GRAY: scala.Double,
    GREY: scala.Double,
    LIGHT_CONTENT: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_ANIMATIONSTYLEFADE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ANIMATION_STYLE_FADE")(ANIMATION_STYLE_FADE)
    __obj.updateDynamic("ANIMATION_STYLE_NONE")(ANIMATION_STYLE_NONE)
    __obj.updateDynamic("ANIMATION_STYLE_SLIDE")(ANIMATION_STYLE_SLIDE)
    __obj.updateDynamic("DEFAULT")(DEFAULT)
    __obj.updateDynamic("GRAY")(GRAY)
    __obj.updateDynamic("GREY")(GREY)
    __obj.updateDynamic("LIGHT_CONTENT")(LIGHT_CONTENT)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.asInstanceOf[Anon_ANIMATIONSTYLEFADE]
  }
}

