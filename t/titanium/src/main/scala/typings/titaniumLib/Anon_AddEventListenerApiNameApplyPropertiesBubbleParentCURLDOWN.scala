package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN extends js.Object {
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: scala.Double
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: scala.Double
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: scala.Double
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: scala.Double
  /**
  				 * No animation.
  				 */
  val NONE: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.AnimationStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN {
  @scala.inline
  def apply(
    CURL_DOWN: scala.Double,
    CURL_UP: scala.Double,
    FLIP_FROM_LEFT: scala.Double,
    FLIP_FROM_RIGHT: scala.Double,
    NONE: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN = {
    val __obj = js.Dynamic.literal(CURL_DOWN = CURL_DOWN, CURL_UP = CURL_UP, FLIP_FROM_LEFT = FLIP_FROM_LEFT, FLIP_FROM_RIGHT = FLIP_FROM_RIGHT, NONE = NONE, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
  
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyPropertiesBubbleParentCURLDOWN]
  }
}

