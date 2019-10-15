package typings.titanium.Titanium.UI.iPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
			 */
@JSGlobal("Titanium.UI.iPhone.ProgressBarStyle")
@js.native
object ProgressBarStyle extends js.Object {
  /**
  				 * The style of progress view that is used in a toolbar.
  				 */
  val BAR: Double = js.native
  /**
  				 * The standard progress-view style. This is the default.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * The standard progress-view style. Same as `DEFAULT`.
  				 */
  val PLAIN: Double = js.native
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
  				 * Gets the value of the <Titanium.UI.iPhone.ProgressBarStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.ProgressBarStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.ProgressBarStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

