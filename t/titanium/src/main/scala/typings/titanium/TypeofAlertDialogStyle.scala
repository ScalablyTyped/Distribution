package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAlertDialogStyle extends js.Object {
  /**
  				 * A standard alert dialog. This is the default value.
  				 */
  val DEFAULT: Double
  /**
  				 * An alert dialog that allows the user to enter login identifier and password.
  				 */
  val LOGIN_AND_PASSWORD_INPUT: Double
  /**
  				 * An alert dialog that allows the user to enter text.
  				 */
  val PLAIN_TEXT_INPUT: Double
  /**
  				 * An alert dialog that allows the user to enter text. The text field is obscured.
  				 */
  val SECURE_TEXT_INPUT: Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofAlertDialogStyle {
  @scala.inline
  def apply(
    DEFAULT: Double,
    LOGIN_AND_PASSWORD_INPUT: Double,
    PLAIN_TEXT_INPUT: Double,
    SECURE_TEXT_INPUT: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofAlertDialogStyle = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], LOGIN_AND_PASSWORD_INPUT = LOGIN_AND_PASSWORD_INPUT.asInstanceOf[js.Any], PLAIN_TEXT_INPUT = PLAIN_TEXT_INPUT.asInstanceOf[js.Any], SECURE_TEXT_INPUT = SECURE_TEXT_INPUT.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofAlertDialogStyle]
  }
}

