package typings.titanium.Titanium.UI.iOS

import typings.titanium.Point
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.View
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior defining an item's movement to a specific point.
			 */
trait SnapBehavior extends Proxy {
  /**
  				 * Specifies the amount of oscillation during the conclusion of the snap.
  				 */
  var damping: Double
  /**
  				 * Item to add to this behavior.
  				 */
  var item: View
  /**
  				 * Specifies the point to snap to.
  				 */
  var snapPoint: Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def getDamping(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def getItem(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def getSnapPoint(): Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def setDamping(damping: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def setItem(item: js.Any): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def setSnapPoint(snapPoint: Point): Unit
}

object SnapBehavior {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    damping: Double,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getDamping: () => Double,
    getItem: () => View,
    getSnapPoint: () => Point,
    item: View,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setDamping: Double => Unit,
    setItem: js.Any => Unit,
    setSnapPoint: Point => Unit,
    snapPoint: Point,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): SnapBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getItem = js.Any.fromFunction0(getItem), getSnapPoint = js.Any.fromFunction0(getSnapPoint), item = item.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setItem = js.Any.fromFunction1(setItem), setSnapPoint = js.Any.fromFunction1(setSnapPoint), snapPoint = snapPoint.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapBehavior]
  }
}

