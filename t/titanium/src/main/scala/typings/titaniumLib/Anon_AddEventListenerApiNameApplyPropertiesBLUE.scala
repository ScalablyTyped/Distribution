package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyPropertiesBLUE extends js.Object {
  /**
  				 * The cell when selected has a blue background. This is the default value.
  				 */
  val BLUE: scala.Double
  /**
  				 * Then cell when selected has a gray background.
  				 */
  val GRAY: scala.Double
  /**
  				 * The cell has no distinct style for when it is selected.
  				 */
  val NONE: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_AddEventListenerApiNameApplyPropertiesBLUE {
  @scala.inline
  def apply(
    BLUE: scala.Double,
    GRAY: scala.Double,
    NONE: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyPropertiesBLUE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BLUE")(BLUE)
    __obj.updateDynamic("GRAY")(GRAY)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyPropertiesBLUE]
  }
}

