package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the animation styles used for view transitions.
			 * One of the group of animation style constants
			 *   * [CURL_DOWN](Titanium.UI.iOS.AnimationStyle.CURL_DOWN)
			 *   * [CURL_UP](Titanium.UI.iOS.AnimationStyle.CURL_UP)
			 *   * [FLIP_FROM_LEFT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_LEFT)
			 *   * [FLIP_FROM_RIGHT](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_RIGHT)
			 *   * [FLIP_FROM_TOP](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_TOP)
			 *   * [FLIP_FROM_BOTTOM](Titanium.UI.iOS.AnimationStyle.FLIP_FROM_BOTTOM)
			 *   * [CROSS_DISSOLVE](Titanium.UI.iOS.AnimationStyle.CROSS_DISSOLVE)
			 *   * [NONE](Titanium.UI.iOS.AnimationStyle.NONE)
			 */
@JSGlobal("Titanium.UI.iOS.AnimationStyle")
@js.native
object AnimationStyleNs extends js.Object {
  /**
  				 * A transition that dissolves from one view to the next.
  				 */
  val CROSS_DISSOLVE: scala.Double = js.native
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: scala.Double = js.native
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: scala.Double = js.native
  /**
  				 * Flip from bottom to top during a transition animation.
  				 */
  val FLIP_FROM_BOTTOM: scala.Double = js.native
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: scala.Double = js.native
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: scala.Double = js.native
  /**
  				 * Flip from top to bottom during a transition animation.
  				 */
  val FLIP_FROM_TOP: scala.Double = js.native
  /**
  				 * No animation.
  				 */
  val NONE: scala.Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

