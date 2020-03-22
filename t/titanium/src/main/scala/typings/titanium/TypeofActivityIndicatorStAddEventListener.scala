package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofActivityIndicatorStAddEventListener extends js.Object {
  /**
  				 * Large white spinning indicator.
  				 */
  val BIG: Double
  /**
  				 * Small gray spinning indicator.
  				 */
  val DARK: Double
  /**
  				 * Small white spinning indicator (default.)
  				 */
  val PLAIN: Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.ActivityIndicatorStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofActivityIndicatorStAddEventListener {
  @scala.inline
  def apply(
    BIG: Double,
    DARK: Double,
    PLAIN: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofActivityIndicatorStAddEventListener = {
    val __obj = js.Dynamic.literal(BIG = BIG.asInstanceOf[js.Any], DARK = DARK.asInstanceOf[js.Any], PLAIN = PLAIN.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofActivityIndicatorStAddEventListener]
  }
}

