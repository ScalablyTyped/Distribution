package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the Animation Styles used for transition on table view rows.
			 */
@JSGlobal("Titanium.UI.iOS.RowAnimationStyle")
@js.native
object RowAnimationStyle extends js.Object {
  /**
  				 * The inserted row or rows slides in from the bottom; the deleted row or rows slides out
  				 * toward the bottom.
  				 */
  val BOTTOM: Double = js.native
  /**
  				 * The inserted or deleted row or rows fades into or out of the table view.
  				 */
  val FADE: Double = js.native
  /**
  				 * The inserted row or rows slides in from the left; the deleted row or rows slides out to the
  				 * left.
  				 */
  val LEFT: Double = js.native
  /**
  				 * No animation is performed. The new cell value appears as if the cell had just been reloaded.
  				 */
  val NONE: Double = js.native
  /**
  				 * The inserted row or rows slides in from the right; the deleted row or rows slides out to
  				 * the right.
  				 */
  val RIGHT: Double = js.native
  /**
  				 * The inserted row or rows slides in from the top; the deleted row or rows slides out toward
  				 * the top.
  				 */
  val TOP: Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iOS.RowAnimationStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iOS.RowAnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iOS.RowAnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

