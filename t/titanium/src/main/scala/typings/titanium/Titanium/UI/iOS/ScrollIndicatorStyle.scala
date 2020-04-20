package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
			 */
@JSGlobal("Titanium.UI.iOS.ScrollIndicatorStyle")
@js.native
object ScrollIndicatorStyle extends js.Object {
  /**
  				 * A style of indicator which is black smaller than the default style. This style is good
  				 * against a white content background.
  				 */
  val BLACK: Double = js.native
  /**
  				 * The default style of scroll indicator, which is black with a white border. This style is
  				 * good against any content background.
  				 */
  val DEFAULT: Double = js.native
  /**
  				 * A style of indicator is white and smaller than the default style. This style is good against
  				 * a black content background.
  				 */
  val WHITE: Double = js.native
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

