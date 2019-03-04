package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListenerApiNameApplyPropertiesBOTTOM extends js.Object {
  /**
  				 * The inserted row or rows slides in from the bottom; the deleted row or rows slides out
  				 * toward the bottom.
  				 */
  val BOTTOM: scala.Double
  /**
  				 * The inserted or deleted row or rows fades into or out of the table view.
  				 */
  val FADE: scala.Double
  /**
  				 * The inserted row or rows slides in from the left; the deleted row or rows slides out to the
  				 * left.
  				 */
  val LEFT: scala.Double
  /**
  				 * No animation is performed. The new cell value appears as if the cell had just been reloaded.
  				 */
  val NONE: scala.Double
  /**
  				 * The inserted row or rows slides in from the right; the deleted row or rows slides out to
  				 * the right.
  				 */
  val RIGHT: scala.Double
  /**
  				 * The inserted row or rows slides in from the top; the deleted row or rows slides out toward
  				 * the top.
  				 */
  val TOP: scala.Double
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
  				 * Gets the value of the <Titanium.UI.iPhone.RowAnimationStyle.apiName> property.
  				 */
  def getApiName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.RowAnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.RowAnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}

object Anon_AddEventListenerApiNameApplyPropertiesBOTTOM {
  @scala.inline
  def apply(
    BOTTOM: scala.Double,
    FADE: scala.Double,
    LEFT: scala.Double,
    NONE: scala.Double,
    RIGHT: scala.Double,
    TOP: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit]
  ): Anon_AddEventListenerApiNameApplyPropertiesBOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM, FADE = FADE, LEFT = LEFT, NONE = NONE, RIGHT = RIGHT, TOP = TOP, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent)
  
    __obj.asInstanceOf[Anon_AddEventListenerApiNameApplyPropertiesBOTTOM]
  }
}

