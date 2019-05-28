package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofActivityIndicatorStyleAddEventListener extends js.Object {
  /**
  				 * Large white spinning indicator.
  				 */
  val BIG: scala.Double
  /**
  				 * Small gray spinning indicator.
  				 */
  val DARK: scala.Double
  /**
  				 * Small white spinning indicator (default.)
  				 */
  val PLAIN: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object TypeofActivityIndicatorStyleAddEventListener {
  @scala.inline
  def apply(
    BIG: scala.Double,
    DARK: scala.Double,
    PLAIN: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit
  ): TypeofActivityIndicatorStyleAddEventListener = {
    val __obj = js.Dynamic.literal(BIG = BIG, DARK = DARK, PLAIN = PLAIN, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofActivityIndicatorStyleAddEventListener]
  }
}

