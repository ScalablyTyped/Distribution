package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTableViewSeparatorStyle extends js.Object {
  /**
  				 * The separator cell has no distinct style.
  				 */
  val NONE: Double
  /**
  				 * The separator cell has a single line running across its width. This is the default value.
  				 */
  val SINGLE_LINE: Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewSeparatorStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewSeparatorStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewSeparatorStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofTableViewSeparatorStyle {
  @scala.inline
  def apply(
    NONE: Double,
    SINGLE_LINE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit
  ): TypeofTableViewSeparatorStyle = {
    val __obj = js.Dynamic.literal(NONE = NONE, SINGLE_LINE = SINGLE_LINE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
  
    __obj.asInstanceOf[TypeofTableViewSeparatorStyle]
  }
}

