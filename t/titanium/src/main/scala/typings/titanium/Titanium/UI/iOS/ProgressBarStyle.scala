package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
			 */
@JSGlobal("Titanium.UI.iOS.ProgressBarStyle")
@js.native
object ProgressBarStyle extends js.Object {
  /**
  				 * The style of progress view that is used in a toolbar.
  				 */
  val BAR: Double = js.native
  /**
  				 * he standard progress-view style. This is the default.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * The standard progress-view style. Same as `DEFAULT`.
  				 */
  val PLAIN: Double = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
}

