package typings.titanium.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the animation styles used for view transitions.
			 */
@JSGlobal("Titanium.UI.iPhone.AnimationStyle")
@js.native
object AnimationStyleNs extends js.Object {
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: Double = js.native
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: Double = js.native
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: Double = js.native
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: Double = js.native
  /**
  				 * No animation.
  				 */
  val NONE: Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.AnimationStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

