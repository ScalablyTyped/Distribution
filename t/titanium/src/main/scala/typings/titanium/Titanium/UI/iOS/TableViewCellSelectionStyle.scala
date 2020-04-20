package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the `selectionStyle` property of
			 * <Titanium.UI.TableViewRow>.
			 */
@JSGlobal("Titanium.UI.iOS.TableViewCellSelectionStyle")
@js.native
object TableViewCellSelectionStyle extends js.Object {
  /**
  				 * The cell when selected has a blue background. This is the default value.
  				 */
  val BLUE: Double = js.native
  /**
  				 * Then cell when selected has a gray background.
  				 */
  val GRAY: Double = js.native
  /**
  				 * The cell has no distinct style for when it is selected.
  				 */
  val NONE: Double = js.native
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

