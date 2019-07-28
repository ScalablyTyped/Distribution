package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAnimationStyle extends js.Object {
  /**
  				 * A transition that dissolves from one view to the next.
  				 */
  val CROSS_DISSOLVE: Double
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: Double
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: Double
  /**
  				 * Flip from bottom to top during a transition animation.
  				 */
  val FLIP_FROM_BOTTOM: Double
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: Double
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: Double
  /**
  				 * Flip from top to bottom during a transition animation.
  				 */
  val FLIP_FROM_TOP: Double
  /**
  				 * No animation.
  				 */
  val NONE: Double
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
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofAnimationStyle {
  @scala.inline
  def apply(
    CROSS_DISSOLVE: Double,
    CURL_DOWN: Double,
    CURL_UP: Double,
    FLIP_FROM_BOTTOM: Double,
    FLIP_FROM_LEFT: Double,
    FLIP_FROM_RIGHT: Double,
    FLIP_FROM_TOP: Double,
    NONE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofAnimationStyle = {
    val __obj = js.Dynamic.literal(CROSS_DISSOLVE = CROSS_DISSOLVE, CURL_DOWN = CURL_DOWN, CURL_UP = CURL_UP, FLIP_FROM_BOTTOM = FLIP_FROM_BOTTOM, FLIP_FROM_LEFT = FLIP_FROM_LEFT, FLIP_FROM_RIGHT = FLIP_FROM_RIGHT, FLIP_FROM_TOP = FLIP_FROM_TOP, NONE = NONE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofAnimationStyle]
  }
}

