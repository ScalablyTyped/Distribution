package typings.titanium.Titanium.App.iOS

import typings.titanium.Titanium.App.Properties
import typings.titanium.titaniumStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The UserDefaults module is used for storing application-related data in property/value pairs
			 * that persist beyond application sessions and device power cycles. UserDefaults allows the suiteName
			 * of the UserDefaults to be specified at creation time.
			 */
@js.native
trait UserDefaults extends Properties {
  /**
  				 * Sets the name of the suite to be used to access UserDefaults.
  				 */
  var suiteName: String = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserDefaultsChangeEvent, Unit]
  ): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: UserDefaultsChangeEvent): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 * @deprecated Access <Titanium.App.iOS.UserDefaults.suiteName> instead.
  				 */
  def getSuiteName(): String = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ UserDefaultsChangeEvent, Unit]
  ): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.App.iOS.UserDefaults.suiteName> property.
  				 * @deprecated Set the value using <Titanium.App.iOS.UserDefaults.suiteName> instead.
  				 */
  def setSuiteName(suiteName: String): Unit = js.native
}

