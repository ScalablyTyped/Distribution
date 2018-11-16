package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the Animation Styles used for transition on table view rows.
			 */
@JSGlobal("Titanium.UI.iOS.RowAnimationStyle")
@js.native
object RowAnimationStyleNs extends js.Object {
  /**
  				 * The inserted row or rows slides in from the bottom; the deleted row or rows slides out
  				 * toward the bottom.
  				 */
  val BOTTOM: scala.Double = js.native
  /**
  				 * The inserted or deleted row or rows fades into or out of the table view.
  				 */
  val FADE: scala.Double = js.native
  /**
  				 * The inserted row or rows slides in from the left; the deleted row or rows slides out to the
  				 * left.
  				 */
  val LEFT: scala.Double = js.native
  /**
  				 * No animation is performed. The new cell value appears as if the cell had just been reloaded.
  				 */
  val NONE: scala.Double = js.native
  /**
  				 * The inserted row or rows slides in from the right; the deleted row or rows slides out to
  				 * the right.
  				 */
  val RIGHT: scala.Double = js.native
  /**
  				 * The inserted row or rows slides in from the top; the deleted row or rows slides out toward
  				 * the top.
  				 */
  val TOP: scala.Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.RowAnimationStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.RowAnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.RowAnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

