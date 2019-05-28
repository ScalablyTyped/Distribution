package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAnimationStyle extends js.Object {
  /**
  				 * A transition that dissolves from one view to the next.
  				 */
  val CROSS_DISSOLVE: scala.Double
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: scala.Double
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: scala.Double
  /**
  				 * Flip from bottom to top during a transition animation.
  				 */
  val FLIP_FROM_BOTTOM: scala.Double
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: scala.Double
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: scala.Double
  /**
  				 * Flip from top to bottom during a transition animation.
  				 */
  val FLIP_FROM_TOP: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object TypeofAnimationStyle {
  @scala.inline
  def apply(
    CROSS_DISSOLVE: scala.Double,
    CURL_DOWN: scala.Double,
    CURL_UP: scala.Double,
    FLIP_FROM_BOTTOM: scala.Double,
    FLIP_FROM_LEFT: scala.Double,
    FLIP_FROM_RIGHT: scala.Double,
    FLIP_FROM_TOP: scala.Double,
    NONE: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit
  ): TypeofAnimationStyle = {
    val __obj = js.Dynamic.literal(CROSS_DISSOLVE = CROSS_DISSOLVE, CURL_DOWN = CURL_DOWN, CURL_UP = CURL_UP, FLIP_FROM_BOTTOM = FLIP_FROM_BOTTOM, FLIP_FROM_LEFT = FLIP_FROM_LEFT, FLIP_FROM_RIGHT = FLIP_FROM_RIGHT, FLIP_FROM_TOP = FLIP_FROM_TOP, NONE = NONE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofAnimationStyle]
  }
}

