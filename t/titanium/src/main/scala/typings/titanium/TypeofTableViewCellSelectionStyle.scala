package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTableViewCellSelectionStyle extends js.Object {
  /**
  				 * The cell when selected has a blue background. This is the default value.
  				 */
  val BLUE: Double
  /**
  				 * Then cell when selected has a gray background.
  				 */
  val GRAY: Double
  /**
  				 * The cell has no distinct style for when it is selected.
  				 */
  val NONE: Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofTableViewCellSelectionStyle {
  @scala.inline
  def apply(
    BLUE: Double,
    GRAY: Double,
    NONE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofTableViewCellSelectionStyle = {
    val __obj = js.Dynamic.literal(BLUE = BLUE, GRAY = GRAY, NONE = NONE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofTableViewCellSelectionStyle]
  }
}

