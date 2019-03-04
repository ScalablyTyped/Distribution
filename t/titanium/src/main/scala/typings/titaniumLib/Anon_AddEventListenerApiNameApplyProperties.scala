package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyProperties extends js.Object {
  /**
  				 * A standard alert dialog. This is the default value.
  				 */
  val DEFAULT: scala.Double
  /**
  				 * An alert dialog that allows the user to enter login identifier and password.
  				 */
  val LOGIN_AND_PASSWORD_INPUT: scala.Double
  /**
  				 * An alert dialog that allows the user to enter text.
  				 */
  val PLAIN_TEXT_INPUT: scala.Double
  /**
  				 * An alert dialog that allows the user to enter text. The text field is obscured.
  				 */
  val SECURE_TEXT_INPUT: scala.Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.AlertDialogStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_AddEventListenerApiNameApplyProperties {
  @scala.inline
  def apply(
    DEFAULT: scala.Double,
    LOGIN_AND_PASSWORD_INPUT: scala.Double,
    PLAIN_TEXT_INPUT: scala.Double,
    SECURE_TEXT_INPUT: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyProperties = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT, LOGIN_AND_PASSWORD_INPUT = LOGIN_AND_PASSWORD_INPUT, PLAIN_TEXT_INPUT = PLAIN_TEXT_INPUT, SECURE_TEXT_INPUT = SECURE_TEXT_INPUT, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
  
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyProperties]
  }
}

