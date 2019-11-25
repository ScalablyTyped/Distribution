package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSystemButtonStyleAddEventListener extends js.Object {
  /**
  				 * Used with [ButtonBar](Titanium.UI.ButtonBar) or [TabbedBar](Titanium.UI.iOS.TabbedBar) only,
  				 * to use the more condensed style used in nav bars and tool bars.
  				 */
  val BAR: Double
  /**
  				 * A simple button style with a border.
  				 */
  val BORDERED: Double
  /**
  				 * The style for a **Done** button--for example, a button that completes some task and returns
  				 * to the previous view.
  				 */
  val DONE: Double
  /**
  				 * Specifies a borderless button, the default style for toolbars, button bars, and tabbed bars.
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
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButtonStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButtonStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButtonStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofSystemButtonStyleAddEventListener {
  @scala.inline
  def apply(
    BAR: Double,
    BORDERED: Double,
    DONE: Double,
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
  ): TypeofSystemButtonStyleAddEventListener = {
    val __obj = js.Dynamic.literal(BAR = BAR.asInstanceOf[js.Any], BORDERED = BORDERED.asInstanceOf[js.Any], DONE = DONE.asInstanceOf[js.Any], PLAIN = PLAIN.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofSystemButtonStyleAddEventListener]
  }
}

