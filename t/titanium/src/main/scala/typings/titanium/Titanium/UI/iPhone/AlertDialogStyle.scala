package typings.titanium.Titanium.UI.iPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the `style` property of
			 * <Titanium.UI.AlertDialog>.
			 */
@JSGlobal("Titanium.UI.iPhone.AlertDialogStyle")
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
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

