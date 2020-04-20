package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the `style` property of
			 * <Titanium.UI.AlertDialog>.
			 */
@JSGlobal("Titanium.UI.iOS.AlertDialogStyle")
@js.native
object AlertDialogStyle extends js.Object {
  /**
  				 * A standard alert dialog. This is the default value.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * An alert dialog that allows the user to enter login identifier and password.
  				 */
  val LOGIN_AND_PASSWORD_INPUT: Double = js.native
  /**
  				 * An alert dialog that allows the user to enter text.
  				 */
  val PLAIN_TEXT_INPUT: Double = js.native
  /**
  				 * An alert dialog that allows the user to enter text. The text field is obscured.
  				 */
  val SECURE_TEXT_INPUT: Double = js.native
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

