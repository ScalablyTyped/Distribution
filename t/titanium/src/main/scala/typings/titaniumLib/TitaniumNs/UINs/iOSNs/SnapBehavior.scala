package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Dynamic behavior defining an item's movement to a specific point.
			 */
trait SnapBehavior
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Specifies the amount of oscillation during the conclusion of the snap.
  				 */
  var damping: scala.Double
  /**
  				 * Item to add to this behavior.
  				 */
  var item: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Specifies the point to snap to.
  				 */
  var snapPoint: titaniumLib.Point
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def getDamping(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def getItem(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def getSnapPoint(): titaniumLib.Point
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.damping> property.
  				 */
  def setDamping(damping: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.item> property.
  				 */
  def setItem(item: js.Any): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.SnapBehavior.snapPoint> property.
  				 */
  def setSnapPoint(snapPoint: titaniumLib.Point): scala.Unit
}

object SnapBehavior {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    damping: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getDamping: () => scala.Double,
    getItem: () => titaniumLib.TitaniumNs.UINs.View,
    getSnapPoint: () => titaniumLib.Point,
    item: titaniumLib.TitaniumNs.UINs.View,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setDamping: scala.Double => scala.Unit,
    setItem: js.Any => scala.Unit,
    setSnapPoint: titaniumLib.Point => scala.Unit,
    snapPoint: titaniumLib.Point,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): SnapBehavior = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, damping = damping, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDamping = js.Any.fromFunction0(getDamping), getItem = js.Any.fromFunction0(getItem), getSnapPoint = js.Any.fromFunction0(getSnapPoint), item = item, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setDamping = js.Any.fromFunction1(setDamping), setItem = js.Any.fromFunction1(setItem), setSnapPoint = js.Any.fromFunction1(setSnapPoint), snapPoint = snapPoint)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[SnapBehavior]
  }
}

